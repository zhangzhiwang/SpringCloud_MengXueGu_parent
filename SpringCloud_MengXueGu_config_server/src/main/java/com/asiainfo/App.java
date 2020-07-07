package com.asiainfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer// 启动config服务器，即配置中心
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
