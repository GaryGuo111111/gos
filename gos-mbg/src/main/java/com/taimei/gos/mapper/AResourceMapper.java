package com.taimei.gos.mapper;

import com.taimei.gos.model.AResource;
import com.taimei.gos.model.AResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AResourceMapper {
    long countByExample(AResourceExample example);

    int deleteByExample(AResourceExample example);

    int deleteByPrimaryKey(Integer aResourceId);

    int insert(AResource record);

    int insertSelective(AResource record);

    List<AResource> selectByExample(AResourceExample example);

    AResource selectByPrimaryKey(Integer aResourceId);

    int updateByExampleSelective(@Param("record") AResource record, @Param("example") AResourceExample example);

    int updateByExample(@Param("record") AResource record, @Param("example") AResourceExample example);

    int updateByPrimaryKeySelective(AResource record);

    int updateByPrimaryKey(AResource record);
}