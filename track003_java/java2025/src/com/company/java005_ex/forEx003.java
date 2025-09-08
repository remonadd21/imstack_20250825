package com.company.java005_ex;

public class forEx003 {
	public static void main(String[] args) {
		/*
		연습문제3)  
		패키지명 : com.company.java005_ex
		클래스명 :  ForEx003
		출력내용 :   for 이용
		1~10까지 몇개인지 세어주시오..
		*/
		
		int cnt = 0;
		String res="";
		for(int i=3; i<10; i++) {
			if(i%3==0) {cnt++; System.out.print("3의 배수는"+i+"갯수는 > "+cnt+"개 \n"); }
		}
		
		
		/*
		upgrade)  시간나면 도전!
		1+2+3+4+5+6+7+8+9+10=55
		*/
		
		// 저장해주는 값이 필요함
		int tot=0;
		
		for(int i=1; i<=10; i++) {
			System.out.print( (i==1?"":"+")+i);
			tot+=i;
		}
		System.out.println("="+tot);
		
		/*
		연습문제4)  
		패키지명 : com.company.java005_ex
		클래스명 :  ForEx004
		출력내용 :   for 이용
		1~10까지 3의 배수 갯수를 출력   
		
		upgrade)  시간나면 도전!
		3의배수 : 3,6,9    
		갯수 : 3개
		
		
		연습문제5)  
		패키지명 : com.company.java005_ex
		클래스명 :  ForEx005
		출력내용 :   for 이용
		소문자 a~z까지 모음의 갯수를 출력하시오. 
       */
		
	}
}
