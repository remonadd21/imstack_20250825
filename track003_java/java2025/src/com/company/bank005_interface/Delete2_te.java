package com.company.bank005_interface;

import java.util.List;

public class Delete2_te implements BankController {

	@Override
	public int exec(List<UserInfo> users, int find) {
		
		// 변수 
		// 처리
		// 출력
		
		UserInfo u = users.remove(find);
		
		return 0;
	}

}
