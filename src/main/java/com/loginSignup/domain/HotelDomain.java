package com.loginSignup.domain;

import lombok.AllArgsConstructor;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder(builderMethodName="builder")
public class HotelDomain {
	
    private String rezName;

    private String rezEmail;

    private String rezNumber;
    
    private String rezBrekkie;
    
    private String rezDate;
    
    private String rezRoom;
    
    private String ht_nm;
}