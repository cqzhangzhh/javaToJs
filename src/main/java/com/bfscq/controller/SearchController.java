package com.bfscq.controller;

import com.bfscq.pojo.Employee;
import com.bfscq.pojo.Result;
import com.bfscq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

//	@Autowired
//	private Employee  employee;

    @GetMapping("/search")
	public Result search(@ModelAttribute Employee employee) {

        return  null;
	}
    

}
