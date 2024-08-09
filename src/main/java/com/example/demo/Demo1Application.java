package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import repository.PersonRepository;

import java.util.List;

@SpringBootApplication
public class Demo1Application {

    private PersonRepository repository;

    public static void main(String[] args) {
        System.out.println("Hello World" );

        SpringApplication.run(Demo1Application.class, args);
    }

}
