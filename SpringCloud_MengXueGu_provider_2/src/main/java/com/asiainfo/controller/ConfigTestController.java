package com.asiainfo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
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
@RefreshScope// 自动刷新，在使用Spring Cloud Bus的时候如果在改变远程仓库的配置之后需要动态地获取修改后的值而不用重启
public class ConfigTestController {
	@Value("${server.port}")
	private String serverPort;
	@Value("${spring.application.name}")
	private String springApplicationName;
	
	@GetMapping("/testConfig")
	public String testConfig() {
		// 可以看到application.yml里面的相关配置已不生效
		return "springApplicationName = " + springApplicationName + ",serverPort = " + serverPort;
	}
}
