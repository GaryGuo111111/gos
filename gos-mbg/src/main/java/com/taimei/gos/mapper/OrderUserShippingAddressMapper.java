package com.taimei.gos.mapper;

import com.taimei.gos.model.OrderUserShippingAddress;
import com.taimei.gos.model.OrderUserShippingAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderUserShippingAddressMapper {
    long countByExample(OrderUserShippingAddressExample example);

    int deleteByExample(OrderUserShippingAddressExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(OrderUserShippingAddress record);

    int insertSelective(OrderUserShippingAddress record);

    List<OrderUserShippingAddress> selectByExample(OrderUserShippingAddressExample example);

    OrderUserShippingAddress selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") OrderUserShippingAddress record, @Param("example") OrderUserShippingAddressExample example);

    int updateByExample(@Param("record") OrderUserShippingAddress record, @Param("example") OrderUserShippingAddressExample example);

    int updateByPrimaryKeySelective(OrderUserShippingAddress record);

    int updateByPrimaryKey(OrderUserShippingAddress record);
}