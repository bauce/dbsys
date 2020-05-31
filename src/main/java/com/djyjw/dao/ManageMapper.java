package com.djyjw.dao;

import com.djyjw.pojo.Manage;
import com.djyjw.pojo.ManageExample;
import com.djyjw.pojo.ManageKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManageMapper {
    long countByExample(ManageExample example);

    int deleteByExample(ManageExample example);

    int deleteByPrimaryKey(ManageKey key);

    int insert(Manage record);

    int insertSelective(Manage record);

    List<Manage> selectByExample(ManageExample example);

    Manage selectByPrimaryKey(ManageKey key);

    int updateByExampleSelective(@Param("record") Manage record, @Param("example") ManageExample example);

    int updateByExample(@Param("record") Manage record, @Param("example") ManageExample example);

    int updateByPrimaryKeySelective(Manage record);

    int updateByPrimaryKey(Manage record);
}