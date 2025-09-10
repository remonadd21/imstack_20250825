package com.company.java005_ex;

public class ForEx010 {
	public static void main(String[] args) {
		
		/*
		연습문제10)  for/while/do while
		패키지명 : com.company.java005_ex
		클래스명 :  RepeatEx010
		for , while , do while 3가지 버젼으로 
		ABCDE   
		FGHIJ
		KLMNO
		PQRST
		UVWXY
		Z 
		 */
		
		/*System.out.print('A');System.out.print('B');System.out.print('C');System.out.print('D');System.out.print('E');
		System.out.println();
		System.out.print('F');System.out.print('G');System.out.print('H');System.out.print('I');System.out.print('J');
		System.out.println();
		System.out.print('K');System.out.print('L');System.out.print('M');System.out.print('N');System.out.print('O');
		System.out.println();
		System.out.print('P');System.out.print('Q');System.out.print('R');System.out.print('S');System.out.print('U');
		System.out.println();
		System.out.print('V');System.out.print('W');System.out.print('X');System.out.print('Y');System.out.print('Z');
		*/
		
		System.out.println("1.for");
		
		for(int i=65; i<=90; i++) {
			if(i%5==0) { System.out.println();}
			System.out.print((char)i);
		}
		
		
		System.out.println("\n\n2.while");
		
		int i=65;
		while(i<=90) {
			if(i%5==0) { System.out.println();}
			System.out.print((char)i);
			i++;
		}
		
		
		System.out.println("\n\n3.do while");
		
		int i2=65;
		do{
			if(i2%5==0) { System.out.println();}
			System.out.print((char)i2);
			i2++;
		}while(i2<=90);
		
		
	}
}
