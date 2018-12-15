package com.base.dao;

import com.base.model.MRole;
import com.base.model.MRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MRoleMapper {
    int countByExample(MRoleExample example);

    int deleteByExample(MRoleExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(MRole record);

    int insertSelective(MRole record);

    List<MRole> selectByExample(MRoleExample example);

    MRole selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") MRole record, @Param("example") MRoleExample example);

    int updateByExample(@Param("record") MRole record, @Param("example") MRoleExample example);

    int updateByPrimaryKeySelective(MRole record);

    int updateByPrimaryKey(MRole record);
}