package com.company.java005_ex;

public class ForEx009 {
	public static void main(String[] args) {
		
		/*
		연습문제9)  for/while/do while
		패키지명 : com.company.java005_ex
		클래스명 :  RepeatEx009
		for , while , do while 3가지 버젼으로 
		1~10까지 3의 배수의 합 : 18
		
		힌트)
		ver-1)
		1이  3의 배수라면  합을더해주변수에누적
		2가  3의 배수라면  합을더해주변수에누적
		3이  3의 배수라면  합을더해주변수에누적
		
		ver-2)
		if( 1이  3의 배수라면 ){ 합을더해주변수에누적 }
		if( 2가  3의 배수라면 ){ 합을더해주변수에누적 }
		if( 3이  3의 배수라면 ){ 합을더해주변수에누적 }
		*/
		
		System.out.println("1) for문");
		
		int tot = 0;
		String res="";

		for (int i = 3; i <= 10; i++) {
			
			if (i % 3 == 0) {
				tot += i;
				System.out.print((i==3?"":"+")+i);
			}
		}
		System.out.println("="+tot);
		
		
		
		
		System.out.println("\n\n2) while문");
		
		int tot2 = 0;
		int i=3;
		
		while(i <= 10) {
			if (i % 3 == 0) {
				tot2 += i;
				System.out.print((i==3?"":"+")+i);
			}
			i++;
		}
		System.out.println("="+tot2);
		
		
		System.out.println("\n\n3)do while문");
		
		int tot3 = 0;
		int i2=3;
		
		do{
			if (i2 % 3 == 0) {
				tot3 += i2;
				System.out.print((i2==3?"":"+")+i2);
			}
			i2++;
		}while(i2 <= 10); 
		System.out.println("="+tot3);
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
		
	}
}
