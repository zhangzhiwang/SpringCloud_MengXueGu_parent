package com.asiainfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asiainfo.entity.Product;
import com.asiainfo.service.IProductService;

@RestController
@RequestMapping("productController")
public class ProductController {
	@Autowired
	private IProductService productService;
	
	@GetMapping("product/{pid}")// 注意：占位符是{}，而不是${}，前面没有$，否则报404
	public Product getProductById(@PathVariable("pid") long id) {
		System.out.println("已进入provider的getProductById方法");
		return productService.getProductById(id);
	}

}
