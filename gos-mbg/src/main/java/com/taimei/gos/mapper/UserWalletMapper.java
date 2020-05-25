package com.taimei.gos.mapper;

import com.taimei.gos.model.UserWallet;
import com.taimei.gos.model.UserWalletExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWalletMapper {
    long countByExample(UserWalletExample example);

    int deleteByExample(UserWalletExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UserWallet record);

    int insertSelective(UserWallet record);

    List<UserWallet> selectByExample(UserWalletExample example);

    UserWallet selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UserWallet record, @Param("example") UserWalletExample example);

    int updateByExample(@Param("record") UserWallet record, @Param("example") UserWalletExample example);

    int updateByPrimaryKeySelective(UserWallet record);

    int updateByPrimaryKey(UserWallet record);
}