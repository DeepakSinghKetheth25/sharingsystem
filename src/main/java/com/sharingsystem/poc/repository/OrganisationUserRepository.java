package com.sharingsystem.poc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sharingsystem.poc.model.OrganisationUser;

@Repository
public interface OrganisationUserRepository extends MongoRepository<OrganisationUser, String> {

	
	
}
