package com.company.java007_ex;

public class Re04_array_test {
	public static void main(String[] args) {
		
		//변수
		char [] abc = {'a','b','c'};
		char [] ch = new char[3];
		
		// 입력, 처리, 출력
		for(int i=0; i<abc.length; i++) {
			ch[i] = abc[i];
			System.out.print( (ch[i]=='a'?"":",")+ch[i]);
			
		}
		
		
		
		
	}// end main
}// end class
