package com.company.bank005_interface;

import java.util.List;
import java.util.Scanner;

public class WidthDraw implements BankController {
	@Override
	public int exec(List<UserInfo> users, int find) {
		
		if(find==4) {
		 Scanner scanner = new Scanner(System.in);

		
	      System.out.println("[4] 출금금액 입력 > ");
	      
	      // 새로 받은 출금 금액
	      double TempMoney = scanner.nextDouble();
	      
	      for(int i=0; i<users.size(); i++) {
		      UserInfo use = users.get(i);
		      // 기존 금액
		      double originMoney = use.getBalance();
		      
		      if(originMoney<TempMoney) {
		    	  	System.out.println("잔액이 부족하여 출금하지 못합니다.");
		    	  	System.out.println("현재 금액 : "+ originMoney);
		    	  	
		      }else {
		    	  	
		    	  	originMoney-=TempMoney;
		    	  	// 메인으로 넘기기
		  	    use.setBalance(originMoney);
		  	    System.out.println("출금이 확인되었습니다.\n출금 후 잔액: "+originMoney);
		      }
	  	 
	  	   
	      }
		}
		return find;
		
	}
}
