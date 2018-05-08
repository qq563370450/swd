package com.example.demo.controller;

import com.example.demo.pojo.AppUser;
import com.example.demo.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Hello {

    @Autowired
    private IUserService userService;

    @GetMapping("asd")
    public void qwe(){
        userService.insert();
    }

    @GetMapping("zxc")
    public Object zxc(){
        return userService.select();
    }

}
