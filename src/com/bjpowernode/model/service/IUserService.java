package com.bjpowernode.model.service;

import com.bjpowernode.entity.User;

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
public interface IUserService {

    User getByUserNameAndPwd(String username, String pwd);
}
