package com.company.java007_ex;

public class Array2Ex002 {

	public static void main(String[] args) {

		/*
		연습문제2)  array
		패키지명 : com.company.java007_ex
		클래스명 :  Array2Ex002
		배열을 이용하여 다음의 프로그램을 작성하시오.   
		  
		   int[][] arr2={{101,102,103},{201,202,203}};
		
		   이중for 이용해서 출력하기

		 * 
		 * */
		System.out.println("ver1");
		int[][] arr2={{101,102,103},{201,202,203}};
		System.out.print(arr2[0][0]+"\t"); System.out.print(arr2[0][1]+"\t");
		System.out.println();
		System.out.print(arr2[1][0]+"\t"); System.out.print(arr2[1][1]+"\t");
		System.out.println();
		
		
		System.out.println("ver2");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[0][i]+"\t"); 
			System.out.println();
		}
		
		
		System.out.println("ver3");
		for(int j = 0; j<arr2.length; j++) {
			for(int i=0; i<arr2[j].length; i++) {
				System.out.print(arr2[j][i]+"\t"); 
				System.out.println();
			}
		}
		
		
		
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

	}
}

