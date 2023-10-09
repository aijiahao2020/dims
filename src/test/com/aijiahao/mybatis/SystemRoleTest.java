package com.aijiahao.mybatis;

import com.aijiahao.bean.Student;
import com.aijiahao.bean.SystemRole;
import com.aijiahao.dao.SystemRoleMapper;
import com.aijiahao.dao.SystemRoleUserMapper;
import com.aijiahao.service.SystemRoleService;
import com.aijiahao.service.SystemRoleUserService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * @author aijiahao
 * @create 2021/4/24 - 10:55
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@WebAppConfiguration
public class SystemRoleTest {
    @Autowired
    SystemRoleService systemRoleService;

    @Autowired
    SystemRoleMapper systemRoleMapper;

    @Autowired
    SystemRoleUserService systemRoleUserService;
    @Test
    public void getAllRolesTest(){
        List<SystemRole> allRole = systemRoleService.getAllRole();
        System.out.println(allRole);
    }

    @Test
    public void updateSystemRoleTest(){
//        int i = systemRoleService.updateSystemRole(new SystemRole(5, "系统管理员", "所有权限", "0"));
//        System.out.println(i);

        //int i = systemRoleMapper.updateByPrimaryKey(new SystemRole(5, "系统管理员", "所有权限", null));
//        System.out.println(i);
    }

    @Test
    public void getRoleByCriteriaTest(){
//        List<SystemRole> roleByCriteria = systemRoleService.getRoleByCriteria(new SystemRole(null, "管", "", "null"));
//        System.out.println(roleByCriteria);
    }

    @Test
    public void selectRoleIdTest(){
//        Integer roleId = systemRoleUserService.getRoleId("201721091131");
//        System.out.println(roleId);


    }



}
