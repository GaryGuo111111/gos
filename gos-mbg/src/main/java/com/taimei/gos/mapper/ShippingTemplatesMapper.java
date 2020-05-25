package com.taimei.gos.mapper;

import com.taimei.gos.model.ShippingTemplates;
import com.taimei.gos.model.ShippingTemplatesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShippingTemplatesMapper {
    long countByExample(ShippingTemplatesExample example);

    int deleteByExample(ShippingTemplatesExample example);

    int deleteByPrimaryKey(Integer shippingTemplatesId);

    int insert(ShippingTemplates record);

    int insertSelective(ShippingTemplates record);

    List<ShippingTemplates> selectByExample(ShippingTemplatesExample example);

    ShippingTemplates selectByPrimaryKey(Integer shippingTemplatesId);

    int updateByExampleSelective(@Param("record") ShippingTemplates record, @Param("example") ShippingTemplatesExample example);

    int updateByExample(@Param("record") ShippingTemplates record, @Param("example") ShippingTemplatesExample example);

    int updateByPrimaryKeySelective(ShippingTemplates record);

    int updateByPrimaryKey(ShippingTemplates record);
}