package com.aijiahao.service.impl;

import com.aijiahao.bean.SystemMenu;
import com.aijiahao.bean.SystemMenuExample;
import com.aijiahao.bean.SystemRoleMenu;
import com.aijiahao.bean.SystemRoleMenuExample;
import com.aijiahao.dao.SystemMenuMapper;
import com.aijiahao.dao.SystemRoleMenuMapper;
import com.aijiahao.service.SystemRoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author aijiahao
 * @create 2021/4/22 - 20:50
 */
@Service("systemRoleMenuService")
public class SystemRoleMenuServiceImpl implements SystemRoleMenuService {

    @Autowired
    SystemRoleMenuMapper systemRoleMenuMapper;

    @Autowired
    SystemMenuMapper systemMenuMapper;

    @Override
    public int updateRoleRight(Integer roleId, String menuIds) {

        if("".equals(menuIds)) return 1;
        SystemRoleMenuExample example = new SystemRoleMenuExample();
        SystemRoleMenuExample.Criteria criteria = example.createCriteria();
        criteria.andRoleIdEqualTo(roleId);
        systemRoleMenuMapper.deleteByExample(example);

        String[] menu_Ids = menuIds.split(",");
        if(menu_Ids.length == 0) return 0;
        for(String menu_id : menu_Ids){
            Integer menuId = Integer.parseInt(menu_id);
            systemRoleMenuMapper.insert(new SystemRoleMenu(roleId, menuId));
        }
        return 1;
    }

    @Override
    public int deleteRoleRights(Integer roleId, Integer menuId) {

        //删除对应权限菜单
        systemRoleMenuMapper.deleteByPrimaryKey(roleId, menuId);
        SystemMenu systemMenu = systemMenuMapper.selectByPrimaryKey(menuId);
        SystemMenuExample example = new SystemMenuExample();
        SystemMenuExample.Criteria criteria = example.createCriteria();
        criteria.andMenuNidEqualTo(menuId);
        //是否有子菜单
        List<SystemMenu> systemMenus = systemMenuMapper.selectByExample(example);
        if(systemMenus.size() != 0){
            for(SystemMenu right : systemMenus){
                systemRoleMenuMapper.deleteByPrimaryKey(roleId, right.getMenuId());
            }
        }
        //删除没有二级菜单的一级菜单
        List<SystemMenu> menus = systemRoleMenuMapper.selectMenusByRoleIdFirst(roleId);
        for(SystemMenu menu : menus){
            List<SystemMenu> menusChildren = systemRoleMenuMapper.selectMenusByRoleIdSecond(new SystemRoleMenu(roleId, menu.getMenuId()));
            if(menusChildren.size() == 0){
                systemRoleMenuMapper.deleteByPrimaryKey(roleId, menu.getMenuId());
            }
        }

        return 1;
    }

    @Override
    public List<SystemMenu> getMenusFirst() {
        return systemRoleMenuMapper.selectMenusFirst();
    }

    @Override
    public List<SystemMenu> selectMenusSecend(Integer menuId) {
        return systemRoleMenuMapper.selectMenusSecend(menuId);
    }

    @Override
    public List<SystemMenu> getMenus() {

        List<SystemMenu> systemMenus = systemRoleMenuMapper.selectMenusFirst();

        for(SystemMenu menu : systemMenus){
            List<SystemMenu> menusChildren = systemRoleMenuMapper.selectMenusSecend(menu.getMenuId());
            menu.setChildren(menusChildren);
        }
        return systemMenus;
    }

    @Override
    public List<SystemMenu> getMenusByRoleId(Integer roleId) {
        List<SystemMenu> menus = systemRoleMenuMapper.selectMenusByRoleIdFirst(roleId);
        for(SystemMenu menu : menus){
            List<SystemMenu> menusChildren = systemRoleMenuMapper.selectMenusByRoleIdSecond(new SystemRoleMenu(roleId, menu.getMenuId()));
            menu.setChildren(menusChildren);
        }
        return menus;
    }

}
