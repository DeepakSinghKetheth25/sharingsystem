package com.sharingsystem.poc.dgs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.DgsQuery;
import com.sharingsystem.poc.exception.RequestException;
import com.sharingsystem.poc.model.OrganisationProduct;
import com.sharingsystem.poc.model.OrganisationProductInput;
import com.sharingsystem.poc.service.OrganisationProductService;

import lombok.extern.slf4j.Slf4j;

@DgsComponent
@Slf4j
public class ProductDataComponent {
      
    @Autowired 
    private OrganisationProductService organisationProductService;

    @DgsQuery(field = "getAllOrganisationProducts")
    public List<OrganisationProduct> getAllOrganisationProducts(final String organisationId) throws RequestException, Exception{
    	log.debug("--- Product Data Component : getAllOrganisationProducts");
        return organisationProductService.getAllOrganisationProducts(organisationId);
    }

    @DgsQuery(field = "organisationProduct")
    public OrganisationProduct organisationProduct(final String organisationId, final String productId) throws RequestException, Exception{
    	log.debug("--- Product Data Component : organisationProduct");
        return organisationProductService.organisationProduct(organisationId, productId);
    }
    
    @DgsMutation(field = "createProduct")
    public OrganisationProduct createProduct(OrganisationProductInput organisationProduct){
    	log.debug("--- Product Data Component : createProduct");
        return organisationProductService.createProduct(organisationProduct);
    }


}
