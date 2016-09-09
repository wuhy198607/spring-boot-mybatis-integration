package com.example.entity;

import java.io.Serializable;

/**
 * Created by wuhy on 2016/9/9.
 */
public class UserEntity implements Serializable
{
    private int id;
    
    private int sex;
    
    private String name;
    
    public int getId()
    {
        return id;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public int getSex()
    {
        return sex;
    }
    
    public void setSex(int sex)
    {
        this.sex = sex;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
}
