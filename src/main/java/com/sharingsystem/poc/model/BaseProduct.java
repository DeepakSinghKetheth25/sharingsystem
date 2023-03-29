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


import java.util.List;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.sharingsystem.poc.model.common.BaseModel;
import com.sharingsystem.poc.model.common.EPublishStatus;
import com.sharingsystem.poc.model.common.EStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Document(collection = "product")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class BaseProduct extends BaseModel {

    @Indexed(unique = true)
    private String REFID;

    private String SKUID;

    private String name;
    
    @NonNull
    private String organisationId;

    private String profitMargin;

    private EStatus status;

    private EPublishStatus publishStatus;

    private List<ProductChildProduct> subProductList;

    private Integer totalLogs;

    public BaseProduct(String REFID, String SKUID, String organisationId, String name, List<ProductChildProduct> subProductList, String profitMargin, EPublishStatus publishStatus) {
        this.REFID = REFID;
        this.SKUID = SKUID;
        this.name = name;
        this.organisationId = organisationId;
        this.status = EStatus.ACTIVE;
        this.publishStatus = publishStatus;
        this.subProductList = subProductList;
        this.totalLogs = 0;
        this.profitMargin = profitMargin;
    }

    public BaseProduct(String id, String REFID, String SKUID, String organisationId, String name, List<ProductChildProduct> subProductList, String profitMargin) {
        super(id);
        this.REFID = REFID;
        this.SKUID = SKUID;
        this.name = name;
        this.organisationId = organisationId;
        this.status = EStatus.ACTIVE;
        this.publishStatus = EPublishStatus.UNPUBLISHED;
        this.subProductList = subProductList;
        this.totalLogs = 0;
        this.profitMargin = profitMargin;
    }

}
