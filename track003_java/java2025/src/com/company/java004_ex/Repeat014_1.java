package com.company.java004_ex;

import java.util.Scanner;

public class Repeat014_1 {
	public static void main(String[] args) {
		
		/*
			1. if버전으로 문제 풀기

			x를 입력받으면 x-ray 출력
			y를 입력받으면 yogurt 출력
			z를 입력받으면 zebra 출력
			그 외에는 x,y,z가 아닙니다. 출력
		*/
		System.out.println("step1) if버전으로 문제 풀기");
		
		// 변수
		char ch = '\u0000';
		
		//입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("문자하나 입력받기 (x,y,z): ");
		ch = scanner.next().charAt(0);
		
		//처리
		//출력
		if(ch=='x'||ch=='X') { System.out.println("x-ray");}
		else if(ch=='y' || ch=='Y') { System.out.println("yogurt");}
		else if(ch=='z' || ch=='Z') {System.out.println("zebra");}
		else {System.out.println("x,y,z가 아닙니다.");}
		
		// 2. switch문 버전으로 위에 문제 풀기
		System.out.println("\n\nstep2) switch버전으로 문제 풀기");
		switch(ch) {
			case 'x' :  case 'X' : System.out.println("x-ray"); break;
			case 'y' :  case 'Y' : System.out.println("yogurt"); break;
			case 'z' :  case 'Z' : System.out.println("zebra"); break;
			default : System.out.println("x,y,z가 아닙니다."); break;
		}
		
		
		
			
		/*	
			
			3. 무한 반복 문제
			    사용자에게 숫자를 입력받기
			    숫자 7이 입력받기 전까지 무한 반복!
			    숫자 7을 입력하면 종료합니다. 출력하고, 반복 종료
			
			4. for, while, do while을 이용하여 1 2 3 4 5 출력 받기
		
		*/
		
	}
}
