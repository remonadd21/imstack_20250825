package com.company.java010_Bank;

import java.util.Scanner;

public class Show {
	private UserInfo userinfo;

	public Show() { super(); }
	public Show(UserInfo userinfo) {
		super();
		this.userinfo = userinfo;
	}
	
	
	public UserInfo getUserinfo() {
		return userinfo;
	}
	public void setUserinfo(UserInfo userinfo) {
		this.userinfo = userinfo;
	}
	// 행위 : 멤버함수
	public void exec() {
		System.out.println("\nID > "+this.userinfo.getId()
						+"\nPass > "+this.userinfo.getPass()
						+"\nBALANCE > "+this.userinfo.getBalance());
	}
	
	
}
/*기능: 유저정보 보여주기*/