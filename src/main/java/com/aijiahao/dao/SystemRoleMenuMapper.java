package com.aijiahao.dao;

import com.aijiahao.bean.SystemMenu;
import com.aijiahao.bean.SystemRoleMenu;
import com.aijiahao.bean.SystemRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemRoleMenuMapper {

    //获取所有一级菜单
    List<SystemMenu> selectMenusFirst();

    //获取一级菜单下对应的二级菜单
    List<SystemMenu> selectMenusSecend(Integer menuId);

    //通过权限id获取用户权限下对应的一级菜单
    List<SystemMenu> selectMenusByRoleIdFirst(Integer roleId);

    //通过权限id和一级菜单id获取用户权限下对应的二级菜单
    List<SystemMenu> selectMenusByRoleIdSecond(SystemRoleMenu systemRoleMenu);

    long countByExample(SystemRoleMenuExample example);

    int deleteByExample(SystemRoleMenuExample example);

    int deleteByPrimaryKey(@Param("roleId") Integer roleId, @Param("menuId") Integer menuId);

    int insert(SystemRoleMenu record);

    int insertSelective(SystemRoleMenu record);

    List<SystemRoleMenu> selectByExample(SystemRoleMenuExample example);

    int updateByExampleSelective(@Param("record") SystemRoleMenu record, @Param("example") SystemRoleMenuExample example);

    int updateByExample(@Param("record") SystemRoleMenu record, @Param("example") SystemRoleMenuExample example);
}
