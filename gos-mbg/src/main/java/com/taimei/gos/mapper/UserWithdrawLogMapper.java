package com.taimei.gos.mapper;

import com.taimei.gos.model.UserWithdrawLog;
import com.taimei.gos.model.UserWithdrawLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWithdrawLogMapper {
    long countByExample(UserWithdrawLogExample example);

    int deleteByExample(UserWithdrawLogExample example);

    int deleteByPrimaryKey(Integer withdrawLogId);

    int insert(UserWithdrawLog record);

    int insertSelective(UserWithdrawLog record);

    List<UserWithdrawLog> selectByExample(UserWithdrawLogExample example);

    UserWithdrawLog selectByPrimaryKey(Integer withdrawLogId);

    int updateByExampleSelective(@Param("record") UserWithdrawLog record, @Param("example") UserWithdrawLogExample example);

    int updateByExample(@Param("record") UserWithdrawLog record, @Param("example") UserWithdrawLogExample example);

    int updateByPrimaryKeySelective(UserWithdrawLog record);

    int updateByPrimaryKey(UserWithdrawLog record);
}