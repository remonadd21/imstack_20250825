package com.company.java010_Bank;

import java.util.Scanner;

public class Login {
	
	// 상태: 멤버변수
	UserInfo userinfo;
	Show show;
	Delete delete;
	Deposit deposit;
	Widthdraw widthdraw;
	
	public Login() { super(); 
		this.userinfo = new UserInfo();
		this.show = new Show(this.userinfo);
		this.deposit = new Deposit(this.userinfo);
		this.widthdraw = new Widthdraw(this.userinfo);
		this.delete = new Delete(this.userinfo);
	
	}
	public Login(UserInfo userinfo) {
		super();
		this.userinfo = userinfo;
	}
	
	// 행위 : 멤버함수
	public int exec() {
		
		int find =-1;
		

			Scanner scanner = new Scanner(System.in);
			System.out.print("아이디를 입력하세요: ");
			String tempId = scanner.next();
			
			System.out.print("비밀번호를 입력하세요: ");
			String tempPw = scanner.next();
	
		
		return tempId.equals(this.userinfo.getId()) && 
				tempPw.equals(this.userinfo.getPass())?1:-1;
		
	}
}
/*기능: 메서드안의 run기능*/