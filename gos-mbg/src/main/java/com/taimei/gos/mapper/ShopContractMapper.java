package com.taimei.gos.mapper;

import com.taimei.gos.model.ShopContract;
import com.taimei.gos.model.ShopContractExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopContractMapper {
    long countByExample(ShopContractExample example);

    int deleteByExample(ShopContractExample example);

    int deleteByPrimaryKey(Integer shopContractId);

    int insert(ShopContract record);

    int insertSelective(ShopContract record);

    List<ShopContract> selectByExample(ShopContractExample example);

    ShopContract selectByPrimaryKey(Integer shopContractId);

    int updateByExampleSelective(@Param("record") ShopContract record, @Param("example") ShopContractExample example);

    int updateByExample(@Param("record") ShopContract record, @Param("example") ShopContractExample example);

    int updateByPrimaryKeySelective(ShopContract record);

    int updateByPrimaryKey(ShopContract record);
}