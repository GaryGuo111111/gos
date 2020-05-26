package com.taimei.gos.admin.service;

import com.taimei.gos.admin.bo.AdminUserDetails;
import com.taimei.gos.admin.dao.AdminRoleDao;
import com.taimei.gos.admin.dto.AdminParam;
import com.taimei.gos.mapper.AdminMapper;
import com.taimei.gos.model.AResource;
import com.taimei.gos.model.Admin;
import com.taimei.gos.model.AdminExample;
import com.taimei.gos.security.util.JwtTokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ggy
 */
@Service
public class AdminService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdminService.class);

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private AdminRoleDao adminRoleDao;

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    /**
     * 获取用户信息
     * @param username
     * @return
     */
    public Admin getAdminByUsername(String username) {
        return adminMapper.selectByPrimaryKey(Integer.valueOf(username));
    }

    /**
     * 获取用户信息
     * @param username
     * @return
     */
    public UserDetails loadUserByUsername(String username){
        //获取用户信息
        Admin admin = getAdminByUsername(username);
        if (admin != null) {
            List<AResource> resourceList = getResourceList(admin.getAdminId());
            return new AdminUserDetails(admin,resourceList);
        }
        throw new UsernameNotFoundException("用户名或密码错误");
    }

    /**
     * 获取用户信息
     * @param adminId
     * @return
     */
    public List<AResource> getResourceList(Integer adminId) {
        return adminRoleDao.getResourceList(adminId);
    }

    /**
     * 新建用户
     * @param adminParam
     * @return
     */
    public Admin register(AdminParam adminParam) {
        Admin admin = new Admin();
        BeanUtils.copyProperties(adminParam, admin);
        admin.setCreateTime((int) System.currentTimeMillis() /1000);
        admin.setIsFreeze((byte) 0);
        admin.setIsDelete((byte) 0);
        admin.setDeleteTime(0);
        //查询是否有相同用户名的用户
        AdminExample example = new AdminExample();
        example.createCriteria().andUserNameEqualTo(admin.getUserName());
        List<Admin> adminList = adminMapper.selectByExample(example);
        if (adminList.size() > 0) {
            return null;
        }
        //将密码进行加密操作
        String encodePassword = passwordEncoder.encode(admin.getPassword());
        admin.setPassword(encodePassword);
        adminMapper.insert(admin);
        return admin;
    }

    /**
     * 用户登陆
     * @param username
     * @param password
     * @return
     */
    public String login(String username, String password) {
        String token = null;
        //密码需要客户端加密后传递
        try {
            AdminExample example = new AdminExample();
            example.createCriteria().andUserNameEqualTo(username);
            List<Admin> admins = adminMapper.selectByExample(example);
            if(admins.size() ==0 ){
                throw new UsernameNotFoundException("用户不存在");
            }
            List<AResource> resourceList = getResourceList(admins.get(0).getAdminId());
            AdminUserDetails userDetails = new AdminUserDetails(admins.get(0), resourceList);
            if(!passwordEncoder.matches(password,userDetails.getPassword())){
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authentication);
            token = jwtTokenUtil.generateToken(userDetails);
        } catch (AuthenticationException e) {
            LOGGER.warn("登录异常:{}", e.getMessage());
        }
        return token;
    }
}
