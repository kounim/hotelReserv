package com.loginSignup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.loginSignup.domain.HotelDomain;
import com.loginSignup.dto.HotelListDto;
import com.loginSignup.service.HotelListService;
import com.loginSignup.service.HotelService;

import lombok.RequiredArgsConstructor;

@RequestMapping(value = "/admin")
@Controller
@RequiredArgsConstructor
public class AdminController {
	
	@Autowired
    private HotelListService hotelListService; //서비스와 연결

	/**
	 * 관리자페이지
	 */
    @GetMapping(value = "")
    public String main(){
        return "admin/index";
    }
   
    
    @GetMapping(value="hotelList")
    public ModelAndView openhotelList() throws Exception {
		ModelAndView mav = new ModelAndView();
		//List<HotelListDto> list = hotelListService.selectBoardList();
		mav.addObject("list", hotelListService.selectBoardList());
        mav.setViewName("admin/hotelList.html"); 
        
        System.out.println("list = "+hotelListService.selectBoardList());
        
        return mav;
    };
    
    /*

    @RequestMapping("/hotelList") //노테이션의 값으로 주소 지정
    public ModelAndView openBoardList() throws Exception{
    	//templates 폴더 아래있는 /boardList.html을 의미함. Thymeleaf와 같은 템플릿엔진을 사용할 경우 스프링 부트의 자동 설정 기능으로 '.html'과 같은 접미사 생략 가능
    	ModelAndView mv = new ModelAndView("admin/hotelList"); 
        //게시글 목록을 조회하기 위해 ServiceImpl 클래스의 selectBoardList 메서드 호출
        List<HotelListDto> list = hotelListService.selectBoardList();  
        mv.addObject("list", list);

        return mv;
    }
    */

}
