package com.aijiahao.service;

import com.aijiahao.bean.SystemMenu;
import com.aijiahao.bean.SystemRoleMenu;

import java.util.List;

/**
 * @author aijiahao
 * @create 2021/4/22 - 20:50
 */

public interface SystemRoleMenuService {

    //通过 用户编号 和菜单数组更新权限
    int updateRoleRight(Integer roleId, String menuIds);

    int deleteRoleRights(Integer roleId, Integer menuId);

    List<SystemMenu> getMenusFirst();

    List<SystemMenu> selectMenusSecend(Integer menuId);

    // 获取所有菜单
    List<SystemMenu> getMenus();

    //通过角色id 获取菜单
    List<SystemMenu> getMenusByRoleId(Integer roleId);
}
