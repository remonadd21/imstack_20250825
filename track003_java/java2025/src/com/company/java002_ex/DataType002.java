package com.company.java002_ex;

import java.util.Scanner;

public class DataType002 {
	public static void main(String[] args) {
		
		//변수
		int age=0;
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요> ");
		age = sc.nextInt();
		
		//처리
		//출력
		
		System.out.println("제 나이는 "+age+" 살 입니다.");
		
	}
}
