package com.aijiahao.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SystemRole {
    private Integer roleId;

    private String roleName;

    private String roleDecs;

    private String roleAvailable;

    private List<SystemMenu> systemMenus;


}
