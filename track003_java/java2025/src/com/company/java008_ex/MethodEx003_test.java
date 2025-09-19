package com.company.java008_ex;

import java.util.Scanner;

public class MethodEx003_test {
	
	public static String scan() {
		Scanner scanner = new Scanner(System.in);
		
		// scaner.next.charAt(0) 버전도 있음
		
		return scanner.next();
	};

	
	/////////////////////////////////////////////////////////////
	public static void main(String[] args) {
	
	//변수	
	String ans="";
	
	
	
	// for 버전
	for(;;) {
		System.out.print("다음 문자를 입력하세요 +, -, *, / : ");
		ans = scan();
		
		if(ans.equals("+") || ans.equals("-") || ans.equals("*") || ans.equals("/")) {
			System.out.println("정보가 일치합니다.");
			break;
		}
		else {
			System.out.println("정보가 일치하지 않습니다.");
		}
		
	}
	
	
	//while 문 버전
	while(ans.equals("+") || ans.equals("-") || ans.equals("*") || ans.equals("/")) {
		System.out.print("다음 문자를 입력하세요 +, -, *, / : ");
		ans = scan();
		
		if(ans.equals("+") || ans.equals("-") || ans.equals("*") || ans.equals("/")) {
			System.out.println("정보가 일치합니다.");
			break;
		}
		else {
			System.out.println("정보가 일치하지 않습니다.");
		}
	}
	
	
	
	//do while 문 버전
	do{
		System.out.print("다음 문자를 입력하세요 +, -, *, / : ");
		ans = scan();
		
		if(ans.equals("+") || ans.equals("-") || ans.equals("*") || ans.equals("/")) {
			System.out.println("정보가 일치합니다.");
			break;
		}
		else {
			System.out.println("정보가 일치하지 않습니다.");
		}
	}while(ans.equals("+") || ans.equals("-") || ans.equals("*") || ans.equals("/"));
		
		
		
	/////////////////////////////////////////////////////////////
	
	}// end main
}// end class


