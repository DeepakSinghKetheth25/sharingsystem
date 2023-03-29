package com.sharingsystem.poc.repository;

import org.springframework.stereotype.Repository;

import com.sharingsystem.poc.model.OrganisationProduct;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface OrganisationProductRepository extends MongoRepository<OrganisationProduct, String>{

	List<OrganisationProduct> findByOrganisationId(String organisationId);
    
    
}
