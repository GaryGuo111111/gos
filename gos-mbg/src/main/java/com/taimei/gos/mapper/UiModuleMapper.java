package com.taimei.gos.mapper;

import com.taimei.gos.model.UiModule;
import com.taimei.gos.model.UiModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UiModuleMapper {
    long countByExample(UiModuleExample example);

    int deleteByExample(UiModuleExample example);

    int deleteByPrimaryKey(Integer uiModuleId);

    int insert(UiModule record);

    int insertSelective(UiModule record);

    List<UiModule> selectByExampleWithBLOBs(UiModuleExample example);

    List<UiModule> selectByExample(UiModuleExample example);

    UiModule selectByPrimaryKey(Integer uiModuleId);

    int updateByExampleSelective(@Param("record") UiModule record, @Param("example") UiModuleExample example);

    int updateByExampleWithBLOBs(@Param("record") UiModule record, @Param("example") UiModuleExample example);

    int updateByExample(@Param("record") UiModule record, @Param("example") UiModuleExample example);

    int updateByPrimaryKeySelective(UiModule record);

    int updateByPrimaryKeyWithBLOBs(UiModule record);

    int updateByPrimaryKey(UiModule record);
}