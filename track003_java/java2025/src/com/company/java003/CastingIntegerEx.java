package com.company.java003;

import java.util.Scanner;

public class CastingIntegerEx {
public static void main(String[] args) {
		
		/*

			연습문제2)
			클래스명 : CastingIntegerEx
			  short sh1 = 1;
			  short sh2 = 2;
			  short result = sh1 +sh2;
			
			※ 자바자료형 범위 찾아보기
			기본형	값, 논리형 boolean, 정수형 byte short (int) long, 실수형 float (double) 
			참조형	주소
			
			
			: 아래값 에러나는 이유!
			: sh1의 값 1 가져올때 int 로 바뀜
			: sh2의 값 2 가져올때 int 로 바뀜
			short result = sh1 +sh2;
			
		*/
		
		short sh1 =1;
		short sh2 =2;
		
		// 아래처럼 해결1
		short result1 = (short) (sh1 + sh2);
		
		// 아래처럼 해결2
		int result2 = sh1+sh2;
	
	}
}
