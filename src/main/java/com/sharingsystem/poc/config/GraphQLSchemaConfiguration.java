package com.sharingsystem.poc.config;


import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsRuntimeWiring;
import com.sharingsystem.poc.directives.AuthorisationDirective;
import graphql.scalars.ExtendedScalars;
import graphql.schema.idl.RuntimeWiring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;


@Configuration
public class GraphQLSchemaConfiguration {
    @DgsComponent
    public class AuthorisationDirectiveRegistration {

//        @Autowired
        private AuthorisationDirective authorisationDirective;

        public AuthorisationDirectiveRegistration(AuthorisationDirective authorisationDirective) {
            this.authorisationDirective = authorisationDirective;
        }

        /**
         * Registers schema directive for <code>@auth</code> directive.
         *
         * @param builder
         * @return RuntimeWiring.Builder
         */
        @DgsRuntimeWiring
        public RuntimeWiring.Builder addSecuredDirective(RuntimeWiring.Builder builder) {
            return builder.directive(AuthorisationDirective.AUTH_DIRECTIVE, authorisationDirective);
        }

    }

    @DgsComponent
    public class ObjectScalar {

        @DgsRuntimeWiring
        public RuntimeWiring.Builder addScalar(RuntimeWiring.Builder builder) {
            return builder.scalar(ExtendedScalars.Object);
        }
    }


}