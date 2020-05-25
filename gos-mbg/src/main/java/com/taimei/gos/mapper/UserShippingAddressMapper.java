package com.taimei.gos.mapper;

import com.taimei.gos.model.UserShippingAddress;
import com.taimei.gos.model.UserShippingAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserShippingAddressMapper {
    long countByExample(UserShippingAddressExample example);

    int deleteByExample(UserShippingAddressExample example);

    int deleteByPrimaryKey(Integer shippingAddressId);

    int insert(UserShippingAddress record);

    int insertSelective(UserShippingAddress record);

    List<UserShippingAddress> selectByExample(UserShippingAddressExample example);

    UserShippingAddress selectByPrimaryKey(Integer shippingAddressId);

    int updateByExampleSelective(@Param("record") UserShippingAddress record, @Param("example") UserShippingAddressExample example);

    int updateByExample(@Param("record") UserShippingAddress record, @Param("example") UserShippingAddressExample example);

    int updateByPrimaryKeySelective(UserShippingAddress record);

    int updateByPrimaryKey(UserShippingAddress record);
}