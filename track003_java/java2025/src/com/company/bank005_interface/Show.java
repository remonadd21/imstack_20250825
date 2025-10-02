package com.company.bank005_interface;

import java.util.List;
import java.util.Scanner;

public class Show implements BankController {
	
	@Override
	public int exec(List<UserInfo> users, int find) {
	
		if(find==2) {
	
				UserInfo use = users.get(find);
				System.out.println("\nID > "+use.getId()
				+"\nPass > "+use.getPass()
				+"\nBALANCE > "+use.getBalance());
	
	
		
	 }
		return 0;
  }
}
