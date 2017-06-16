package com.test;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("testController")
public class TestController {
	
	@RequestMapping("/hello")
	public String Hello(@PathVariable("name") String name){
		return  "Hello  美, "+ name;
	}

}
