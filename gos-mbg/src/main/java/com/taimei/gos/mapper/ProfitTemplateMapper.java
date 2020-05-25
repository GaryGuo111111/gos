package com.taimei.gos.mapper;

import com.taimei.gos.model.ProfitTemplate;
import com.taimei.gos.model.ProfitTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfitTemplateMapper {
    long countByExample(ProfitTemplateExample example);

    int deleteByExample(ProfitTemplateExample example);

    int deleteByPrimaryKey(Integer profitTemplateId);

    int insert(ProfitTemplate record);

    int insertSelective(ProfitTemplate record);

    List<ProfitTemplate> selectByExample(ProfitTemplateExample example);

    ProfitTemplate selectByPrimaryKey(Integer profitTemplateId);

    int updateByExampleSelective(@Param("record") ProfitTemplate record, @Param("example") ProfitTemplateExample example);

    int updateByExample(@Param("record") ProfitTemplate record, @Param("example") ProfitTemplateExample example);

    int updateByPrimaryKeySelective(ProfitTemplate record);

    int updateByPrimaryKey(ProfitTemplate record);
}