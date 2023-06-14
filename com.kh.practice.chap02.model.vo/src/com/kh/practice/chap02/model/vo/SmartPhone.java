package com.kh.practice.chap02.model.vo;

public abstract class SmartPhone implements Cellphone, TouchDisplay{
	
	private String maker; // 제조사 정보 
	
	public SmartPhone() {}
	
	public abstract String printInformation();
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public String getMaker() {
		return maker;
	}
}
