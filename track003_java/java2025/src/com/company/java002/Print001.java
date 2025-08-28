package com.company.java002;

public class Print001 {
	public static void main(String[] args) {
		
		// 1. System.out.println()
		System.out.println("1. 줄바꿈");
		
		// 2. System.out.print()
		System.out.print("2. 줄바꿈 안됨");
		
		// \\슬러시 2개는 기능을 사용하는 것이 아니라는 뜻으로 사용
		System.out.print("3. 특수 문자\\n으로 줄바꿈 가능\n");
		
		// 3. System.out.printf()
		// %s (문자열),  %d (정수형 표현),  %f(실수형 표현)
		System.out.printf("3. 정수 %d, 실수 %f, 문자열 %s",1,0.123,"ABC\n");
		
		// +의 의미
		System.out.println(10+3);
		
		// 중요1) 문자열이 등장한 "+" 뒤에서 부터는 문자로 인식함
		System.out.println(10+3+"+"+1+2);
		
		// 중요2) 아래와 같이 하면 ( ) 안의 값을 먼저 계산하기 때문에
		// 문자열이 앞에 있어도 더하기가 먼저 가능함
		System.out.println(10+3+"+"+(1+2));
		
		//문제) 위의 중요 내용들을 참고하여 1+2 = 3으로 출력받기
		System.out.println(1+"+"+2+"="+(1+2));
	}
}
