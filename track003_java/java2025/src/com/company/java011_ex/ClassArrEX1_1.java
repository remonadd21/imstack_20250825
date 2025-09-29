package com.company.java011_ex;

public class ClassArrEX1_1 {
	public static void main(String[] args) {
		
		Apple[] apples = new Apple[3];
		
		apples[0] = new Apple("Red", "iron", 2, 1000);
		apples[1] = new Apple("Green", "hulk", 1, 1500);
		apples[2] = new Apple("Red", "captain", 3, 2000);
		
//		기본 for문
//		for(int i=0; i<apples.length; i++) {
//			System.out.println(apples[ i ]+"\t");
//		}
		
//		향상된 for문
		for(Apple a:apples) {
			System.out.println(a+"\t");
		}
		
	}
}
