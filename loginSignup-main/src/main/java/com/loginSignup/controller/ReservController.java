/*

package com.loginSignup.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/reservation")
public class ReservController {

	
    @GetMapping(value = "")
    public String main(){
        return "reservation/index";
    }
      //-----------------성남호텔링크----------------
      
  	@GetMapping("/sungnam1")
      public ModelAndView rvsn1() throws IOException {
  		ModelAndView mav = new ModelAndView();
  		String ht_nm = "성남호텔1";
  		String ht_image="hotel02";
  		mav.addObject("ht_image", ht_image);
  		mav.addObject("ht_nm", "hotel Name : "+ht_nm);
        mav.setViewName("reservation/reserv"); 
        return mav;
      };
      
  	@GetMapping("/sungnam2")
      public ModelAndView rvsn2() throws IOException {
  		ModelAndView mav = new ModelAndView();
  		String ht_nm = "성남호텔2";
  		String ht_image="hotel02";
  		mav.addObject("ht_image", ht_image);
  		mav.addObject("ht_nm", "hotel Name : "+ht_nm);
        mav.setViewName("reservation/reserv"); 
        return mav;
      };
      
  	@GetMapping("/sungnam3")
      public ModelAndView rvsn3() throws IOException {
  		ModelAndView mav = new ModelAndView();
  		String ht_nm = "성남호텔3";
  		String ht_image="hotel02";
  		mav.addObject("ht_image", ht_image);
  		mav.addObject("ht_nm", "hotel Name : "+ht_nm);
        mav.setViewName("reservation/reserv"); 
        return mav;
      };
      
  	@GetMapping("/sungnam4")
      public ModelAndView rvsn4() throws IOException {
  		ModelAndView mav = new ModelAndView();
  		String ht_nm = "성남호텔4";
  		String ht_image="hotel03";
  		mav.addObject("ht_image", ht_image);
  		mav.addObject("ht_nm", "hotel Name : "+ht_nm);
        mav.setViewName("reservation/reserv"); 
        return mav;
      };
      //------------------부산호텔 링크---------------
  	@GetMapping("busan1")
      public ModelAndView rvbs1() throws IOException {
  		ModelAndView mav = new ModelAndView();
  		String ht_nm = "부산호텔1";
  		String ht_image="hotel01";
  		mav.addObject("ht_image", ht_image);
  		mav.addObject("ht_nm", "hotel Name : "+ht_nm);
        mav.setViewName("reservation/reserv.html"); 
        return mav;
      };
      
  	@GetMapping("busan2")
      public ModelAndView rvbs2() throws IOException {
  		ModelAndView mav = new ModelAndView();
  		String ht_nm = "부산호텔2";
  		String ht_image="hotel01";
  		mav.addObject("ht_image", ht_image);
  		mav.addObject("ht_nm", "hotel Name : "+ht_nm);
        mav.setViewName("reservation/reserv.html"); 
        return mav;
      };
      
  	@GetMapping("busan3")
      public ModelAndView rvbs3() throws IOException {
  		ModelAndView mav = new ModelAndView();
  		String ht_nm = "부산호텔3";
  		String ht_image="hotel01";
  		mav.addObject("ht_image", ht_image);
  		mav.addObject("ht_nm", "hotel Name : "+ht_nm);
        mav.setViewName("reservation/reserv.html"); 
        return mav;
      };
      
  	@GetMapping("busan4")
      public ModelAndView rvbs4() throws IOException {
  		ModelAndView mav = new ModelAndView();
  		String ht_nm = "부산호텔4";
  		String ht_image="hotel01";
  		mav.addObject("ht_image", ht_image);
  		mav.addObject("ht_nm", "hotel Name : "+ht_nm);
        mav.setViewName("reservation/reserv.html"); 
        return mav;
      };

}

*/
