package com.aijiahao.bean;

import java.util.List;

public class SystemMenu {
    private Integer menuId;

    private Integer menuNid;

    private String menuTitle;

    private String menuPath;

    private String menuIcon;

    private String menuAvailable;

    private List<SystemMenu> children;

    public List<SystemMenu> getChildren() {
        return children;
    }

    public void setChildren(List<SystemMenu> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "SystemMenu{" +
                "menuId=" + menuId +
                ", menuNid=" + menuNid +
                ", menuTitle='" + menuTitle + '\'' +
                ", menuPath='" + menuPath + '\'' +
                ", menuIcon='" + menuIcon + '\'' +
                ", menuAvailable='" + menuAvailable + '\'' +
                ", children=" + children +
                '}';
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getMenuNid() {
        return menuNid;
    }

    public void setMenuNid(Integer menuNid) {
        this.menuNid = menuNid;
    }

    public String getMenuTitle() {
        return menuTitle;
    }

    public void setMenuTitle(String menuTitle) {
        this.menuTitle = menuTitle == null ? null : menuTitle.trim();
    }

    public String getMenuPath() {
        return menuPath;
    }

    public void setMenuPath(String menuPath) {
        this.menuPath = menuPath == null ? null : menuPath.trim();
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon == null ? null : menuIcon.trim();
    }

    public String getMenuAvailable() {
        return menuAvailable;
    }

    public void setMenuAvailable(String menuAvailable) {
        this.menuAvailable = menuAvailable == null ? null : menuAvailable.trim();
    }
}
