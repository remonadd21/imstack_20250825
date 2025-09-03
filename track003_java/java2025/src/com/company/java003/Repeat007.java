package com.company.java003;

import java.util.Scanner;

public class Repeat007 {
	public static void main(String[] args) {
		
		// GIGO
		// 변수
		int kor, eng, mat, total;
		double avg;
		
		// 입력
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어점수를 입력하세요: ");
		kor = scanner.nextInt();
		
		System.out.print("영어점수를 입력하세요: ");
		eng = scanner.nextInt();
		
		System.out.print("수학점수를 입력하세요: ");
		mat = scanner.nextInt();
		
		// 처리
		total = kor+eng+mat;
		
		// 3.0으로 해도 되지만 기본형은 double 형변환 함
		avg = (double)total/3;
		
		// 출력
		System.out.println("국어점수: "+kor+"\n영어점수: "+eng+"\n수학점수: "+mat+"\n"
				+ "총점:"+total+"\n평균: "+avg);
		
	}
}
