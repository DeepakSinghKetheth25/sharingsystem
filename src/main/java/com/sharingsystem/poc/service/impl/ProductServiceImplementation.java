package com.sharingsystem.poc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharingsystem.poc.model.BaseProduct;
import com.sharingsystem.poc.model.BaseProductInput;
import com.sharingsystem.poc.model.ChildProductInput;
import com.sharingsystem.poc.model.ProductChildProduct;
import com.sharingsystem.poc.model.common.EStatus;
import com.sharingsystem.poc.repository.ProductRepository;
import com.sharingsystem.poc.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductServiceImplementation implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public BaseProduct addProduct(BaseProductInput productInput) {
		log.debug("--- Service Method : addProduct ---");

		List<ProductChildProduct> subProducts = new ArrayList<>();

		if(productInput.getSubProductList()!=null){

			List<ChildProductInput> subProductList = productInput.getSubProductList();

			for(int i=0;i<subProductList.size(); i++){

				BaseProduct childProduct = productRepository.findById(subProductList.get(i).getId()).get() ;
				
				subProducts.add(
						new ProductChildProduct( 
							childProduct.getOrganisationId(),
							childProduct.getPublishStatus(),
							subProductList.get(i).getOrder(),
							EStatus.ACTIVE,
							childProduct
						)
				);	
			}
		}

		BaseProduct product = new BaseProduct(
			productInput.getREFID(),
			productInput.getSKUID(),
			productInput.getOrganisationId(),
			productInput.getName(),
			subProducts,
			productInput.getProfitMargin(),
			productInput.getPublishStatus()
		);

		return productRepository.save(product);
	}

}
