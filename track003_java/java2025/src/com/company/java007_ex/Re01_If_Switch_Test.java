package com.company.java007_ex;

import java.util.Scanner;

public class Re01_If_Switch_Test {
	public static void main(String[] args) {
		/*
		 * # java 실습문제 (이클립스)
			> if문 버전
			1. 사용자로 부터 문자를 입력받기
			m을 입력받으면 mango 출력
			n을 입력받으면 noodle 출력
			o를 입력받으면 orange 출력
			그 외에는 m,n,o가 아닙니다. 출력
			
			> switch
			2. 사용자로 부터 숫자를 입력받아 출력받으시오.
			1을 입력받으면 mango 출력
			2을 입력받으면 noodle 출력
			3를 입력받으면 orange 출력
			그 외에는 1,2,3이 아닙니다. 출력
		*/
		System.out.println("step1) if문 버전");
		//변수
		char c = ' ';
		String res="";
		//입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("m,n,o중에 문자 입력받기: ");
		
		c = scanner.next().charAt(0);
		
		//처리
		if(c=='m' || c=='M') { res+="mango"; }
		else if(c=='n' || c=='N') { res+="noodle"; }
		else if(c=='o' || c=='O') { res+="orange"; }
		else { res+="m,n,o가 아닙니다.";}
		
		//출력
		System.out.println( res );
		
		
		System.out.println("\n\nstep2) switch문 버전");
		//변수
		int num;
		//입력
		System.out.print("1,2,3 숫자 입력받기: ");
		num = scanner.nextInt();
		//처리
		switch(num) {
			case 1: res+="mango"; break;
			case 2: res+="noodle"; break;
			case 3: res+="orange"; break;
			default : res+="m,n,o가 아닙니다."; break;
		}
		
		//출력
		System.out.println(res);
		
		/*
			> 반복문 응용
			for, while, do while문을 이용하여 다음과 같이 출력하시오
			5 4 3 2 1
			
			
			> 배열 응용
			1. 배열명 nums  10, 20, 30 넣기
			2. for문과 length를  이용하여 10, 20, 30 출력받기
		 * */
		
		
	}
}
