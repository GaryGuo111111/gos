package com.taimei.gos.mapper;

import com.taimei.gos.model.ARole;
import com.taimei.gos.model.ARoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ARoleMapper {
    long countByExample(ARoleExample example);

    int deleteByExample(ARoleExample example);

    int deleteByPrimaryKey(Integer roleId);

    int insert(ARole record);

    int insertSelective(ARole record);

    List<ARole> selectByExample(ARoleExample example);

    ARole selectByPrimaryKey(Integer roleId);

    int updateByExampleSelective(@Param("record") ARole record, @Param("example") ARoleExample example);

    int updateByExample(@Param("record") ARole record, @Param("example") ARoleExample example);

    int updateByPrimaryKeySelective(ARole record);

    int updateByPrimaryKey(ARole record);
}