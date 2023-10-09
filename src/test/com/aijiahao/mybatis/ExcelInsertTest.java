package com.aijiahao.mybatis;

import com.aijiahao.bean.Student;
import com.aijiahao.dao.StudentMapper;
import com.aijiahao.service.StudentService;
import org.apache.ibatis.session.SqlSession;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.FileInputStream;
import java.util.UUID;

/**
 * @author aijiahao
 * @create 2021/4/23 - 13:39
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@WebAppConfiguration
public class ExcelInsertTest {

    @Autowired
    StudentMapper studentMapper;

//    @Autowired
//    SqlSession sqlSession;

    @Autowired
    StudentService studentService;

    @Test
    public void insertTest(){
       // StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        for (int i = 0; i < 1000; i++){
            String uuid = UUID.randomUUID().toString().substring(0, 5) + i;
            //mapper.insertSelective(new Student());
        }
    }


    @Test
    public void testRead07() throws Exception {

        //StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        //获取文件流
        FileInputStream inputStream = new FileInputStream( "E:\\GraduationProject\\file\\db\\ProvideStudentList.xlsx");

        //1、创建一个工作簿， 使用Excel能操作的这边都能操作
        Workbook workbook = new XSSFWorkbook(inputStream);
        //2、得到表
        Sheet sheetAt = workbook.getSheetAt(0);
        int rowCount = sheetAt.getPhysicalNumberOfRows();
        System.out.println(rowCount);
        for(int rowNum = 1; rowNum < rowCount; rowNum++){
//            String uuid = UUID.randomUUID().toString().substring(0, 5) + i;
            Row rowData = sheetAt.getRow(rowNum);
            if(rowData != null){
                Cell cell = rowData.getCell(2);
                if(cell != null){
//                    String uuid = "TestName" +UUID.randomUUID().toString().substring(0, 5);
//                    Student student = new Student();
//                    student.setStuId(cell.getStringCellValue());
//                    student.setStuPassword(cell.getStringCellValue());
//                    student.setStuName(uuid);
//                    student.setStuPro("计算机科学与技术");
//                    student.setStuAcademy("计算机学院");
//                    student.setStuClass(4);
//                    System.out.println(student);
                    System.out.println(cell.getNumericCellValue());
//                    mapper.insertSelective(student);
                }
            }
        }
        //3、得到行
//        Row row = sheetAt.getRow(0);
//        //4、得到列
//        Cell cell = row.getCell(0);
//
//        //getStringCellValue 字符串类型
//        //getNumericCellValue 数值类型
//        //读取值得时候，一定需要注意类型
//        System.out.println(cell.getStringCellValue());
        inputStream.close();
    }

    @Test
    public void testAddStuBatchByExcel() throws Exception {
        studentService.addStuBatchByExcel("E:\\GraduationProject\\file\\db\\ProvideStudentList.xlsx");
    }

}
