package com.bjpowernode.model.service;

import com.bjpowernode.entity.Student;
import com.bjpowernode.util.Pager;

import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.model.service
 * @Description: java类作用描述
 * @Author: admin
 * @CreateDate: 2020/12/6 16:45
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public interface IStudentService {

    List<Student> list();

    List<Student> list(Pager pager);

    Student get(int stuId);

    int save(Student student);

    int update(Student student);

    int delete(int stuId);

}
