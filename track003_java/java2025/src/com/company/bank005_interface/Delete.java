package com.company.bank005_interface;

import java.util.List;

public class Delete implements BankController {

	

	@Override
	public int exec(List<UserInfo> users, int find) {
		UserInfo u = users.remove(find);
	}
	return 0;
		
	}

}
