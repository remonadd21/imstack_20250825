package com.company.java006_ex;

public class ArrayEx004 {
	public static void main(String[] args) {
		

		
		/*
			연습문제4)  array
			패키지명 : com.company.java006_ex
			클래스명 :  ArrayEx004
			    1. 배열명 : ch
			    2. 값 넣기 : 'B' , 'a' , 'n' , 'a', 'n' , 'a'
			    3. ch 배열에서 a의 갯수 세기
		*/
		
		//중요! char로 배열을 만들면 equals를 사용하기 어렵다.
		//		equals를 사용하려면 정확하게 문자라는 Character 라고 작성한다.
		Character[] ch = {'B', 'a', 'n', 'a', 'n', 'a'};
		int cnt = 0;

		for (int i = 0; i < ch.length; i++) {
		    if (ch[i].equals('a')) {
		        System.out.print(ch[i] + ",");
		        cnt++;
		    }
		}
		System.out.println("\n\na는 총:" + cnt + "개");
			
		
		
		/*
			연습문제5)  array
			패키지명 : com.company.java006_ex
			클래스명 :  ArrayEx005
			    1. 배열명 : ch
			    2. 값 넣기 : 'B' , 'a' , 'n' , 'a', 'n' , 'a'
			    3. ch 배열에서 대문자의 갯수카운트, 소문자의 갯수 카운트

		 */
		
		
	}
}
