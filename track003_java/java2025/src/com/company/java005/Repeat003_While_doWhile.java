package com.company.java005;

public class Repeat003_While_doWhile {
	public static void main(String[] args) {
		
		// 1. for (반복횟수를 알 때)
		// 1 2 3 출력받기
		System.out.println("1. for");
		for(int i=1; i<4; i++) {
			System.out.print( i +"\t");
		}
		
		
		// 2. while (반복횟수를 모를 때 (게시판)- 가장 우선 조건만 본다.)
		System.out.println("2. while");
		int i = 1; // 2-1, 초기값은 위로
		while (i < 4) { // 2-2 조건만 확인
			System.out.print(i + "\t");
			i++; // 2-3 증감문
		}
		

		// 3. do while (무조건 한 번은 실행해야 할 때)
		
		System.out.println("3. do while");
		
		i = 1; // 3-1, 초기값은 위로

		do{ // 2-2 일단 실행
			System.out.print(i + "\t");
			i++;
		}while (i < 4); // 2-3 조건을 나중에 본다.
		
		/*
		 * 연습문제8)  for, while, do while
			패키지명 : com.company.java005_ex
			클래스명 :  ForEx008 
			1.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  1 2 3 4 5
			2.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  5 4 3 2 1
			3.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  JAVA1   JAVA2  JAVA3
			
			
			
			연습문제9)  for/while/do while
			패키지명 : com.company.java005_ex
			클래스명 :  RepeatEx009
			for , while , do while 3가지 버젼으로 
			1~10까지 3의 배수의 합 : 18
			
			힌트)
			ver-1)
			1이  3의 배수라면  합을더해주변수에누적
			2가  3의 배수라면  합을더해주변수에누적
			3이  3의 배수라면  합을더해주변수에누적
			
			ver-2)
			if( 1이  3의 배수라면 ){ 합을더해주변수에누적 }
			if( 2가  3의 배수라면 ){ 합을더해주변수에누적 }
			if( 3이  3의 배수라면 ){ 합을더해주변수에누적 }
			
			
			
			연습문제10)  for/while/do while
			패키지명 : com.company.java005_ex
			클래스명 :  RepeatEx010
			for , while , do while 3가지 버젼으로 
			ABCDE   
			FGHIJ
			KLMNO
			PQRST
			UVWXY
			Z 

		 * 
		 */
		
	}
}
