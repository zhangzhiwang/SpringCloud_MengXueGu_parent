package com.asiainfo.fallback;

import org.springframework.stereotype.Component;

import com.asiainfo.entity.Product;
import com.asiainfo.service.ProductClientService;

@Component
public class ProductClientServiceFallback implements ProductClientService {

	@Override
	public Product queryProductByIdFeign(long id) {
		// TODO Auto-generated method stub
		return new Product(-2L, "客户端熔断" , "客户端熔断");
	}

}
