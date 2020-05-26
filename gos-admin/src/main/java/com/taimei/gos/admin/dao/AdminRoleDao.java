package com.taimei.gos.admin.dao;

import com.taimei.gos.model.AResource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 后台用户与角色管理自定义Dao
 * Created by macro on 2018/10/8.
 */
public interface AdminRoleDao {

    /**
     * 获取用户所有可访问资源
     */
    List<AResource> getResourceList(@Param("adminId") Integer adminId);

}
