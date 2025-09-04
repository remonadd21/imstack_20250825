package com.company.java003_ex;

public class OperatorEx001 {
	public static void main(String[] args) {
		
		/*
		 * 연습문제1)
			클래스명 : OperatorEx001
			    int a=3, b=10;
			    System.out.println(  b+=10 - a-- );   
			    System.out.println(  a+=5 );
			    System.out.println(  a>=10 || a<0 && a>3);
		*/
		
		// 먼저  		값 			비교 		조건 		대입
		// ()  ++,+,-,*,/		>,<		&& ||	=  +=
		//변수
			int a=3, b=10;
		
		//입력
		//처리
		//출력
		//1. 뒤에 값 먼저 계산 10-a
		//2. b+7
		//3. 17
			System.out.println(b+=10 - a--);
		
		//1.  a = a+5
		//2.  7
			System.out.println( a+=5 );
			
		//1. a(7) >= 또는  나열된 값 2개가 동시에 맞으면... 
		//2. true이지만 없으므로 false
			
			System.out.println(a>=10 || a<0 && a>3);
		
		
		/*
			연습문제2)  다음에 해당하는 클래스의 조건을 출력하시오.
			클래스명 : OperatorEx002
			q1-1 int형 변수 x가 3보다 크고 10보다 작을때 true인 조건식 
			q1-2 char형 변수 ch가 'a' 또는 'A'일때   true인 조건식    
			q1-3 char형 변수 ch가 숫자('0'~'9')일때   true인 조건식     
			q1-4 char형 변수 ch가 영문자(대문자 또는 소문자) 일때   true인 조건식

		 * 
		 * */
	}
}
