package com.company.java004_ex;

import java.util.Scanner;

public class Repeat013_1 {
	public static void main(String[] args) {
		
		// if버전으로 풀기
		//1. a를 입력받으면 apple, b를 입력받으면 banana, c를 입력받으면 coconut 그외에는 a,b,c가 아니다.
		
		//변수
			char c = '\u0000';
		//입력
			Scanner scanner = new Scanner(System.in);
			System.out.print("a, b, c 입력받기: ");
			c= scanner.next().charAt(0);
		//처리
		//출력
		
		
		if(c=='a') {System.out.println("apple 입니다.");}
		else if(c=='b') {System.out.println("banana 입니다.");}
		else if(c=='c') {System.out.println("coconut 입니다.");}
		
		
	}
}
