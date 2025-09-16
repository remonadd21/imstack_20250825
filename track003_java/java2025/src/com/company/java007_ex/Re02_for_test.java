package com.company.java007_ex;

public class Re02_for_test {
	public static void main(String[] args) {
		
		/*
		> 반복문 응용
		for, while, do while문을 이용하여 다음과 같이 출력하시오
		5 4 3 2 1
		*/
		
		System.out.println("1) for문 버전");
		
		for(int i=5; i>0; i--) {
			System.out.print(i+"\t");
		}
		
		
		System.out.println("\n\n2) while문 버전");
		
		int i=5; 
		while(i > 0) {
			System.out.print(i+"\t");
			i--;
		}
		
		
		System.out.println("\n\n3)do while문 버전");
		
		i=5; 
		do{
			System.out.print(i+"\t");
			i--;
		}while(i > 0);
		
		
		/*
		> 배열 응용
		1. 배열명 nums  10, 20, 30 넣기
		2. for문과 length를  이용하여 10, 20, 30 출력받기
		*/
	}
}
