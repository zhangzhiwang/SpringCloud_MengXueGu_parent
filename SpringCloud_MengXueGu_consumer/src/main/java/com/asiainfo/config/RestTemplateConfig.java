package com.asiainfo.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateConfig {
	@Bean
	@LoadBalanced// 开启ribbon负载均衡，默认的负载均衡算法是轮询
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
