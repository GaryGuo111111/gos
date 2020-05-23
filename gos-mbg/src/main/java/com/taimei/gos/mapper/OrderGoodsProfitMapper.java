package com.taimei.gos.mapper;

import com.taimei.gos.model.OrderGoodsProfit;
import com.taimei.gos.model.OrderGoodsProfitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderGoodsProfitMapper {
    long countByExample(OrderGoodsProfitExample example);

    int deleteByExample(OrderGoodsProfitExample example);

    int deleteByPrimaryKey(Integer orderGoodsProfitId);

    int insert(OrderGoodsProfit record);

    int insertSelective(OrderGoodsProfit record);

    List<OrderGoodsProfit> selectByExample(OrderGoodsProfitExample example);

    OrderGoodsProfit selectByPrimaryKey(Integer orderGoodsProfitId);

    int updateByExampleSelective(@Param("record") OrderGoodsProfit record, @Param("example") OrderGoodsProfitExample example);

    int updateByExample(@Param("record") OrderGoodsProfit record, @Param("example") OrderGoodsProfitExample example);

    int updateByPrimaryKeySelective(OrderGoodsProfit record);

    int updateByPrimaryKey(OrderGoodsProfit record);
}