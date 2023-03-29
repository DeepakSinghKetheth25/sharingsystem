package com.sharingsystem.poc.service;

import org.springframework.stereotype.Service;

import com.sharingsystem.poc.model.BaseProduct;
import com.sharingsystem.poc.model.BaseProductInput;


@Service
public interface ProductService {

	public BaseProduct addProduct(BaseProductInput product);
	
}
