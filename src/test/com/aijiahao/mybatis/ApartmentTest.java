package com.aijiahao.mybatis;

import com.aijiahao.bean.Apartment;
import com.aijiahao.dao.ApartmentMapper;
import com.aijiahao.service.ApartmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

/**
 * @author aijiahao
 * @create 2021/4/18 - 16:20
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@WebAppConfiguration
public class ApartmentTest {


    @Autowired
    ApartmentMapper apartmentMapper;

    @Autowired
    ApartmentService apartmentService;

    @Test
    public void testAptMapper(){
        System.out.println(apartmentMapper);

        List<Apartment> apartments = apartmentMapper.selectByExample(null);

        for (Apartment apartment : apartments) {
            System.out.println(apartment);
        }
    }

    @Test
    public void addApartmentTest(){
        Apartment apartment = new Apartment();
        apartment.setAptId("4");
        apartment.setAptLayer(6);
        apartment.setAptSex("1");
        apartment.setAptClass(8);
        int i = apartmentService.addApartment(apartment);
        System.out.println(apartment);

        apartmentService.deleteApartmentByAptId("4");
    }

    @Test
    public void countApartmentByAptIdTest(){
        System.out.println(apartmentService.countApartmentByAptId(""));
    }

    @Test
    public void getApartmentsByCriteriaTest(){
        Apartment apartment = new Apartment();
        apartment.setAptId("1");
        List<Apartment> apartmentsByCriteria = apartmentService.getApartmentsByCriteria(apartment);
        System.out.println(apartmentsByCriteria);
    }


    @Test
    public void getApartmentByAptId(){
        Apartment apartmentByAptId = apartmentService.getApartmentByAptId("");
        System.out.println(apartmentByAptId);
    }



    @Test
    public void deleteApartmentByAptIdTest(){
        System.out.println(apartmentService.deleteApartmentByAptId("1"));
    }
}
