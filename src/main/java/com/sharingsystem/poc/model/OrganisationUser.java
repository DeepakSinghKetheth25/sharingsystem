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

import org.springframework.data.mongodb.core.mapping.Document;

import com.sharingsystem.poc.model.common.BaseModel;
import com.sharingsystem.poc.model.common.EOrganisationRole;
import com.sharingsystem.poc.model.common.EOrganisationUserStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Document(collection = "organisation-user")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class OrganisationUser extends BaseModel {

    @NonNull
    private String organisationId;

    @NonNull
    private String userId;

    @NonNull
    private EOrganisationUserStatus organisationUserStatus;

    private List<EOrganisationRole> roleList;

}
