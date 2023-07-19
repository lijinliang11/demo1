package com.example.demo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@MapperScan("com.example.demo1.dao")
@SpringBootApplication //(exclude = DataSourceAutoConfiguration.class)
public class Demo1Application {

    public static void main(String[] args) {
        //System.out.println("start");
        SpringApplication.run(Demo1Application.class, args);
    }

}
