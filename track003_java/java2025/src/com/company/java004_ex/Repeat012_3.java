package com.company.java004_ex;

public class Repeat012_3 {
	public static void main(String[] args) {
		
		/*
		 * 	1. 다음을 for로 작성하시오
			2. Repeat012_3
			    > 1, 2, 3, 4, 5
			    > 5 4 3 2 1
			    > java1 java2 java3  
		 */
		
		System.out.println("1) for step1");
		for(int i=1; i<=5; i++) {
			System.out.print( (i==1?"":",")+i );
		}
		
		System.out.println("\n\n2) for step2");
		
		for(int i=5; i>0; i--) {
			System.out.print(i+"\t");
		}
		
		System.out.println("\n\n3) for step3");
		
		for(int i=1; i<4; i++) {
			System.out.print((i==1?"":" , ")+"java"+i);
		}
	}
}
