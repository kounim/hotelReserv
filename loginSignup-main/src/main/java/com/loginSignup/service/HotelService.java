package com.loginSignup.service;

import java.util.List;
import java.util.Map;

import com.loginSignup.domain.HotelDomain;


public interface HotelService {
	  // selectId
    public HotelDomain mbSelectList(Map<String, String> map);
    
    // selectAll
    public List<HotelDomain> mbAllList(Map<String, Integer> map);
    
    // selectAll Conut
    public int mbGetAll();
    
    //신규
    public void mbCreate(HotelDomain HotelDomain);
    
    //getMbIdCheck
    public HotelDomain mbGetId(Map<String, String> map);
    
    //mbDuplicationCheck
    public int mbDuplicationCheck(Map<String, String> map);
    
    //update
    public void mbUpdate(HotelDomain HotelDomain); 
    
    //delete 
    public void mbRemove(Map<String, String> map); 
    
}