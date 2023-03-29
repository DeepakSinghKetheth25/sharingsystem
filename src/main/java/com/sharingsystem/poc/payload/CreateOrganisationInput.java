package com.sharingsystem.poc.payload;

import com.sharingsystem.poc.model.common.EOrganisationType;
import com.sharingsystem.poc.model.Address;

import lombok.Data;

@Data
public class CreateOrganisationInput {

	private String OKID;
    private String status;
    private String name;
    private String userId;
    private String publicMobileCountryCode;
    private String publicMobile;
    private String publicEmail;
    private String websiteURL;
    private Address address;
    private EOrganisationType type;
	
}
