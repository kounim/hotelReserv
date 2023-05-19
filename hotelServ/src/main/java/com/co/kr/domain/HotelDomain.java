package com.co.kr.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder(builderMethodName="builder")
public class HotelDomain {

	private Integer htSeq;
	private String htName;
	private String htRoom;
	private String htCreateAt;
	private String htUpdateAt;
}