package com.company.java005;

import java.util.Scanner;

public class Repeat002_For {
	public static void main(String[] args) {
		// 1. 무한반복 for(;;){}
		// 주의 : for(;;){ System.out.println("Hello");} 무한으로 반복됨 }
		// 무한 반복은 빠져 나갈 조건과 break 사용할 수 있음
		
		Scanner scanner = new Scanner(System.in);
		for(;;){ 
			System.out.print("숫자 1을 입력하세요: ");
			int a = scanner.nextInt();
			
			if(a==1) {break;}
		}
		
		
		// for-break
		System.out.println("step1) break; 3출력 되면 빠져나옴");
		for(int i=1; i<=10; i++) {
			if(i==3) {break;}
			System.out.print(i+"\t");
		}
		
		System.out.println("\n\nstep2) continue 3을 건너뛰고 연결해서 출력됨");
		// for-continue(해당값을 스킵함)
		for(int i=1; i<=10; i++) {
			if(i==3) {continue;}
			System.out.print(i+"\t");
		}
		
	}
}
