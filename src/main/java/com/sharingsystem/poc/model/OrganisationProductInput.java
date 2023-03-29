/*
 * Copyright (c) 2020-Present OK Systems Limited All rights reserved
 * 
 * This software is the confidential and proprietary information of OK Systems Limited ('Confidential
 * Information'). You shall not disclose such Confidential Information and shall use it only in
 * accordance with the terms of the licence agreement you entered into with OK Systems Limited.
 * 
 * Organistion: OK Systems Limited
 * Project: OK Grade
 * Author: Apoorva Katta (apoorva@okgrade.com)
 */

package com.sharingsystem.poc.model;

import com.sharingsystem.poc.model.common.BaseModel;
import com.sharingsystem.poc.model.common.EPublishStatus ;
import com.sharingsystem.poc.model.common.EStatus ;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Document(collection = "organisation-product")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class OrganisationProductInput extends BaseModel{
	
    @NonNull
	private String organisationId;

    @NonNull
    @DBRef
    private BaseProductInput product;
    
    private EPublishStatus publishStatus;

    private EPublishStatus globalPublishStatus;

    private String order;

    private Integer quantity;

    private EStatus status;

    public OrganisationProductInput(String organisationId, EPublishStatus publishStatus, String order, EStatus status, BaseProductInput product) {
        
    	this.organisationId = organisationId;
    	this.publishStatus = publishStatus;
        this.globalPublishStatus = null;
        this.order = order;
        this.quantity = 1;
        this.status = status;
        this.product = product;
    }
}
