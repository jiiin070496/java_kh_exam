package com.kh.practice.comf.func;

import java.util.Scanner;

public class CompExample {
	private Scanner sc = new Scanner(System.in);
	
//	public void recursive() {
//		recursive(); 
//	}
	
	
	public void practice4(){
//		위 문제와 모든 것이 동일하고, “더 하시겠습니까?”라고 추가로 물어보도록 하세요.
//		이 때, N이나 n이 나오면 프로그램을 끝내고 Y나 y면 계속 진행하도록 하되 Y, y, N, n이 아닌
//		다른 문자를 입력했을 경우 “잘못된 대답입니다. 다시 입력해주세요.”를 출력하고
//		더 하겠냐는 물음을 반복하세요.


		while(true) {
			System.out.print("문자열: ");
			String str = sc.nextLine();
			System.out.print("문자: ");
			char c = sc.nextLine().charAt(0);
			int count = 0;
			for(int i = 0; i <str.length(); i++) {
				if(str.charAt(i) == c) {
					count++;
				}
			}
			
			System.out.println("포함된 개수: " + count);
			
			boolean exit = false; //while(true) 문자열: 을 끝내고 나갈수 있도록 하기 위한 변수
			while(true) {
				System.out.print("더 하시겠습니까?(y/n)");
				String strContinue = sc.nextLine().toLowerCase();
				if(strContinue.equals("y")) {
					break;
				}else if(strContinue.equals("n")) {
					exit = true; //while(true) 문자열: 을 끝낼 수 있도록 true로 대입
					System.out.println("프로그램 종료합니다.");
					break;
				}else {
					System.out.println("잘못된 대답입니다.");
				}
			}
			if(exit) {
				break;
			}
		}
	}


	public void practice4_1() {
		String strContinue = "";
		do {
			System.out.print("문자열: ");
			String str = sc.nextLine();
			System.out.print("문자: ");
			char c = sc.nextLine().charAt(0);
			int count = 0;
			for(int i = 0; i <str.length(); i++) {
				if(str.charAt(i) == c) {
					count++;
				}
			}
			
			System.out.println("포함된 개수: " + count);
			
			boolean exit = false; //while(true) 문자열: 을 끝내고 나갈수 있도록 하기 위한 변수
			while(true) {
				System.out.print("더 하시겠습니까?(y/n)");
				strContinue = sc.nextLine().toLowerCase();
				if(strContinue.equals("y")) {
					break;
				}else if(strContinue.equals("n")) {
					exit = true; //while(true) 문자열: 을 끝낼 수 있도록 true로 대입
					System.out.println("프로그램 종료합니다.");
					break;
				}else {
					System.out.println("잘못된 대답입니다.");
				}
			}
			
			}while(strContinue.equals("y"));
			System.out.println("=====끝=====");
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

