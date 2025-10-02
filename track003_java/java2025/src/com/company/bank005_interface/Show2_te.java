package com.company.bank005_interface;

import java.util.List;
import java.util.Scanner;

public class Show2_te implements BankController {
	
	@Override
	public int exec(List<UserInfo> users, int find) {
		System.out.println(find);
		if(find==2) {
		for(int i=0; i<users.size(); i++) {
				
				UserInfo use = users.get(i);
				System.out.println("\nID > "+use.getId()
				+"\nPass > "+use.getPass()
				+"\nBALANCE > "+use.getBalance());
			}
		}
		return find;
		
	}

}
