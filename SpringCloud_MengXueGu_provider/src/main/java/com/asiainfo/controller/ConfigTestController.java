package com.asiainfo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试config客户端
 *
 * @author zhangzhiwang
 * @date Jul 6, 2020 11:45:45 PM
 */
@RestController
@RequestMapping("ConfigTestController")
public class ConfigTestController {
	@Value("${server.port}")
	private String serverPort;
	@Value("${spring.application.name}")
	private String springApplicationName;
	
	@GetMapping("/testConfig")
	public void testConfig() {
		// 可以看到application.yml里面的相关配置已不生效
		System.out.println("springApplicationName = " + springApplicationName + ",serverPort = " + serverPort);
	}
}
