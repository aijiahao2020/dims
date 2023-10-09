package com.aijiahao.dao;

import com.aijiahao.bean.SystemAdministrator;
import com.aijiahao.bean.SystemAdministratorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemAdministratorMapper {
    long countByExample(SystemAdministratorExample example);

    int deleteByExample(SystemAdministratorExample example);

    int deleteByPrimaryKey(String adminId);

    int insert(SystemAdministrator record);

    int insertSelective(SystemAdministrator record);

    List<SystemAdministrator> selectByExample(SystemAdministratorExample example);

    SystemAdministrator selectByPrimaryKey(String adminId);

    int updateByExampleSelective(@Param("record") SystemAdministrator record, @Param("example") SystemAdministratorExample example);

    int updateByExample(@Param("record") SystemAdministrator record, @Param("example") SystemAdministratorExample example);

    int updateByPrimaryKeySelective(SystemAdministrator record);

    int updateByPrimaryKey(SystemAdministrator record);
}