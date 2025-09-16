package com.company.java007_ex;

public class Array2Ex003 {

	public static void main(String[] args) {

		/*
		 * 
		 * 연습문제3)  array
			패키지명 : com.company.java007_ex
			클래스명 :  Array2Ex003
			배열을 이용하여 다음의 프로그램을 작성하시오.   
			1. new 연산자 이용하여 다차원배열만들기
			2. for + length 이용해서 대입   
			3. for + length 이용해서 출력 
			   101       102       103
			   104    105    106
		*/
		
		int [][] num = new int[2][3];
		int data=100;
		
		System.out.println("ver-1");
		/*
		 * num[0][0] = ++data; num[0][1] = ++data; num[0][2] = ++data; 
		 * num[1][0] =++data; num[1][1] = ++data; num[1][2] = ++data;
		 */
		
		System.out.println("ver-2");
		for(int j=0; j<num.length; j++) {
			for(int i=0; i<num[j].length; i++) {
				num[j][i] = ++data;
				
				System.out.print(num[j][i]+",");
			}
			System.out.println();
		}
			
		
		
		/*
			연습문제4)  array
			패키지명 : com.company.java007_ex
			클래스명 :  Array2Ex004
			배열을 이용하여 다음의 프로그램을 작성하시오.   
			1. new 연산자 이용하여 다차원배열만들기
			2. for + length 이용해서 대입   
			3. for + length 이용해서 출력 
			   A   B   C
			   B   C   D
			
			연습문제5)  array
			패키지명 : com.company.java007_ex
			클래스명 :  Array2Ex005
			배열을 이용하여 다음의 프로그램을 작성하시오.   
			1. 다음의 주어진조건을 이용하여 총점과 평균을 구하시오.
			
			 int[][] arr = {
			   { 1, 1, 1,},
			   { 2, 2, 2,},
			   { 3, 3, 3,},
			   { 4, 4, 4,},
			 };
			 int total=0;  double avg=0.0;
			
			출력내용:
			총점 : 30
			평균 : 2.5
			
			연습문제6)  array
			패키지명 : com.company.java007_ex
			클래스명 :  Array2Ex006
			> 2차원배열 
			1.  new 로 만들고   5*5
			2.  데이터 넣기  for+length
			3.  데이터 출력  for+length
			
			1   2   3   4   5
			6   7   8   9   10
			11   12   13   14   15
			16   17   18   19   20
			21   22   23   24   25
			
			연습문제7)  array
			패키지명 : com.company.java007_ex
			클래스명 :  Array2Ex007
			> 2차원배열   4*4
			1.  new 로 만들고 
			2.  데이터 넣기  for+length
			3.  데이터 출력  for+length
			1   2   3   4
			1   2   3   4
			1   2   3   4
			1   2   3   4
			
			
			연습문제8)  array
			패키지명 : com.company.java007_ex
			클래스명 :  Array2Ex008
			배열을 이용하여 다음의 프로그램을 작성하시오.   
			1. 다음의 주어진조건을 이용하여 총점과 평균을 구하시오.
			
			int[][] datas = {  {  10, 10, 10 ,10}, 
			            {  20, 20, 20 ,20}, 
			            {  30, 30, 30 ,30},  
			};  // 3층 4칸 
			int[][] result = new int[datas.length+1][datas[0].length+1];
			
			#1. result 에 datas데이터 복사하기
			#2. 가로방향누적데이터
			#3. 세로방향데이터누적
			#4. 총합
			
			출력내용:
			10   10   10   10   40   
			20   20   20   20   80   
			30   30   30   30   120   
			60   60   60   60   240   
		 * 
		 * 
		 * 
		 */

	}
}

