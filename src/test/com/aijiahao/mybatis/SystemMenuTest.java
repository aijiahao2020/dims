package com.aijiahao.mybatis;

import com.aijiahao.bean.SystemMenu;
import com.aijiahao.bean.SystemRoleMenu;
import com.aijiahao.bean.SystemRoleUser;
import com.aijiahao.dao.SystemMenuMapper;
import com.aijiahao.dao.SystemRoleMenuMapper;
import com.aijiahao.service.SystemRoleMenuService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * @author aijiahao
 * @create 2021/4/22 - 16:04
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@WebAppConfiguration
public class SystemMenuTest {


    @Autowired
    SystemMenuMapper systemMenuMapper;

    @Autowired
    SystemRoleMenuMapper systemRoleMenuMapper;

    @Autowired
    SystemRoleMenuService systemRoleMenuService;

    //查询所有菜单
    @Test
    public void selectSystemMenu(){
//        List<SystemMenu> menusByRoleId = systemRoleMenuService.getMenusByRoleId(1);
//        System.out.println(menusByRoleId);
//        List<SystemMenu> roleRightData = systemRoleMenuService.getMenus();
//        System.out.println(roleRightData);

        systemRoleMenuService.updateRoleRight(1, "");
        System.out.println("成功");

    }
}
