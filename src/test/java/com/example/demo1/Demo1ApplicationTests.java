package com.example.demo1;

import com.example.demo1.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo1ApplicationTests {
    //1.注入你要测试的对象
    @Autowired
    private BookDao bookDao;


    @Test
    void contextLoads() {
        //2.执行要测试的对象对应的方法
        //bookDao.save();
        System.out.println("Test........");
        System.out.println(bookDao.getById(1));
    }

}
