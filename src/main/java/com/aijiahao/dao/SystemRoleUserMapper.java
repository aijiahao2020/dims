package com.aijiahao.dao;

import com.aijiahao.bean.SystemRoleUser;
import com.aijiahao.bean.SystemRoleUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemRoleUserMapper {

    //通过管理员获取角色名称
//    int selectRoleId(String adminId);

    long countByExample(SystemRoleUserExample example);

    int deleteByExample(SystemRoleUserExample example);

    int deleteByPrimaryKey(@Param("adminId") String adminId, @Param("roleId") Integer roleId);

    int insert(SystemRoleUser record);

    int insertSelective(SystemRoleUser record);

    List<SystemRoleUser> selectByExample(SystemRoleUserExample example);

    int updateByExampleSelective(@Param("record") SystemRoleUser record, @Param("example") SystemRoleUserExample example);

    int updateByExample(@Param("record") SystemRoleUser record, @Param("example") SystemRoleUserExample example);
}
