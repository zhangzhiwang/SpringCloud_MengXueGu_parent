package com.asiainfo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asiainfo.entity.Product;
import com.asiainfo.mapper.ProductMapper;
import com.asiainfo.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService{
	@Autowired
	private ProductMapper productMapper;
	
	
	@Override
	public Product getProductById(Long id) {
		return productMapper.getProductById(id);
	}

}
