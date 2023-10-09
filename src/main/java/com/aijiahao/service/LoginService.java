package com.aijiahao.service;

import com.aijiahao.bean.Student;
import com.aijiahao.bean.SystemAdministrator;

/**
 * @author aijiahao
 * @create 2021/4/22 - 17:29
 */

public interface LoginService {


    //学生登录验证
    public boolean loginStudent(Student student);

    //管理员登录验证
    public boolean loginSysAdmin(SystemAdministrator systemAdministrator);

    public SystemAdministrator getSystemAdminByPrimaryKey(String adminId);

}
