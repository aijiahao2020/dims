package com.aijiahao.controller;

import com.aijiahao.bean.SystemMenu;
import com.aijiahao.bean.SystemRole;
import com.aijiahao.bean.SystemRoleMenu;
import com.aijiahao.service.SystemRoleMenuService;
import com.aijiahao.service.SystemRoleService;
import com.aijiahao.utils.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author aijiahao
 * @create 2021/4/24 - 10:48
 */

@RestController
@RequestMapping("api/private/v1")
public class AdminRoleController {


    @Autowired
    SystemRoleService systemRoleService;

    @Autowired
    SystemRoleMenuService systemRoleMenuService;

    @RequestMapping(value = "roles", method = RequestMethod.GET)
    public JsonResult getRoles(SystemRole systemRole){
//        System.out.println(systemRole);
//        List<SystemRole> allRole = systemRoleService.getAllRole();
        List<SystemRole> allRole = systemRoleService.getRoleByCriteria(systemRole);
        for(SystemRole role : allRole){
            List<SystemMenu> menusByRoleId = systemRoleMenuService.getMenusByRoleId(role.getRoleId());
            role.setSystemMenus(menusByRoleId);
        }

        return JsonResult.success().add("allRole", allRole);
    }

    @RequestMapping(value = "roles/{roleId}", method = RequestMethod.PUT)
    @ResponseBody
    public JsonResult updateRole(@RequestBody SystemRole systemRole){
//        List<SystemRole> allRole = systemRoleService.getAllRole();
//        return JsonResult.success().add("allRole", allRole);

        if(systemRoleService.updateSystemRole(systemRole) != 0){
            return JsonResult.success();
        }else{
            return JsonResult.fail();
        }
    }

}
