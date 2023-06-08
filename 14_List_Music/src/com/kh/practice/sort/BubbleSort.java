package com.kh.practice.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BubbleSort {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = 10;
//		int b = 20;
//		//SWAP - a방에 b값으로 바꾸고, b방에 a값으로 바꾸기
//		int temp = a;
//		a = b;
//		b = temp;
//		
//		System.out.println(a); //20
//		System.out.println(b); //10
//		
//		//버블 정렬
//		//int [] arr = new int[] {3, 1, 2, 5, 7, 9};
//		// Arrays.asList(arr) 배열 ==>List
//		System.out.println(Arrays.toString(arr));
//		System.out.print("[");
//		for(int ar : arr) {
//			System.out.print(ar);
//			System.out.print(",");
//		}
//		System.out.println("]");
//		for(int i = 0; i < arr.length-1; i++) {
//			for(int j = 0; j < arr.length-1 - i; j++) {
//				if(arr[j] > arr[j+1]) {  //오름차순
////				if(arr[j] < arr[j+1]) {  //내림차순
//				//SWAP
//					int tmp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = tmp;
//				}
//			
//			}
//		}
//		System.out.print("[");
//		for(int ar : arr) {
//			System.out.print(ar);
//			System.out.print(",");
//		}
//		System.out.println("]");
//		System.out.println("이름을 , 로 구분하여 입력해주세요.");
//		String names = sc.nextLine();
//		StringTokenizer strToken = new StringTokenizer(names, ",");
//		List<String> nameList = new ArrayList<String>();
//		while (strToken.hasMoreTokens()) {
//			nameList.add(strToken.nextToken());
//		}
//
//		
		int [] arr = new int[] {3,2,5,1,6,8};		
		System.out.println(Arrays.toString(arr));
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {  //오름차순
				//SWAP
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		// 버블 정렬 결과
		System.out.println(Arrays.toString(arr));

		
		System.out.println("이름을 , 로 구분하여 입력해주세요.");
		String name = sc.nextLine();
		StringTokenizer strToken2 = new StringTokenizer(name, ",");
		List<String> nameList2 = new ArrayList<String>();
		while (strToken2.hasMoreTokens()) {
			nameList2.add(strToken2.nextToken());
		}
		
		
		String tmpStr = "";
		// 버블 정렬하기
		for(int i=0; i<nameList2.size()-1; i++) {
			for(int j=0; j<nameList2.size()-1-i; j++) {
				if(nameList2.get(j).hashCode()>nameList2.get(j+1).hashCode()) {  //오름차순
				//SWAP
					tmpStr = nameList2.get(j);
					nameList2.set(j, nameList2.get(j+1));
					nameList2.set(j+1, tmpStr);
				}
			}
		}
		System.out.println(nameList2.toString());
	}
		
}			
		
		
		
		
		
		


