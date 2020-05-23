package com.taimei.gos.mapper;

import com.taimei.gos.model.GoodsShippingTemplatesRules;
import com.taimei.gos.model.GoodsShippingTemplatesRulesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsShippingTemplatesRulesMapper {
    long countByExample(GoodsShippingTemplatesRulesExample example);

    int deleteByExample(GoodsShippingTemplatesRulesExample example);

    int insert(GoodsShippingTemplatesRules record);

    int insertSelective(GoodsShippingTemplatesRules record);

    List<GoodsShippingTemplatesRules> selectByExample(GoodsShippingTemplatesRulesExample example);

    int updateByExampleSelective(@Param("record") GoodsShippingTemplatesRules record, @Param("example") GoodsShippingTemplatesRulesExample example);

    int updateByExample(@Param("record") GoodsShippingTemplatesRules record, @Param("example") GoodsShippingTemplatesRulesExample example);
}