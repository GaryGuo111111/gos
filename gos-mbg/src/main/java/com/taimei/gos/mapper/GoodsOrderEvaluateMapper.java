package com.taimei.gos.mapper;

import com.taimei.gos.model.GoodsOrderEvaluate;
import com.taimei.gos.model.GoodsOrderEvaluateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsOrderEvaluateMapper {
    long countByExample(GoodsOrderEvaluateExample example);

    int deleteByExample(GoodsOrderEvaluateExample example);

    int deleteByPrimaryKey(Integer goodsOrderEvaluateId);

    int insert(GoodsOrderEvaluate record);

    int insertSelective(GoodsOrderEvaluate record);

    List<GoodsOrderEvaluate> selectByExampleWithBLOBs(GoodsOrderEvaluateExample example);

    List<GoodsOrderEvaluate> selectByExample(GoodsOrderEvaluateExample example);

    GoodsOrderEvaluate selectByPrimaryKey(Integer goodsOrderEvaluateId);

    int updateByExampleSelective(@Param("record") GoodsOrderEvaluate record, @Param("example") GoodsOrderEvaluateExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodsOrderEvaluate record, @Param("example") GoodsOrderEvaluateExample example);

    int updateByExample(@Param("record") GoodsOrderEvaluate record, @Param("example") GoodsOrderEvaluateExample example);

    int updateByPrimaryKeySelective(GoodsOrderEvaluate record);

    int updateByPrimaryKeyWithBLOBs(GoodsOrderEvaluate record);

    int updateByPrimaryKey(GoodsOrderEvaluate record);
}