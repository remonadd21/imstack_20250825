package com.company.java007_ex;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Ex002_upgrade1 {
	public static void main(String[] args) {
		
		/*
		 * 다차원 배열 + 조건 처리
			패키지명 : com.company.java007_ex 
			클래스명 : Array2Ex002_upgrade1 
			문제 설명 : 
			다음과 같은 2차원 배열이 주어졌을 때,
			각 요소를 이중 for문으로 순회하면서
			짝수인 값만 출력하시오.
			출력 시 각 값의 위치(index)도 함께 출력하시오.
			
			출력예시:
			짝수 arr2[0][1] = 102
			짝수 arr2[1][0] = 200
			짝수 arr2[1][2] = 202
			짝수 arr2[2][1] = 302
			
			int[][] arr2 = {
			    {101, 102, 103},
			    {200, 201, 202},
			    {301, 302, 303}
			};
		 * 
		 * */
		int [][] arr2 = {{101, 102, 103},
						{200, 201, 202},
						{301, 302, 303}};
		
		
		System.out.println("ver-1");
		System.out.print(arr2[0][0]+"\t");System.out.print(arr2[0][1]+"\t");System.out.print(arr2[0][1]+"\t");
		System.out.println();
		
		
		// 칸 먼저 보고, 층 올리기
		System.out.println("ver-2");
		
		// 처리 , 출력
		for(int j=0; j<arr2.length; j++) {
			for(int i=0; i<arr2[j].length; i++) {
			
					System.out.print(arr2[j][i]%2==0?+arr2[j][i]:"\n");
			}
			System.out.println();
		}
		
		
		/*
			다차원 배열을 이용한 좌석 예약 시스템
			패키지명 : com.company.java007_ex 
			클래스명 : Array2Uptrade002 
			
			문제 설명 : 극장의 좌석 상태를 2차원 배열로 표현하고,
			예약 가능한 좌석은 0,
			이미 예약된 좌석은 1로 표시됩니다. 사용자가 원하는 좌석을 입력하면,
			해당 좌석이 예약 가능한지 확인하고,
			예약 처리 후 전체 좌석 상태를 출력하시오.
			
			java
			int[][] seats = {
			    {0, 1, 0, 0},
			    {1, 0, 0, 1},
			    {0, 0, 1, 0}
			};
			
			
			조건:
			사용자 입력은 행 번호와 열 번호를 Scanner로 받는다.
			이미 예약된 좌석이면 "이미 예약된 좌석입니다." 출력
			예약 가능하면 "예약되었습니다." 출력 후 해당 좌석을 1로 변경
			최종 좌석 상태를 출력하시오.
			
			출력예시:
			예약되었습니다.
			
			현재 좌석 상태:
			0 1 1 0
			1 0 0 1
			0 0 1 0
		
		*/
		
		//변수
		int[][] seats = { {0, 1, 0, 0}, 
						{1, 0, 0, 1}, 
						{0, 0, 1, 0} };
			
		
		int num =0;
		//입력
		
		Scanner scanner = new Scanner(System.in);
		
		//처리
		//출력
		/*
		 * System.out.print(seats[0][0]+"\t");System.out.print(seats[0][1]+"\t");System.
		 * out.print(seats[0][2]+"\t"); System.out.println();
		 */
		
		
		System.out.println("ver-2");
		
		for(int j=0; j<seats.length; j++) {
			for(int i=0; i<seats[j].length; i++) {
				
				
				
				System.out.println(Arrays.deepToString(seats));
				System.out.print("\n좌석을 예약 하시겠습니까? 00, 01, 02 값으로 입력해주세요");
				seats[j][i] = scanner.nextInt();
				
				
				
				
				if(seats[j][i]==1) {System.out.print(seats[j][i]+"의 값으로 이미 예약이 되어있습니다."); break;}
				else {seats[j][i]=1; System.out.println("좌석 예약에 성공했습니다."); break;}
				
				
			}
			System.out.println();
		}
		
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
