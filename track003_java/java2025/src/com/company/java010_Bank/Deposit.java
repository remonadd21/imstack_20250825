package com.company.java010_Bank;

import java.util.Scanner;

public class Deposit {
	
	// 상태: 멤버변수
	UserInfo userinfo;
	
	public Deposit() { super(); }
	public Deposit(UserInfo userinfo) {
		super();
		this.userinfo = userinfo;
	}
	
	// 행위 : 멤버함수
	public void exec() {
		Scanner scanner = new Scanner(System.in);
		
			
	      System.out.println("[3] 입금금액 입력 > ");
	      
	      // 새로 받은 금액
	      double TempMoney = scanner.nextDouble();
	      
	      // 기존 금액
	      double originMoney = this.userinfo.getBalance();
	      
	  		originMoney+=TempMoney;
	  		// 메인으로 넘기기
	  		this.userinfo.setBalance(originMoney);
	  		System.out.println("입금이 확인되었습니다.\n입금 후 잔액: "+originMoney);
	      
	      // 메인으로 넘기기
	      this.userinfo.setBalance(originMoney);
	     
	      System.out.println("입금금액: " +  originMoney);
	
	}
}
/*기능: 입금기능*/