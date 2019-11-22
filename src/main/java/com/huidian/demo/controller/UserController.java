package com.huidian.demo.controller;

import com.huidian.demo.domain.User;
import com.huidian.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/getAllUser")
    public String getAllUser(Model model){
        List<User> users = userService.getAllUser();
        model.addAttribute("users",users);
        return "user_list";
    }
}
