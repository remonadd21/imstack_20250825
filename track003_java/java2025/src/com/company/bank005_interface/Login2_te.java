package com.company.bank005_interface;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Login2_te implements BankController {

	@Override
	public int exec(List<UserInfo> users, int find) {
		
		
		Scanner scanner = new Scanner(System.in);
		

		System.out.print("아이디를 입력하세요: ");
		String tempId = scanner.next();
		
		System.out.print("비밀번호를 입력하세요: ");
		String tempPw = scanner.next();
		
		// if(내가 입력받은 유저1번째 users.get(1)의 아이디) {1번이 유저번호}
		for(int i=0; i<users.size(); i++) {
			if(tempId.equals(users.get(i).getId()) && tempPw.equals(users.get(i).getPass())) {
				return i;
			}
		}
		// users.add(new UserInfo("id","pw",1))
		// users.get(0) 0번째 유저
		// users.size() 유저의 갯수
		// users.remove(0) 0번째 유저 삭제
		
		
		
		return -1;

		
	}
}




		
