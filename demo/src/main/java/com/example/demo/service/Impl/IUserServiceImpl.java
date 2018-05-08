package com.example.demo.service.Impl;


import com.example.demo.mapper.AppUserMapper;
import com.example.demo.pojo.AppUser;
import com.example.demo.pojo.AppUserExample;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
@Transactional(isolation = Isolation.READ_COMMITTED )
@Service("userService")
public class IUserServiceImpl implements IUserService{



    @Autowired
    private AppUserMapper appUserMapper;

    @Override
    public Object select() {
        List<AppUser> appUsers = appUserMapper.selectByExample(new AppUserExample());
        return appUsers;
    }

    @Override
    public void insert() {
//        AppUser appUser = new AppUser();
//        appUser.setPhone("666");
//        appUser.setPwd("666");
//        appUser.setCreateTime(new Date());
//        appUserMapper.insertSelective(appUser);
//        AppUser appUser2 = appUserMapper.selectByPrimaryKey(appUser.getId());
//        appUser2.setPhone("888");
//        AppUser appUser1 = null;
//        appUser1.setPhone("");
        System.out.println("123");

    }
}
