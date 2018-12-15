package com.base.dao;

import com.base.model.MMenu;
import com.base.model.MMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MMenuMapper {
    int countByExample(MMenuExample example);

    int deleteByExample(MMenuExample example);

    int deleteByPrimaryKey(String uuid);

    int insert(MMenu record);

    int insertSelective(MMenu record);

    List<MMenu> selectByExample(MMenuExample example);

    MMenu selectByPrimaryKey(String uuid);

    int updateByExampleSelective(@Param("record") MMenu record, @Param("example") MMenuExample example);

    int updateByExample(@Param("record") MMenu record, @Param("example") MMenuExample example);

    int updateByPrimaryKeySelective(MMenu record);

    int updateByPrimaryKey(MMenu record);
}