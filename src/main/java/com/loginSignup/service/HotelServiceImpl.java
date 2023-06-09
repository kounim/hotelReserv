package com.loginSignup.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.loginSignup.VO.ReservationVO;
import com.loginSignup.domain.HotelDomain;
import com.loginSignup.entity.Reservation;
import com.loginSignup.mapper.HotelMapper;
import com.loginSignup.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	private HotelMapper hotelMapper;
	
	public List<HotelDomain> htList(){
		return hotelMapper.htList();
	}
	
	public List<HotelDomain> reservationList(){
		return hotelMapper.reservationList();
	}
	
	@Override
	public int fileProcess(ReservationVO reservationVO, HttpServletRequest httpReq) {
		//session 생성
		HttpSession session = httpReq.getSession();
		
		//content domain 생성 
		HotelDomain hotelDomain = HotelDomain.builder()
			.rezName(session.getAttribute("rezName").toString())
			.rezEmail(reservationVO.getRezEmail())
			.rezNumber(reservationVO.getRezNumber())
			.rezBrekkie(reservationVO.getRezBrekkie())
			.rezDate(reservationVO.getRezDate())
			.rezRoom(reservationVO.getRezRoom())
			.hotelName(reservationVO.getHotelName())
			.build();
	
			
				// db 인서트
			//hotelMapper.rezCreate(hotelDomain);
			System.out.println(" db 인서트");

			
			
			// file 데이터 db 저장시 쓰일 값 추출
//			int bdSeq = hotelDomain.getHt_nm();

	
			return 0; // 저장된 게시판 번호
	}
	public int rezDuplicationCheck(Map<String, String> map) {
		// TODO Auto-generated method stub
		return hotelMapper.rezDuplicationCheck(map);
	}
	
	@Override
	public void rezRemove(Reservation reservation) {
		hotelMapper.rezRemove(reservation);
	}
}

