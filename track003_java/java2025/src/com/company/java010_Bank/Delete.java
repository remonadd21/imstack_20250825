package com.company.java010_Bank;

import java.util.Scanner;

public class Delete {
	// 상태: 멤버변수
	UserInfo userinfo;
	
	public Delete() { super(); }
	public Delete(UserInfo userinfo) {
		super();
		this.userinfo = userinfo;
	}

	// 행위 : 멤버함수
	public void exec() {
		// 사용자 id  null, 비밀번호 null, 잔액 0 
		this.userinfo.setId("");
		this.userinfo.setPass("");
		this.userinfo.setBalance(0);
		System.out.println("정보를 삭제 했습니다.");
	}
}
/*기능: 삭제기능*/