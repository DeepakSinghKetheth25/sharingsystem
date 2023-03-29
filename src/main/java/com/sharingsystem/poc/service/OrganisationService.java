package com.sharingsystem.poc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sharingsystem.poc.model.Organisation;
import com.sharingsystem.poc.payload.CreateOrganisationInput;

@Service
public interface OrganisationService {
	
	public Organisation createOrganisation(CreateOrganisationInput organisation);

	public List<Organisation> getAllOrganisations();

	public Organisation getOrganisation(String organisationId);
	
}
