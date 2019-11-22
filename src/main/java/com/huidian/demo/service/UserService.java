package com.huidian.demo.service;

import com.huidian.demo.domain.User;

import java.util.List;

public interface UserService {

    User login(String uusername, String upassword);
    List<User> getAllUser();
}
