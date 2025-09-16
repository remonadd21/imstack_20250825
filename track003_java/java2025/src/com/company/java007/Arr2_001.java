package com.company.java007;

import java.util.Arrays;

public class Arr2_001 {

	public static void main(String[] args) {
		
		int [][] arr = {
							{1,2,3},		// 00, 01, 02
							{4,5,6}		// 10, 11, 12
						};
		
		System.out.println(arr);  				// 주소     [[I@5aaa6d82
		System.out.println(Arrays.toString(arr)); // 주소   [[I@73a28541, [I@6f75e721]
		System.out.println(Arrays.deepToString(arr)); // [[1, 2, 3], [4, 5, 6]] 
		
		// ver-1 눈에 보이는대로
		System.out.println("ver-1");
		System.out.print(arr[0][0]+"\t"); System.out.print(arr[0][1]+"\t"); System.out.print(arr[0][1]+"\t");
		System.out.println();
		System.out.print(arr[1][0]+"\t"); System.out.print(arr[1][1]+"\t"); System.out.print(arr[1][1]+"\t");
		System.out.println();
		
		// ver-2 칸 정리 {반복} {변수} for(시작; 종료; 변화)
		System.out.println("ver-2");
		for(int kan=0; kan<=2; kan++){{System.out.print(arr[0][kan]+"\t");}}
		System.out.println();
		for(int kan=0; kan<=2; kan++){{System.out.print(arr[1][kan]+"\t");}}
		System.out.println();
		
		
		// ver-3 층 정리
		/*
		 * ver-2에서 반복되는 값
		 * for(int kan=0; kan<=2; kan++){{System.out.print(arr[0][kan]+"\t");}}
		 * System.out.println();
		 */
		
		System.out.println("ver-3");
		for(int ch=0; ch<=1; ch++) {
			for(int kan=0; kan<=2; kan++){{System.out.print(arr[ch][kan]+"\t");}}
			System.out.println();
		}
		
		System.out.println("ver4");
		// 배열명  아파트.length 층 // 배열명 [0] 층 .lenght 칸
		for(int ch=0; ch<=arr.length; ch++) {
							// 층의 칸수
			for(int kan=0; kan<=arr[ch].length; kan++){{System.out.print(arr[ch][kan]+"\t");}}
			System.out.println();
		}
		
		/*
		 * 연습문제1)  array
		패키지명 : com.company.java007_ex
		클래스명 :  Array2Ex001
		배열을 이용하여 다음의 프로그램을 작성하시오.   
		  
		   int[][] arr2={{100,200,300},{400,500,600}};
		
		   이중for 이용해서 출력하기
		
		
		
		연습문제2)  array
		패키지명 : com.company.java007_ex
		클래스명 :  Array2Ex002
		배열을 이용하여 다음의 프로그램을 작성하시오.   
		  
		   int[][] arr2={{101,102,103},{201,202,203}};
		
		   이중for 이용해서 출력하기
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
	}// end main
}// end class
