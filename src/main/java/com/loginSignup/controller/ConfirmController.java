package com.loginSignup.controller;


import java.io.IOException;
import java.text.ParseException;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.loginSignup.VO.ReservationVO;
import com.loginSignup.entity.Reservation;
import com.loginSignup.repository.ReservationRepository;
import com.loginSignup.service.HotelService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/confirm")
public class ConfirmController {

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ModelAndView confirm(Authentication authentication, ReservationVO reservationVO) throws IOException, ParseException {
        System.out.print('a');

        User user = (User) authentication.getPrincipal();

        ModelAndView mav = new ModelAndView();

        Reservation reservation = Reservation.builder()
                .email(user.getUsername())
                .rezName(reservationVO.getRezName())
                .rezEmail(reservationVO.getRezEmail())
                .rezNumber(reservationVO.getRezNumber())
                .rezBrekkie(reservationVO.getRezBrekkie())
                .rezDate(reservationVO.getRezDate())
                .rezRoom(reservationVO.getRezRoom())
                .hotelName(reservationVO.getHt_nm())
                .build();
        reservationRepository.save(reservation);

        mav.addObject("email", user.getUsername());
        mav.addObject("rezName", reservationVO.getRezName());
        mav.addObject("rezEmail", reservationVO.getRezEmail());
        mav.addObject("rezNumber", reservationVO.getRezNumber());
        mav.addObject("rezBrekkie", reservationVO.getRezBrekkie());
        mav.addObject("rezDate", reservationVO.getRezDate());
        mav.addObject("rezRoom", reservationVO.getRezRoom());
        mav.addObject("ht_nm", reservationVO.getHt_nm());

        mav.setViewName("reservation/confirm.html");
        return mav;
    }

    @GetMapping(value = "")
    public ModelAndView confirmList(Authentication authentication, ReservationVO reservationVO, String bdSeq, HttpServletRequest httpReq) throws IOException, ParseException {
        System.out.print('b');

        User user = (User) authentication.getPrincipal();

        Optional<Reservation> reservationOptional = reservationRepository.findById(user.getUsername());

        ModelAndView mav = new ModelAndView();

        if (reservationOptional.isPresent()) {
            Reservation reservation = reservationOptional.get();
            mav.addObject("rezName", reservation.getRezName());
            mav.addObject("rezEmail", reservation.getRezEmail());
            mav.addObject("rezNumber", reservation.getRezNumber());
            mav.addObject("rezBrekkie", reservation.getRezBrekkie());
            mav.addObject("rezDate", reservation.getRezDate());
            mav.addObject("rezRoom", reservation.getRezRoom());
            mav.addObject("ht_nm", reservation.getHotelName());
        } else {
            mav.addObject("rezName", reservationVO.getRezName());
            mav.addObject("rezEmail", reservationVO.getRezEmail());
            mav.addObject("rezNumber", reservationVO.getRezNumber());
            mav.addObject("rezBrekkie", reservationVO.getRezBrekkie());
            mav.addObject("rezDate", reservationVO.getRezDate());
            mav.addObject("rezRoom", reservationVO.getRezRoom());
            mav.addObject("ht_nm", reservationVO.getHt_nm());
        }

        System.out.print('b');
        mav.setViewName("reservation/confirm.html");
        return mav;

    }

    @RequestMapping("/remove")
    public ModelAndView reservationRemove(Authentication authentication) throws IOException {
    	
    	ModelAndView mav = new ModelAndView();
    	User user = (User) authentication.getPrincipal();

        Optional<Reservation> reservationOptional = reservationRepository.findById(user.getUsername());
        Reservation reservation = reservationOptional.get();
    	reservationRepository.delete(reservation);
    	
    	System.out.print('b');
    	mav.setViewName("main.html");
    	return mav;
    	
    }
    

}
