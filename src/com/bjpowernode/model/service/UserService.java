package com.bjpowernode.model.service;

import com.bjpowernode.entity.User;
import com.bjpowernode.model.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.model.service
 * @Description: java类作用描述
 * @Author: admin
 * @CreateDate: 2020/12/12 16:52
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service
public class UserService implements  IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getByUserNameAndPwd(String username, String pwd) {
        return userMapper.selectByUserNameAndPwd(username,pwd);
    }
}
