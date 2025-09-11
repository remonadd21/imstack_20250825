package com.company.java006_ex;

public class ArrayEx005 {
	public static void main(String[] args) {
		
		
		/*
			연습문제5)  array
			패키지명 : com.company.java006_ex
			클래스명 :  ArrayEx005
			    1. 배열명 : ch
			    2. 값 넣기 : 'B' , 'a' , 'n' , 'a', 'n' , 'a'
			    3. ch 배열에서 대문자의 갯수카운트, 소문자의 갯수 카운트

		 */
		
		
		
		char [] ch= {'B' , 'a' , 'n' , 'a', 'n' , 'a'};
		int cnt=0, cnt2=0;
		
		for(int i=0; i<ch.length; i++) {
			
			if(ch[i]>='A' && ch[i]<='Z') {
				System.out.print(ch[i]);
				cnt++;
			}
			else if(ch[i]>='a' && ch[i]<='z') {
				System.out.print(ch[i]);
				cnt2++;
			}
		}
		
		System.out.println("\n대문자의 갯수: "+cnt);
		System.out.println("소문자의 갯수: "+cnt2);
		
		
		
		
	}
}
