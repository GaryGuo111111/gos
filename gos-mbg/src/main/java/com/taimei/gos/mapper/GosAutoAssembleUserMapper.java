package com.taimei.gos.mapper;

import com.taimei.gos.model.GosAutoAssembleUser;
import com.taimei.gos.model.GosAutoAssembleUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GosAutoAssembleUserMapper {
    long countByExample(GosAutoAssembleUserExample example);

    int deleteByExample(GosAutoAssembleUserExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(GosAutoAssembleUser record);

    int insertSelective(GosAutoAssembleUser record);

    List<GosAutoAssembleUser> selectByExample(GosAutoAssembleUserExample example);

    GosAutoAssembleUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") GosAutoAssembleUser record, @Param("example") GosAutoAssembleUserExample example);

    int updateByExample(@Param("record") GosAutoAssembleUser record, @Param("example") GosAutoAssembleUserExample example);

    int updateByPrimaryKeySelective(GosAutoAssembleUser record);

    int updateByPrimaryKey(GosAutoAssembleUser record);
}