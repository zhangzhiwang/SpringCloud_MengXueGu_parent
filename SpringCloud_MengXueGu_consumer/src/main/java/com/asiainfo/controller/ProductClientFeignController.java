package com.asiainfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.asiainfo.entity.Product;
import com.asiainfo.service.ProductClientService;
import com.netflix.discovery.converters.Auto;

@RestController
@RequestMapping("productClientFeignController")
public class ProductClientFeignController {
	@Autowired
	private ProductClientService productClientService;
	
	@RequestMapping("/getProductByIdFeign/{pid}")
	public Product getProductByIdFeign(@PathVariable("pid") long id) {
		return productClientService.queryProductByIdFeign(id);
	}
}
