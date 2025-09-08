package com.company.java005_ex;

public class forEx005 {
	public static void main(String[] args) {
		/*
		연습문제5)  
		패키지명 : com.company.java005_ex
		클래스명 :  ForEx005
		출력내용 :   for 이용
		소문자 a~z까지 모음의 갯수를 출력하시오. 
       */
		
		for(char i='a'; i<='z'; i++) {
			System.out.print(i +" , ");
		}
		
		System.out.println("\n업그레이드, a, e, i, o, u");
		for(char i='a'; i<='z'; i++) {
			System.out.print((i=='a')?'a':(i=='e')?'e':(i=='i')?'i':
				(i=='o')?'o':(i=='u')?'u':"");
		}
		
		System.out.println("\n\nswitch 버전으로 문제풀기");
		for(char i='a'; i<='z'; i++) {
			switch(i) {
			case 'a': case 'e': case 'i': case 'o': case 'u': 
				System.out.print((i=='a'?"":",")+i); break;
			}
		}
	}
}
