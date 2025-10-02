package com.company.bank005_interface;

import java.util.List;
import java.util.Scanner;

public class Add implements BankController {

	@Override
	public int exec(List<UserInfo> users, int find) {
		
		if(find==1) {
	      Scanner scanner  = new Scanner(System.in);
	      System.out.println("[1]아이디    입력 > ");  String id= scanner.next();
	      System.out.println("[2]비밀번호  입력 > ");  String pw = scanner.next();
	      System.out.println("[3]잔액     입력 > ");  double money = scanner.nextDouble();
	      
	      users.add(new UserInfo(id,pw, money) );
	      
	      //this.userinfo = new UserInfo(id, pass, balance);
	      System.out.println("사용자 추가완료 : " +  users);
	      
		}
		return find;
	}


}
