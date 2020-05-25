package com.taimei.gos.mapper;

import com.taimei.gos.model.GoodsAttributeValue;
import com.taimei.gos.model.GoodsAttributeValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsAttributeValueMapper {
    long countByExample(GoodsAttributeValueExample example);

    int deleteByExample(GoodsAttributeValueExample example);

    int deleteByPrimaryKey(Integer goodsAttributeValueId);

    int insert(GoodsAttributeValue record);

    int insertSelective(GoodsAttributeValue record);

    List<GoodsAttributeValue> selectByExample(GoodsAttributeValueExample example);

    GoodsAttributeValue selectByPrimaryKey(Integer goodsAttributeValueId);

    int updateByExampleSelective(@Param("record") GoodsAttributeValue record, @Param("example") GoodsAttributeValueExample example);

    int updateByExample(@Param("record") GoodsAttributeValue record, @Param("example") GoodsAttributeValueExample example);

    int updateByPrimaryKeySelective(GoodsAttributeValue record);

    int updateByPrimaryKey(GoodsAttributeValue record);
}