package com.megalink.study.controller;


import com.megalink.study.service.UserService;
import com.megalink.study.vo.req.LoginReq;
import com.megalink.study.vo.res.LoginRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by chenhansen on 2017/7/21.
 */
@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String login(HttpServletRequest request, HttpServletResponse response, ModelAndView modelAndView){
        return "login/login";
    }

    @RequestMapping(value="/login.do", method = RequestMethod.POST)
    public void doLogin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute LoginReq loginReq){
        LoginRes loginRes = userService.login(loginReq.getUserName(),loginReq.getPassword());
        if(loginRes!=null){
            request.getSession().setAttribute("user",loginRes);
        }
    }
}
