package com.aijiahao.dao;

import com.aijiahao.bean.Repair;
import com.aijiahao.bean.RepairExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepairMapper {
    long countByExample(RepairExample example);

    int deleteByExample(RepairExample example);

    int deleteByPrimaryKey(String repairId);

    int insert(Repair record);

    int insertSelective(Repair record);

    List<Repair> selectByExample(RepairExample example);

    Repair selectByPrimaryKey(String repairId);

    int updateByExampleSelective(@Param("record") Repair record, @Param("example") RepairExample example);

    int updateByExample(@Param("record") Repair record, @Param("example") RepairExample example);

    int updateByPrimaryKeySelective(Repair record);

    int updateByPrimaryKey(Repair record);
}