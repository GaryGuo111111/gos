package com.taimei.gos.mapper;

import com.taimei.gos.model.RemindContentTemplate;
import com.taimei.gos.model.RemindContentTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RemindContentTemplateMapper {
    long countByExample(RemindContentTemplateExample example);

    int deleteByExample(RemindContentTemplateExample example);

    int deleteByPrimaryKey(Long remindType);

    int insert(RemindContentTemplate record);

    int insertSelective(RemindContentTemplate record);

    List<RemindContentTemplate> selectByExample(RemindContentTemplateExample example);

    RemindContentTemplate selectByPrimaryKey(Long remindType);

    int updateByExampleSelective(@Param("record") RemindContentTemplate record, @Param("example") RemindContentTemplateExample example);

    int updateByExample(@Param("record") RemindContentTemplate record, @Param("example") RemindContentTemplateExample example);

    int updateByPrimaryKeySelective(RemindContentTemplate record);

    int updateByPrimaryKey(RemindContentTemplate record);
}