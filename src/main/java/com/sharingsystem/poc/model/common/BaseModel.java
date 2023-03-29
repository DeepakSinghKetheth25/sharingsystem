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

package com.sharingsystem.poc.model.common;

import java.util.Date;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseModel {

    public BaseModel(String id2) {
        this.id = id2;
    }


    @Id
    private String id;

    @Version
    private Long version;

    @CreatedBy
    private String createdBy;

    @CreatedDate
    private Date createdDate;

    @LastModifiedBy
    private String lastModifiedBy;

    @LastModifiedDate
    private Date lastModifiedDate;
}
