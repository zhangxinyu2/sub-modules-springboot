package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@EnableAutoConfiguration	//这个注解告诉Spring Boot根据添加的jar依赖猜测你想如何配置Spring
@ComponentScan				//ComponentScan扫描Spring组件
@Configuration				//Configuration配置组件
public class Application {
	
	public static void main(String[] agrs){
		SpringApplication.run(Application.class,agrs);
	}

}
