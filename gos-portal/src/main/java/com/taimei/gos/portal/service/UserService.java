package com.taimei.gos.portal.service;

import com.github.pagehelper.util.StringUtil;
import com.taimei.gos.mapper.UserMapper;
import com.taimei.gos.model.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ggy
 */
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUser(String userId) throws Exception {
        if(StringUtil.isEmpty(userId)) {
            throw new Exception("参数错误");
        }
        return userMapper.selectByPrimaryKey(Integer.valueOf(userId));
    }
}
