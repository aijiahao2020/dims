package com.aijiahao.service;

import com.aijiahao.bean.SystemRole;

import java.util.List;

/**
 * @author aijiahao
 * @create 2021/4/24 - 10:49
 */
public interface SystemRoleService {

    //获取所有角色
    List<SystemRole> getAllRole();

    List<SystemRole> getRoleByCriteria(SystemRole systemRole);

    //更新系统角色
    int updateSystemRole(SystemRole systemRole);

}
