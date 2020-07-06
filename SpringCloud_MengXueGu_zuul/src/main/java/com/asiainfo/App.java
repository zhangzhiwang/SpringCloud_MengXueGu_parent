package com.asiainfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy// 开启zuul网关
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
