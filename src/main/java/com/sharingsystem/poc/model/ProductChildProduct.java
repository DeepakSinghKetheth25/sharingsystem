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


import org.springframework.data.mongodb.core.mapping.DBRef;

import com.sharingsystem.poc.model.common.EPublishStatus;
import com.sharingsystem.poc.model.common.EStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductChildProduct {

    @NonNull
    private EPublishStatus publishStatus;

    private EPublishStatus globalPublishStatus;

    @NonNull
    private String organisationId;

    @NonNull
    private String order;

    @NonNull
    private Integer quantity;

    @NonNull
    private EStatus status;

    @DBRef
    private BaseProduct childProduct;

    public ProductChildProduct(String organisationId, EPublishStatus publishStatus, String order, EStatus status, BaseProduct childProduct) {
        this.organisationId = organisationId;
        this.publishStatus = publishStatus;
        this.globalPublishStatus = null;
        this.order = order;
        this.quantity = 1;
        this.status = status;
        this.childProduct = childProduct;
    }
}
