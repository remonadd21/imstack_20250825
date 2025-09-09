package com.company.java005_ex;

import java.util.Scanner;

public class Bank_ver1_step4 {
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
				
				case 3:System.out.println("3.입급 기능입니다."); 
				/*3. 입금 기능 부분에 입급 입력받기
					 아이디와 비밀번호가 맞으면 입금받기, 잔액 보여주기
					 맞지 않으면 정보를 확인해 주세요. 출력*/
				
				System.out.print("아이디 입력받기: ");
				tempid = scanner.next();
				
				System.out.print("비밀번호 입력받기: ");
				temppass = scanner.next();
				
				//처리
				//출력
				if(tempid.equals(ids) && temppass.equals(pws)) {
					System.out.println("정보가 일치합니다.");
					System.out.print("입금 해주세요: ");
					money+=scanner.nextInt();
					
					System.out.println("고객님의 잔액은 "+money+"원 입니다.");
				}
				else {
					System.out.println("정보가 일치하지 않습니다.");
				}
				
				break;
				
				case 4:System.out.println("4.출금 기능입니다."); 
				/*	4. 출금 기능 부분에서 출금하기
			    아이디와 비밀번호가 맞으면 출금하기, 잔액에서 빠진것 보여주기
			    맞지 않으면 정보를 확인해 주세요. 출력*/
				
				System.out.print("아이디 입력받기: ");
				tempid = scanner.next();
				
				System.out.print("비밀번호 입력받기: ");
				temppass = scanner.next();
				
				//처리
				//출력
				if(tempid.equals(ids) && temppass.equals(pws)) {
					System.out.println("정보가 일치합니다.");
					System.out.print("출금 금액을 입력하세요: ");
					money-=scanner.nextInt();
					
					System.out.println("고객님의 잔액은 "+money+"원 입니다.");
				}
				else {
					System.out.println("정보가 일치하지 않습니다.");
				}
				
				break;
				case 5:System.out.println("5.삭제 기능입니다."); 
				/*5. 아이디와 비밀번호가 맞으면 삭제 하시겠습니까? 물어보기
				y나 Y라면 삭제 되었습니다. 출력받고, 아이디와 비번, 잔액 지우기
				n이나 N이라면 메뉴로 돌아갑니다. 출력하기*/
				
				System.out.print("아이디 입력받기: ");
				tempid = scanner.next();
				
				System.out.print("비밀번호 입력받기: ");
				temppass = scanner.next();
				
				//처리
				//출력
				if(tempid.equals(ids) && temppass.equals(pws)) {
					System.out.print("삭제 하시겠습니까? (Y/N): ");
					char chk ='\u0000';
					chk=scanner.next().charAt(0);
					
					
					if(chk=='y' || chk=='Y') {
						System.out.print("계좌정보를 삭제합니다.");
						money=0; ids=""; pws=""; 
					}
					else if(chk=='n' || chk=='N') {
						System.out.println("취소 하셨습니다.");
					}
					else {System.out.println("Y나N을 입력해주세요.");}
					
				}
				else {
					System.out.println("정보가 일치하지 않습니다.");
				}
				
				
				
				break;
			}
		}
		
		
	}
}
