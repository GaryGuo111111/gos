package com.taimei.gos.admin.service;

import cn.hutool.core.collection.CollUtil;
import com.taimei.gos.admin.bo.AdminUserDetails;
import com.taimei.gos.admin.dao.AdminRoleDao;
import com.taimei.gos.mapper.AdminMapper;
import com.taimei.gos.model.AResource;
import com.taimei.gos.model.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private AdminRoleDao adminRoleDao;

    public Admin getAdminByUsername(String username) {
        return adminMapper.selectByPrimaryKey(Integer.valueOf(username));
    }

    public UserDetails loadUserByUsername(String username){
        //获取用户信息
        Admin admin = getAdminByUsername(username);
        if (admin != null) {
            List<AResource> resourceList = getResourceList(admin.getAdminId());
            return new AdminUserDetails(admin,resourceList);
        }
        throw new UsernameNotFoundException("用户名或密码错误");
    }

    public List<AResource> getResourceList(Integer adminId) {
        return adminRoleDao.getResourceList(adminId);
    }
}
