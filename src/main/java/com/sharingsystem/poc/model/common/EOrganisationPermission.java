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

public enum EOrganisationPermission {

    ARCHIVE_PRODUCT, 
    ARCHIVE_PRODUCT_SUBPRODUCT,
    ARCHIVE_PUBLISH_PRODUCT,
    ARCHIVE_ITEM, 
    ARCHIVE_LABEL, 
    
    ARCHIVE_MEDIA, 
    ARCHIVE_DOCUMENT, 
    ARCHIVE_NOTE, 

    ARCHIVE_CONTROL_TEST, 
    ARCHIVE_CONTROL_INSPECTION, 

    ARCHIVE_CREATE_PRODUCT_INSPECTION, 
    ARCHIVE_RUN_INTERNAL_INSPECTION, 
    ARCHIVE_RUN_EXTERNAL_INSPECTION, 
    ARCHIVE_VISUAL_SUPPLY_CHAIN_MAPPING, 
    
    ITEM_EXTERNAL_ID;

}
