package com.lening.service.impl;

import com.lening.entity.StudentBean;
import com.lening.mapper.StudentMapper;
import com.lening.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: day-03
 * @author: 杨熠烜
 * @create: 2022-07-05 17:04
 **/
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper stuMapper;

    @Override
    public List<StudentBean> getAllStu() {
        return stuMapper.getAllStu();
    }

    @Override
    public void delStuByid(Long id) {
        stuMapper.delStuById(id);
    }

    @Override
    public List<StudentBean> getAllStuAndAge(StudentBean stu) {
        return null;
    }
}
