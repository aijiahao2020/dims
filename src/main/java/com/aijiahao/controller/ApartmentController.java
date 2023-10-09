package com.aijiahao.controller;

import com.aijiahao.bean.Apartment;
import com.aijiahao.bean.Student;
import com.aijiahao.bean.SystemAdministrator;
import com.aijiahao.service.ApartmentService;
import com.aijiahao.service.LoginService;
import com.aijiahao.utils.JsonResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @author aijiahao
 * @create 2021/4/25 - 9:34
 */
@RestController
@RequestMapping("api/private/v1")
public class ApartmentController {

    @Autowired
    ApartmentService apartmentService;

    @Autowired
    LoginService loginService;

    //删除楼栋信息
    @RequestMapping(value="apartments/{aptId}", method = RequestMethod.DELETE)
    public JsonResult deleteApartment(@PathVariable("aptId") String aptId){
        System.out.println(aptId);

        Apartment apartment = apartmentService.getApartmentByAptId(aptId);
        if(apartment.getAptRealp() != 0){
            return JsonResult.fail().add("message", "该楼栋还有学生住宿，无法删除");
        }
        int i = apartmentService.deleteApartmentByAptId(aptId);
        if(i == 0){
            return JsonResult.fail();
        }

        return JsonResult.success();
    }

    //更新楼栋信息
    @RequestMapping(value = "apartments/{aptId}", method = RequestMethod.PUT)
    @ResponseBody
    public JsonResult updateApartment(@RequestBody Apartment apartment){

        System.out.println(apartment);
        int i = apartmentService.updateApartment(apartment);
        if(i == -1){
            return JsonResult.fail().add("message", "楼栋未清空，无法更新性别");
        }
        return JsonResult.success().add("message", "楼栋更新成功");
    }

    //aptId 传入检查
    @RequestMapping(value="apartments/{aptId}", method = RequestMethod.GET)
    public JsonResult getApartmentByAptId(@PathVariable("aptId") String aptId){

        Apartment apartment = apartmentService.getApartmentByAptId(aptId);
        if(apartment != null){
            return JsonResult.success().add("apartment", apartment);
        }
        return JsonResult.fail();
    }

    @RequestMapping(value="apartments", method = RequestMethod.POST)
    public JsonResult addApartment(@RequestBody Apartment apartment){
        long l = apartmentService.countApartmentByAptId(apartment.getAptId());
        if(!"".equals(apartment.getAptId()) && l == 0){
            apartmentService.addApartment(apartment);
            return JsonResult.success();
        }
        return JsonResult.fail();
    }

    @RequestMapping(value = "getApts", method = RequestMethod.GET)
    public JsonResult getApartmentsOnload(HttpServletRequest request){
        String adminId = (String)request.getAttribute("adminId");
        SystemAdministrator admin = loginService.getSystemAdminByPrimaryKey(adminId);

        if(admin.getAdminType() == 2){
            if(!"".equals(admin.getAptId()) && admin.getAptId() != null){
                Apartment apartmentByAptId = apartmentService.getApartmentByAptId(admin.getAptId());
                return JsonResult.success().add("apartments", apartmentByAptId).add("adminType", "2");
            }else{
                return JsonResult.fail();
            }
        }else{
            List<Apartment> apartments = apartmentService.getApartments();
            return JsonResult.success().add("apartments", apartments).add("adminType", "1");
        }

    }

    @RequestMapping(value = "apartments", method = RequestMethod.GET)
    public JsonResult getApartments(@RequestParam(value = "apartmentSelect") String apartmentSelect,
                                    @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                                    @RequestParam(value = "pageSize",defaultValue = "1")Integer pageSize){

        System.out.println("进入apartments");

        PageHelper.startPage(pageNum, pageSize);

        Apartment apartment = JSON.parseObject(apartmentSelect, new TypeReference<Apartment>() {
        });
        System.out.println(apartment);
        List<Apartment> apartments = apartmentService.getApartmentsByCriteria(apartment);
        PageInfo pageInfo = new PageInfo(apartments, pageSize);
        return JsonResult.success().add("pageInfo", pageInfo);
//        return JsonResult.success();
    }

}
