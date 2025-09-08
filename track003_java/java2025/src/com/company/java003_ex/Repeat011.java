package com.company.java003_ex;

import java.util.Scanner;

public class Repeat011 {
	public static void main(String[] args) {
		
		//변수
		int num1, num2;
		char oper ='\u0000'; 
		double avg;
		String result = "";
		
		//입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("1. 숫자 하나입력받기: ");
		num1 = scanner.nextInt();
		
		System.out.print("연산자를 입력하세요(+,-,*,/): ");
		oper = scanner.next().charAt(0);
		
		
		System.out.print("2. 숫자 하나입력받기: ");
		num2 = scanner.nextInt();
		
		//처리
		if(oper =='+') {result = num1+"+"+num2+"="+(num1+num2);}
		else if(oper =='-') {result = num1+"-"+num2+"="+(num1-num2);}
		else if(oper =='*') {result = num1+"*"+num2+"="+(num1*num2);}
		else if(oper =='/') {
			avg = num1/(double)num2;
			result = num1+"/"+num2+"="+String.format("%.2f", avg);		
		}
		
		//출력
		System.out.println(result);
		
		// >>3항 연산자
		avg = num1/(double)num2;
		
		
		result = ""+num1+oper+num2+"=";
		result+= (oper=='+')?num1+num2:(oper=='-')?num1-num2:(oper=='*')?num1*num2:
			(oper=='/')?String.format("%.2f", avg):"";
			
		
		System.out.println("삼항 연산자 출력: "+result);
		
		
	}
}
