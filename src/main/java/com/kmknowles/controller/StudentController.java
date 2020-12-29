package com.kmknowles.controller;

import com.kmknowles.entity.Student;
import com.kmknowles.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController @RequestMapping("/students")
public class StudentController {

    private StudentService studentService;

    public StudentController() {
        studentService= new StudentService();
    }



    @RequestMapping(method= RequestMethod.GET)
    public Collection<Student> getAllStudents() {
        return studentService.getAllStudents();
    }


}
