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

package com.sharingsystem.poc.exception;
import com.sharingsystem.poc.model.common.EResponseError;
import lombok.Getter;

@Getter
public class RequestException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private EResponseError eResponseError;

    private Object data;

    public RequestException() {
        super();
    }

    public RequestException(final EResponseError eResponseError, final Throwable cause) {
        super(eResponseError.getErrorMessage(), cause);
        this.eResponseError = eResponseError;
    }

    public RequestException(final EResponseError eResponseError) {
        super(eResponseError.getErrorMessage());
        this.eResponseError = eResponseError;
    }

    public RequestException(final Throwable cause) {
        super(cause);
    }

    public RequestException(final EResponseError eResponseError, Object data, final Throwable cause) {
        super(eResponseError.getErrorMessage(), cause);
        this.eResponseError = eResponseError;
        this.data = data;
    }

    public RequestException(final EResponseError eResponseError, Object data) {
        super(eResponseError.getErrorMessage());
        this.eResponseError = eResponseError;
        this.data = data;
    }

    public RequestException(Object data, final Throwable cause) {
        super(cause);
        this.data = data;
    }

}
