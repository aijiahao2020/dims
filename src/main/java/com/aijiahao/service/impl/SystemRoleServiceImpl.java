package com.aijiahao.service.impl;

import com.aijiahao.bean.SystemRole;
import com.aijiahao.bean.SystemRoleExample;
import com.aijiahao.dao.SystemRoleMapper;
import com.aijiahao.service.SystemRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author aijiahao
 * @create 2021/4/24 - 10:49
 */
@Service

public class SystemRoleServiceImpl implements SystemRoleService {

    @Autowired
    SystemRoleMapper systemRoleMapper;

    @Override
    public List<SystemRole> getAllRole() {
        return systemRoleMapper.selectByExample(null);
    }

    @Override
    public List<SystemRole> getRoleByCriteria(SystemRole systemRole) {

        if(systemRole == null){
            return getAllRole();
        }
        SystemRoleExample example = new SystemRoleExample();
        SystemRoleExample.Criteria criteria = example.createCriteria();
        if(systemRole.getRoleName() != null && !"".equals(systemRole.getRoleName()))
            criteria.andRoleNameLike("%" + systemRole.getRoleName() + "%");
        if(systemRole.getRoleDecs() != null && !"".equals(systemRole.getRoleDecs()))
            criteria.andRoleDecsLike("%" + systemRole.getRoleDecs() + "%");

        return systemRoleMapper.selectByExample(example);
    }

    @Override
    public int updateSystemRole(SystemRole systemRole) {
        return systemRoleMapper.updateByPrimaryKeySelective(systemRole);
    }
}
