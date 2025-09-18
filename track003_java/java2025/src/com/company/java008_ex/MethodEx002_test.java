package com.company.java008_ex;


public class MethodEx002_test {
	
	public static void start() {
		System.out.println("부우웅");
	}
	
	public static void scan(int num, char c) {
		for(int i=0; i<num; i++) {
			System.out.print(c);
		}
	}
	
	public static String signalGrade(int num) {
		return num>=85?"A":num>=75?"B":num>=65?"C":"D";
	}
	
	
	public static int charge(int n1, int n2) {
		return n1+n2;
	}
	
	/////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		
		System.out.println("탐사 로봇이 기동합니다.");
		start();    //: 부우웅 출력

		System.out.println("행성 스캔중");
		scan(5,'#');     //: ###### 출력

		System.out.println("신호강도 분석결과");
		System.out.println("신호등급"+signalGrade(65));    
		//: c출력

		System.out.println("배터리 충전 중...");
		System.out.println("충전완료 "+charge(40,40)+"%");
		//: 80출력
		
		/////////////////////////////////////////////////////////////
		
	}
}
