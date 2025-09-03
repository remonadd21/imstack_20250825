package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx001 {
	public static void main(String[] args) {
		
		/*
		
		형변환연습문제

		연습문제1)
		패키지명 : com.company.java003_ex
		클래스명 : CastingEx001
		출력내용 :  Scanner이용해서 나누기 프로그램만들기 
		   숫자입력1>  _입력받기  10   ( ☆자료형을 int )
		   숫자입력2>  _입력받기  3     ( ☆자료형을 int )              
		   
		   10 / 3 = 3.33
		
		   1단계)  변수 - 입력- 처리 - 출력
		   2단계)  정수/정수 = 정수
		              정수/실수 = 실수
		              실수/정수 = 실수
		              실수/실수 = 실수    
		      ※  형변환법 :    by = (byte) in;   나 잠깐만 byte할게.... 데이터 누수있을수 있음!
		*/
		
		//변수
		int num1, num2;
		double avg;
		
		//입력
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 10 입력받기: ");
		num1 = scanner.nextInt();
		
		System.out.print("숫자 3 입력받기: ");
		num2 = scanner.nextInt();
		
		
		//처리
		// 정수 / 정수 = 정수
		// 		 정수 / 실수 = 실수
		// avg = num1 / (double)num2;
		
		// 		 실수 / 정수 = 실수
		avg = (double)num1/num2;
		
		//출력
		System.out.println("double로 처리받은 값 : "+ String.format("%.2f",avg));
		// 중요: String.format("%.2f",avg) 는 소수점 자릿수를 얼마까지 할지 표현할 수 있다.
		//		String.format은 String 구조에서만 사용가능!
		
		avg = (float)num1/(float)num2; 
		System.out.println("float로 처리받은 값 : "+avg);
		
		/*
		 * CastingEx002_1  만들어서 풀기
		 * 
		 * 번외문제) 건강 점수 계산기 만들기
		당신은 건강 추적 애플리케이션의 초기 버전을 개발 중입니다. 
		사용자의 하루 활동 데이터를 입력받아 건강 점수를 계산하고, 
		평균 점수를 기반으로 건강 레벨을 출력하는 프로그램을 작성하세요.
		
		● 요구사항
		
		1. 사용자로부터 다음 세 가지 정보를 입력받습니다:
		   - 하루 걸음 수 (예: 7500)
		   - 운동 시간 (분 단위, 예: 45)
		   - 수면 시간 (시간 단위, 예: 7)
		
		2. 각 항목을 다음 기준으로 점수화합니다:
		   - 걸음 수: 1000걸음당 1점
		   - 운동 시간: 10분당 1점
		   - 수면 시간: 1시간당 2점
		
		3. 총점과 평균 점수를 계산합니다.
		   - 평균은 `double` 타입으로 계산하며 소수점 둘째 자리까지 출력합니다.
		
		4. 평균 점수를 기준으로 건강 레벨을 산정합니다:
		   - 건강 레벨 = 평균 점수를 `int`로 변환한 후 2로 나눈 값
		
		5. 다음 형식으로 결과를 출력합니다:
		::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
		:: HEALTH TRACKER ::
		::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
		걸음수   운동시간   수면시간   총점   평균   건강레벨
		7500   45      7      22   7.33   3
		
		● 조건
		
		- `Scanner` 클래스를 사용하여 입력을 처리할 것
		- `System.out.printf`를 사용하여 평균 점수를 소수점 둘째 자리까지 출력할 것
		- 형 변환을 적절히 사용할 것 (`(int)` 등)

		 * 
		 * 
		 * 
		 * */

		
	}
}
