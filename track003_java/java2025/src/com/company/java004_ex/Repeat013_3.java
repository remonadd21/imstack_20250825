package com.company.java004_ex;

import java.util.Scanner;

public class Repeat013_3 {
	public static void main(String[] args) {

		//1. 1을 입력받을때 까지 사용자에게 무한 반복으로 입력을 받아주세요.
		
		//변수
			int num;
		//입력
			Scanner scanner = new Scanner(System.in);
			
		//처리
		//출력
		for(;;) {
			
			System.out.print("1 입력받기: ");
			num= scanner.nextInt();
			if(num==1) {System.out.println("1이므로 동작을 멈춥니다."); break;}
			
		}
		
		
	}
}
