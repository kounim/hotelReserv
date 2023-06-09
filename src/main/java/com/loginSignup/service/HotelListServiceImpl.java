package com.loginSignup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginSignup.dto.HotelListDto;
import com.loginSignup.mapper.HotelListMapper;

@Service 
public class HotelListServiceImpl implements HotelListService{

	@Autowired 
	private HotelListMapper hotelListMapper;

	@Override
	public List<HotelListDto> selectBoardList() throws Exception {
		// TODO Auto-generated method stub
		return hotelListMapper.selectBoardList();
	}
}