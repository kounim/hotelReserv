package com.loginSignup.controller;




import java.io.IOException;

import javax.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.loginSignup.dto.ReservationFormDto;
import com.loginSignup.entity.Reservation;
import com.loginSignup.service.MemberService;

import lombok.RequiredArgsConstructor;



@Controller
@RequiredArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {
	 
//	private final ModelMapper modelMapper;
	
    @RequestMapping(value = "/join")
    public String reservationForm(Model model){
        model.addAttribute("reservationFormDto", new ReservationFormDto());
        System.out.println('a');
        return "reservation/confirm";
    }
    
//    @PostMapping(value = "/join")
//    public String reservationForm(@Valid ReservationFormDto reservationFormDto, Model model){
//     
//  	Reservation member= modelMapper.map(reservationFormDto, Reservation.class);
//    	System.out.println('c');
//		return "reservation/confirm";
//
//    } 
    
    @GetMapping(value = "")
    public String main(){
    	System.out.println('b');
        return "reservation/reservation";
    }
    
  //-----------------성남호텔링크----------------
    
  	@GetMapping("/sungnam1")
      public ModelAndView rvsn1() throws IOException {
  		ModelAndView mav = new ModelAndView();
  		String ht_nm = "성남호텔1";
  		String ht_image="sungnam1";
  		mav.addObject("ht_image", ht_image);
  		mav.addObject("ht_nm", ht_nm);
        mav.setViewName("reservation/reservation"); 
        return mav;
      };
      
  	@GetMapping("/sungnam2")
      public ModelAndView rvsn2() throws IOException {
  		ModelAndView mav = new ModelAndView();
  		String ht_nm = "성남호텔2";
  		String ht_image="sungnam2";
  		mav.addObject("ht_image", ht_image);
  		mav.addObject("ht_nm", ht_nm);
        mav.setViewName("reservation/reservation"); 
        return mav;
      };
      
  	@GetMapping("/sungnam3")
      public ModelAndView rvsn3() throws IOException {
  		ModelAndView mav = new ModelAndView();
  		String ht_nm = "성남호텔3";
  		String ht_image="hotel02";
  		mav.addObject("ht_image", ht_image);
  		mav.addObject("ht_nm", "hotel Name : "+ht_nm);
        mav.setViewName("reservation/reservation"); 
        return mav;
      };
      
  	@GetMapping("/sungnam4")
      public ModelAndView rvsn4() throws IOException {
  		ModelAndView mav = new ModelAndView();
  		String ht_nm = "성남호텔4";
  		String ht_image="hotel03";
  		mav.addObject("ht_image", ht_image);
  		mav.addObject("ht_nm", "hotel Name : "+ht_nm);
        mav.setViewName("reservation/reservation"); 
        return mav;
      };
      //------------------부산호텔 링크---------------
  	@GetMapping("/busan1")
      public ModelAndView rvbs1() throws IOException {
  		ModelAndView mav = new ModelAndView();
  		String ht_nm = "부산호텔1";
  		String ht_image="busan1";
  		mav.addObject("ht_image", ht_image);
  		mav.addObject("ht_nm", ht_nm);
        mav.setViewName("reservation/reservation"); 
        return mav;
      };
      
  	@GetMapping("/busan2")
      public ModelAndView rvbs2() throws IOException {
  		ModelAndView mav = new ModelAndView();
  		String ht_nm = "부산호텔2";
  		String ht_image="hotel01";
  		mav.addObject("ht_image", ht_image);
  		mav.addObject("ht_nm", "hotel Name : "+ht_nm);
        mav.setViewName("reservation/reservation"); 
        return mav;
      };
      
  	@GetMapping("/busan3")
      public ModelAndView rvbs3() throws IOException {
  		ModelAndView mav = new ModelAndView();
  		String ht_nm = "부산호텔3";
  		String ht_image="hotel01";
  		mav.addObject("ht_image", ht_image);
  		mav.addObject("ht_nm", "hotel Name : "+ht_nm);
        mav.setViewName("reservation/reservation"); 
        return mav;
      };
      
  	@GetMapping("/busan4")
      public ModelAndView rvbs4() throws IOException {
  		ModelAndView mav = new ModelAndView();
  		String ht_nm = "부산호텔4";
  		String ht_image="hotel01";
  		mav.addObject("ht_image", ht_image);
  		mav.addObject("ht_nm", "hotel Name : "+ht_nm);
        mav.setViewName("reservation/reservation"); 
        return mav;
      };
    
    
    
	 
}
