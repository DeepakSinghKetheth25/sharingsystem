package com.sharingsystem.poc.dgs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.DgsQuery;
import com.sharingsystem.poc.model.User;
import com.sharingsystem.poc.service.UserService;

import lombok.extern.slf4j.Slf4j;

@DgsComponent
@Slf4j
public class UserDataComponent {

	@Autowired
	private UserService userService;
	
	@DgsMutation(field = "createUser")
	public User createUser(User user) {
		log.debug("--- User Data Component : createUser ---");
		return userService.createUser(user);
	}

	@DgsQuery(field = "users")
	public List<User> users(String OKID) {
		log.debug("--- User Data Component : users ---");
		return userService.users();
	}

	@DgsQuery(field = "getUser")
	public User getUser(String userId) {
		log.debug("--- User Data Component : getUser ---");
		return userService.getUser(userId);
	}

	@DgsQuery(field = "getUserWithOKID")
	public User getUserWithOKID(String OKID) {
		log.debug("--- User Data Component : getUserWithOKID ---");
		return userService.getUserWithOKID(OKID);
	}
}
