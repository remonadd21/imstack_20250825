package com.company.java004;

import java.util.Scanner;

public class Switch001 {
	public static void main(String[] args) {
		//변수
		int a=0;
		Scanner scanner= new Scanner(System.in);
		
		//입력
		System.out.print("숫자한개 입력 > ");
		a = scanner.nextInt();
		
		//처리+출력 (1) if (조건식이 복잡하고, 여러개 일 때 && >=)
			if(a==1) {System.out.println("1이다.");}
			else if(a==2) {System.out.println("2이다.");}
			else if(a==3) {System.out.println("3이다.");}
		
		//처리+출력 (2) switch
		// if에서는 조건이 맞으면 else if를 더이상 읽지 않지만 
		// switch에서는 break가 없으면 빠져나가지 않고, 위에서 아래로 모든 값을 읽는다.
		// switch는 처리대상이 심플할 때 사용 
			switch(a) {
				case 1: System.out.println("1이다."); break;
				case 2: System.out.println("2이다."); break;
				case 3: System.out.println("3이다."); break;
			}
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
