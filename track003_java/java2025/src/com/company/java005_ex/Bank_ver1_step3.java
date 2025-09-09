package com.company.java005_ex;

import java.util.Scanner;

public class Bank_ver1_step3 {
	public static void main(String[] args) {
		
		int num;
		double money = 0;
		String ids="", pws="";
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
				System
				.out.println("\n====BANK====\n\n"
						+ "1.추가\n"
						+ "2.조회\n"
						+ "3.입급\n"
						+ "4.출금\n"
						+ "5.삭제\n"
						+ "9.종료\n");
				
			System.out.print("서비스 번호를 입력하세요>> ");
			num = scanner.nextInt();
				
			if(num==9) {System.out.println("ATM을 종료합니다.");break;}
			switch(num) {

				case 1:System.out.println("\n1.추가 기능입니다.\n"); 
				System.out.print("아이디 입력받기: ");
				ids = scanner.next();
				
				System.out.print("비밀번호 입력받기: ");
				pws = scanner.next();

				System.out.print("잔액 입력받기: ");
				money = scanner.nextInt();
				
				break;
				case 2:System.out.println("\n2.조회 기능입니다.\n"); 
				//변수
				//중요) 비교할 임시 아이디와 임시 비번 만들기
				String tempid, temppass;
				
				
				//입력	2-1. 사용자에게 아이디와 비번 입력받기
				//		2-2. 아이디와 비번이 틀렸을때는 정보를 확인해주세요. 출력
				//		2-3. 아이디와 비번이 맞으면, 사용자 정보 출력받기
				//		중요) 현재 아이디와 비번에 값을 받으면 비교가 아닌 덮어버림!
				System.out.print("아이디 입력받기: ");
				tempid = scanner.next();
				
				System.out.print("비밀번호 입력받기: ");
				temppass = scanner.next();
				
				//처리
				//출력
				if(tempid.equals(ids) && temppass.equals(pws)) {
					System.out.println("정보가 일치합니다.");
					System.out.println("아이디: "+ids);
					System.out.println("잔액: "+money);
				}
				else {
					System.out.println("정보가 일치하지 않습니다.");
				}
				
				break;
				
				case 3:System.out.println("3.입급 기능입니다."); break;
				case 4:System.out.println("4.출금 기능입니다."); break;
				case 5:System.out.println("5.삭제 기능입니다."); break;
			}
		}
		
		
	}
}
