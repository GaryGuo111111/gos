package com.taimei.gos.mapper;

import com.taimei.gos.model.SysAddress;
import com.taimei.gos.model.SysAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAddressMapper {
    long countByExample(SysAddressExample example);

    int deleteByExample(SysAddressExample example);

    int deleteByPrimaryKey(String code);

    int insert(SysAddress record);

    int insertSelective(SysAddress record);

    List<SysAddress> selectByExample(SysAddressExample example);

    SysAddress selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") SysAddress record, @Param("example") SysAddressExample example);

    int updateByExample(@Param("record") SysAddress record, @Param("example") SysAddressExample example);

    int updateByPrimaryKeySelective(SysAddress record);

    int updateByPrimaryKey(SysAddress record);
}