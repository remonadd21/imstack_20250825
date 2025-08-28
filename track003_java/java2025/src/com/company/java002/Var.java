package com.company.java002;

public class Var {
	public static void main(String[] args) {
		//1.변수?  자료형	변수명(소문자)
		
		/*
		int a == %d (정수값과 같음)
		int a;로 하고 출력받으면 담는 값이 없어서 출력시 에러
		출력문의 a가 빨간줄이 가면 거기서 클릭하고 초기값 누르면
		int a=0; 으로 자동으로 변환됨
		*/
		
		int a = 0;
		System.out.println("a 값 출력받기: "+a);
		
		a = 1000000; // A=B (=뒤에 값을 앞에 넣기 B를 A에 넣기)
					 // a[1000000]
		System.out.println("a 값 재출력받기: "+a);
		
		
		a = a-90000; // a가 담은 값에서 - 90000 가 다시 a에 저장됨
		System.out.println("계산된 a 값 출력받기: "+a);
		
		//2.변수의 범위
		{
			int b=20;
			System.out.println("b 출력: "+b);
			
			/* a는 더 큰 영역에서 영향을 주기 때문에 b영역에서
			사용가능함 */
			a = a+b;
			System.out.println("a와 b를 더한 값 출력: "+a);
		}
		// b=1000; 에러발생, 영역을 벗어남  
		
		//3. 변수명 ($나 _로 시작하기 때문에 숫자 사용가능)
		// 오픈된 변수
		int $1=1;
		int _2=2;
		
		// 고정된 상수 (HOME 처럼 대문자로 만든다면...)
		final int HOME=4;
		
		// int static 처럼 빨간색이고, 예약어는 사용불가!
		// int main은 사용가능, 빨간글자가 아니기 때문..
		
		// 문제1
		/*	com.company.java002_ex
		 * 	VarEx001
		 * 	정수형 변수 apple 선언하고 값 대입후 출력받기 
		 * 	
		 * 
		 * */
	
	}// end main
}
