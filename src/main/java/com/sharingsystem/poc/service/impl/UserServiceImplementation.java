package com.sharingsystem.poc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharingsystem.poc.model.User;
import com.sharingsystem.poc.repository.UserRepository;
import com.sharingsystem.poc.service.UserService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceImplementation implements UserService{

	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {
		log.debug("--- Service Method : createUser --");
		return userRepository.save(user);
	}

	@Override
	public User getUser(String userId) {
		log.debug("--- Service Method : getUser --");
		return userRepository.findById(userId).get();
	}

	@Override
	public User getUserWithOKID(String OKID) {
		log.debug("--- Service Method : getUserWithOKID --");
		return userRepository.findByOKID(OKID).get();
	}

	@Override
	public List<User> users() {
		log.debug("--- Service Method : users --");
		return userRepository.findAll();
	}
}
