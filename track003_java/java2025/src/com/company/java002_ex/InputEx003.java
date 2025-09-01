package com.company.java002_ex;

import java.util.Scanner;

public class InputEx003 {
	public static void main(String[] args) {
		
		//변수
		final int nows = 2025;
		int year, month, days, age;
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("태어난 연도를 숫자만 입력하세요.");
		year = sc.nextInt();
		
		System.out.print("태어난 월을 숫자만 입력하세요.");
		month = sc.nextInt();
		//처리
		
		System.out.print("태어난 일을 숫자만 입력하세요.");
		days = sc.nextInt();
		
		age = (nows-year)-1;
		
		//출력
		System.out.println("나의 생년 월 일은 "+year+"년 "+month+"월 "+days+"일 이고, "
				+ "나이는 "+age+"세 입니다.");
		
	}
}
