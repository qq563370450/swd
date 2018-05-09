package com.example.demo.service;

public interface IRedisService {

    //写入缓存
    boolean set(String key, Object value);

    //根据key取值
    Object get(String key);

}
