package com.aijiahao.controller;

import com.aijiahao.bean.Student;
import com.aijiahao.bean.SystemMenu;
import com.aijiahao.service.StudentService;
import com.aijiahao.service.SystemRoleMenuService;
import com.aijiahao.utils.JsonResult;
import com.aijiahao.utils.UpdateUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * @author aijiahao
 * @create 2021/4/22 - 9:53
 */

@RestController
@RequestMapping("api/private/v1")
public class AdminStudentController {



    @Autowired
    StudentService studentService;



    @RequestMapping(value="/addStu", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult addStu(@RequestParam("fileList") MultipartFile multipartFile, HttpServletRequest request){
        String filepath = UpdateUtil.addByExcel(multipartFile, request, "/upload/provideStudentList/");
        if(filepath == null){
            return JsonResult.fail().add("message", "操作失败");
        }

        boolean b = studentService.addStuBatchByExcel(filepath);
//        List<Student> allStu = studentService.getAllStu();
        if(b) {
            return JsonResult.success().add("message", "导入成功");
        }else{
            return JsonResult.success().add("message", "导入失败");
        }
//        return JsonResult.fail().add("message", "操作失败");
    }

    @RequestMapping(value = "users", method = RequestMethod.GET)
    public JsonResult getUsers(@RequestParam(value = "stuSelect")String stuSelect, @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                               @RequestParam(value = "pageSize",defaultValue = "5")Integer pageSize, Model model){
        PageHelper.startPage(pageNum, pageSize);
        //startPgae后面紧跟的这个查询的就是一个查分页询

//        List<Student> allStu = studentService.getAllStu();
        Student student = JSON.parseObject(stuSelect, new TypeReference<Student>() {
        });
        List<Student> allStu = studentService.getStuByCriteria(student);

        //使用pageInfo包装查询后的结果，只需要pageInfo交给页面就行
        //封装了详细信息   ，包括我们查询出来的数据
        PageInfo pageInfo = new PageInfo(allStu, pageSize);

        return JsonResult.success().add("pageInfo", pageInfo);
    }

    //宿舍分配接口
    @RequestMapping(value = "aptAssign", method = RequestMethod.GET)
    public JsonResult getAptAssignStus(@RequestParam(value = "stuSelect")String stuSelect,
                                       @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                                       @RequestParam(value = "pageSize",defaultValue = "5")Integer pageSize,
                                       @RequestParam(value = "isAssign",defaultValue = "1")String isAssign,
                                       Model model){
        PageHelper.startPage(pageNum, pageSize);
        //startPgae后面紧跟的这个查询的就是一个分页查询

//        List<Student> allStu = studentService.getAllStu();
        System.out.println(isAssign + ":isAssign");
        Student student = JSON.parseObject(stuSelect, new TypeReference<Student>() {
        });
        List<Student> allStu = studentService.getAptAssignStus(student, isAssign);

        //使用pageInfo包装查询后的结果，只需要pageInfo交给页面就行
        //封装了详细信息   ，包括我们查询出来的数据
        PageInfo pageInfo = new PageInfo(allStu, pageSize);

        return JsonResult.success().add("pageInfo", pageInfo);
    }


    // 为学生分配楼栋
    @RequestMapping(value = "aptAssign", method = RequestMethod.POST)
    public JsonResult updateRoleRights(@RequestBody String jsonString){
        JSONObject jsonObject = JSON.parseObject(jsonString);
        String aptId = jsonObject.getString("aptId");
        String stuIds = jsonObject.getString("stuIds");
//        systemRoleMenuService.updateRoleRight(roleId, menuIds);
        boolean b = studentService.updateStuAptAssign(aptId, stuIds);
        if(b){
            return JsonResult.success();
        }
        return JsonResult.fail();
    }

}
