package com.test.DevTool;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/")
	@ResponseBody
	public String test() {
		int a = 67;
		int b = 23;
		return "just Testing \t sum of a and b is :" + (a + b);
	}
}
