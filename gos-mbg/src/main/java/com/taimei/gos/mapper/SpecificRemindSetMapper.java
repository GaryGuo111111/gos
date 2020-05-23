package com.taimei.gos.mapper;

import com.taimei.gos.model.SpecificRemindSet;
import com.taimei.gos.model.SpecificRemindSetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpecificRemindSetMapper {
    long countByExample(SpecificRemindSetExample example);

    int deleteByExample(SpecificRemindSetExample example);

    int deleteByPrimaryKey(Integer specificRemindSetId);

    int insert(SpecificRemindSet record);

    int insertSelective(SpecificRemindSet record);

    List<SpecificRemindSet> selectByExample(SpecificRemindSetExample example);

    SpecificRemindSet selectByPrimaryKey(Integer specificRemindSetId);

    int updateByExampleSelective(@Param("record") SpecificRemindSet record, @Param("example") SpecificRemindSetExample example);

    int updateByExample(@Param("record") SpecificRemindSet record, @Param("example") SpecificRemindSetExample example);

    int updateByPrimaryKeySelective(SpecificRemindSet record);

    int updateByPrimaryKey(SpecificRemindSet record);
}