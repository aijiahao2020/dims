package com.aijiahao.mybatis;

import com.aijiahao.bean.Apartment;
import com.aijiahao.bean.Bulletin;
import com.aijiahao.service.BulletinService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * @author aijiahao
 * @create 2021/5/19 - 19:40
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@WebAppConfiguration
public class BeanTest {


    @Autowired
    BulletinService bulletinService;

    @Test
    public void testAptMapper(){
        List<Bulletin> bltByCriteria = bulletinService.getBltByCriteria(null);
        System.out.println(bltByCriteria);
    }
}
