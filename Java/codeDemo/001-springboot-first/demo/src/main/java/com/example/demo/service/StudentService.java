package com.example.demo.service;


import com.example.demo.model.Student;

/**
 * ClassName:StudentService
 * Package:com.bjpowernode.springboot.service
 * Description:
 *
 * @date:2020/3/6 11:49
 * @author:蛙课网
 */
public interface StudentService {

    /**
     * 根据学生ID查询详情
     * @param id
     * @return
     */
    Student queryStudentById(Integer id);
}
