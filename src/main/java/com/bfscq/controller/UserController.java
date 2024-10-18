package com.bfscq.controller;

import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bfscq.pojo.Result;
import com.bfscq.pojo.User;
import com.bfscq.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService  userService;
	
    @PostMapping("/register")
	public Result register(@RequestBody User user) {
    	
    	 String password;
    	// 用户名密码检查
    	// 匹配用正则表达式（5~16非空字符）
    	String pattern  = "^\\S{5,16}$";
    	boolean isMatch = Pattern.matches(pattern , user.getUsername());

    	// 用户名不符合要求的情况
    	if(!isMatch) {
    		return Result.error("用户名不符合要求");
    	}
    	// 密码不符合要要求的情况
    	isMatch = Pattern.matches(pattern , user.getPasswordHash());
    	if(!isMatch) {
    		return Result.error("密码不符合要求");
    	}
    	
        //查询用户
        User u = userService.findByUserName(user.getUsername());
        if (u != null) {
            //占用
            return Result.error("用户名已被占用");
        } 
        
        //查询用户
        u = userService.findByUserEmail(user.getEmail());
        if (u == null) {
            //没有占用
            //注册
            userService.register(user);
            return Result.success();
        } else {
            //占用
            return Result.error("邮箱已被占用");
        }
	}
    
    @PostMapping("/login")
	public Result test(@RequestBody User user) {
        String password;
       // 用户名密码检查
       // 匹配用正则表达式（5~16非空字符）
       String pattern  = "^\\S{5,16}$";
       boolean isMatch = Pattern.matches(pattern , user.getUsername());

       // 用户名不符合要求的情况
       if(!isMatch) {
           return Result.error("用户名不符合要求");
       }
       // 密码不符合要要求的情况
       isMatch = Pattern.matches(pattern , user.getPasswordHash());
       if(!isMatch) {
           return Result.error("密码不符合要求");
       }
       
       //查询用户
       User u = userService.findByUserName(user.getUsername());
       if (u != null) {
           //OK
           return Result.success();
       }else {
           //ERR
           return Result.error("邮箱已被占用");
       }

	}
    
    @GetMapping("/test1")
	public String test1() {
        return "123";
	}
}
