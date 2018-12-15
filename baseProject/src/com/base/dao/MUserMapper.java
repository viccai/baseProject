package com.base.dao;

import com.base.model.MUser;
import com.base.model.MUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MUserMapper {
    int countByExample(MUserExample example);

    int deleteByExample(MUserExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(MUser record);

    int insertSelective(MUser record);

    List<MUser> selectByExample(MUserExample example);

    MUser selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") MUser record, @Param("example") MUserExample example);

    int updateByExample(@Param("record") MUser record, @Param("example") MUserExample example);

    int updateByPrimaryKeySelective(MUser record);

    int updateByPrimaryKey(MUser record);
}