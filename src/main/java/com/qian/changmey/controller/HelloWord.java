package com.qian.changmey.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWord {

	@RequestMapping("/")
	@ResponseBody
	public String helloWord() {
		return "Hellow Word！";
	}
}
