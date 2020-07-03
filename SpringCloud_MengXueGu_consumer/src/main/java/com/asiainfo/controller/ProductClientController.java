package com.asiainfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.asiainfo.entity.Product;

@RestController
@RequestMapping("productClientController")
public class ProductClientController {
	@Autowired
	private RestTemplate restTemplate;
	@Value("${product.url}")
	private String url;
	
	@RequestMapping("/product/{pid}")
	public Product getProductById(@PathVariable("pid") long id) {
		return restTemplate.getForObject(url + id, Product.class);
	}
}
