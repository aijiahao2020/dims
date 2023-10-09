package com.aijiahao.utils;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author aijiahao
 * @create 2021/4/23 - 15:12
 */
public class UpdateUtil {

    public static String addByExcel(MultipartFile multipartFile, HttpServletRequest request, String path){
        //判断所上传文件是否存在
        if(multipartFile.isEmpty()){
            return null;
        }
        //获取上传文件的原始名称
        String originalFilename = multipartFile.getOriginalFilename();
        //设置上传文件的保存地址目录
        String dirPath = request.getSession().getServletContext().getRealPath(path);
        File filePath = new File(dirPath);
        //如果保存的地址不存在,就先创建目录
        if (!filePath.exists()) {
            filePath.mkdirs();
        }
        //获取当前文件的后缀
        String suffix = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);
        //获取当前时间并格式化
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(d) + originalFilename.substring(0,originalFilename.lastIndexOf(".")));
        String newFileName = sdf.format(d) + originalFilename.substring(0,originalFilename.lastIndexOf(".")) + "." + suffix;

        //使用UUID重新命名上传的文件名称(UUID(唯一识别码)+原始文件名称后缀)
//        String newFileName = UUID.randomUUID() + "." + suffix;
        try {
            //创建可能会有错误,强制添加异常
            multipartFile.transferTo(new File(dirPath + newFileName));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        System.out.println(dirPath + newFileName);
//        return "上传成功"+"文件地址="+dirPath + newFileName;

//        System.out.println("进入addStu");

        return dirPath + newFileName;

    }
}
