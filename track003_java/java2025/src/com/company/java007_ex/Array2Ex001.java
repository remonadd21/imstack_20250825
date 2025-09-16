package com.company.java007_ex;

public class Array2Ex001 {

	public static void main(String[] args) {
		/*
		 * 연습문제1)  array
		패키지명 : com.company.java007_ex
		클래스명 :  Array2Ex001
		배열을 이용하여 다음의 프로그램을 작성하시오.   
		  
		   int[][] arr2={{100,200,300},{400,500,600}};
		
		   이중for 이용해서 출력하기
		*/
		
		int[][] arr2={{100,200,300},{400,500,600}};
		System.out.print(arr2[0][0]+"\t"); System.out.print(arr2[0][1]+"\t");  System.out.print(arr2[0][2]+"\t");
		System.out.println();
		System.out.print(arr2[1][0]+"\t"); System.out.print(arr2[1][1]+"\t");  System.out.print(arr2[1][2]+"\t");
		System.out.println();
		System.out.println("ver2");
		
		for(int ch=0; ch<arr2.length; ch++) {
			for(int kan=0; kan<arr2[ch].length; kan++) {
				System.out.print(arr2[ch][kan]+"\t"); 
				System.out.println();
			}
			
		}
	}
		
		
		
		
		/*
		연습문제2)  array
		패키지명 : com.company.java007_ex
		클래스명 :  Array2Ex002
		배열을 이용하여 다음의 프로그램을 작성하시오.   
		  
		   int[][] arr2={{101,102,103},{201,202,203}};
		
		   이중for 이용해서 출력하기

		 * 
		 * */

}

