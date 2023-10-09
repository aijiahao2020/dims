package com.aijiahao.controller;

import com.aijiahao.bean.Apartment;
import com.aijiahao.bean.Dormitory;
import com.aijiahao.bean.Student;
import com.aijiahao.service.ApartmentService;
import com.aijiahao.service.DormitoryService;
import com.aijiahao.utils.JsonResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author aijiahao
 * @create 2021/4/26 - 13:44
 */
@RestController
@RequestMapping("api/private/v1")
public class DormitoryController {

    @Autowired
    DormitoryService dormitoryService;

    @Autowired
    ApartmentService apartmentService;

    @RequestMapping(value = "dormitorys", method = RequestMethod.GET)
    public JsonResult getUsers(@RequestParam(value = "drmySelect")String drmySelect, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                               @RequestParam(value = "pageSize",defaultValue = "5")Integer pageSize, Model model){
        PageHelper.startPage(pageNum, pageSize);
        //startPgae后面紧跟的这个查询的就是一个分页查询

        Dormitory dormitory = JSON.parseObject(drmySelect, new TypeReference<Dormitory>() {
        });
        System.out.println(dormitory);
        String aptId = dormitory.getAptId();

        List<Dormitory> dormitorys = dormitoryService.getDrmyByCriteria(dormitory);
        //使用pageInfo包装查询后的结果，只需要pageInfo交给页面就行
        //封装了详细信息   ，包括我们查询出来的数据
        PageInfo pageInfo = new PageInfo(dormitorys, pageSize);

        Apartment apartment = null;
        if(aptId != null && !"".equals(aptId)){
            apartment = apartmentService.getApartmentByAptId(aptId);
        }

        System.out.println(apartment);
        return JsonResult.success().add("pageInfo", pageInfo).add("apartment", apartment);
    }

}


