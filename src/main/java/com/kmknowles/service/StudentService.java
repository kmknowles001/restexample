package com.kmknowles.service;

import com.kmknowles.dao.StudentDao;
import com.kmknowles.entity.Student;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Service
public class StudentService {

    private StudentDao studentDao;

    public StudentService() {
        this.studentDao = new StudentDao();
    }

    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }
}
