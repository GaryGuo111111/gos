package com.taimei.gos.mapper;

import com.taimei.gos.model.TalkFunCourseGoods;
import com.taimei.gos.model.TalkFunCourseGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TalkFunCourseGoodsMapper {
    long countByExample(TalkFunCourseGoodsExample example);

    int deleteByExample(TalkFunCourseGoodsExample example);

    int deleteByPrimaryKey(Integer talkFunCourseGoodsId);

    int insert(TalkFunCourseGoods record);

    int insertSelective(TalkFunCourseGoods record);

    List<TalkFunCourseGoods> selectByExample(TalkFunCourseGoodsExample example);

    TalkFunCourseGoods selectByPrimaryKey(Integer talkFunCourseGoodsId);

    int updateByExampleSelective(@Param("record") TalkFunCourseGoods record, @Param("example") TalkFunCourseGoodsExample example);

    int updateByExample(@Param("record") TalkFunCourseGoods record, @Param("example") TalkFunCourseGoodsExample example);

    int updateByPrimaryKeySelective(TalkFunCourseGoods record);

    int updateByPrimaryKey(TalkFunCourseGoods record);
}