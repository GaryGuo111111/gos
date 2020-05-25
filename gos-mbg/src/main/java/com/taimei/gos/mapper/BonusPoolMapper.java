package com.taimei.gos.mapper;

import com.taimei.gos.model.BonusPool;
import com.taimei.gos.model.BonusPoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BonusPoolMapper {
    long countByExample(BonusPoolExample example);

    int deleteByExample(BonusPoolExample example);

    int deleteByPrimaryKey(Integer bonusPoolId);

    int insert(BonusPool record);

    int insertSelective(BonusPool record);

    List<BonusPool> selectByExample(BonusPoolExample example);

    BonusPool selectByPrimaryKey(Integer bonusPoolId);

    int updateByExampleSelective(@Param("record") BonusPool record, @Param("example") BonusPoolExample example);

    int updateByExample(@Param("record") BonusPool record, @Param("example") BonusPoolExample example);

    int updateByPrimaryKeySelective(BonusPool record);

    int updateByPrimaryKey(BonusPool record);
}