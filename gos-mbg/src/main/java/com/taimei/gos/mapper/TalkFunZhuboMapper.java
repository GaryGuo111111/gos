package com.taimei.gos.mapper;

import com.taimei.gos.model.TalkFunZhubo;
import com.taimei.gos.model.TalkFunZhuboExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TalkFunZhuboMapper {
    long countByExample(TalkFunZhuboExample example);

    int deleteByExample(TalkFunZhuboExample example);

    int insert(TalkFunZhubo record);

    int insertSelective(TalkFunZhubo record);

    List<TalkFunZhubo> selectByExample(TalkFunZhuboExample example);

    int updateByExampleSelective(@Param("record") TalkFunZhubo record, @Param("example") TalkFunZhuboExample example);

    int updateByExample(@Param("record") TalkFunZhubo record, @Param("example") TalkFunZhuboExample example);
}