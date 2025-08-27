package com.company.java001;

public class A002 {
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("AB");
		System.out.println("ABC");
		
		// ▼ 한 줄로 위와 같이 만들려면?
		System.out.println("AABABC");
		
		// 아래와 같이 만들기  \n 사용하기
		System.out.println("A\nAB\nABC");
		
		// 포맷형식
		// println은 포맷형식이 아니므로, 에러가 발생함
		// printf는 포맷형식에 맞게 출력
		System.out.printf("이름: %s 나이: %d 세", "임민재", 45);
		
	}
}
