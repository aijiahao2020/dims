package com.aijiahao.dao;

import com.aijiahao.bean.SystemMenu;
import com.aijiahao.bean.SystemMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemMenuMapper {
    long countByExample(SystemMenuExample example);

    int deleteByExample(SystemMenuExample example);

    int deleteByPrimaryKey(Integer menuId);

    int insert(SystemMenu record);

    int insertSelective(SystemMenu record);

    List<SystemMenu> selectByExample(SystemMenuExample example);

    SystemMenu selectByPrimaryKey(Integer menuId);

    int updateByExampleSelective(@Param("record") SystemMenu record, @Param("example") SystemMenuExample example);

    int updateByExample(@Param("record") SystemMenu record, @Param("example") SystemMenuExample example);

    int updateByPrimaryKeySelective(SystemMenu record);

    int updateByPrimaryKey(SystemMenu record);
}