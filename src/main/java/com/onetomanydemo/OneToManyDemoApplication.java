package com.onetomanydemo;

import com.onetomanydemo.service.ICreateDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class OneToManyDemoApplication {
    @Autowired
    private ICreateDatabase iCreateDatabase;

    public static void main(String[] args) {
        SpringApplication.run(OneToManyDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(){
        return args -> {
            iCreateDatabase.createDatabase();
        };
    }
}
