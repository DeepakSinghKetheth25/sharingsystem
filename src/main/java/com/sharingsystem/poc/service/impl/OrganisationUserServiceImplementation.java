package com.sharingsystem.poc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sharingsystem.poc.model.common.*;
import com.sharingsystem.poc.model.OrganisationUser;
import com.sharingsystem.poc.repository.OrganisationUserRepository;
import com.sharingsystem.poc.service.OrganisationUserService;

public class OrganisationUserServiceImplementation implements OrganisationUserService {

	@Autowired
	private OrganisationUserRepository organisationUserRepository;
	
	@Override
	public OrganisationUser addUserToOrganisationAsOwner(String organisationId, String userId) {

		
		List<EOrganisationRole> roleList = new ArrayList<>();
		
		roleList.add(EOrganisationRole.ORGANISATION_OWNER);
		roleList.add(EOrganisationRole.ORGANISATION_MANAGER);
		
		OrganisationUser organisationUser = new OrganisationUser(
					organisationId, userId, EOrganisationUserStatus.ACTIVE, roleList
				);
		
		organisationUser = organisationUserRepository.save(organisationUser);
		
		return organisationUser;
	}

}
