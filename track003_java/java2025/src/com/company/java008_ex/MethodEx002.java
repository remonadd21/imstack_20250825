package com.company.java008_ex;

public class MethodEx002 {
	public static void test1(int ten) {System.out.println(ten);}
	public static void test2(double num){System.out.println(num);}
	public static void hap(int a, int c){ 
		int total=0; 
		for(int i=a; i<=c; i++ ) {
			total+=i;
		}
		System.out.println(total);
	}
	public static void disp(int num , char t){ 
	
		for(int i=0; i<num; i++) {
			System.out.print(t);
		}
	}

	/////////////////////////////////////////////////
	public static void main(String[] args) {
		test1(10);
		test2(1.2);
		hap(3, 5);
		disp(7, '*');
		
	}
	/////////////////////////////////////////////////
}
/*
 * 연습문제2)  method
패키지명 : com.company.java008_ex
클래스명 :  MethodEx002
다음과 같이 test1(), test2(), hap(), disp()메서드를 정의하시오.

public static void main(String[] args) {
    // public static  리턴값 메서드명(파라미터)
    test1(10);    //10 출력
     test2(1.2);   // 1.2 출력
     hap(3,5);     // 3에서 5까지의 더한 값이 12 출력, 어떤 값도 더한 값 출력받기
     disp(7, '*');  // *******출력
}

 * 
 * 
 */