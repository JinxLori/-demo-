package com.example.demo.web;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:StudentController
 * Package:com.bjpowernode.springboot.web
 * Description:
 *
 * @date:2020/3/6 11:47
 * @author:蛙课网
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/student")
    public Object student(Integer id) {

        Student student = studentService.queryStudentById(id);

        return student;
    }
}
