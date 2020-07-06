package com.asiainfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.asiainfo.service"})// 启用feign客户端，@EnableFeignClients会扫描指定目录下标注了@FeignClient注解的类并生成代理实现类
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
