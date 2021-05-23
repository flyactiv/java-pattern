package com.example.lesson13;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@PropertySource("/application.yml")
public class Student {

    @Value("${student.name}")
    private String name;
    @Value("${student.last_name}")
    private String lastName;
    @Value("${student.group}")
    private String group;

    @PostConstruct
    public void info() {
        System.out.println(name + " " +
                lastName + " " +
                group);
    }
}
