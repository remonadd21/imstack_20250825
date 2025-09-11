package com.company.java006_ex;

public class ArrayEx001 {
	public static void main(String[] args) {
		
		/*
		 * ■14. array 배열
			1. 배열?
			- [같은 타입]의 데이터를 [연속된 공간에 저장]하는 자료구조
			- 각 데이터의 저장위치 [인덱스]를 통해서 접근
			
			int  a     = 10;  // 비교
			
			int[]  arr =  {  1,2,3 };
			-----------------------------------------------------
			[heap-동적데이터]              [stack-임시데이터] 
			1번지{ 1,       2,       3}  ←  arr : 1번지
			    arr[0]  arr[1]  arr[2]
			-----------------------------------------------------
			
			
			연습문제1)  array
			패키지명 : com.company.java006_ex
			클래스명 :  ArrayEx001
			    1. 배열명 : arr
			    2. 값 넣기 : 1.1  , 1.2  , 1.3  , 1.4  , 1.5
			    3. for + length 로 출력
			    
			*/
			double [] arr1 = {1.1, 1.2, 1.3, 1.4, 1.5};
			
			for(int i=0; i<arr1.length; i++) {
				System.out.print(arr1[i]+"\t");
			}
		
		
			/*
			연습문제2)  array
			패키지명 : com.company.java006_ex
			클래스명 :  ArrayEx002
			    1. 배열명 : arr
			    2. 값 넣기 : 'A' , 'B' , 'C' , 'D'
			    3. for + length 로 출력
			
			연습문제3)  array
			패키지명 : com.company.java006_ex
			클래스명 :  ArrayEx003
			    1. 배열명 : arr
			    2. 값 넣기 : "아이언맨" , "헐크" , "캡틴"
			    3. for + length 로 출력
			
			
			
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
