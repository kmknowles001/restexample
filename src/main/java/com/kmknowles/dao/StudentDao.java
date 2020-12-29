package com.kmknowles.dao;

import com.kmknowles.entity.*;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

@Repository
public class StudentDao {

    private static Map<Integer, Student> students;

    static {

        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1,"Said","Computer"));
                put(2, new Student(2,"Alex U","Finance"));
                put(3, new Student(3,"Anna","Maths"));
            }
        };


    };
    public Collection<Student> getAllStudents() {
        return this.students.values();

    }
}
