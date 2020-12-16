package com.bjpowernode.controller;

import com.bjpowernode.entity.Student;
import com.bjpowernode.entity.Teacher;
import com.bjpowernode.model.service.IStudentService;
import com.bjpowernode.model.service.ITeacherService;
import com.bjpowernode.util.Pager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: ssm
 * @Package: com.bjpowernode.controller
 * @Description: java类作用描述
 * @Author: admin
 * @CreateDate: 2020/12/6 16:51
 * @Version: 1.0
 * <p>
 * Copyright: Copyright (c) 2020
 */
@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired
    IStudentService studentService;

    @Autowired
    ITeacherService teacherService;

    @RequestMapping("list")
    List<Student> list(Pager pager){

        //return studentService.list();

        return studentService.list(pager);
    }

    @RequestMapping("add")
    List<Teacher> add(){

      return teacherService.list();
    }

    @RequestMapping("save")
    /*void save(String stuName,Integer stuSex){

        Student student = new Student();

        student.setStuName(stuName);
        //setSex.................
        //request.getParqmter("stuName")

    }*/

    String save(Student student){

        studentService.save(student);

        //return "redirect:list";

        return "redirect:list";
    }

    @RequestMapping("edit")
    Student edit(ArrayList<Teacher> list, int stuId){


        list.addAll(teacherService.list());


      return  studentService.get(stuId);
    }

    @RequestMapping("saveUpdate")
    String edit(Student student){


       studentService.update(student);

        return "redirect:list";
    }


    @RequestMapping("del")
    String del(int stuId){


        studentService.delete(stuId);

        return "redirect:list";
    }

}
