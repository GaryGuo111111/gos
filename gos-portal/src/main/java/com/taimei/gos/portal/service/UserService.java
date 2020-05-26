package com.taimei.gos.portal.service;

import com.github.pagehelper.util.StringUtil;
import com.taimei.gos.mapper.UserMapper;
import com.taimei.gos.model.User;
import com.taimei.gos.portal.domain.MemberDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author ggy
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getByUsername(String username) {
        return userMapper.selectByPrimaryKey(Integer.valueOf(username));
    }

    public UserDetails loadUserByUsername(String username) {
        User member = getByUsername(username);
        if(member!=null){
            return new MemberDetails(member);
        }
        throw new UsernameNotFoundException("用户名或密码错误");
    }
}
