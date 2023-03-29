package com.sharingsystem.poc.service;

import org.springframework.stereotype.Service;

import com.sharingsystem.poc.model.OrganisationProduct;
import com.sharingsystem.poc.model.OrganisationProductInput;

import java.util.List;

@Service
public interface OrganisationProductService {
    
    public OrganisationProduct createProduct(OrganisationProductInput product);

	public OrganisationProduct organisationProduct(String organisationId, String productId);

	public List<OrganisationProduct> getAllOrganisationProducts(String organisationId);

}
