package com.taimei.gos.mapper;

import com.taimei.gos.model.RulesGoodsBuyLevelPriceDifferences;
import com.taimei.gos.model.RulesGoodsBuyLevelPriceDifferencesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RulesGoodsBuyLevelPriceDifferencesMapper {
    long countByExample(RulesGoodsBuyLevelPriceDifferencesExample example);

    int deleteByExample(RulesGoodsBuyLevelPriceDifferencesExample example);

    int deleteByPrimaryKey(Integer levelPriceId);

    int insert(RulesGoodsBuyLevelPriceDifferences record);

    int insertSelective(RulesGoodsBuyLevelPriceDifferences record);

    List<RulesGoodsBuyLevelPriceDifferences> selectByExample(RulesGoodsBuyLevelPriceDifferencesExample example);

    RulesGoodsBuyLevelPriceDifferences selectByPrimaryKey(Integer levelPriceId);

    int updateByExampleSelective(@Param("record") RulesGoodsBuyLevelPriceDifferences record, @Param("example") RulesGoodsBuyLevelPriceDifferencesExample example);

    int updateByExample(@Param("record") RulesGoodsBuyLevelPriceDifferences record, @Param("example") RulesGoodsBuyLevelPriceDifferencesExample example);

    int updateByPrimaryKeySelective(RulesGoodsBuyLevelPriceDifferences record);

    int updateByPrimaryKey(RulesGoodsBuyLevelPriceDifferences record);
}