package com.company.java008_ex;

import java.util.Scanner;

public class MethodEx004_test {
	
	public static String scan() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	};

	
	/////////////////////////////////////////////////////////////
	public static void main(String[] args) {
	/*
	System.out.print(101);System.out.print(102);System.out.print(103);
	System.out.println();
	System.out.print(201);System.out.print(202);System.out.print(203);
	System.out.println();
	*/
	/*
	 * int [] arr = new int[2][3]
	 * int data 101;
	 * 
	 * 입력
	 * for(int ch=0; ch<arr.length; ch++){
	 * 		for(int kan=0; kan<arr[ch].length; kan++){
	 * 			arr[ch][kan] = data++
	 * 		}
	 * }
	 * 
	 * 
	 * 출력
	 * for(int ch=0; ch<arr.length; ch++){
	 * 		for(int kan=0; kan<arr[ch].length; kan++){
	 * 			System.out.println(arr[ch][kan]);
	 * 		}
	 * 		System.out.println();
	 * }
	 * 
	 * */	
		
		
	//변수
	// 중요 ▲위 처럼 층이 있는 배열의 값, 또는 new의 배열 값이라면 arr[ch] 의 값이 사용이 가능함!
	int data=100;
	for(int ch=0; ch<2; ch++) {
		for(int kan=0; kan<3; kan++) {
			System.out.print(++data+"\t");
		}
		data=200;
		System.out.println();
	}
		
	
		
	/////////////////////////////////////////////////////////////
	
	}// end main
}// end class


