package com.asiainfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asiainfo.entity.Product;
import com.asiainfo.service.IProductService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("productController")
public class ProductController {
	@Autowired
	private IProductService productService;
	
	@HystrixCommand(fallbackMethod = "getProductByIdFallback")// 对本方法进行熔断，fallbackMethod指定熔断后所调用方法的名字，该方法的返回值类型和参数列表必须和被熔断的方法一致
	@GetMapping("product/{pid}")// 注意：占位符是{}，而不是${}，前面没有$，否则报404
	public Product getProductById(@PathVariable("pid") long id) {
		System.out.println("已进入provider的getProductById方法");
		if(id == 6) {
			throw new RuntimeException();
		}
		return productService.getProductById(id);
	}
	
	public Product getProductByIdFallback (@PathVariable("pid") long id) {
		return new Product(-1L, "熔断之后的产品", "无法访问数据库");
	}

}
