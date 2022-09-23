package com.cydeo.streampractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.cydeo.streampractice.practice.Practice.getMinSalaryEmployee;

@SpringBootApplication
public class StreamPracticeApplication {

    public static void main(String[] args) {
        System.out.println(getMinSalaryEmployee());

        SpringApplication.run(StreamPracticeApplication.class, args);
    }

}
