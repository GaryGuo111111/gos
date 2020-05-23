package com.taimei.gos.mapper;

import com.taimei.gos.model.SysExpress;
import com.taimei.gos.model.SysExpressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysExpressMapper {
    long countByExample(SysExpressExample example);

    int deleteByExample(SysExpressExample example);

    int deleteByPrimaryKey(Integer sysExpressId);

    int insert(SysExpress record);

    int insertSelective(SysExpress record);

    List<SysExpress> selectByExample(SysExpressExample example);

    SysExpress selectByPrimaryKey(Integer sysExpressId);

    int updateByExampleSelective(@Param("record") SysExpress record, @Param("example") SysExpressExample example);

    int updateByExample(@Param("record") SysExpress record, @Param("example") SysExpressExample example);

    int updateByPrimaryKeySelective(SysExpress record);

    int updateByPrimaryKey(SysExpress record);
}