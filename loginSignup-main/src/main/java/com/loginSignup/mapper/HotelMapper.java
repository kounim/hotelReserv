package com.loginSignup.mapper;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.loginSignup.domain.HotelDomain;

@Mapper
public interface HotelMapper {
	
	//전체 리스트 조회
	public HotelDomain mbSelectList(Map<String, String> map);
    
    //신규 저장
    public void mbCreate(HotelDomain HotelDomain);
    
    //전체데이터
    public List<HotelDomain> mbAllList(Map<String, Integer> map);
    
    // 전체갯수
    public int mbGetAll();
    
    //id 정보 가져오기
    public HotelDomain mbGetId(Map<String, String> map);
    
    //중복체크
    public int mbDuplicationCheck(Map<String, String> map);
    
    //업데이트
    public void mbUpdate(HotelDomain HotelDomain);
    
    //삭제
    public void mbRemove(Map<String, String> map);
    
}