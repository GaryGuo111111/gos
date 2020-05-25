package com.taimei.gos.mapper;

import com.taimei.gos.model.GosPart;
import com.taimei.gos.model.GosPartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GosPartMapper {
    long countByExample(GosPartExample example);

    int deleteByExample(GosPartExample example);

    int deleteByPrimaryKey(Integer gosPartId);

    int insert(GosPart record);

    int insertSelective(GosPart record);

    List<GosPart> selectByExample(GosPartExample example);

    GosPart selectByPrimaryKey(Integer gosPartId);

    int updateByExampleSelective(@Param("record") GosPart record, @Param("example") GosPartExample example);

    int updateByExample(@Param("record") GosPart record, @Param("example") GosPartExample example);

    int updateByPrimaryKeySelective(GosPart record);

    int updateByPrimaryKey(GosPart record);
}