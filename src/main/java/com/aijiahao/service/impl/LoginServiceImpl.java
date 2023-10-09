package com.aijiahao.service.impl;

import com.aijiahao.bean.Student;
import com.aijiahao.bean.SystemAdministrator;
import com.aijiahao.dao.StudentMapper;
import com.aijiahao.dao.SystemAdministratorMapper;
import com.aijiahao.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author aijiahao
 * @create 2021/4/22 - 17:59
 */
@Service("admainLoginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    SystemAdministratorMapper systemAdministratorMapper;

    @Autowired
    StudentMapper studentMapper;

    @Override
    public boolean loginStudent(Student student) {
        if(student.getStuId() != null){
            Student stu = studentMapper.selectByPrimaryKey(student.getStuId());
            //通过管理员id 查询，对比密码
            if(stu != null && stu.getStuPassword().equals(student.getStuPassword())){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean loginSysAdmin(SystemAdministrator systemAdmin) {
        if(systemAdmin.getAdminId() != null){
            SystemAdministrator systemAdministrator = systemAdministratorMapper.selectByPrimaryKey(systemAdmin.getAdminId());
            //通过管理员id 查询，对比密码
            if(systemAdministrator != null && systemAdministrator.getAdminPassword().equals(systemAdmin.getAdminPassword())){
                return true;
            }
        }
        return false;
    }

    @Override
    public SystemAdministrator getSystemAdminByPrimaryKey(String adminId) {
        return systemAdministratorMapper.selectByPrimaryKey(adminId);
    }
}
