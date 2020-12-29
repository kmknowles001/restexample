package com.kmknowles.main;

import com.kmknowles.controller.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication @ComponentScan(basePackageClasses = StudentController.class)
public class Main {

    public static void main(String[] args){

        SpringApplication.run(Main.class, args);

    }


}
