package com.sharingsystem.poc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sharingsystem.poc.model.BaseProduct;


public interface ProductRepository extends MongoRepository<BaseProduct, String> {

}
