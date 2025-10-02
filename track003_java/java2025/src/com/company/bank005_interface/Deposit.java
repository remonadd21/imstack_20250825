package com.company.bank005_interface;

import java.util.List;
import java.util.Scanner;

public class Deposit implements BankController {

	@Override
	public int exec(List<UserInfo> users, int find) {
		System.out.println(find);
		if(find==3) {

			  
			  Scanner scanner = new Scanner(System.in);
			
			
		      System.out.println("[3] 입금금액 입력 > ");
		      
		      // 새로 받은 금액
		      double TempMoney = scanner.nextDouble();
		      
		      // 기존 금액
		      for(int i=0; i<users.size(); i++) {
		      UserInfo use = users.get(i);
		      double originMoney = use.getBalance();
		      
		  		originMoney+=TempMoney;
		  		// 메인으로 넘기기
		  		use.setBalance(originMoney);
		  		System.out.println("입금이 확인되었습니다.\n입금 후 잔액: "+originMoney);
		      
		      // 메인으로 넘기기
		  	  use.setBalance(originMoney);
		     
		      System.out.println("입금금액: " +  originMoney);
		     }
			
		}
		return find;
	}

}
