package com.taimei.gos.mapper;

import com.taimei.gos.model.GosAutoAssembleGoods;
import com.taimei.gos.model.GosAutoAssembleGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GosAutoAssembleGoodsMapper {
    long countByExample(GosAutoAssembleGoodsExample example);

    int deleteByExample(GosAutoAssembleGoodsExample example);

    int deleteByPrimaryKey(Integer gosAutoAssembleGoodsId);

    int insert(GosAutoAssembleGoods record);

    int insertSelective(GosAutoAssembleGoods record);

    List<GosAutoAssembleGoods> selectByExample(GosAutoAssembleGoodsExample example);

    GosAutoAssembleGoods selectByPrimaryKey(Integer gosAutoAssembleGoodsId);

    int updateByExampleSelective(@Param("record") GosAutoAssembleGoods record, @Param("example") GosAutoAssembleGoodsExample example);

    int updateByExample(@Param("record") GosAutoAssembleGoods record, @Param("example") GosAutoAssembleGoodsExample example);

    int updateByPrimaryKeySelective(GosAutoAssembleGoods record);

    int updateByPrimaryKey(GosAutoAssembleGoods record);
}