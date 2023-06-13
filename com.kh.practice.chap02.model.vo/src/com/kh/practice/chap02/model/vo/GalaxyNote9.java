package com.kh.practice.chap02.model.vo;

public class GalaxyNote9 extends SmartPhone implements NotePen{

	public GalaxyNote9() {}
	
	public String makeCall() {
		return "번호를 누르고 통화버튼을 누름";
	}
	
	public String takeCall() {
		return "전화받기 버튼을 누름";

	}
	
	public String picture() {
		return "1300만 듀얼카메라";

	}
	
	public String charge() {
		return "고속 충전, 고속 무선충전 지원";
	}
	
	public String touch() {
		return "정전식, 와콤펜 지원";
	}
	
	public boolean bluetoothPen() {
		return true;
	}
	
	public String printInformation() {
		return "GalaxyNote9 " + super.getMaker() + "에서 만들어졌고 제원은 다음과 같다.\n"
				+ makeCall() +
				takeCall() + 
				picture() + 
				charge() + 
				touch() +
				"블루투스 팬 탑재 여부: " + bluetoothPen();
	}


}
