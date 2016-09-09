package com.example.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.UserEntity;
import com.example.service.UserService;

/**
 * Created by wuhy on 2016/9/9.
 */
@RestController
@RequestMapping("user")
public class UserController
{
    @Resource
    private UserService userService;
    
    @RequestMapping("search")
    public UserEntity search()
    {
        return userService.findUserById(1);
    }
}
