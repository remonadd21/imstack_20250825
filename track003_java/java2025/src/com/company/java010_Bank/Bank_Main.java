package com.company.java010_Bank;

import java.util.Scanner;

// 1. 클래스는 부품객체
// 2. 클래스는 상태와 행위를 갖는다.

public class Bank_Main {
	// 상태: 멤버변수
	UserInfo userinfo;
	Add add;
	Show show;
	Delete delete;
	Deposit deposit;
	Login login;
	Widthdraw widthdraw;
	
	
	
	public Bank_Main() {
		this.userinfo = new UserInfo("","",0);
		this.add = new Add(this.userinfo);   // 정보보관용도의 model 주소, db주소 넘기기
		this.show = new Show(this.userinfo);
		this.deposit = new Deposit(this.userinfo);
		this.widthdraw = new Widthdraw(this.userinfo);
		this.delete = new Delete(this.userinfo);
		this.login = new Login(this.userinfo);
	}
	
	public void run() {
		Scanner scanner = new Scanner(System.in);
		int num = -1;
		
		while( num !=9) {
			System.out.println("main: "+this.userinfo+"\t"+System.identityHashCode(this.userinfo));
	          System.out.print("\n\n🌟💰 WELCOME TO BANK SYSTEM 💰🌟\n" + 
	                  "\n[1] ➕ 계좌 추가" + "\n[2] 🔍 계좌 조회" + "\n[3] 💵 입금하기" + "\n[4] 💸 출금하기" + "\n[5] 🗑️ 계좌 삭제\n[6] 로그인 "
	                  +"\n\n👉 번호를 선택하세요:");
	          
	          num = scanner.nextInt();
	          
	          switch(num) {
	          	case 1: this.add.exec(); break;
	          	case 2: case 3: case 4: case 5: 
		          	// 1.유저의 정보
	          		// 2, 3, 4, 5 일때 로그인이 안돼어 있다면 정보 띄워주기
	          		// 되어 있다면 로그인 정보 띄우기
		            if(this.login.exec()==-1) {System.out.println("유저의 정보를 확인해 주세요"); break;}
		          	//  2.각각의 처리
	          	
		            switch(num) {
	          			case 2: this.show.exec(); break;
	          			case 3: this.deposit.exec(); break;
	          			case 4: this.widthdraw.exec(); break;
	          			case 5: this.delete.exec(); break;
		            		}
		            break;		
	          }
	          	
		}
		
		
	}

	// 행위: 멤버함수
	public static void main(String[] args) {
		Bank_Main bank = new Bank_Main();
		bank.run();
		
	}
	
}
