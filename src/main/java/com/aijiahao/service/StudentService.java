package com.aijiahao.service;

import com.aijiahao.bean.Student;

import java.util.List;

/**
 * @author aijiahao
 * @create 2021/4/23 - 15:25
 */
public interface StudentService {

    //通过上传Excel文件批量导入学生信息
    public boolean addStuBatchByExcel(String filePath);

    //获取所有的学生信息
    public List<Student> getAllStu();

    //通过模糊查询获取学生信息
    public List<Student> getStuByCriteria(Student student);

    // 根据isAssign 获取学生楼栋分配信息
    public List<Student> getAptAssignStus(Student student, String isAssign);

    // 批量分配楼栋
    public boolean updateStuAptAssign(String aptId, String stuIds);


}
