package com.djyjw.dao;

import com.djyjw.pojo.WorkInfo;
import com.djyjw.pojo.WorkInfoExample;
import com.djyjw.pojo.WorkInfoWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WorkInfoMapper {
    long countByExample(WorkInfoExample example);

    int deleteByExample(WorkInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorkInfoWithBLOBs record);

    int insertSelective(WorkInfoWithBLOBs record);

    List<WorkInfoWithBLOBs> selectByExampleWithBLOBs(WorkInfoExample example);

    List<WorkInfo> selectByExample(WorkInfoExample example);

    WorkInfoWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorkInfoWithBLOBs record, @Param("example") WorkInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") WorkInfoWithBLOBs record, @Param("example") WorkInfoExample example);

    int updateByExample(@Param("record") WorkInfo record, @Param("example") WorkInfoExample example);

    int updateByPrimaryKeySelective(WorkInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(WorkInfoWithBLOBs record);

    int updateByPrimaryKey(WorkInfo record);
}