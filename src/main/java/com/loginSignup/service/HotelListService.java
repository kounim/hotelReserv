package com.loginSignup.service;

import java.util.List;

import com.loginSignup.dto.HotelListDto;

public interface HotelListService {

    List<HotelListDto> selectHotelList() throws Exception;

}