package com.sharingsystem.poc.model;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.sharingsystem.poc.model.common.BaseModel;
import com.sharingsystem.poc.model.common.EOrganisationGroup;
import com.sharingsystem.poc.model.common.EOrganisationType;
import com.sharingsystem.poc.model.common.EStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Document(collection = "organisation")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Organisation extends BaseModel {

    @Indexed(unique = true)
    private String OKID;

    private EStatus status;

    private String name;

    private String publicMobileCountryCode;

    private String publicMobile;

    private String publicEmail;

    private String websiteURL;

    private Address address;

    private EOrganisationGroup organisationType;

    private EOrganisationType type;



//    private List<Product> products;

}
