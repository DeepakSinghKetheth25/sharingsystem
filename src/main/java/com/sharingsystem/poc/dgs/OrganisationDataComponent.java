package com.sharingsystem.poc.dgs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.DgsQuery;
import com.sharingsystem.poc.model.Organisation;
import com.sharingsystem.poc.payload.CreateOrganisationInput;
import com.sharingsystem.poc.service.OrganisationService;

import lombok.extern.slf4j.Slf4j;

@DgsComponent
@Slf4j
public class OrganisationDataComponent {
	
	@Autowired
	private OrganisationService organisationService;
	
	@DgsMutation(field = "createOrganisation")
	public Organisation createOrganisation(CreateOrganisationInput createOrganisationInput) {
		log.debug("--- Organisation Data Component : createOrganisation ---");
		return organisationService.createOrganisation(createOrganisationInput);
	}
	
	@DgsQuery(field = "organisations")
	public List<Organisation> organisations(){
		log.debug("--- Organisation Data Component : getAllOrganisations ---");
		return organisationService.getAllOrganisations();
	}
	
	@DgsQuery(field = "organisation")
	public Organisation organisation(String organisationId){
		log.debug("---Organisation  Data Component : getOrganisation ---");
		return organisationService.getOrganisation(organisationId);
	}
	

}
