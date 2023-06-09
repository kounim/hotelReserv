package com.loginSignup.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;

import com.loginSignup.VO.ReservationVO;
import com.loginSignup.domain.HotelDomain;
import com.loginSignup.entity.Reservation;


public interface HotelService {
	
	public List<HotelDomain> htList();
	
	  // selectId
	public List<HotelDomain> reservationList();
	
	public int fileProcess(ReservationVO reservationVO, HttpServletRequest httpReq);

	public int rezDuplicationCheck(Map<String, String> map);
	
	
	@Transactional
	public void rezRemove(Reservation reservation); 
	
	
}