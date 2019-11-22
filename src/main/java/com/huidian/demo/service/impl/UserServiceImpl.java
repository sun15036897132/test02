package com.huidian.demo.service.impl;

import com.huidian.demo.domain.User;
import com.huidian.demo.mapper.UserMapper;
import com.huidian.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String uusername, String upassword) {

        return userMapper.login(uusername, upassword);
    }
}

