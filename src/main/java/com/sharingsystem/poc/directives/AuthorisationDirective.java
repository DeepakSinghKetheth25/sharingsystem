package com.sharingsystem.poc.directives;

import com.netflix.graphql.dgs.context.DgsContext;
import com.netflix.graphql.dgs.internal.DgsRequestData;
import com.sharingsystem.poc.exception.RequestException;
import graphql.execution.DataFetcherResult;
import graphql.execution.ResultPath;
import graphql.language.SourceLocation;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import graphql.schema.GraphQLFieldDefinition;
import graphql.schema.GraphQLFieldsContainer;
import graphql.schema.idl.SchemaDirectiveWiring;
import graphql.schema.idl.SchemaDirectiveWiringEnvironment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Slf4j
@Component
public class AuthorisationDirective implements SchemaDirectiveWiring {

    public static final String AUTH_DIRECTIVE = "auth";
    public static final String ROLE_ATTR = "role";

    @Override
    public GraphQLFieldDefinition onField(SchemaDirectiveWiringEnvironment<GraphQLFieldDefinition> environment) {
        GraphQLFieldDefinition field = environment.getElement();
        GraphQLFieldsContainer parentType = environment.getFieldsContainer();

        // build a data fetcher that first checks authorisation roles before then calling the original data fetcher
        DataFetcher originalDataFetcher = environment.getCodeRegistry().getDataFetcher(parentType, field);

        if (field.getDirective(AUTH_DIRECTIVE) == null) {
            return field;
        }

        DataFetcher authDataFetcher = dataFetchingEnvironment -> {
            DgsRequestData requestData =  DgsContext.getRequestData(dataFetchingEnvironment);
            //Current user Permissions from headers
            List<String> permissions = requestData.getHeaders().get("permissions");

            if(permissions == null)
                return null;

            //Permissions required by the @auth directive
//            List<String> requiredPermissions = (List<String>) dataFetchingEnvironment.getFieldDefinition().getAppliedDirective(AUTH_DIRECTIVE).getArgument(ROLE_ATTR).getValue();
            String requiredPermissions = (String) dataFetchingEnvironment.getFieldDefinition().getAppliedDirective(AUTH_DIRECTIVE).getArgument(ROLE_ATTR).getValue();
            DataFetcherResult.Builder<Object> resultBuilder = DataFetcherResult.newResult();

            boolean result = permissions.contains(requiredPermissions);
//            Boolean result = requiredPermissions.stream().anyMatch( permission -> permissions.contains(permission) );

            if (result) {
                log.debug("Required Permission found");
                return originalDataFetcher.get(dataFetchingEnvironment);
            } else {
                log.debug("Required Permission Not found");
                return null;
            }
        };

        // now change the field definition to have the new authorising data fetcher
        environment.getCodeRegistry().dataFetcher(parentType, field, authDataFetcher);

        return field;
    }
}