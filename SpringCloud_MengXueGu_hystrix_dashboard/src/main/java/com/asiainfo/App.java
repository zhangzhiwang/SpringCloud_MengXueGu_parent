package com.asiainfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard// 启动hystrix监控，监控的页面的访问url为http://localhost:port/hystrix。其实hystrix监控的原理是通过Spring Boot的actuator实现的，需要在被监控的服务添加endpoint。
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
