package com.taimei.gos.mapper;

import com.taimei.gos.model.ShippingTemplatesRules;
import com.taimei.gos.model.ShippingTemplatesRulesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShippingTemplatesRulesMapper {
    long countByExample(ShippingTemplatesRulesExample example);

    int deleteByExample(ShippingTemplatesRulesExample example);

    int deleteByPrimaryKey(Integer shippingTemplatesRulesId);

    int insert(ShippingTemplatesRules record);

    int insertSelective(ShippingTemplatesRules record);

    List<ShippingTemplatesRules> selectByExample(ShippingTemplatesRulesExample example);

    ShippingTemplatesRules selectByPrimaryKey(Integer shippingTemplatesRulesId);

    int updateByExampleSelective(@Param("record") ShippingTemplatesRules record, @Param("example") ShippingTemplatesRulesExample example);

    int updateByExample(@Param("record") ShippingTemplatesRules record, @Param("example") ShippingTemplatesRulesExample example);

    int updateByPrimaryKeySelective(ShippingTemplatesRules record);

    int updateByPrimaryKey(ShippingTemplatesRules record);
}