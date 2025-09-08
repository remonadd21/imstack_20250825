package com.company.java005_ex;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		
		for(;;) {
			
			System.out.println("1.추가\n2.조회\n3.입금\n4.출금\n5.삭제\n9.종료");
			
			//변수
			int num=0, money=0, age=0;
			char end9 ='\u0000';
			String ids="",ids2="", pws="",pws2="";
			//입력
			Scanner scanner = new Scanner(System.in);
			System.out.print("서비스 번호를 눌러 주세요: ");
			num = scanner.nextInt();
			if(num==1) {
				System.out.print("아이디 입력: ");
				ids = scanner.next().toString();
				
				System.out.print("비밀번호 입력: ");
				pws = scanner.next().toString();
				
				System.out.print("나이입력: ");
				age = scanner.nextInt();
				
				System.out.print("잔액입력: ");
				money = scanner.nextInt();
				
				if(ids=="" || pws=="" || age<0 || money<0) {
					System.out.println("빈칸이거나 값이 맞지 않습니다. 확인해주세요.");
					return;
				}
	
			}
			if(num ==2) {
		
				System.out.println("아이디 : "+ids);
				System.out.println("비밀번호 : "+pws);
				System.out.println("잔액 : "+money);
			}
			
			else if(num ==9) {
				System.out.print("종료하시겠습니까? (Y/N)");
				end9 = scanner.next().charAt(0);
				
				if(end9 =='Y' || end9 == 'y') {
					System.out.println("종료합니다."); 
				}
			}
			
		}
		
		
	}
}
