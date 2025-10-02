package com.company.bank005_interface;

import java.util.List;
import java.util.Scanner;

public class WidthDraw2_te implements BankController {
	@Override
	public int exec(List<UserInfo> users, int find) {
		System.out.println(find);
		if(find==3) {

			  
			  Scanner scanner = new Scanner(System.in);
			
			
		      System.out.println("[3] 입금금액 입력 > ");
		      
		      // 새로 받은 금액
		      double TempMoney = scanner.nextDouble();
		      
		      UserInfo u = users.get(find);
		      u.setBalance(u.getBalance() - TempMoney);
	
		
		     
		      System.out.println("출금완료 ");
		     }
	
		return 0;
	}

}