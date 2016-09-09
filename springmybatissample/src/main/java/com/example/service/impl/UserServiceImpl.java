package com.example.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.entity.UserEntity;
import com.example.mapper.UserMapper;
import com.example.service.UserService;

/**
 * Created by wuhy on 2016/9/9.
 */
@Service
public class UserServiceImpl implements UserService
{
    @Resource
    private UserMapper userMapper;
    
    @Override
    public UserEntity findUserById(int id)
    {
        return userMapper.findUserById(id);
    }
}
