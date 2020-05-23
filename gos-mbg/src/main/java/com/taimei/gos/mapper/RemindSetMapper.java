package com.taimei.gos.mapper;

import com.taimei.gos.model.RemindSet;
import com.taimei.gos.model.RemindSetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RemindSetMapper {
    long countByExample(RemindSetExample example);

    int deleteByExample(RemindSetExample example);

    int deleteByPrimaryKey(Integer remindSetId);

    int insert(RemindSet record);

    int insertSelective(RemindSet record);

    List<RemindSet> selectByExample(RemindSetExample example);

    RemindSet selectByPrimaryKey(Integer remindSetId);

    int updateByExampleSelective(@Param("record") RemindSet record, @Param("example") RemindSetExample example);

    int updateByExample(@Param("record") RemindSet record, @Param("example") RemindSetExample example);

    int updateByPrimaryKeySelective(RemindSet record);

    int updateByPrimaryKey(RemindSet record);
}