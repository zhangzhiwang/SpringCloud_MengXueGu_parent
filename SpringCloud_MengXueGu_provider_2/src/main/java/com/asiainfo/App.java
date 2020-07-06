package com.asiainfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient// 标识该工程是eureka客户端
//@MapperScan(basePackages = {"com.asiainfo.mapper"})
@EnableHystrix// 开启hystrix熔断器
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
