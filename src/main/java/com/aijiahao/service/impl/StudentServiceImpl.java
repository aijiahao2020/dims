package com.aijiahao.service.impl;

import com.aijiahao.bean.*;
import com.aijiahao.dao.ApartmentMapper;
import com.aijiahao.dao.StudentMapper;
import com.aijiahao.service.StudentService;
import org.apache.ibatis.session.SqlSession;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * @author aijiahao
 * @create 2021/4/23 - 15:25
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentMapper studentMapper;

    @Autowired
    ApartmentMapper apartmentMapper;

//    @Autowired
//    SqlSession sqlSession;


    @Override
    public boolean addStuBatchByExcel(String filePath){
//        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        //获取文件流
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(filePath);


            Workbook workbook = null;
            try {
                workbook = new XSSFWorkbook(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            }
            //2、得到表
            Sheet sheetAt = workbook.getSheetAt(0);
            Row rowTitle = sheetAt.getRow(0);
            int rowCount = sheetAt.getPhysicalNumberOfRows();
            for(int rowNum = 1; rowNum < rowCount; rowNum++){
                Row rowData = sheetAt.getRow(rowNum);
                Student stu = new Student();
                if(rowData != null){
                    //读取列
                    int cellCount = rowTitle.getPhysicalNumberOfCells();
                    for (int cellNum = 0; cellNum < cellCount; cellNum++){
                        Cell cell = rowData.getCell(cellNum);
                        String cellValue = "";
                        if(cell != null){
                            CellType cellTypeEnum = cell.getCellTypeEnum();
                            if(cellTypeEnum == CellType.STRING){
                                cellValue = cell.getStringCellValue();
                            }else{
                                cellValue = "";
                            }
                        }

                        switch (cellNum){
                            case 0: stu.setStuId(cellValue);break;
                            case 1: stu.setStuName(cellValue);break;
                            case 2: stu.setStuSex(cellValue);break;
                            case 3: stu.setStuAcademy(cellValue);break;
                            case 4: stu.setStuClass(cellValue);break;
                            case 5: stu.setStuPro(cellValue);break;
                            case 6: stu.setPhone(cellValue);break;
                            case 7: stu.setEmail(cellValue);break;
                        }
                    }

                    //初始化密码

                    stu.setStuPassword(stu.getStuId());
                    studentMapper.insertSelective(stu);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;

        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return true;
    }

    @Override
    public List<Student> getAllStu() {
        return studentMapper.selectByExample(null);
    }

    @Override
    public List<Student> getStuByCriteria(Student student) {
        if(student == null){
            return getAllStu();
        }
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        if(student.getStuId() != null && !"".equals(student.getStuId())) criteria.andStuIdLike("%" + student.getStuId() + "%");
        if(student.getStuName() != null && !"".equals(student.getStuName())) criteria.andStuNameLike("%" + student.getStuName() + "%");
        if(student.getStuAcademy() != null && !"".equals(student.getStuAcademy())) criteria.andStuAcademyLike("%" + student.getStuAcademy() + "%");
        if(student.getPhone() != null && !"".equals(student.getPhone())) criteria.andPhoneLike("%" + student.getPhone() + "%");
        if(student.getEmail() != null && !"".equals(student.getEmail())) criteria.andEmailLike("%" + student.getEmail() + "%");
        if(student.getStuPro() != null && !"".equals(student.getStuPro())) criteria.andStuProLike("%" + student.getStuPro() + "%");
        if(student.getAptId() != null && !"".equals(student.getAptId())) criteria.andAptIdLike("%" + student.getAptId() + "%");
        if(student.getDrmyId() != null && !"".equals(student.getDrmyId())) criteria.andDrmyIdLike("%" + student.getDrmyId() + "%");
        if(student.getBedId() != null && !"".equals(student.getBedId())) criteria.andBedIdLike("%" + student.getBedId() + "%");
        if(student.getStuSex() != null && !"".equals(student.getStuSex())) criteria.andStuSexLike("%" + student.getStuSex() + "%");
        if(student.getStuClass() != null && !"".equals(student.getStuClass())) criteria.andStuClassLike(student.getStuClass() + "%");
        return studentMapper.selectByExample(example);
    }

    @Override
    public List<Student> getAptAssignStus(Student student, String isAssign) {
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        if(student.getStuAcademy() != null && !"".equals(student.getStuAcademy())) criteria.andStuAcademyLike("%" + student.getStuAcademy() + "%");
        if(student.getStuPro() != null && !"".equals(student.getStuPro())) criteria.andStuProLike("%" + student.getStuPro() + "%");
        if(student.getStuSex() != null && !"".equals(student.getStuSex())) criteria.andStuSexLike("%" + student.getStuSex() + "%");
        if(student.getStuClass() != null && !"".equals(student.getStuClass())) criteria.andStuClassLike(student.getStuClass() + "%");
        if("1".equals(isAssign)){
            criteria.andAptIdIsNull();
        }else{
            criteria.andAptIdIsNotNull();
        }

        return studentMapper.selectByExample(example);
    }

    @Override
    public boolean updateStuAptAssign(String aptId, String stuIds) {
        if("".equals(stuIds)) return true;
        StudentExample example = new StudentExample();
        StudentExample.Criteria criteria = example.createCriteria();
        Apartment apartment = apartmentMapper.selectByPrimaryKey(aptId);
        String[] stu_Ids = stuIds.split(",");
        if(stu_Ids.length == 0) return true;
        Integer newRealp = apartment.getAptRealp() + stu_Ids.length;
        if(apartment.getAptMaxp() < newRealp) return false;
        for(String stuId : stu_Ids){
            Student student = new Student();
            student.setStuId(stuId);
            student.setAptId(aptId);
            studentMapper.updateByPrimaryKeySelective(student);
        }
        apartment.setAptId(aptId);
        apartment.setAptRealp(newRealp);
        apartmentMapper.updateByPrimaryKeySelective(apartment);

        return true;
    }
}
