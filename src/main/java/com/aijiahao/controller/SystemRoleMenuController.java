package com.aijiahao.controller;

import com.aijiahao.bean.SystemMenu;
import com.aijiahao.bean.SystemRoleMenu;
import com.aijiahao.service.SystemRoleMenuService;
import com.aijiahao.service.SystemRoleUserService;
import com.aijiahao.utils.JsonResult;
import com.aijiahao.utils.JwtUtil;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.List;

/**
 * @author aijiahao
 * @create 2021/4/24 - 16:03
 */
@RestController
@RequestMapping("api/private/v1")
public class SystemRoleMenuController {

    @Autowired
    SystemRoleMenuService systemRoleMenuService;

    @Autowired
    SystemRoleUserService systemRoleUserService;

    @RequestMapping(value = "menus", method = RequestMethod.GET)
    public JsonResult getMenus(HttpServletRequest request){

        String adminId = (String)request.getAttribute("adminId");
        System.out.println(adminId);

        Integer roleId = systemRoleUserService.getRoleId(adminId);

        List<SystemMenu> menus = systemRoleMenuService.getMenusByRoleId(roleId);
        // System.out.println(menus);
        return JsonResult.success().add("menus", menus);
    }

    @RequestMapping(value = "roleRights", method = RequestMethod.POST)
    public JsonResult updateRoleRights(@RequestBody String jsonString){
        JSONObject jsonObject = JSON.parseObject(jsonString);
        Integer roleId = jsonObject.getInteger("roleId");
        String menuIds = jsonObject.getString("menuIds");
        systemRoleMenuService.updateRoleRight(roleId, menuIds);
        return JsonResult.success();
    }

    @RequestMapping(value = "roleRights", method = RequestMethod.GET)
    public JsonResult getRoleRights(){

        List<SystemMenu> roleRightData = systemRoleMenuService.getMenus();
        return JsonResult.success().add("roleRightData", roleRightData);
    }

    @RequestMapping(value = "roleRights/{roleId}/{menuId}", method = RequestMethod.DELETE)
    public JsonResult deleteRoleRights(@PathVariable("roleId") Integer roleId, @PathVariable("menuId") Integer menuId){

        systemRoleMenuService.deleteRoleRights(roleId, menuId);
        List<SystemMenu> roleRight = systemRoleMenuService.getMenusByRoleId(roleId);
        return JsonResult.success().add("roleRight", roleRight);
    }

}


