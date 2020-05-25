package com.taimei.gos.mapper;

import com.taimei.gos.model.GoodsAttributeKey;
import com.taimei.gos.model.GoodsAttributeKeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsAttributeKeyMapper {
    long countByExample(GoodsAttributeKeyExample example);

    int deleteByExample(GoodsAttributeKeyExample example);

    int deleteByPrimaryKey(Integer goodsAttributeKeyId);

    int insert(GoodsAttributeKey record);

    int insertSelective(GoodsAttributeKey record);

    List<GoodsAttributeKey> selectByExample(GoodsAttributeKeyExample example);

    GoodsAttributeKey selectByPrimaryKey(Integer goodsAttributeKeyId);

    int updateByExampleSelective(@Param("record") GoodsAttributeKey record, @Param("example") GoodsAttributeKeyExample example);

    int updateByExample(@Param("record") GoodsAttributeKey record, @Param("example") GoodsAttributeKeyExample example);

    int updateByPrimaryKeySelective(GoodsAttributeKey record);

    int updateByPrimaryKey(GoodsAttributeKey record);
}