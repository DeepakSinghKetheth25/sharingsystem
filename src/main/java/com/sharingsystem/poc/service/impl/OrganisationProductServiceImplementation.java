package com.sharingsystem.poc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharingsystem.poc.model.BaseProduct;
import com.sharingsystem.poc.model.BaseProductInput;
import com.sharingsystem.poc.model.OrganisationProduct;
import com.sharingsystem.poc.model.OrganisationProductInput;
import com.sharingsystem.poc.model.common.EStatus;
import com.sharingsystem.poc.repository.OrganisationProductRepository;
import com.sharingsystem.poc.service.OrganisationProductService;
import com.sharingsystem.poc.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OrganisationProductServiceImplementation implements OrganisationProductService {

	@Autowired
	private OrganisationProductRepository organisationProductRepository;

	@Autowired
	private ProductService productService;
	

	@Override
	public OrganisationProduct createProduct(OrganisationProductInput organisationProduct) {
		log.debug("--- Service Method : createProduct ---");

		BaseProductInput product = organisationProduct.getProduct();
		BaseProduct baseProduct = productService.addProduct(product);


		OrganisationProduct orgProduct = new OrganisationProduct(
			organisationProduct.getOrganisationId(),
			organisationProduct.getPublishStatus(),
			organisationProduct.getOrder(),
			organisationProduct.getQuantity(),
			EStatus.ACTIVE,
			baseProduct
		);

		orgProduct = organisationProductRepository.save(orgProduct);

		return orgProduct;
	}

	@Override
	public OrganisationProduct organisationProduct(String organisationId, String productId) {
		log.debug("--- Service Method : organisationProduct ---");

		List<OrganisationProduct> productList = organisationProductRepository.findByOrganisationId(organisationId);

		OrganisationProduct organisationProduct = productList.stream()
				.filter(product -> product.getProduct().getId().equals(productId))
				.findAny().orElse(null);

		return organisationProduct;
	}

	@Override
	public List<OrganisationProduct> getAllOrganisationProducts(String organisationId) {
		log.debug("--- Service Method : getAllOrganisationProducts ---");
		return organisationProductRepository.findByOrganisationId(organisationId);
	}


}
