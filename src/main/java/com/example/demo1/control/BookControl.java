package com.example.demo1.control;

import com.example.demo1.MyDataSourse;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class BookControl {
    @Value("${city}")
    private String city1;

    //使用自动装配所有的数据封装到一个对象
    @Autowired
    private Environment env;

    @Autowired
    private MyDataSourse myDataSourse;

    @RequestMapping(value ="/books")
    public String getById(){
        System.out.println("spring boot is running");
        return "spring boot is running";
    }

    @RequestMapping("/hello")
    String index(){
        System.out.println(city1);
        System.out.println(env.getProperty("server.port"));
        System.out.println(myDataSourse);
        return "Hello World!";
    }
}
