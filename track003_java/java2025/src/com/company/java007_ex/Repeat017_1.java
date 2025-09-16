package com.company.java007_ex;

public class Repeat017_1 {
	public static void main(String[] args) {
		
		//변수
		int [][] num = new int[2][3];
		int data=100;
		//입력
		//처리
		//출력
		
		for(int j=0; j<num.length; j++) {
			for(int i=0; i<num[j].length; i++) {
				num[j][i]=++data;
				System.out.print(num[j][i]+"\t");
			}
			System.out.println();
		}
				
				
		
		
	}
}
