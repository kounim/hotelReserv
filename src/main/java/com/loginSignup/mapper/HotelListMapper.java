package com.loginSignup.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.loginSignup.dto.HotelListDto;

@Mapper
public interface HotelListMapper {
	List<HotelListDto> selectHotelList() throws Exception; 
}
