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
public class OrganisationProduct extends BaseModel{
	
    @NonNull
	private String organisationId;

    @NonNull
    @DBRef
    private BaseProduct product;
    
    private EPublishStatus publishStatus;

    private EPublishStatus globalPublishStatus;

    private String order;

    private Integer quantity;

    private EStatus status;

    public OrganisationProduct(String organisationId, EPublishStatus publishStatus, String order,Integer quantity, EStatus status, BaseProduct product) {
        
    	this.organisationId = organisationId;
    	this.publishStatus = publishStatus;
        this.globalPublishStatus = null;
        this.order = order;
        this.quantity = quantity;
        this.status = status;
        this.product = product;
    }
}
