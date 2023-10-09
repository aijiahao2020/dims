package com.aijiahao.bean;

public class SystemAdministrator {
    private String adminId;

    private String aptId;

    private String adminPassword;

    private String adminName;

    private String adminPhone;

    private String adminImage;

    private String adminSex;

    private Integer adminType;

    private String adminAvailable;

    private String adminPosition;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId == null ? null : adminId.trim();
    }

    public String getAptId() {
        return aptId;
    }

    public void setAptId(String aptId) {
        this.aptId = aptId == null ? null : aptId.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone == null ? null : adminPhone.trim();
    }

    public String getAdminImage() {
        return adminImage;
    }

    public void setAdminImage(String adminImage) {
        this.adminImage = adminImage == null ? null : adminImage.trim();
    }

    public String getAdminSex() {
        return adminSex;
    }

    public void setAdminSex(String adminSex) {
        this.adminSex = adminSex == null ? null : adminSex.trim();
    }

    public Integer getAdminType() {
        return adminType;
    }

    public void setAdminType(Integer adminType) {
        this.adminType = adminType;
    }

    public String getAdminAvailable() {
        return adminAvailable;
    }

    public void setAdminAvailable(String adminAvailable) {
        this.adminAvailable = adminAvailable == null ? null : adminAvailable.trim();
    }

    public String getAdminPosition() {
        return adminPosition;
    }

    public void setAdminPosition(String adminPosition) {
        this.adminPosition = adminPosition == null ? null : adminPosition.trim();
    }
}