package com.bfscq.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.bfscq.pojo.User;

@Mapper
public interface UserMapper {
    //根据用户名查询用户
    @Select("select * from javatojs.users where username=#{username}")
    User findByUserName(String username);
    
    
    
    //根据邮箱名查询用户
    @Select("select * from javatojs.users where email=#{userEmail}")
    User findByUserEmail(String userEmail);

    //添加
    @Insert("insert into javatojs.users(username,password_hash,email,created_at,updated_at)" +
            " values(#{user.username},#{password},#{user.email},now(),now())")
    void add(User user, String password);
    
    
    
}
