package com.company.java008_ex;

import java.util.Scanner;

public class MethodEx007_test {
	
	

	/////////////////////////////////////////////////////////////
	public static void main(String[] args) {
	
	char ch='A';
		
	for(int j=0; j<2; j++) {
		for(int i=0; i<3; i++) {
			System.out.print((ch++)+"\t");
		}
		ch = 'a';
		System.out.println();
		
	}
	
	/*
	 * 	아래 틀린 것은?
	 *  int add (int x, int y){return x+y;}
		int add (byte a, byte b){return a+b;}
		int add (short a, short b){return a+b;}
		long add (int a ,int b){return a+b;}			<--- 오버로딩은 파라미터의 자료형이 같으면 안됨
		long add (long a, long b){return a+b;}
	 * */
	
	/////////////////////////////////////////////////////////////
	
	}// end main
}// end class


