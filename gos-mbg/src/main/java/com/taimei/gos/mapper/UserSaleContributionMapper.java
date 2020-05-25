package com.taimei.gos.mapper;

import com.taimei.gos.model.UserSaleContribution;
import com.taimei.gos.model.UserSaleContributionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserSaleContributionMapper {
    long countByExample(UserSaleContributionExample example);

    int deleteByExample(UserSaleContributionExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UserSaleContribution record);

    int insertSelective(UserSaleContribution record);

    List<UserSaleContribution> selectByExample(UserSaleContributionExample example);

    UserSaleContribution selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UserSaleContribution record, @Param("example") UserSaleContributionExample example);

    int updateByExample(@Param("record") UserSaleContribution record, @Param("example") UserSaleContributionExample example);

    int updateByPrimaryKeySelective(UserSaleContribution record);

    int updateByPrimaryKey(UserSaleContribution record);
}