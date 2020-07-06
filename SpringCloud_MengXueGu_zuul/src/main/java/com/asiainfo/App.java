package com.asiainfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy// 开启zuul网关。zuul主要起两个作用：一个是路由转发，一个是过滤
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
