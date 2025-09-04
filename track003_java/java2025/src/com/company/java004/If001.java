package com.company.java004;

public class If001 {
	public static void main(String[] args) {
		//1. 1형식
		int axe=1;
		System.out.println("▼1형식 - 조건을 무조건 읽음");
		
		// axe가 1이라면 금도끼, 2라면 은도끼,  3이라면 낡은도끼
		// if(axe가 1이라면) {금도끼}, if(2라면) {은도끼}, if (3이라면) {낡은도끼}
		
		if(axe==1) {System.out.println("금도끼");}
		if(axe==2) {System.out.println("은도끼");} // 조건을 읽었는지 알 수 없다.
		if(axe==3) {System.out.println("낡은도끼");} // 조건을 읽었는지 알 수 없다.
		
		//2. 2형식, else 뒤에는 조건이 오지 못 함.
		axe=2;
		System.out.println("▼2형식 - 맞다/틀리다");
		if(axe==1) {System.out.println("금도끼");}
		else {System.out.println("도끼가 아니다.");}
		
		//3. 다형식
		axe=3;
		System.out.println("▼다형식");
		if(axe==1) {System.out.println("금도끼");}
		else if(axe==2) {System.out.println("은도끼");}
		else if(axe==3) {System.out.println("낡은도끼");}
		else {System.out.println("도끼가 아니다.");}
		
		/*
			■12. 조건문  (1)
1. 프로그램 코드 실행흐름
  - 위 → 아래, 왼쪽 → 오른쪽
  - 제어문은 개발자가 원하는 방향으로 변경할수 있도록 도와줌.

2. 제어문의 종류
    조건문      : if , switch  #
    반복문      : for, while, do while
    제어키워드 : break# , continue


	연습문제1)
	패키지명 : com.company.java004_ex
	클래스명 :  IfEx001
	출력내용 : 평균을 입력받아 60점이상이면 합격,  불합격여부를 출력하는 프로그램을 IF로 작성하시오.
	*/
	
	/*
	연습문제2)
	패키지명 : com.company.java004_ex
	클래스명 :  IfEx002
	출력내용 : 숫자 한개를 입력받아 
	   양수라면 양수  , 음수라면 음수  ,0이라면 zero를 출력하는 프로그램을 작성하시오.
	
	   
	연습문제3)
	패키지명 : com.company.java004_ex
	클래스명 :  IfEx003
	출력내용 : 숫자한개를 입력받아 
	   만약 1을 입력했다면   one ,   
	   만약 2을 입력했다면   two ,
	   만약 3을 입력했다면   three ,
	   1,2,3이 아니라면  1,2,3이 아니다를 출력하는 프로그램을 작성하시오.
	 
	
	   
	연습문제4)
	패키지명 : com.company.java004_ex
	클래스명 :  IfEx004
	출력내용 : 문자한개를 입력받아 
	   대문자인지,  소문자인지 판별하는 프로그램을 작성하시오.
   ※  대문자  ch>='A' && ch<='Z' / 소문자  ch>='a'  &&  ch<='z'  
		
		
		*/
	}
}
