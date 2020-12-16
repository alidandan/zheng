package com.bjpowernode.model.dao;

import com.bjpowernode.entity.Teacher;
import com.bjpowernode.util.Pager;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {

    int deleteByPrimaryKey(Integer teaId);

    int deleteBatch(Integer[] teaIds);

    int insert(Teacher record);

    int insertSelective(Teacher record);

    Teacher selectByPrimaryKey(Integer teaId);

    List<Teacher> selectAll();

    List<Teacher> selectByTeacher(Teacher record);

    List<Teacher> selectByPager(Pager pager);

    int selectTotalCount();

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
    List<Teacher> searchByPager(@Param("teacher") Teacher teacher, @Param("pager")Pager pager);

    int searchTotalCount(@Param("teacher") Teacher teacher);


    int updateByPrimaryKeySelective(Teacher record);

    int updateByPrimaryKey(Teacher record);
}