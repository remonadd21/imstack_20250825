package com.company.java004_ex;

import java.util.Scanner;

public class SwitchEx003 {
	public static void main(String[] args) {
		/*
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
		*/
		
		//변수
		int num1, num2;
		char oper='\u0000';
		double avg;
		//입력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력받기1: ");
		num1 = sc.nextInt();
		
		System.out.print("연산자 입력받기 (+,-,*,/): ");
		oper = sc.next().charAt(0);
		
		System.out.print("숫자입력받기2: ");
		num2 = sc.nextInt();
		
		//처리
		avg = num1/(double)num2;
		String result =""+num1+oper+num2+"=";
		//출력
		
		switch(oper) {
		case '+': result+=(num1+num2); break;
		case '-': result+=(num1-num2); break;
		case '*': result+=(num1*num2); break;
		case '/': result+=String.format("%.2f", avg); break;
		// case '/': System.out.printf("%d %c %d = %.2f,num1,op,num2,(double)num1/num2"); break;
		}
		
		System.out.println(result);
		
	}
}
