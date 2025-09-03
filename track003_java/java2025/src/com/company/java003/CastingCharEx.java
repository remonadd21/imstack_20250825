package com.company.java003;

import java.util.Scanner;

public class CastingCharEx {
	public static void main(String[] args) {
		
		/*
		 * 연습문제1)
			클래스명 : CastingCharEx 
			- 대문자입력받아서 소문자로 변경프로그램을 작성하시오.
			
			연습문제2)
			클래스명 : CastingIntegerEx
			  short sh1 = 1;
			  short sh2 = 2;
			  short result = sh1 +sh2;
			
			※ 자바자료형 범위 찾아보기

		 */
		
		// 변수
		char upper = ' ';
		char lower = ' ';
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		
		//대문자 받아서 소문자로
		System.out.print("소문자로 변환할 대문자 입력하기: ");
		upper = scanner.next().charAt(0); 
		// next 문자열이 없기 때문에  charAt(0) 첫번째 문자 사용
		
		//처리  대문자 받아서 소문자로 처리
		lower = (char) (upper+32);
		
		// 출력
		System.out.println("입력하신 대문자: "+upper+" / 소문자 변환 : "+lower);
	}
}
