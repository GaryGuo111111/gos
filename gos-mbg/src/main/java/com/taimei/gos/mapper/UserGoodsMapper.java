package com.taimei.gos.mapper;

import com.taimei.gos.model.UserGoods;
import com.taimei.gos.model.UserGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserGoodsMapper {
    long countByExample(UserGoodsExample example);

    int deleteByExample(UserGoodsExample example);

    int deleteByPrimaryKey(Integer userGoodsId);

    int insert(UserGoods record);

    int insertSelective(UserGoods record);

    List<UserGoods> selectByExample(UserGoodsExample example);

    UserGoods selectByPrimaryKey(Integer userGoodsId);

    int updateByExampleSelective(@Param("record") UserGoods record, @Param("example") UserGoodsExample example);

    int updateByExample(@Param("record") UserGoods record, @Param("example") UserGoodsExample example);

    int updateByPrimaryKeySelective(UserGoods record);

    int updateByPrimaryKey(UserGoods record);
}