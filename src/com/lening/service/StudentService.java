package com.lening.service;

import com.lening.entity.StudentBean;

import java.util.List;

public interface StudentService {
    /**
     * 查询所有学生信息
     * @return
     */
    List<StudentBean> getAllStu();

    /**
     * 通过id删除学生信息
     * @param id
     */
    void delStuByid(Long id);

    /**
     * 模糊查询
     * @param stu
     * @return
     */
    List<StudentBean> getAllStuAndAge(StudentBean stu);
}
