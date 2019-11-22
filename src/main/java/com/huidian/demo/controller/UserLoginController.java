package com.huidian.demo.controller;


import com.huidian.demo.domain.User;
import com.huidian.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserLoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/login")
    public String login(HttpServletRequest request,String uusername, String upassword){

       String username = request.getParameter("uusername");
       String password = request.getParameter("upassword");
        User login = userService.login(uusername, upassword);
        if(login == null){
            return "login";
        }
        return "redirect:getAllUser";
        //return "success";
    }

}
