package com.aijiahao.controller;
import com.aijiahao.bean.Student;
import com.aijiahao.bean.SystemAdministrator;
import com.aijiahao.bean.User;
import com.aijiahao.service.LoginService;
import com.aijiahao.utils.JwtUtil;
import com.aijiahao.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author aijiahao
 * @create 2021/4/21 - 14:39
 */
@RestController
@RequestMapping("api/private/v1")
public class LoginController {

    @Autowired
    LoginService loginService;

    //用户登录
    /*
        请求为json对象 post请求无法封装参数
        解决：在后端用@RequestBody接收
     */
    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult login(@RequestBody User user){
       // System.out.println(administrator);
//        System.out.println(user);

        String username = user.getUsername();
        String password = user.getPassword();
        //0表示学生登录
        if("0".equals(user.getType())){
            Student student = new Student();
            student.setStuId(username);
            student.setStuPassword(password);
            if(!loginService.loginStudent(student)){
                return JsonResult.fail();
            };

        }else{
            SystemAdministrator systemAdministrator = new SystemAdministrator();
            systemAdministrator.setAdminId(username);
            systemAdministrator.setAdminPassword(password);
            if(!loginService.loginSysAdmin(systemAdministrator)) {//用户名密码不正确
                return JsonResult.fail();
            }
        }
        String token = JwtUtil.sign(username, password);
        return JsonResult.success().add("token", token);

    }
}
