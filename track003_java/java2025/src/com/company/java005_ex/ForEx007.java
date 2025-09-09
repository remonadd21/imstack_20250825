package com.company.java005_ex;

import java.util.Scanner;

public class ForEx007 {
	public static void main(String[] args) {
		
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
		
		
		//변수
			int kor=-1, eng=-1, math=-1, total=0;
			double avg;
			String hak="",pass="",elite="",level="";
			
		//입력
			Scanner scanner = new Scanner(System.in);
			System.out.print("학번 입력> ");
			hak = scanner.next().toString();
		
			
		// 참일때 반복
		// if 버전일때는 continue가 있으면 범위 안의 숫자인지 if로 올라가서 다시 확인함
		// else if 버전 일때는 continue 필요없음
		for(;;) {
			
			if(!(kor>=0 && kor<=100)) {
				System.out.print("국어점수 입력> ");
				kor = scanner.nextInt();
				/* continue; */
			}
			
			else if(!(eng>=0 && eng<=100)) {
				System.out.print("영어점수 입력> ");
				eng = scanner.nextInt();
				/* continue; */
			}
			
			else if(!(math>=0 && math<=100)) {
				System.out.print("수학점수 입력> ");
				math = scanner.nextInt();
				/* continue; */
			}
			else { break; }
			
		}
		//처리
			total = kor+eng+math;
			avg = total/(double)3;
			
		//pass 처리
			pass = (avg<60)?"불합격":(kor>=40 && eng>=40 && math>=40)?"합격":"";
			
		//장학생 처리
			elite = (avg>=95)?"장학생":"일반";
			
		//레벨 처리
			level = (avg>=90)?"수":(avg>=80)?"우":(avg>=70)?"미":(avg>=60)?"양":"가";
			
		//출력
		System.out.println("===================================================================================");
		System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\n"
				,"학번","국어","영어","수학","총점","평균","합격여부","레벨","장학생");
		System.out.println("===================================================================================");
		System.out.printf("%-5s\t%-5d\t%-5d\t%-5d\t%-5d\t%.2f\t%-5s\t%-5s\t%-5s\n"
				,hak,kor,eng,math,total,avg,pass,level,elite);
		
	}
}
