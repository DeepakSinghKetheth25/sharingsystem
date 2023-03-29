package com.sharingsystem.poc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sharingsystem.poc.model.Organisation;


@Repository
public interface OrganisationRepository extends MongoRepository<Organisation, String> {

}
