package com.company.java010_Bank;

import java.util.Scanner;

public class Widthdraw {
	
	// 상태: 멤버변수
	UserInfo userinfo;
	
	public Widthdraw() { super(); }
	public Widthdraw(UserInfo userinfo) {
		super();
		this.userinfo = userinfo;
	}

	// 행위 : 멤버함수
	public void exec() {
		Scanner scanner = new Scanner(System.in);

			
	      System.out.println("[4] 출금금액 입력 > ");
	      
	      // 새로 받은 출금 금액
	      double TempMoney = scanner.nextDouble();
	      
	      // 기존 금액
	      double originMoney = this.userinfo.getBalance();
	      
	      if(originMoney<TempMoney) {
	    	  	System.out.println("잔액이 부족하여 출금하지 못합니다.");
	    	  	System.out.println("현재 금액 : "+ originMoney);
	    	  	
	      }else {
	    	  	
	    	  	originMoney-=TempMoney;
	    	  	// 메인으로 넘기기
	  	    this.userinfo.setBalance(originMoney);
	  	    System.out.println("출금이 확인되었습니다.\n출금 후 잔액: "+originMoney);
	      }
	  	 
	  	   
	  
	      
	      
	}
	
}
/*출금기능*/