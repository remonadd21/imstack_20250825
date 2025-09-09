package com.company.java004_ex;

import java.util.Scanner;

public class Repeat012_1 {
	public static void main(String[] args) {
		
		/*	1. 다음을 if로 작성하시오
			2. Repeat012_1
			    만약 1을 입력했다면 one
			    만약 2를 입력했다면 two
			    만약 3을 입력했다면 three
			    1,2,3이 아니라면 1,2,3이 아니다를 출력하시오.
		*/
		
		//변수
		int num;
		String res ="";
		//입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 입력(정수): ");
		num = scanner.nextInt();
		//처리
		//출력
		if(num==1) {res+="one 입니다.";}
		else if(num==2) {res+="two 입니다.";}
		else if(num==3) {res+="three 입니다.";}
		else {res+="1,2,3이 아닙니다.";}
		
		System.out.println(res);
		
	}
}
