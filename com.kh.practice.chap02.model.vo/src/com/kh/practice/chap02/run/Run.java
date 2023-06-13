package com.kh.practice.chap02.run;

import com.kh.practice.chap02_abstractNInterface.PhoneController;

public class Run {

	public static void main(String[] args) {
		PhoneController pc = new PhoneController();
		
		for(int i = 0; i < 2; i++) {
			System.out.println(pc.method()[i]);
			System.out.println();
		}
	}

}
