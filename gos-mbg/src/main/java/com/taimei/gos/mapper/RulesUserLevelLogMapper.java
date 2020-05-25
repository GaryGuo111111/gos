package com.taimei.gos.mapper;

import com.taimei.gos.model.RulesUserLevelLog;
import com.taimei.gos.model.RulesUserLevelLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RulesUserLevelLogMapper {
    long countByExample(RulesUserLevelLogExample example);

    int deleteByExample(RulesUserLevelLogExample example);

    int deleteByPrimaryKey(Integer upLevelLogId);

    int insert(RulesUserLevelLog record);

    int insertSelective(RulesUserLevelLog record);

    List<RulesUserLevelLog> selectByExample(RulesUserLevelLogExample example);

    RulesUserLevelLog selectByPrimaryKey(Integer upLevelLogId);

    int updateByExampleSelective(@Param("record") RulesUserLevelLog record, @Param("example") RulesUserLevelLogExample example);

    int updateByExample(@Param("record") RulesUserLevelLog record, @Param("example") RulesUserLevelLogExample example);

    int updateByPrimaryKeySelective(RulesUserLevelLog record);

    int updateByPrimaryKey(RulesUserLevelLog record);
}