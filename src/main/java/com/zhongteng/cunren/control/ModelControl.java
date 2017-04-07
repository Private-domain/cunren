package com.zhongteng.cunren.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelControl {
	
	
	@RequestMapping("/index")
	public String hello(){
		return "index";
	}
	

}
