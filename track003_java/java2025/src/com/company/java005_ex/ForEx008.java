package com.company.java005_ex;

public class ForEx008 {
	public static void main(String[] args) {
		
		/*
		 * 연습문제8)  for, while, do while
			패키지명 : com.company.java005_ex
			클래스명 :  ForEx008 
			1.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  1 2 3 4 5
			2.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  5 4 3 2 1
			3.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  JAVA1   JAVA2  JAVA3
		*/
		System.out.println("1.for문");
		
		for(int i=1; i<=5; i++) {
			System.out.print( i +"\t");
		}
		
		System.out.println("\n\n2. while문");
		
		int i=1;
		while(i<=5) {
			System.out.print(i+"\t");
			i++;
		}
		
		System.out.println("\n\n3. do while문");
		
		i=1;
		do{
			System.out.print(i+"\t");
			i++;
		}while(i<=5);
		
		
		System.out.println("\n\n4.for문");
		
		for(i=5; i>=1; i--) {
			System.out.print( i +"\t");
		}
		
		System.out.println("\n\n5. while문");
		
		i=5;
		while(i>=1) {
			System.out.print(i+"\t");
			i--;
		}
		
		System.out.println("\n\n6. do while문");
		
		i=5;
		do{
			System.out.print(i+"\t");
			i--;
		}while(i>=1);
		
		
		System.out.println("\n\n7.for문");
		
		for(i=1; i<=3; i++) {
			System.out.print( "java"+i +"\t");
		}
		
		System.out.println("\n\n8. while문");
		
		i=1; 
		while(i<=3) {
			System.out.print( "java"+i +"\t");
			i++;
		}
		
		System.out.println("\n\n9. do while문");
		
		i=1; 
		do{
			System.out.print( "java"+i +"\t");
			i++;
		}while(i<=3);
		
	}
}
