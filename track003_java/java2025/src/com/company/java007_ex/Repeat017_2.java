package com.company.java007_ex;

public class Repeat017_2 {
	public static void main(String[] args) {
		
		//변수
		char [][] ch = new char[2][3];
		char data='A';
		//입력
		//처리
		//출력
		
		for(int j=0; j<ch.length; j++) {
			for(int i=0; i<ch[j].length; i++) {
				ch[j][i] =data++;
				System.out.print(ch[j][i]+"\t");
			}
			data='B';
			System.out.println();
		}
		
	
		
		
				
		
		
	}
}
