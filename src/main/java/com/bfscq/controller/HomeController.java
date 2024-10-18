package com.bfscq.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class HomeController {

	@GetMapping("/info")
	public String home() {
		return "index"; // 返回视图名称
	}
}
