package com.company.java003;

public class Casting002_char {
	public static void main(String[] args) {
		// 1. 문자 초기화
		// 문자는 저장시 숫자 / 출력시 문자
		// 초기화: char ch1=''; 에러남 
		// ' ' 공백이라도 있어야 오류 안남
		char ch1=' '; 
		char ch2='\u0000';
		
		System.out.println("step1 : "+ch1+"\t"+ ch2);
		System.out.println("step2 : "+(int)ch1+"\t"+(int)ch2);
		
		// 2. 문자 연산
		char c = 'A';
		System.out.println("step3: "+ (int)c);
		
		// c+1은 문자가 아닌 66으로 출력됨
		// 중요: char (2byte) + int (4byte)로 큰 값을 기준으로 계산됨! 
		System.out.println("step4: "+ (c+1) );
		
		// c+1을 합쳐서 문자로 문자로 형변환을 해주면 B가 출력된다.
		System.out.println("step5: "+ (char)(c+1) );
		
		// Q1) 대문자 A를 소문자 a로 변환시키기
		System.out.println("대문자 A(65): " + (int)'A' );
		System.out.println("소문자 a(97): " + (int)'a' );
		
		System.out.println("대문자 A, 소문자 a로 변환하기1 : "+(char)('A'+32));
		
		// Q2) 변수로 만들어서 표현하기
		char A1 = 'A';
		char a1 = 'a';
		
		//a2 변수에 담기 = A대문자를 소문자로 변환값
		char a2 = (char) (A1+32);
		System.out.println("대문자 A, 소문자 a로 변환하기2 : "+ a2);
		
		
		// 3. 문자열
		// 자료형의 분류는  기본형(값)과 참조형(주소)
		String str1 ="abc";
		String str2 ="abc";
		String str3 = new String("abc");
		
		// 해당하는 문자열의 주소 위치를 알 수 있음
		// main 메서드와 분리되는 메서드들과의 주소가 다를 수 있음
		System.out.println( System.identityHashCode(str1));
		System.out.println( System.identityHashCode(str2));
		System.out.println( System.identityHashCode(str3));
		
		System.out.println(str1 == str3);			// 주소가 같은지 비교
		System.out.println(str1.equals(str3));		// equals로 문자열 비교
		
	}// end main
}// end class
