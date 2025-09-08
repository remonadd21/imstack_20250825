package com.company.java005_ex;

import java.util.Scanner;

public class ForEx002 {
	public static void main(String[] args) {
		
		/*	
		연습문제2)  
		패키지명 : com.company.java005_ex
		클래스명 :  ForEx002
		출력내용 :   for 이용
		
		   사용자에게 단을 입력받아 해당하는 
		   단을 출력해주는 프로그램을 작성하시오. FOR문을 이용하시오.
		*/
		
		//변수
		int num=0;
		
		//입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("구구단의 단을 입력하세요> ");
		num = scanner.nextInt();
		//처리
		//출력
		for(int i=1; i<=9; i++) {
			System.out.print(num+"*"+i+"="+(num*i)+"\t");
		}
		
		/*
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
