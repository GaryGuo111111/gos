package com.taimei.gos.mapper;

import com.taimei.gos.model.GoodsCategoryAttribute;
import com.taimei.gos.model.GoodsCategoryAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsCategoryAttributeMapper {
    long countByExample(GoodsCategoryAttributeExample example);

    int deleteByExample(GoodsCategoryAttributeExample example);

    int deleteByPrimaryKey(@Param("goodsCategoryId") Integer goodsCategoryId, @Param("goodsAttributeKeyId") Integer goodsAttributeKeyId);

    int insert(GoodsCategoryAttribute record);

    int insertSelective(GoodsCategoryAttribute record);

    List<GoodsCategoryAttribute> selectByExample(GoodsCategoryAttributeExample example);

    int updateByExampleSelective(@Param("record") GoodsCategoryAttribute record, @Param("example") GoodsCategoryAttributeExample example);

    int updateByExample(@Param("record") GoodsCategoryAttribute record, @Param("example") GoodsCategoryAttributeExample example);
}