package com.example.demo.service.Impl;


import com.example.demo.mapper.AppUserMapper;
import com.example.demo.pojo.AppUser;
import com.example.demo.pojo.AppUserExample;
import com.example.demo.service.IRedisService;
import com.example.demo.service.IUserService;
import com.github.pagehelper.PageHelper;
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
    private IRedisService redisService;
    @Autowired
    private AppUserMapper appUserMapper;

    @Override
    public Object select() {
//        PageHelper.startPage(1,1);
        List<AppUser> appUsers = appUserMapper.selectByExample(new AppUserExample());
//        AppUser appUser = appUserMapper.selectByPrimaryKey(23);
        return appUsers;
    }

    @Override
    public void insert() {
        String key = "id";
        String value = "asd";
        boolean set = redisService.set(key, value);

    }

    @Override
    public Object qqq(AppUser user) {

        Object id = redisService.get("id");
        return id;
    }
}
