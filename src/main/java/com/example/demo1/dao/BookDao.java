package com.example.demo1.dao;

import com.example.demo1.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
//mybatis有注解和xml两种方式，这里是注解方式
@Mapper
public interface BookDao {
   // public void save();
    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);
}
