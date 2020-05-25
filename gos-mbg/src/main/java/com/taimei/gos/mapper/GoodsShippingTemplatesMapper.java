package com.taimei.gos.mapper;

import com.taimei.gos.model.GoodsShippingTemplates;
import com.taimei.gos.model.GoodsShippingTemplatesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsShippingTemplatesMapper {
    long countByExample(GoodsShippingTemplatesExample example);

    int deleteByExample(GoodsShippingTemplatesExample example);

    int deleteByPrimaryKey(@Param("goodsId") Integer goodsId, @Param("shippingTemplatesId") Integer shippingTemplatesId);

    int insert(GoodsShippingTemplates record);

    int insertSelective(GoodsShippingTemplates record);

    List<GoodsShippingTemplates> selectByExample(GoodsShippingTemplatesExample example);

    int updateByExampleSelective(@Param("record") GoodsShippingTemplates record, @Param("example") GoodsShippingTemplatesExample example);

    int updateByExample(@Param("record") GoodsShippingTemplates record, @Param("example") GoodsShippingTemplatesExample example);
}