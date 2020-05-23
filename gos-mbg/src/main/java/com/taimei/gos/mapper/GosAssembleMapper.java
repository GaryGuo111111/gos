package com.taimei.gos.mapper;

import com.taimei.gos.model.GosAssemble;
import com.taimei.gos.model.GosAssembleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GosAssembleMapper {
    long countByExample(GosAssembleExample example);

    int deleteByExample(GosAssembleExample example);

    int deleteByPrimaryKey(Integer gosAssembleId);

    int insert(GosAssemble record);

    int insertSelective(GosAssemble record);

    List<GosAssemble> selectByExample(GosAssembleExample example);

    GosAssemble selectByPrimaryKey(Integer gosAssembleId);

    int updateByExampleSelective(@Param("record") GosAssemble record, @Param("example") GosAssembleExample example);

    int updateByExample(@Param("record") GosAssemble record, @Param("example") GosAssembleExample example);

    int updateByPrimaryKeySelective(GosAssemble record);

    int updateByPrimaryKey(GosAssemble record);
}