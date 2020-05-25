package com.taimei.gos.mapper;

import com.taimei.gos.model.GoodsMaxBuyMode;
import com.taimei.gos.model.GoodsMaxBuyModeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsMaxBuyModeMapper {
    long countByExample(GoodsMaxBuyModeExample example);

    int deleteByExample(GoodsMaxBuyModeExample example);

    int deleteByPrimaryKey(Integer goodsId);

    int insert(GoodsMaxBuyMode record);

    int insertSelective(GoodsMaxBuyMode record);

    List<GoodsMaxBuyMode> selectByExample(GoodsMaxBuyModeExample example);

    GoodsMaxBuyMode selectByPrimaryKey(Integer goodsId);

    int updateByExampleSelective(@Param("record") GoodsMaxBuyMode record, @Param("example") GoodsMaxBuyModeExample example);

    int updateByExample(@Param("record") GoodsMaxBuyMode record, @Param("example") GoodsMaxBuyModeExample example);

    int updateByPrimaryKeySelective(GoodsMaxBuyMode record);

    int updateByPrimaryKey(GoodsMaxBuyMode record);
}