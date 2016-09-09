package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import com.example.entity.UserEntity;

/**
 * Created by wuhy on 2016/9/9.
 */
@Mapper
@Component
public interface UserMapper
{
    @Select("SELECT * FROM USER WHERE id = #{0}")
    UserEntity findUserById(int id);
}
