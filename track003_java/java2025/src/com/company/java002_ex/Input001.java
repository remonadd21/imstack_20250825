package com.company.java002_ex;

import java.util.Scanner;

public class Input001 {
	public static void main(String[] args) {
		// ## 자료형의 분류 : 기본형 (값) / 참조형 (주소)
		// 기본형 : 논리형(boolean), 
		// 정수형 : (byte, short, int, long)
		// 실수형 : (float, double)
		
		// OOP? 클래스(부품객체) 조립해서 완성해가는 프로그램
		
		// ## 변수
		int 	like	= 0;  // like[ 0 ]
		Scanner scanner = new Scanner(System.in); 
		// 1. Scanner scanner; 를 하면 누군가 만들어 놓은 것이기 
		// 때문에 참조해서 사용해야 함 , 단축키: ctrl + shift + o
		// 상단에 import 된 것 확인가능!
		
		// 2. = new Scanner(System.in)
		// new 공간 빌리기		어떤 주소로 부터 공간을 빌려옴
		// Scanner(System.in) Scanner() 사용할 수 있도록 초기화
		// System.in은 키보드로 입력하겠다는 뜻
		
		// 3. 사용법
		// scanner. 자료형의 값.
		
		// ## 입력
		
		System.out.println("정수(1,2,3...)를 입력하세요> ");
		like = scanner.nextInt();
		
		
		// ## 처리 , 처리할게 없음
		
		// ## 출력
		System.out.println("입력한 정수는 "+like+" 입니다.");
		
		/*
		 * 연습문제1)    ※ Input002  참고
		패키지명 : com.company.java002_ex
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

		 * */
	}
}
