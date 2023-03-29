package com.sharingsystem.poc.service;


import org.springframework.stereotype.Service;

import com.sharingsystem.poc.model.OrganisationUser;


@Service
public interface OrganisationUserService {

	public OrganisationUser addUserToOrganisationAsOwner(String id, String userId);

}
