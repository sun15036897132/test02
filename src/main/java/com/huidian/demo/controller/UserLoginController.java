package com.huidian.demo.controller;


import com.huidian.demo.domain.User;
import com.huidian.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserLoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(path = "/dologin")
    public String login(HttpServletRequest request){

       String username = request.getParameter("uusername");
       String password = request.getParameter("upassword");
        User login = userService.login(username, password);
        if(login == null){
            return "login";
        }
        return "redirect:getAllUser";
        //return "success";
    }

    @RequestMapping(path = "dologin")
    public String dologin(){
        return "login";
    }

}
