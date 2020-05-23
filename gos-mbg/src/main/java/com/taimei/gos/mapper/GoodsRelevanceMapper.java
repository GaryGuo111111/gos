package com.taimei.gos.mapper;

import com.taimei.gos.model.GoodsRelevance;
import com.taimei.gos.model.GoodsRelevanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsRelevanceMapper {
    long countByExample(GoodsRelevanceExample example);

    int deleteByExample(GoodsRelevanceExample example);

    int deleteByPrimaryKey(@Param("goodsId") Integer goodsId, @Param("relevanceGoodsId") Integer relevanceGoodsId);

    int insert(GoodsRelevance record);

    int insertSelective(GoodsRelevance record);

    List<GoodsRelevance> selectByExample(GoodsRelevanceExample example);

    int updateByExampleSelective(@Param("record") GoodsRelevance record, @Param("example") GoodsRelevanceExample example);

    int updateByExample(@Param("record") GoodsRelevance record, @Param("example") GoodsRelevanceExample example);
}