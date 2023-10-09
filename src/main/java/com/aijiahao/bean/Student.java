package com.aijiahao.bean;

public class Student {
    private String stuId;

    private String drmyId;

    private String aptId;

    private String stuPassword;

    private String bedId;

    private String stuName;

    private String stuPortrait;

    private String stuSex;

    private String stuAcademy;

    private String stuClass;

    private String stuPro;

    private String email;

    private String phone;

    public Student() {
    }

    public Student(String stuId, String drmyId, String aptId, String stuPassword, String bedId, String stuName, String stuPortrait, String stuSex, String stuAcademy, String stuClass, String stuPro, String email, String phone) {
        this.stuId = stuId;
        this.drmyId = drmyId;
        this.aptId = aptId;
        this.stuPassword = stuPassword;
        this.bedId = bedId;
        this.stuName = stuName;
        this.stuPortrait = stuPortrait;
        this.stuSex = stuSex;
        this.stuAcademy = stuAcademy;
        this.stuClass = stuClass;
        this.stuPro = stuPro;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuId='" + stuId + '\'' +
                ", drmyId='" + drmyId + '\'' +
                ", aptId='" + aptId + '\'' +
                ", stuPassword='" + stuPassword + '\'' +
                ", bedId='" + bedId + '\'' +
                ", stuName='" + stuName + '\'' +
                ", stuPortrait='" + stuPortrait + '\'' +
                ", stuSex='" + stuSex + '\'' +
                ", stuAcademy='" + stuAcademy + '\'' +
                ", stuClass='" + stuClass + '\'' +
                ", stuPro='" + stuPro + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId == null ? null : stuId.trim();
    }

    public String getDrmyId() {
        return drmyId;
    }

    public void setDrmyId(String drmyId) {
        this.drmyId = drmyId == null ? null : drmyId.trim();
    }

    public String getAptId() {
        return aptId;
    }

    public void setAptId(String aptId) {
        this.aptId = aptId == null ? null : aptId.trim();
    }

    public String getStuPassword() {
        return stuPassword;
    }

    public void setStuPassword(String stuPassword) {
        this.stuPassword = stuPassword == null ? null : stuPassword.trim();
    }

    public String getBedId() {
        return bedId;
    }

    public void setBedId(String bedId) {
        this.bedId = bedId == null ? null : bedId.trim();
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    public String getStuPortrait() {
        return stuPortrait;
    }

    public void setStuPortrait(String stuPortrait) {
        this.stuPortrait = stuPortrait == null ? null : stuPortrait.trim();
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex == null ? null : stuSex.trim();
    }

    public String getStuAcademy() {
        return stuAcademy;
    }

    public void setStuAcademy(String stuAcademy) {
        this.stuAcademy = stuAcademy == null ? null : stuAcademy.trim();
    }

    public String getStuClass() {
        return stuClass;
    }

    public void setStuClass(String stuClass) {
        this.stuClass = stuClass == null ? null : stuClass.trim();
    }

    public String getStuPro() {
        return stuPro;
    }

    public void setStuPro(String stuPro) {
        this.stuPro = stuPro == null ? null : stuPro.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}
