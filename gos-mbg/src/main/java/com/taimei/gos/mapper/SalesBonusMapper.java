package com.taimei.gos.mapper;

import com.taimei.gos.model.SalesBonus;
import com.taimei.gos.model.SalesBonusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesBonusMapper {
    long countByExample(SalesBonusExample example);

    int deleteByExample(SalesBonusExample example);

    int deleteByPrimaryKey(Integer salesBonusId);

    int insert(SalesBonus record);

    int insertSelective(SalesBonus record);

    List<SalesBonus> selectByExample(SalesBonusExample example);

    SalesBonus selectByPrimaryKey(Integer salesBonusId);

    int updateByExampleSelective(@Param("record") SalesBonus record, @Param("example") SalesBonusExample example);

    int updateByExample(@Param("record") SalesBonus record, @Param("example") SalesBonusExample example);

    int updateByPrimaryKeySelective(SalesBonus record);

    int updateByPrimaryKey(SalesBonus record);
}