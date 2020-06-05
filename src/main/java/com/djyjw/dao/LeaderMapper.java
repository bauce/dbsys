package com.djyjw.dao;

import com.djyjw.pojo.Leader;
import com.djyjw.pojo.LeaderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LeaderMapper {
    long countByExample(LeaderExample example);

    int deleteByExample(LeaderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Leader record);

    int insertSelective(Leader record);

    List<Leader> selectByExample(LeaderExample example);

    Leader selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Leader record, @Param("example") LeaderExample example);

    int updateByExample(@Param("record") Leader record, @Param("example") LeaderExample example);

    int updateByPrimaryKeySelective(Leader record);

    int updateByPrimaryKey(Leader record);
}