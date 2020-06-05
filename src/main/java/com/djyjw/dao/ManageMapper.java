package com.djyjw.dao;

import com.djyjw.pojo.Manage;
import com.djyjw.pojo.ManageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManageMapper {
    long countByExample(ManageExample example);

    int deleteByExample(ManageExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(Manage record);

    int insertSelective(Manage record);

    List<Manage> selectByExample(ManageExample example);

    Manage selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") Manage record, @Param("example") ManageExample example);

    int updateByExample(@Param("record") Manage record, @Param("example") ManageExample example);

    int updateByPrimaryKeySelective(Manage record);

    int updateByPrimaryKey(Manage record);
}