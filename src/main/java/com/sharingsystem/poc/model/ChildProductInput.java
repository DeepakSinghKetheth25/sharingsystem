package com.sharingsystem.poc.model;

import lombok.Data;

@Data
public class ChildProductInput {

    String id;
    String organisationId;
    String order;
    Integer quantity;

}
