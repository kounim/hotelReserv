package com.loginSignup.VO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public class ReservationVO {
	private String email;

	private String rezName;

    private String rezEmail;

    private String rezNumber;
    
    private String rezBrekkie;
    
    private String rezDate;
    
    private String rezRoom;
    
    private String hotelName;
    
}
