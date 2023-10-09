package com.aijiahao.service.impl;

import com.aijiahao.bean.SystemRoleUser;
import com.aijiahao.bean.SystemRoleUserExample;
import com.aijiahao.dao.SystemRoleUserMapper;
import com.aijiahao.service.SystemRoleUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author aijiahao
 * @create 2021/4/22 - 19:24
 */
@Service
public class SystemRoleUserServiceImpl implements SystemRoleUserService {

    @Autowired
    SystemRoleUserMapper systemRoleUserMapper;

    @Override
    public Integer getRoleId(String adminId) {
        SystemRoleUserExample example = new SystemRoleUserExample();
        SystemRoleUserExample.Criteria criteria = example.createCriteria();
        criteria.andAdminIdEqualTo(adminId);
        List<SystemRoleUser> systemRoleUsers = systemRoleUserMapper.selectByExample(example);
        if(systemRoleUsers != null && systemRoleUsers.size() != 0) return systemRoleUsers.get(0).getRoleId();
        return 0;
    }
}
