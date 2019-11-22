package com.huidian.demo.service;

import com.huidian.demo.domain.User;

public interface UserService {

    User login(String uusername, String upassword);
}
