package com.company.java003;

import java.util.Scanner;

public class Operator001 {
	public static void main(String[] args) {
		// 먼저() 값(+,-,*,/,++,--,%) 비교 (>,<) 조건(&&, ||, ?:) 대입(=)
		// 1. 값
		int a=10, b=3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);	// 몫 3, 
		System.out.println(a%b);	// 나머지 1
		
		
		// Q1. 나머지 연산자 - 짝수?, 홀수?
		// 0%2  1%2  2%2 3%2
		
		System.out.println("나머지 없으면 짝수: "+0%2+" / "+1%2+" / "+2%2+" / "+3%2);
		
		// Q2. 3의 배수?
		System.out.println("3으로 나눠지면 3의 배수: "+0%3+" / "+1%3+" / "+2%3+" / "+3%3+" / "+4%3);
		
		
		// 2. 비교 (==, !=, < , >, <=, >=)
		
		System.out.println(10 > 3);
		System.out.println(10 == 3);
		
		// 먼저 값을 구하고 비교
		// Q1. a가 짝수니?  true
		System.out.println(a%2 == 0);
		
		// Q2. b가 3의 배수니?  true
		System.out.println(b%3 == 0);
		
		// 3. && (모든조건 만족시) || (나열된 조건들 중에 하나라도 만족시)
		System.out.println(true & true);  // & 하나는 뒤에 조건까지 참이 있는지 확인함.
		System.out.println(true && true); // 앞뒤 조건 true가 동시에 맞아야 함!
		System.out.println(false & true); // & 앞에가 false고 뒤에가 true이기 때문에 true에서 값이 끝남
		System.out.println(false && true); // 동시 조건이 맞아야 하지만.. true에 마우스 올리면 dead code 뜸
	
		System.out.println(true | true);  //  &하나 처럼 | 앞에와 뒤에 코드까지 다 읽음
		System.out.println(true || true); // 둘다 만족하고 있어서 dead code
		System.out.println(false | true); // true
		System.out.println(false || true);	// true
		
		// Q1 a가 2의 배수이면서 5의 배수라면 true / false
		System.out.println(a%2==0 && a%5==0);
		
		// Q2 a가 2의 배수이거나 3의 배수라면 true / false
		System.out.println(a%2==0 || a%3==0);
		
		
		// 4.삼항연산자 (조건)?  참 : 거짓
		System.out.println( a==10? "10이다" :"10이 아니다.");
		
		// Q3 숫자를 입력받아 0보다 크다면 양수, 0보다 작으면 음수, 아니라면 0
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 하나 입력받기: ");
		int num = scanner.nextInt();
		
		// String res = num>0 ? "양수":"음수"
		
		// 거짓 자리에서 다시 수식 표현이 가능함
		// String res = num>0 ? "양수": num<0? "참":"거짓"
		String res = num >0 ? "양수":num<0? "음수":"0";
		System.out.println("결과 값: "+res);
		*/
		
		// 5.대입 연산자
		a=10;  b=3;
		System.out.println("a=a+b : "+(a+=b) );
		System.out.println("a=a-b : "+(a-=b) );
		System.out.println("a=a*b : "+(a*=b) );
	
		
		// 6.단항
		int a1=1, b1=1, c1=1, d1=1;
		
		System.out.println(++a1); // 증가하고 출력
		System.out.println(a1);
		System.out.println(b1++); // 출력하고 증가
		System.out.println(b1);
		System.out.println(--c1); // 감소하고 출력
		System.out.println(c1);
		System.out.println(d1--); // 출력하고 감소
		System.out.println(d1);
		
		
		/*
		 * 연습문제1)
			클래스명 : OperatorEx001
			    int a=3, b=10;
			    System.out.println(  b+=10 - a-- );   
			    System.out.println(  a+=5 );
			    System.out.println(  a>=10 || a<0 && a>3);
			
			연습문제2)  다음에 해당하는 클래스의 조건을 출력하시오.
			클래스명 : OperatorEx002
			q1-1 int형 변수 x가 3보다 크고 10보다 작을때 true인 조건식 
			q1-2 char형 변수 ch가 'a' 또는 'A'일때   true인 조건식    
			q1-3 char형 변수 ch가 숫자('0'~'9')일때   true인 조건식     
			q1-4 char형 변수 ch가 영문자(대문자 또는 소문자) 일때   true인 조건식

		 * 
		 * */
	}
}
