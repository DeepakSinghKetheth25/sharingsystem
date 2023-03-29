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

package com.sharingsystem.poc.dgs.exception.implementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sharingsystem.poc.model.common.EResponseError;

import graphql.ErrorClassification;
import graphql.GraphQLError;
import graphql.language.SourceLocation;
import lombok.Getter;

@Getter
public class GraphQLErrorDGS implements GraphQLError {

    private EResponseError responseError;

    public GraphQLErrorDGS(EResponseError responseError) {
        this.responseError = responseError;
    }

    @Override
    public ErrorClassification getErrorType() {
        return null;
    }

    @Override
    public List<SourceLocation> getLocations() {
        return null;
    }

    @Override
    public String getMessage() {
        return responseError.name();
    }

    @Override
    public Map<String, Object> getExtensions() {
        Map<String, Object> extensions = new HashMap<>();
        extensions.put("errorCode", responseError.getErrorCode());
        extensions.put("errorMessage", responseError.getErrorMessage());
        return extensions;
    }

}
