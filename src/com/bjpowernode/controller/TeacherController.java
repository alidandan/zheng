package com.bjpowernode.controller;

import com.bjpowernode.entity.Teacher;
import com.bjpowernode.model.service.ITeacherService;
import com.bjpowernode.model.service.TeacherService;
import com.bjpowernode.util.Pager;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;


import com.bjpowernode.util.PageInfo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.*;
import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.controller
 * @Description: java类作用描述
 * @Author: admin
 * @CreateDate: 2020/12/9 10:37
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
@RequestMapping("teacher")   //     /teacher/*
public class TeacherController {


    @Autowired
    ITeacherService teacherService;


    @RequestMapping("list")
    PageInfo list(Teacher teacher, @RequestParam(defaultValue = "1") int no){


        PageHelper.startPage(no, 10);
        //        //return teacherService.list();

       // return teacherService.list(teacher);

        PageInfo info = new PageInfo(teacherService.list(teacher));



        return info;
    }

    @RequestMapping("edit")
   /* Teacher edit(Integer teaId){//int 必须是数字   Integer 可以是null,也可以是数字


        return teacherService.get(teaId);

    }*/

    void edit(Teacher teacher,Integer teaId){//int 必须是数字   Integer 可以是null,也可以是数字

        // teaId.intValue()

        if(teaId != null){//从修改进入的
            Teacher teacherDB = teacherService.get(teaId);
            BeanUtils.copyProperties(teacherDB,teacher);//source  源（从哪里来），tartet 目标 (往哪里去)
        }



       /* teacher.setTeaId(teacherDB.getTeaId());
        teacher.setTeaName(teacherDB.getTeaName());
        teacher.setTeaSex(teacherDB.getTeaSex());*/



    }

    /**
     * 保存或修改教师信息
     * @param teacher
     * @return
     */
    @RequestMapping("save")
    String save(Teacher teacher){


        if(teacher.getTeaId() != null){

            //执行修改
            teacherService.update(teacher);

        }else{

            //执行新增
            teacherService.save(teacher);
        }


        return "redirect:list";

    }

    @RequestMapping("delete")
    String delete(int teaId){

        teacherService.delete(teaId);

        return "redirect:list";
    }

    @RequestMapping("deleteBatch")
    String deleteBatch(Integer[] teaIds){

        teacherService.delete(teaIds);

        return "redirect:list";
    }

}
