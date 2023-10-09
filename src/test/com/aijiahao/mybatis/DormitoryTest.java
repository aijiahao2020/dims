package com.aijiahao.mybatis;

import com.aijiahao.bean.Apartment;
import com.aijiahao.bean.Dormitory;
import com.aijiahao.bean.DrmyStu;
import com.aijiahao.dao.DormitoryMapper;
import com.aijiahao.service.DormitoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * @author aijiahao
 * @create 2021/4/26 - 13:53
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@WebAppConfiguration
public class DormitoryTest {

    @Autowired
    DormitoryService dormitoryService;
    @Autowired
    DormitoryMapper dormitoryMapper;

    @Test
    public void testGetDrmyByCriteria(){

        List<Dormitory> drmyByCriteria = dormitoryService.getDrmyByCriteria(null);

        for (Dormitory apartment : drmyByCriteria) {
            System.out.println(apartment);
        }

//        List<DrmyStu> drmyStus = dormitoryMapper.selectStuByDrmy(new Dormitory("206", "9", null, null, null, null));
//        System.out.println(drmyStus);

    }

    @Test
    public void arrayTest(){
        List<Dormitory> drmyByCriteria = dormitoryService.getDrmyByCriteria(null);
        System.out.println(drmyByCriteria);
    }
}
