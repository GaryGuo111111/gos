package com.taimei.gos.mapper;

import com.taimei.gos.model.BonusPoolSettlement;
import com.taimei.gos.model.BonusPoolSettlementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BonusPoolSettlementMapper {
    long countByExample(BonusPoolSettlementExample example);

    int deleteByExample(BonusPoolSettlementExample example);

    int deleteByPrimaryKey(Integer bonusPoolSettlementId);

    int insert(BonusPoolSettlement record);

    int insertSelective(BonusPoolSettlement record);

    List<BonusPoolSettlement> selectByExample(BonusPoolSettlementExample example);

    BonusPoolSettlement selectByPrimaryKey(Integer bonusPoolSettlementId);

    int updateByExampleSelective(@Param("record") BonusPoolSettlement record, @Param("example") BonusPoolSettlementExample example);

    int updateByExample(@Param("record") BonusPoolSettlement record, @Param("example") BonusPoolSettlementExample example);

    int updateByPrimaryKeySelective(BonusPoolSettlement record);

    int updateByPrimaryKey(BonusPoolSettlement record);
}