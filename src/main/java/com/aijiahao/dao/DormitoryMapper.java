package com.aijiahao.dao;

import com.aijiahao.bean.Dormitory;
import com.aijiahao.bean.DormitoryExample;
import java.util.List;

import com.aijiahao.bean.DrmyStu;
import org.apache.ibatis.annotations.Param;

public interface DormitoryMapper {

    //通过楼栋号宿舍号获取学生信息
    List<DrmyStu> selectStuByDrmy(Dormitory record);

    long countByExample(DormitoryExample example);

    int deleteByExample(DormitoryExample example);

    int deleteByPrimaryKey(@Param("drmyId") String drmyId, @Param("aptId") String aptId);

    int insert(Dormitory record);

    int insertSelective(Dormitory record);

    List<Dormitory> selectByExample(DormitoryExample example);

    Dormitory selectByPrimaryKey(@Param("drmyId") String drmyId, @Param("aptId") String aptId);

    int updateByExampleSelective(@Param("record") Dormitory record, @Param("example") DormitoryExample example);

    int updateByExample(@Param("record") Dormitory record, @Param("example") DormitoryExample example);

    int updateByPrimaryKeySelective(Dormitory record);

    int updateByPrimaryKey(Dormitory record);
}
