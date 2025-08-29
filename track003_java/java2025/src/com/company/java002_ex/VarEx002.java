package com.company.java002_ex;

public class VarEx002 {
	public static void main(String[] args) {
		// 문제3 
		/*
		 * com.company.java002_ex
		 * VarEx002
		 *  
			정수형데이터를 담을수 있는 변수 a 만들고   
		 	a에 10대입하시오
		    정수형데이터를 담을수 있는 변수 b 만들고   
		    b에 3대입하시오
		    System.out.println 을 4번사용해서 
		     10 + 3 = 13
		     10  - 3 = 7
		     10  * 3 = 30
		     10  / 3 = 3

		 * */
		
		int a=10;
		int b=3;
		
		// println
		System.out.println(a+"+"+b+"="+(a+b));
		System.out.println(a+"-"+b+"="+(a-b));
		System.out.println(a+"*"+b+"="+(a*b));
		System.out.println(a+"/"+b+"="+(a/b));
		
		
		// printf
		System.out.printf("%d+%d=%d\n",a,b,(a+b));
		System.out.printf("%d-%d=%d\n",a,b,(a-b));
		System.out.printf("%d*%d=%d\n",a,b,(a*b));
		System.out.printf("%d/%d=%d\n",a,b,(a/b));
		
	}
}
