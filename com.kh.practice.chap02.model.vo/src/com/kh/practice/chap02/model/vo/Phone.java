package com.kh.practice.chap02.model.vo;

public interface Phone {

	public static final char[] NUMBERPAD = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '*', '0', '#'};
	
	
	//interface 메소드 생성시 {}X
	public String makeCall(); //전화 걸기
	
	public String takeCall(); //전화 받기


}
