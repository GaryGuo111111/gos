package com.taimei.gos.mapper;

import com.taimei.gos.model.UserWalletLog;
import com.taimei.gos.model.UserWalletLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWalletLogMapper {
    long countByExample(UserWalletLogExample example);

    int deleteByExample(UserWalletLogExample example);

    int deleteByPrimaryKey(Integer walletLogId);

    int insert(UserWalletLog record);

    int insertSelective(UserWalletLog record);

    List<UserWalletLog> selectByExample(UserWalletLogExample example);

    UserWalletLog selectByPrimaryKey(Integer walletLogId);

    int updateByExampleSelective(@Param("record") UserWalletLog record, @Param("example") UserWalletLogExample example);

    int updateByExample(@Param("record") UserWalletLog record, @Param("example") UserWalletLogExample example);

    int updateByPrimaryKeySelective(UserWalletLog record);

    int updateByPrimaryKey(UserWalletLog record);
}