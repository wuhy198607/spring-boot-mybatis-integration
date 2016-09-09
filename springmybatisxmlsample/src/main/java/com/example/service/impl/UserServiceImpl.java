package com.example.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.dao.UserDao;
import com.example.entity.UserEntity;
import com.example.service.UserService;

/**
 * Created by wuhy on 2016/9/9.
 */
@Service
public class UserServiceImpl implements UserService
{
    @Resource
    private UserDao userDao;
    
    @Override
    public UserEntity findUserById(int id)
    {
        return userDao.findUserById(id);
    }
}
