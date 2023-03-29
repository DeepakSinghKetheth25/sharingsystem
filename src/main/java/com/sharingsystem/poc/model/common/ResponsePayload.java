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

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponsePayload {

    @Builder.Default
    private Boolean success = false;

    private EResponseError error;

    private Object data;

}
