package com.company.java002_ex;

import java.util.Scanner;

public class InputEx001 {
	public static void main(String[] args) {
		/*
		 * 패키지명 : com.company.java002_ex
			클래스명 : InputEx001
			출력내용 : 
		   1-1.  나이를 입력받을 자료형 선택후  변수명  age로 하시오.  예) 10,20
		   1-2.  Scanner이용해서 나이 입력받고 출력하시오.
		  
		    당신의 나이를 입력하시오 > _입력받기
		    내 나이는 ** 입니다.
		
			연습문제2)
			패키지명 : com.company.java002_ex
			클래스명 : InputEx002
			출력내용 :  Scanner이용해서 좋아하는 정수 입력받고 출력하시오.
			좋아하는 수(정수)   입력하시오 > _입력받기
		    좋아하는 숫자는 ** 입니다.
			*/
		
		//변수
		int age;
		//입력
		System.out.println("당신의 나이를 입력하세요> ");
		Scanner sc = new Scanner(System.in);
		
		age = sc.nextInt();
		//처리
		//출력
		
		System.out.println("저의 나이는 "+age+"세 입니다.");
	}
}
