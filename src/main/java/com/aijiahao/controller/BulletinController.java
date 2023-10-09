package com.aijiahao.controller;

import com.aijiahao.bean.Apartment;
import com.aijiahao.bean.Bulletin;
import com.aijiahao.bean.Student;
import com.aijiahao.service.BulletinService;
import com.aijiahao.utils.JsonResult;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author aijiahao
 * @create 2021/5/6 - 21:22
 */

@RestController
@RequestMapping("api/private/v1")
public class BulletinController {

    @Autowired
    BulletinService bulletinService;

    @RequestMapping(value="bulletin", method = RequestMethod.POST)
    public JsonResult addApartment(@RequestBody Bulletin bulletin, HttpServletRequest request){
        String adminId = (String)request.getAttribute("adminId");
        System.out.println(adminId);
        if(adminId != null && !"".equals(adminId)){
            bulletin.setAdminId(adminId);
            System.out.println(bulletin);
            int i = bulletinService.addBulletin(bulletin);
            if(i != 0){
                return JsonResult.success();
            }
        }

        return JsonResult.fail();
    }


    @RequestMapping(value = "bulletins", method = RequestMethod.GET)
    public JsonResult getBulletins(@RequestParam(value = "bltSelect")String bltSelect, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                               @RequestParam(value = "pageSize",defaultValue = "5")Integer pageSize, Model model){
        PageHelper.startPage(pageNum, pageSize);
        //startPgae后面紧跟的这个查询的就是一个分页查询

//        List<Student> allStu = studentService.getAllStu();
        Bulletin bulletin = JSON.parseObject(bltSelect, new TypeReference<Bulletin>() {
        });
        List<Bulletin> allBlt = bulletinService.getBltByCriteria(bulletin);

        //使用pageInfo包装查询后的结果，只需要pageInfo交给页面就行
        //封装了详细信息   ，包括我们查询出来的数据
        PageInfo pageInfo = new PageInfo(allBlt, pageSize);

        return JsonResult.success().add("pageInfo", pageInfo);
    }
}
