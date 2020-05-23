package com.taimei.gos.mapper;

import com.taimei.gos.model.AdminActionLog;
import com.taimei.gos.model.AdminActionLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminActionLogMapper {
    long countByExample(AdminActionLogExample example);

    int deleteByExample(AdminActionLogExample example);

    int deleteByPrimaryKey(Integer actionLogId);

    int insert(AdminActionLog record);

    int insertSelective(AdminActionLog record);

    List<AdminActionLog> selectByExampleWithBLOBs(AdminActionLogExample example);

    List<AdminActionLog> selectByExample(AdminActionLogExample example);

    AdminActionLog selectByPrimaryKey(Integer actionLogId);

    int updateByExampleSelective(@Param("record") AdminActionLog record, @Param("example") AdminActionLogExample example);

    int updateByExampleWithBLOBs(@Param("record") AdminActionLog record, @Param("example") AdminActionLogExample example);

    int updateByExample(@Param("record") AdminActionLog record, @Param("example") AdminActionLogExample example);

    int updateByPrimaryKeySelective(AdminActionLog record);

    int updateByPrimaryKeyWithBLOBs(AdminActionLog record);

    int updateByPrimaryKey(AdminActionLog record);
}