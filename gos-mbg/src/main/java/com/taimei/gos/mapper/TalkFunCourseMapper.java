package com.taimei.gos.mapper;

import com.taimei.gos.model.TalkFunCourse;
import com.taimei.gos.model.TalkFunCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TalkFunCourseMapper {
    long countByExample(TalkFunCourseExample example);

    int deleteByExample(TalkFunCourseExample example);

    int deleteByPrimaryKey(Integer talkFunCourseId);

    int insert(TalkFunCourse record);

    int insertSelective(TalkFunCourse record);

    List<TalkFunCourse> selectByExampleWithBLOBs(TalkFunCourseExample example);

    List<TalkFunCourse> selectByExample(TalkFunCourseExample example);

    TalkFunCourse selectByPrimaryKey(Integer talkFunCourseId);

    int updateByExampleSelective(@Param("record") TalkFunCourse record, @Param("example") TalkFunCourseExample example);

    int updateByExampleWithBLOBs(@Param("record") TalkFunCourse record, @Param("example") TalkFunCourseExample example);

    int updateByExample(@Param("record") TalkFunCourse record, @Param("example") TalkFunCourseExample example);

    int updateByPrimaryKeySelective(TalkFunCourse record);

    int updateByPrimaryKeyWithBLOBs(TalkFunCourse record);

    int updateByPrimaryKey(TalkFunCourse record);
}