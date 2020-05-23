package com.taimei.gos.mapper;

import com.taimei.gos.model.SysConfig;
import com.taimei.gos.model.SysConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysConfigMapper {
    long countByExample(SysConfigExample example);

    int deleteByExample(SysConfigExample example);

    int deleteByPrimaryKey(String k);

    int insert(SysConfig record);

    int insertSelective(SysConfig record);

    List<SysConfig> selectByExampleWithBLOBs(SysConfigExample example);

    List<SysConfig> selectByExample(SysConfigExample example);

    SysConfig selectByPrimaryKey(String k);

    int updateByExampleSelective(@Param("record") SysConfig record, @Param("example") SysConfigExample example);

    int updateByExampleWithBLOBs(@Param("record") SysConfig record, @Param("example") SysConfigExample example);

    int updateByExample(@Param("record") SysConfig record, @Param("example") SysConfigExample example);

    int updateByPrimaryKeySelective(SysConfig record);

    int updateByPrimaryKeyWithBLOBs(SysConfig record);

    int updateByPrimaryKey(SysConfig record);
}