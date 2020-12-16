package com.bjpowernode.model.dao;

import com.bjpowernode.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer uid);

    User selectByUserNameAndPwd(String username,String pwd);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}