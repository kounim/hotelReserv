package com.loginSignup.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping(value = "/search")
public class HotelController {

	
    @GetMapping(value = "")
    public String main(){
        return "search/index";
    }
    
  //----------지역별 맵 페이지-------------
  	@GetMapping("/sungnam")
      public ModelAndView goSungnam() throws IOException {
  		ModelAndView mav = new ModelAndView();
          mav.setViewName("search/sungnam"); 
          return mav;
      };
      
  	@GetMapping("/busan")
      public ModelAndView goBusan() throws IOException {
  		ModelAndView mav = new ModelAndView();
          mav.setViewName("search/busan"); 
          return mav;
      };
      //------------------------------
      
  	@GetMapping("searchMain")
      public ModelAndView searchMain() throws IOException {
  		ModelAndView mav = new ModelAndView();
          mav.setViewName("search/index"); 
          return mav;
      };

}
