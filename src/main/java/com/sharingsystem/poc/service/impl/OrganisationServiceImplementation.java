package com.sharingsystem.poc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sharingsystem.poc.model.common.EOrganisationRole;
import com.sharingsystem.poc.model.common.EOrganisationUserStatus;
import com.sharingsystem.poc.model.common.EStatus;
import com.sharingsystem.poc.model.Organisation;
import com.sharingsystem.poc.model.OrganisationUser;
import com.sharingsystem.poc.payload.CreateOrganisationInput;
import com.sharingsystem.poc.repository.OrganisationRepository;
import com.sharingsystem.poc.repository.OrganisationUserRepository;
import com.sharingsystem.poc.service.OrganisationService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OrganisationServiceImplementation implements OrganisationService {

	@Autowired
	private OrganisationRepository organisationRepository;
	
//	@Autowired 
//	private OrganisationUserService organisationUserService;

	@Autowired 
	private OrganisationUserRepository organisationUserRepository;
	
	@Override
	public Organisation createOrganisation(CreateOrganisationInput organisationInput) {
		log.debug("--- Service Method : createOrganisation ---");
		
		String userId = organisationInput.getUserId();
		
		Organisation organisation = Organisation.builder()
				.name(organisationInput.getName())
				.OKID(organisationInput.getOKID())
				.status(EStatus.ACTIVE)
				.publicMobileCountryCode(organisationInput.getPublicMobileCountryCode())
				.publicMobile(organisationInput.getPublicMobile())
				.publicEmail(organisationInput.getPublicEmail())
				.websiteURL(organisationInput.getWebsiteURL())
				.address(organisationInput.getAddress())
				.type(organisationInput.getType())
				.build();
		
		organisation = organisationRepository.save(organisation);
		
		addUserToOrganisationAsOwner(organisation.getId(), userId);
//		organisationUserService.addUserToOrganisationAsOwner(organisation.getId(), userId);
		
		return organisation;
		
	}

	private OrganisationUser addUserToOrganisationAsOwner(String organisationId, String userId) {
		// TODO Auto-generated method stub
		
		List<EOrganisationRole> roleList = new ArrayList<>();
		
		roleList.add(EOrganisationRole.ORGANISATION_OWNER);
		roleList.add(EOrganisationRole.ORGANISATION_MANAGER);
		
		OrganisationUser organisationUser = new OrganisationUser(
					organisationId, userId, EOrganisationUserStatus.ACTIVE, roleList
				);
		
		organisationUser = organisationUserRepository.save(organisationUser);
		
		return organisationUser;
		
	}


	@Override
	public List<Organisation> getAllOrganisations() {
		log.debug("--- Service Method : getAllOrganisations ---");
		return organisationRepository.findAll();
	}

	@Override
	public Organisation getOrganisation(String organisationId) {
		log.debug("--- Service Method : getOrganisation ---");
		return organisationRepository.findById(organisationId).get();

	}

}
