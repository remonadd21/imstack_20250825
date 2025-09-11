package com.company.java006_ex;

public class ArrayEx003 {
	public static void main(String[] args) {
		
		/*
		
			
			연습문제3)  array
			패키지명 : com.company.java006_ex
			클래스명 :  ArrayEx003
			    1. 배열명 : arr
			    2. 값 넣기 : "아이언맨" , "헐크" , "캡틴"
			    3. for + length 로 출력
			    
			중요! 문자열은 equals로 비교!!
		*/	
		
		String[] arr = {"아이언맨" , "헐크" , "캡틴"};
		
		for(int i=0; i<arr.length; i++) {
			System.out.print((arr[i].equals("아이언맨")?"":" , ")+arr[i]);
		}
		
		
		/*
			연습문제4)  array
			패키지명 : com.company.java006_ex
			클래스명 :  ArrayEx004
			    1. 배열명 : ch
			    2. 값 넣기 : 'B' , 'a' , 'n' , 'a', 'n' , 'a'
			    3. ch 배열에서 a의 갯수 세기
			
			
			연습문제5)  array
			패키지명 : com.company.java006_ex
			클래스명 :  ArrayEx005
			    1. 배열명 : ch
			    2. 값 넣기 : 'B' , 'a' , 'n' , 'a', 'n' , 'a'
			    3. ch 배열에서 대문자의 갯수카운트, 소문자의 갯수 카운트

		 */
		
		
	}
}
