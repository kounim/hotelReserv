package com.loginSignup.controller;




import javax.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
	 
}
