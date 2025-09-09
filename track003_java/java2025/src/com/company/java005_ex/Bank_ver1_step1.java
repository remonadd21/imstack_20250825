package com.company.java005_ex;

import java.util.Scanner;

public class Bank_ver1_step1 {
	public static void main(String[] args) {
		
		
		/* 문제: 메뉴 반복 만들기 */
		int num;
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
				System
				.out.println("====BANK====\n"
						+ "1.추가\n"
						+ "2.조회\n"
						+ "3.입급\n"
						+ "4.출금\n"
						+ "5.삭제\n"
						+ "9.종료");
				
			System.out.print("서비스 번호를 입력하세요>> ");
			num = scanner.nextInt();
				
			if(num==9) {System.out.println("ATM을 종료합니다.");break;}
			switch(num) {
				case 1:System.out.println("1.추가 기능입니다."); break;
				case 2:System.out.println("2.조회 기능입니다."); break;
				case 3:System.out.println("3.입급 기능입니다."); break;
				case 4:System.out.println("4.출금 기능입니다."); break;
				case 5:System.out.println("5.삭제 기능입니다."); break;
			}
		}
		
		
	}
}
