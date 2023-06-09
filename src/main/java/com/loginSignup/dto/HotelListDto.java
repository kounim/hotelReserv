package com.loginSignup.dto;


import lombok.Data;

@Data 
public class HotelListDto {
    private int htseq;
    private String htname;
    private String htroom;
    private double htlocationx;
    private double htlocationy;
    private String htreservation;
    private String htcreateat;
    private String htupdateat;
}