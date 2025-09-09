package com.company.java005_ex;

import java.util.Scanner;

public class ForEx006_for1_ex2 {
public static void main(String[] args) {
		
		/*
		 * 연습문제6)  for 무한반복
			패키지명 : com.company.java006_ex
			클래스명 :  ForEx006
			출력내용 :  계산기
			
			1)  각 연산자에 맞게 계산처리
			2)  숫자1, 숫자2는 0~100사이만 입력가능하게 아니면 무한반복
			3)  연산자는 +, - ,*, /만 입력가능하게 아니면 무한반복
			     
			
			1. 정수를 하나 입력해주세요 > 10   
			2. 정수를 하나 입력해주세요 > 3
			3. 연산자를 입력해주세요(+,-,*,/) > +
			10+3=13
		 */
		
		//변수
		int num1 = 0, num2 = 0, tot = 0;
		char oper='\u0000';
		String res="";
		
		
		Scanner scanner = new Scanner(System.in);
		
		//입력
		
		for(;;) {
						
			// if로 풀때 continue가 없으면 if 조건으로 다시 확인하러 오지 않고,
			// 다음으로 넘어감.. if는 모두가 주인공... else if는 상관 없음
			if(!(num1>0 && num1<=100)) { 
				System.out.print("정수 하나 입력받기1: ");
				num1 = scanner.nextInt();
				continue;
			}
			if(!(num2>0 && num2<=100)) {
				System.out.print("정수 하나 입력받기2: ");
				num2 = scanner.nextInt();
				continue;
			}
			if(!(oper=='+' || oper=='-' || oper=='/' || oper=='*')) {
				System.out.print("연산자 입력받기(+,-,*,/): "); 
				oper = scanner.next().charAt(0);
				continue;
			}
			else {
				break; // num1, num2, oper 의 답이 맞을 경우 나갈수 있게 만들기
			}
			
	
			
			
		}
				
		//처리
		// 평균값 처리
		double avg= num1/(double)num2;
		
		// 숫자 + 숫자 =  표현 만들기 처리
		res=""+num1+oper+num2+"=";
		
		// 답 만들기
		switch(oper) {
		case '+':res+=num1+num2; break;
		case '-':res+=num1-num2;  break;
		case '*':res+=num1*num2;  break;
		case '/':res+=String.format("%.2f", avg); break;
		}
		
		//출력
		System.out.println(res);
		
		/*
		 * 	클래스명 :  ForEx007
			출력내용 :  성적처리 프로그램입니다.
			
			1. 총점 구하기
			2. 평균 구하기
			3. 평균이 60점이상이고  각과목이 40점 미만이면 아니라면 합격/ 아니면 불합격
			4. 평균이 95점이상이면 장학생
			5. 평균이  90점이상이면 수, 80점이상이면 우, 70점이상이면 미, 60점이상이면 양, 아니라면 가 
			
			학번 입력 > std111
			국어점수 입력 > 100    ※ 0~100사이만입력받기
			수학점수 입력 > 100    ※ 0~100사이만입력받기
			영어점수 입력 > 99      ※ 0~100사이만입력받기
			
			============================================================== 
			학번   국어   영어   수학   총점   평균   합격여부   레벨   장학생
			============================================================== 
			std111   100   100   99   299   99.67   합격   수   장학생

		 * */
	
	}
}

