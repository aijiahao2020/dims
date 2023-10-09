package com.aijiahao.dao;

import com.aijiahao.bean.Bulletin;
import com.aijiahao.bean.BulletinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BulletinMapper {
    long countByExample(BulletinExample example);

    int deleteByExample(BulletinExample example);

    int deleteByPrimaryKey(Integer bltId);

    int insert(Bulletin record);

    int insertSelective(Bulletin record);

    List<Bulletin> selectByExample(BulletinExample example);

    Bulletin selectByPrimaryKey(Integer bltId);

    int updateByExampleSelective(@Param("record") Bulletin record, @Param("example") BulletinExample example);

    int updateByExample(@Param("record") Bulletin record, @Param("example") BulletinExample example);

    int updateByPrimaryKeySelective(Bulletin record);

    int updateByPrimaryKey(Bulletin record);
}