package com.company.java004_ex;

import java.util.Scanner;

public class Repeat012_2 {
	public static void main(String[] args) {
		
		/*
			1. 다음을 switch로 작성하시오
			2. Repeat012_2
			    만약 1을 입력했다면 one
			    만약 2를 입력했다면 two
			    만약 3을 입력했다면 three
			    1,2,3이 아니라면 1,2,3이 아니다를 출력하시오.
		*/
		
		//변수
		int num;
		String res="";
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 정수로 입력: ");
		num = sc.nextInt();
		
		//처리
		switch(num) {
		case 1 : res+="one 입니다."; break;
		case 2 : res+="two 입니다."; break;
		case 3 : res+="three 입니다."; break;
		default: res+="1,2,3이 아닙니다."; break;
		}
		
		//출력
		System.out.println(res);
		
	}
}
