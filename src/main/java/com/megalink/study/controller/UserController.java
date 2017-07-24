package com.megalink.study.controller;

import com.megalink.study.model.nochange.User;
import com.megalink.study.service.UserService;
import com.megalink.study.utils.Md5Utils;
import com.megalink.study.utils.UuIdTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by chenhansen on 2017/7/23.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value="/add-user.do", method = RequestMethod.POST)
    public void addUser(HttpServletRequest request, HttpServletResponse response, @ModelAttribute User user){
        String salt= UuIdTool.getUuId();
        String password= Md5Utils.md5(Md5Utils.md5(user.getPassword())+salt);
        user.setSalt(salt);
        user.setPassword(password);
        userService.addUser(user);
    }
}
