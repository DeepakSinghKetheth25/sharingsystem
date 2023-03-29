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

package com.sharingsystem.poc.dgs.exception;

import com.netflix.graphql.dgs.exceptions.DefaultDataFetcherExceptionHandler;
import com.sharingsystem.poc.exception.RequestException;
import com.sharingsystem.poc.model.common.EResponseError;
import com.sharingsystem.poc.dgs.exception.implementation.GraphQLErrorDGS;


import org.springframework.stereotype.Component;

import graphql.GraphQLError;
import graphql.execution.DataFetcherExceptionHandler;
import graphql.execution.DataFetcherExceptionHandlerParameters;
import graphql.execution.DataFetcherExceptionHandlerResult;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class RequestDataFetchingExceptionHandler implements DataFetcherExceptionHandler {
    private final DefaultDataFetcherExceptionHandler defaultHandler = new DefaultDataFetcherExceptionHandler();

    @Override
    public DataFetcherExceptionHandlerResult onException(DataFetcherExceptionHandlerParameters handlerParameters) {
        // return null;

        log.debug("Exception: " + handlerParameters.getException());
        log.error(handlerParameters.getException().getMessage(), handlerParameters.getException());

/*        if (handlerParameters.getException() instanceof AccessDeniedException) {
            GraphQLError graphqlError = new GraphQLErrorDGS(EResponseError.ACCESS_DENIED);

            return DataFetcherExceptionHandlerResult.newResult().error(graphqlError).build();
        }
*/
        if (handlerParameters.getException() instanceof RequestException) {
            RequestException requestException = (RequestException) handlerParameters.getException();

            GraphQLError graphqlError = new GraphQLErrorDGS(requestException.getEResponseError());

            return DataFetcherExceptionHandlerResult.newResult().error(graphqlError).build();

        }

        if (handlerParameters.getException() instanceof Exception) {
            GraphQLError graphqlError = new GraphQLErrorDGS(EResponseError.REQUEST_FAILED);

            return DataFetcherExceptionHandlerResult.newResult().error(graphqlError).build();
        }

        return defaultHandler.onException(handlerParameters);
    }
}
