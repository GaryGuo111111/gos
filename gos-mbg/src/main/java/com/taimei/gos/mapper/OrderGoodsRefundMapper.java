package com.taimei.gos.mapper;

import com.taimei.gos.model.OrderGoodsRefund;
import com.taimei.gos.model.OrderGoodsRefundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderGoodsRefundMapper {
    long countByExample(OrderGoodsRefundExample example);

    int deleteByExample(OrderGoodsRefundExample example);

    int deleteByPrimaryKey(Integer orderGoodsId);

    int insert(OrderGoodsRefund record);

    int insertSelective(OrderGoodsRefund record);

    List<OrderGoodsRefund> selectByExampleWithBLOBs(OrderGoodsRefundExample example);

    List<OrderGoodsRefund> selectByExample(OrderGoodsRefundExample example);

    OrderGoodsRefund selectByPrimaryKey(Integer orderGoodsId);

    int updateByExampleSelective(@Param("record") OrderGoodsRefund record, @Param("example") OrderGoodsRefundExample example);

    int updateByExampleWithBLOBs(@Param("record") OrderGoodsRefund record, @Param("example") OrderGoodsRefundExample example);

    int updateByExample(@Param("record") OrderGoodsRefund record, @Param("example") OrderGoodsRefundExample example);

    int updateByPrimaryKeySelective(OrderGoodsRefund record);

    int updateByPrimaryKeyWithBLOBs(OrderGoodsRefund record);

    int updateByPrimaryKey(OrderGoodsRefund record);
}