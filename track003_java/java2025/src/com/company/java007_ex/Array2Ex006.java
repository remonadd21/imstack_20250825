package com.company.java007_ex;

public class Array2Ex006 {

	public static void main(String[] args) {
		
		/*
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
		*/
		int [][] five = new int[5][5];
		
		int data=1;
		
		// System.out.println([0][0]+"\t");System.out.println([0][1]+"\t");System.out.println([0][2]+"\t");
		
		for(int j=0; j<five.length; j++) {
			for(int i=0; i<five.length; i++) {
				five[j][i]=data++;
				System.out.print( five[j][i]+"\t");
			}
			System.out.println();
		}
		
		
		/*
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


