package com.aijiahao.mybatis;

import com.aijiahao.bean.Student;
import com.aijiahao.dao.StudentMapper;
import com.aijiahao.service.StudentService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
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
 * @create 2021/4/23 - 22:02
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@WebAppConfiguration
public class StudentTest {

    @Autowired
    StudentService studentService;

    @Test
    public void testGetStuByCriteria(){
        List<Student> stuByCriteria = studentService.getStuByCriteria(new Student("2017", "", "", null, "", null, "",null, "",null, "",null, ""));
        System.out.println(stuByCriteria);

    }


    @Test
    public void testJsonToPojo(){
        String objectStr="{\"stuId\":\"1233\",\"aptId\":\"\",\"stuName\":\"\",\"stuAcademy\":\"\",\"stuClass\":\"\",\"stuPro\":\"\"}";

        Student student = JSON.parseObject(objectStr, new TypeReference<Student>() {
        });
        System.out.println(student);
    }

    @Test
    public void getAptAssignStusTest(){
        List<Student> aptAssignStus = studentService.getAptAssignStus(new Student(), "1");
        System.out.println(aptAssignStus);
    }



    @Test
    public void deleteRoleRights(){
        boolean b = studentService.updateStuAptAssign("8", "201721090027");
        System.out.println(b);
    }


}
