package com.sharingsystem.poc.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sharingsystem.poc.model.User;


public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findByOKID(String oKID);

}
