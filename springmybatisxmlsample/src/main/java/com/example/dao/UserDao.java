package com.example.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.entity.UserEntity;

/**
 * Created by wuhy on 2016/9/9.
 */
@Repository
@Mapper
public interface UserDao {
    UserEntity findUserById(int id);
}
