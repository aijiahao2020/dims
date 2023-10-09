package com.aijiahao.dao;

import com.aijiahao.bean.Apartment;
import com.aijiahao.bean.ApartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApartmentMapper {
    long countByExample(ApartmentExample example);

    int deleteByExample(ApartmentExample example);

    int deleteByPrimaryKey(String aptId);

    int insert(Apartment record);

    int insertSelective(Apartment record);

    List<Apartment> selectByExample(ApartmentExample example);

    Apartment selectByPrimaryKey(String aptId);

    int updateByExampleSelective(@Param("record") Apartment record, @Param("example") ApartmentExample example);

    int updateByExample(@Param("record") Apartment record, @Param("example") ApartmentExample example);

    int updateByPrimaryKeySelective(Apartment record);

    int updateByPrimaryKey(Apartment record);
}