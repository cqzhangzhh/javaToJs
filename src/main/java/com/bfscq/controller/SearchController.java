package com.bfscq.controller;

import com.bfscq.pojo.Result;
import com.bfscq.pojo.User;
import com.bfscq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.regex.Pattern;

@RestController
public class SearchController {

	@Autowired
	private UserService  userService;

    @GetMapping("/search")
	public Result search(@RequestBody User user) {

        return  null;
	}
    

}
