package com.company.bank005_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Bank_Main {
	// 멤버변수
	private List<UserInfo> users;  // add, get, size, remove, contains
	private BankController [] controller;
	
	
	
	public Bank_Main() { 
		users = new ArrayList<>();
		controller = new BankController[]{
				new Add(),new Show(),new Deposit(), 
				new WidthDraw(),new Delete(), new Login()
		};
	}

	// 멤버함수 (메뉴판)
	public void menu() {
		
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		while( num !=9) {
	          System.out.print("\n\n🌟💰 WELCOME TO BANK SYSTEM 💰🌟\n" + 
	                  "\n[1] ➕ 계좌 추가" + "\n[2] 🔍 계좌 조회" + "\n[3] 💵 입금하기" + "\n[4] 💸 출금하기" + "\n[5] 🗑️ 계좌 삭제"
	                  +"\n\n👉 번호를 선택하세요:");
	          
	          	// 공간은 0이고 숫자는 1부터 라서 -1
	          	num = scanner.nextInt();

	          	if(num>=2 && num<=4) { controller[5].exec(users, num);}
	          	controller[num-1].exec(users, num); 	
		}
		

	}
	
	public static void main(String[] args) {
		
		new Bank_Main().menu();// start
	}
}

//변수
//입력+처리
/*
 * 메뉴판 출력
 * 
 * Q1, 무한반복 + 각번호 입력받으면 ~ 기능입니다. 출력
 * Q2, 입력받은 번호가 1번이면 유저추가
 * Q3, 입력받은 번호가 2,3,4,5 이면
 * 	1) Login
 * 	2) 2,3,4,5 각각에서 처리해야 할 일
 * */
// 1. 유저추가
// 2,3,4,5
// 1) Login  2) 2,3,4,5 각각에서 처리해야 할 
