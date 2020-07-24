package com.asiainfo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.asiainfo.controller.TestConfig;
import com.asiainfo.controller.TestConnect;
import com.asiainfo.controller.TestProperties;
import com.netflix.discovery.converters.Auto;

@SpringBootApplication
@EnableEurekaClient// 标识该工程是eureka客户端
@MapperScan(basePackages = {"com.asiainfo.mapper"})
@EnableHystrix// 开启hystrix熔断器
public class App {
//	@Autowired
//	private static TestConfig t;
//	@Autowired
//	private static TestConnect test;
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
		
//		System.out.println(t);
		
//		ApplicationContext app = new ClassPathXmlApplicationContext("classpath:spring.xml");
//		TestConnect test = (TestConnect) app.getBean("testConnect");
//		System.out.println(test);
	}
}
