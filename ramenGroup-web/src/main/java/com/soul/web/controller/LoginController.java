package com.soul.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/5/18.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping
    public String getLoginPage(){
        return "login";
    }


}
