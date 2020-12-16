package com.bjpowernode.model.dao;

import com.bjpowernode.entity.Student;
import com.bjpowernode.util.Pager;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IStudentDao {

    int deleteByPrimaryKey(Integer stuId);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer stuId);

    List<Student> selectAll();

    /**
     * 翻页查询
     * @param no 目标页号
     * @param pageNo 每页记录数
     *               dao方法的参数列表中，参数的个数大于1个时：
     *
     *               1.使用位置占位符（第1个参数的位置是0，#{0},第2个参数的位置是1，#{1}）
     *
     *               2.使命名式占位符  (第1个参数的名称是param1，第2个参数的名称是param2............)
     *
     *               3.使用注解 @Param("no") int no,@Param("pageNo") int pageNo
     * @return
     */
    //List<Student> selectByPager(@Param("no") int no, @Param("pageNo") int pageNo);

    List<Student> selectByPager(Pager pager);

    int selectCount();

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}