package com.bjpowernode.model.service;

import com.bjpowernode.entity.Student;
import com.bjpowernode.entity.Teacher;
import com.bjpowernode.util.Pager;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.model.service
 * @Description: java类作用描述
 * @Author: admin
 * @CreateDate: 2020/12/9 10:27
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
public interface ITeacherService {

    List<Teacher> list();

    List<Teacher> list(Teacher teacher);

    List<Teacher> list(Pager pager);

    List<Teacher> list(Teacher teacher,Pager pager);

    Teacher get(int teaId);

    int save(Teacher teacher);

    int update(Teacher teacher);

    int delete(int teaId);

    int delete(Integer[] teaIds);
}
