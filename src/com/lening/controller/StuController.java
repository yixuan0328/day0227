package com.lening.controller;

import com.lening.entity.StudentBean;
import com.lening.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: day-03
 * @author: 杨熠烜
 * @create: 2022-07-05 17:01
 **/
@Controller
@RequestMapping("/student")
public class StuController {
    @Resource
    private StudentService stuService;

    @RequestMapping("/getAllStu")
    public String getAllStu(Model model){
        List<StudentBean> list=stuService.getAllStu();
        model.addAttribute("list",list);
        return "stu_list";
    }
    @RequestMapping("/delStuByid")
    public String delStuByid(Long id){
        stuService.delStuByid(id);
        return "redirect:getAllStu.do";
    }
}
