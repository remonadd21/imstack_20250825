package com.company.java004_ex;

import java.util.Scanner;

public class SwitchEx001 {
	public static void main(String[] args) {
		
		/*
		 * 연습문제1)  
			패키지명 : com.company.java004_ex
			클래스명 :  SwitchEx001
			출력내용 :  switch 이용
			     숫자한개 입력받아
			     3이면 봄
			     6이면 여름
			     9이면 가을
			     12이면 겨울
		
		*/
		//변수
		int num;
		//입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 한개 입력: ");
		num = scanner.nextInt();
		

		//처리
		
		//출력
		switch(num) {
		case 3: System.out.println("봄"); break;
		case 6: System.out.println("여름"); break;
		case 9: System.out.println("가을"); break;
		case 12: System.out.println("겨울"); break;
		}
		
		
		
		
			
		/*
			연습문제2)  
			패키지명 : com.company.java004_ex
			클래스명 :  SwitchEx002
			출력내용 :   switch 이용
			     숫자한개 입력받아
			     3,4,5이면 봄
			     6,7,8이면 여름
			     9,10,11이면 가을
			     12,1,2이면 겨울
			
			
			연습문제3)  3
			패키지명 : com.company.java004_ex
			클래스명 :  SwtichEx003
			출력내용 :  계산기
			
			1. 정수를 하나 입력해주세요 > 10
			2. 정수를 하나 입력해주세요 > 3
			3. 연산자를 입력해주세요(+,-,*,/) > +
			10+3=13
			
			1. 정수를 하나 입력해주세요 > 10
			2. 정수를 하나 입력해주세요 > 3
			3. 연산자를 입력해주세요(+,-,*,/) > -
			10-3=7 

		 * */
		
		
	}
}
