package com.company.java014_ex;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx002 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> numbers = new ArrayList<>();
		numbers.add("one");
		numbers.add("two");
		numbers.add("three");
		
		System.out.print("1,2,3 중에 입력받기: ");
		int now = scanner.nextInt();
		
		
		System.out.println("0) 미션 버전");
		System.out.println("한 줄 출력:"+numbers.get(now-1));
		
		
		
		
		System.out.println("1) switch 버전");
		switch(now) {
		case 1: System.out.println(numbers.get(0)); break;
		case 2: System.out.println(numbers.get(1)); break;
		case 3: System.out.println(numbers.get(2)); break;
		}
		
		System.out.println("2) if 버전");
		if(now==1) {
			System.out.println(numbers.get(0));
		}
		else if(now==2) {
			System.out.println(numbers.get(1));
		}
		else if(now==3) {
			System.out.println(numbers.get(2));
		}
	}

}

//연습문제2)  Collection  Framework
//패키지명 : com.company.java014_ex
//클래스명 : ListEx002
//1.  numbers ArrayList 만들기
//2.  one, two, three 데이터 추가
//3.  사용자에게 1,2,3 입력받기
//4.  1을 입력받으면 one 출력
//    2를입력받으면 two 출력
//    3을입력받으면 three 출력