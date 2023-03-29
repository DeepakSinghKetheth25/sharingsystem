package com.sharingsystem.poc.model;

 import java.util.List;
 
 import org.springframework.data.mongodb.core.index.Indexed;
 import org.springframework.data.mongodb.core.mapping.Document;

import com.sharingsystem.poc.model.common.ERole;

import lombok.AllArgsConstructor;
 import lombok.Builder;
 import lombok.Data;
 import lombok.EqualsAndHashCode;
 import lombok.NoArgsConstructor;
 import lombok.NonNull;
 
 @Document(collection = "user")
 @Data
 @Builder
 @NoArgsConstructor
 @AllArgsConstructor
 @EqualsAndHashCode(callSuper = false)
 public class User {
    
    private String id;

     @Indexed(unique = true)
     @NonNull
     private String OKID;
 
     private String name;
 
     private String email;
 
     private String mobile;
 
     private String mobileCountryCode;
 
//     private String loginOTP;
 
//     private Date loginOTPValidTill;
 
     private List<ERole> roleList;

 }
 