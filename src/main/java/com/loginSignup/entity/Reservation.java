package com.loginSignup.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.*;

@Entity
@Table(name="rez")
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Reservation {

	@Id
    @Column(name="email")
    private String email;

	@Column(name="hotel_name")
    private String hotelName;
	
	@Column(name="rez_name")
    private String rezName;
	
	@Column(name="rez_email")
    private String rezEmail;

	@Column(name="rez_number")
    private String rezNumber; 
    
	@Column(name="rez_brekkie")
    private String rezBrekkie;

	@Column(name="rez_date")
    private String rezDate;
	
	@Column(name="rez_room")
    private String rezRoom;



	
}
