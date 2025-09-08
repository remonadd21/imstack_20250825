package com.company.java005_ex;

public class ForEx001 {
	public static void main(String[] args) {
	      /*
	       연습문제1)  
			패키지명 : com.company.java005_ex
			클래스명 :  ForEx001
			출력내용 :   for 이용
			q1  for문을 이용해서 다음과 같이 출력하시오 :   1 2 3 4 5 
			q2  for문을 이용해서 다음과 같이 출력하시오 :   5 4 3 2 1 
			q3  for문을 이용해서 다음과 같이 출력하시오 :   JAVA1   JAVA2  JAVA3  
			q4  for문을 이용해서 다음과 같이 출력하시오 :   HAPPY3   HAPPY2  HAPPY1  
			q5  for문을 이용해서 다음과 같이 출력하시오 :   0,1,2  
			q6  for문을 이용해서 다음과 같이 출력하시오 :   0,1,2, ,,,중간생략 ,,, 99  
			q7  for문을 이용해서 다음과 같이 출력하시오 :   10, 9,,,,중간생략 ,,, , 1 
			q8  for문을 이용해서 다음과 같이 출력하시오 :   0, 2, 4, 6, 8 
			q9  for문을 이용해서 다음과 같이 출력하시오 :   0, 2, 4, 6, 8 ,,,중간생략 ,,, 18 
		*/
		System.out.println("\nTEST1");
		//q1  for문을 이용해서 다음과 같이 출력하시오 :   1 2 3 4 5 
		for(int i=1; i<=5; i++) {
			System.out.print(i+"\t");
		}
		
		System.out.println("\n\nTEST2");
		//q2  for문을 이용해서 다음과 같이 출력하시오 :   5 4 3 2 1 
		for(int i=5; i>=1; i--) {
			System.out.print(i+"\t");
		}
		
		
		System.out.println("\n\nTEST3");
		//q3  for문을 이용해서 다음과 같이 출력하시오 :   JAVA1   JAVA2  JAVA3 
		for(int i=1; i<=3; i++) {
			System.out.print("JAVA"+i+"\t");
		}
		
		
		System.out.println("\n\nTEST4");
		//q4  for문을 이용해서 다음과 같이 출력하시오 :   HAPPY3   HAPPY2  HAPPY1  
		for(int i=3; i>=1; i--) {
			System.out.print("HAPPY"+i+"\t");
		}
		
		System.out.println("\n\nTEST5");
		//q5  for문을 이용해서 다음과 같이 출력하시오 :   0,1,2 
		
		for(int i=0; i<=2; i++) {
			System.out.print( i +"\t");
		}
		
		System.out.println("\n\nTEST5-1");
		
		for(int i=0; i<=2; i++) {System.out.print((i==0? "":",")+i );}
		
		System.out.println("\n\nTEST6");
		//q6  for문을 이용해서 다음과 같이 출력하시오 :   0,1,2, ,,,중간생략 ,,, 99  
		
		for(int i=0; i<=99; i++) {
			System.out.print( (i==0?"":",")+i);
		}
		
		
		System.out.println("\n\nTEST7");
		//q7  for문을 이용해서 다음과 같이 출력하시오 :   10, 9,,,,중간생략 ,,, , 1 
		for(int i=10; i>=1; i--) {
			System.out.print( (i==10?"":",")+i);
		}
		
		System.out.println("\n\nTEST8");
		//q8 for문을 이용해서 다음과 같이 출력하시오 :   0, 2, 4, 6, 8
		for(int i=0; i<=8; i+=2) {
			System.out.print( i +"\t");
		}
		
		System.out.println("\n\nTEST9");
		//q9  for문을 이용해서 다음과 같이 출력하시오 :   0, 2, 4, 6, 8 ,,,중간생략 ,,, 18 
		for(int i=0; i<=18; i+=2) {
			System.out.print( (i==0?"":",")+i);
		}
		
		/*	
			연습문제2)  
			패키지명 : com.company.java005_ex
			클래스명 :  ForEx002
			출력내용 :   for 이용
			
			   사용자에게 단을 입력받아 해당하는 
			   단을 출력해주는 프로그램을 작성하시오. FOR문을 이용하시오.
			
			
			
			연습문제3)  
			패키지명 : com.company.java005_ex
			클래스명 :  ForEx003
			출력내용 :   for 이용
			1~10까지의 합을 구하시오.
			
			upgrade)  시간나면 도전!
			1+2+3+4+5+6+7+8+9+10=55
			
			연습문제4)  
			패키지명 : com.company.java005_ex
			클래스명 :  ForEx004
			출력내용 :   for 이용
			1~10까지 3의 배수 갯수를 출력   
			
			upgrade)  시간나면 도전!
			3의배수 : 3,6,9    
			갯수 : 3개
			
			
			연습문제5)  
			패키지명 : com.company.java005_ex
			클래스명 :  ForEx005
			출력내용 :   for 이용
			소문자 a~z까지 모음의 갯수를 출력하시오. 
	       */
		
		
	}
}
