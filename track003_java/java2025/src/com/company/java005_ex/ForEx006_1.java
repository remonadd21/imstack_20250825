package com.company.java005_ex;

import java.util.Scanner;

public class ForEx006_1 {
	public static void main(String[] args) {
		
		/*
		 * 연습문제6)  for 무한반복
			패키지명 : com.company.java006_ex
			클래스명 :  ForEx006
			출력내용 :  계산기
			
			1)  각 연산자에 맞게 계산처리
			2)  숫자1, 숫자2는 0~100사이만 입력가능하게 아니면 무한반복
			3)  연산자는 +, - ,*, /만 입력가능하게 아니면 무한반복
			     
			
			1. 정수를 하나 입력해주세요 > 10   
			2. 정수를 하나 입력해주세요 > 3
			3. 연산자를 입력해주세요(+,-,*,/) > +
			10+3=13
		 */
		
		//변수
		int num1, num2;
		char oper='\u0000';
		String res="";
		
		
		Scanner scanner = new Scanner(System.in);
		
		//입력
		
		for(;;) {
			System.out.print("정수 하나 입력받기1: ");
			num1 = scanner.nextInt();
			
			System.out.print("정수 하나 입력받기2: ");
			num2 = scanner.nextInt();
			
			if(num1 >0 && num1<=100 && num2 >0 && num2<=100) { break;  }
		}
		
		for(;;) {
			System.out.print("연산자 입력받기(+,-,*,/): ");
			oper = scanner.next().charAt(0);
			
			if(oper=='+' || oper=='-' || oper=='/' || oper=='*' ) {break;}	
		}
		
		//처리
		switch(oper) {
		case '+':res+=num1+"+"+num2; break;
		case '-':res+=num1+"-"+num2; break;
		case '*':res+=num1+"*"+num2; break;
		case '/':res+=String.format("%.2f", num1/(double)num2); break;
		}
		
		//출력
		System.out.println(res);
		
	
	}
}

