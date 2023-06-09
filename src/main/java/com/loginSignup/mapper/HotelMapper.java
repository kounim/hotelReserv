package com.loginSignup.mapper;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.loginSignup.VO.ReservationVO;
import com.loginSignup.domain.HotelDomain;
import com.loginSignup.entity.Reservation;

@Mapper
public interface HotelMapper {
	
	public List<HotelDomain> reservationList();
	
	public List<HotelDomain> htList();
	
	//전체 리스트 조회
	public HotelDomain rezSelectList(Map<String, String> map);
    
    //신규 저장
    public void rezCreate(HotelDomain HotelDomain);
    
    //전체데이터
    public List<HotelDomain> rezAllList(Map<String, Integer> map);
    
    // 전체갯수
    public int rezGetAll();
    
    //id 정보 가져오기
    public HotelDomain rezGetId(Map<String, String> map);
    
    //중복체크
    public int rezDuplicationCheck(Map<String, String> map);
    
    //업데이트
    public void rezUpdate(HotelDomain HotelDomain);
    
    //삭제
    public void rezRemove(Reservation reservation);
    
}