package com.sharingsystem.poc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sharingsystem.poc.model.User;


@Service
public interface UserService {

	public User createUser(User user);

	public User getUser(String userId);

    public User getUserWithOKID(String oKID);

    public List<User> users();
	
	
}
