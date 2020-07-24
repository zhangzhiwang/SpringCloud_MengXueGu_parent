package com.asiainfo.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
	@Bean(name = "tc")
	public TestConfig testConfig(TestProperties testProperties) {
		System.out.println(testProperties);
		return new TestConfig();
	}
}
