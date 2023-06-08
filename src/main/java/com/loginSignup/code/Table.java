package com.loginSignup.code;
import lombok.Getter;

@Getter
public enum Table {
	
	REZ("rez");
	
	private String table;

	Table(String table){
		this.table = table;
	}
}
