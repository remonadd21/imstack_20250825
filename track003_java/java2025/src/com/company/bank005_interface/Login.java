package com.company.bank005_interface;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Login implements BankController {

	@Override
	public int exec(List<UserInfo> users, int find) {
		
		find=-1;
		
		Scanner scanner = new Scanner(System.in);
		

		System.out.print("아이디를 입력하세요: ");
		String tempId = scanner.next();
		
		System.out.print("비밀번호를 입력하세요: ");
		String tempPw = scanner.next();

		
		for(int i=0; i<users.size(); i++) {
			
			UserInfo use = users.get(i);
			if(tempId.equals(use.getId()) && tempPw.equals(use.getPass())) {
				find=i;
				System.out.println("로그인에 성공했습니다.");
				break;
			}
		}	
		if(find==-1) {
			System.out.println("로그인에 실패했습니다.");
			find=0;
			System.exit(find);
		}
		return find;
	}

}


		
