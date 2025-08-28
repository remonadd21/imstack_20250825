package com.company.java002_ex;

public class PrintEx001 {
	public static void main(String[] args) {
		
		//문제1 좋아하는 색상은 RED입니다. 
		// print, printf, println 으로 각각 3번 출력받기
		System.out.print("좋아하는 색상은 RED 입니다.\n");
		System.out.printf("좋아하는 색상은 %s 입니다.\n", "RED");
		System.out.println("좋아하는 색상은 RED 입니다.");
		
		//문제2 (10+3=10+3) 이 나오도록 만들기		
		System.out.println(10+"+"+3+"="+(10+3));
		System.out.printf("%d+%d=(%d)",10,3,(10+3));
	}
}
