package com.bjpowernode.model.service;

import com.bjpowernode.entity.Teacher;
import com.bjpowernode.model.dao.TeacherMapper;
import com.bjpowernode.util.Pager;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.model.service
 * @Description: java类作用描述
 * @Author: admin
 * @CreateDate: 2020/12/9 10:28
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Service
public class TeacherService implements ITeacherService {

    @Autowired
    TeacherMapper teacherMapper;

    @Override
    public List<Teacher> list() {
        return teacherMapper.selectAll();
    }

    @Override
    public List<Teacher> list(Teacher teacher) {
        return teacherMapper.selectByTeacher(teacher);
    }

    @Override
    public List<Teacher> list(Pager pager) {

        //查总记录数
        int count = teacherMapper.selectTotalCount();

        pager.setTotalRowCount(count);

        return teacherMapper.selectByPager(pager);
    }

    @Override
    public List<Teacher> list(Teacher teacher, Pager pager) {


        //查总记录数
        int count = teacherMapper.searchTotalCount(teacher);

        pager.setTotalRowCount(count);

        return teacherMapper.searchByPager(teacher,pager);
    }

    @Override
    public Teacher get(int teaId) {
        return teacherMapper.selectByPrimaryKey(teaId);
    }

    @Override
    public int save(Teacher teacher) {
        return teacherMapper.insertSelective(teacher);
    }

    @Override
    public int update(Teacher teacher) {
        return teacherMapper.updateByPrimaryKeySelective(teacher);
    }

    @Override
    public int delete(int teaId) {

        //执行更改：更改 此教师的学生的tea_id的值为null值
        // studentMapper.updateStudentSetTeacherNull()  update student set tea_id = null where stu_id =?


        return teacherMapper.deleteByPrimaryKey(teaId);
    }

    @Override
    public int delete(Integer[] teaIds) {

        return teacherMapper.deleteBatch(teaIds);
    }
}
