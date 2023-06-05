package com.loginSignup.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginSignup.domain.HotelDomain;
import com.loginSignup.mapper.HotelMapper;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	private HotelMapper HotelMapper;

	@Override
	public void mbCreate(HotelDomain loginDomain) {
		HotelMapper.mbCreate(loginDomain);
	}

	@Override
	public HotelDomain mbSelectList(Map<String, String> map) {
		return HotelMapper.mbSelectList(map);
	}

	@Override
	public List<HotelDomain> mbAllList(Map<String, Integer> map) { 
		return HotelMapper.mbAllList(map);
	}

	@Override
	public void mbUpdate(HotelDomain loginDomain) {
		HotelMapper.mbUpdate(loginDomain);
	}

	@Override
	public void mbRemove(Map<String, String> map) {
		HotelMapper.mbRemove(map);
	}

	@Override
	public HotelDomain mbGetId(Map<String, String> map) {
		return HotelMapper.mbGetId(map);
	}

	@Override
	public int mbDuplicationCheck(Map<String, String> map) {
		// TODO Auto-generated method stub
		return HotelMapper.mbDuplicationCheck(map);
	}

	@Override
	public int mbGetAll() {
		// TODO Auto-generated method stub
		return HotelMapper.mbGetAll();
	}

}