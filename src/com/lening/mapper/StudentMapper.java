package com.lening.mapper;

import com.lening.entity.StudentBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    //查询全部学生信息
    List<StudentBean> getAllStu();
    //删除学生信息
   void delStuById(@Param("id") Long id);

   List<StudentBean> getAllStuAndAge(StudentBean stu);
}
