package com.example.demo.controller;

import com.example.demo.pojo.AppUser;
import com.example.demo.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping(value = "helloController", produces = {"application/json;charset=utf-8"})
public class Hello {

    @Autowired
    private IUserService userService;

    @PostMapping("asd")
    public String qwe(AppUser user,Model model){
        model.addAttribute("user",user);
        return "qwe";
    }

    @GetMapping("zxc")
    public String zxc(Model model){
        Object select = userService.select();
//        model.addAttribute("param",userService.select());
        model.addAttribute("name",select);
        return "asd";
    }

    @GetMapping("qqq")
    public Object qqq(@ModelAttribute(value="appUser") AppUser user){
        return userService.qqq(user);
    }


}
