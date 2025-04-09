package com.yaru.lesson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LessonApplication {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(LessonApplication.class, args);
    }

}
