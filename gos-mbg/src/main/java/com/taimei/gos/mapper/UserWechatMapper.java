package com.taimei.gos.mapper;

import com.taimei.gos.model.UserWechat;
import com.taimei.gos.model.UserWechatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWechatMapper {
    long countByExample(UserWechatExample example);

    int deleteByExample(UserWechatExample example);

    int deleteByPrimaryKey(Integer userWechatId);

    int insert(UserWechat record);

    int insertSelective(UserWechat record);

    List<UserWechat> selectByExample(UserWechatExample example);

    UserWechat selectByPrimaryKey(Integer userWechatId);

    int updateByExampleSelective(@Param("record") UserWechat record, @Param("example") UserWechatExample example);

    int updateByExample(@Param("record") UserWechat record, @Param("example") UserWechatExample example);

    int updateByPrimaryKeySelective(UserWechat record);

    int updateByPrimaryKey(UserWechat record);
}