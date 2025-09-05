package com.company.java003_ex;

import java.util.Scanner;

public class Repeat010 {
	public static void main(String[] args) {
		
		//변수
		int num = 0;
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("1,2,3 중 숫자하나 입력받기: ");
		num = sc.nextInt();
		//처리
		//출력
		System.out.println("▼ if문으로 출력받기");
		if(num==1 || num==2 || num==3) 
		{System.out.println(num+"값이 같습니다.");}
		else {System.out.println("범위 밖의 숫자 입니다.");}
		
		System.out.println("▼ 3항으로 출력받기");
		String result = (num==1)?"숫자1입니다":(num==2)?"숫자2입니다.":
			(num==3)?"숫자3입니다.":"범위밖의 숫자입니다.";
		
		System.out.println("결과 값: "+result);
			
		
	}
}
