package com.company.java004_ex;

import java.util.Scanner;

public class Repeat014_3 {
	public static void main(String[] args) {
		
		
		
		/*
			4. for, while, do while을 이용하여 1 2 3 4 5 출력 받기
	
		 */
		System.out.println("1. for 버전");
		for(int i=1; i<=5; i++) {
			System.out.print(i+"\t");
		}
		
		
		System.out.println("\n\n2. while 버전");
		
		int i=1; 
		while(i<=5) {
			System.out.print(i+"\t");
			i++;
		}
		
		
		
		System.out.println("\n\n3. do while 버전");
		
		int b=1; 
		do{
			System.out.print(b+"\t");
			b++;
		}while(b<=5);
		
		
	}
}
