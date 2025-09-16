package com.company.java008;

public class Method002 {
	//(1) 마법상자
	// public static 리턴값  method명( parameter 재료값){ }
	public static void myint(int a) {
		System.out.println(a);
	}
	
	public static void ten(int money) {System.out.println(money *10);}
	
	public static void add(int money, int bitcoin) {System.out.println( money + bitcoin);}
	
	///////////////////////////////////////////
	public static void main(String[] args) {
		//(2) 사용
	// public static 리턴값  method명( parameter 재료값){ }
							myint(1);
							myint(2);
							
	// public static void ten(int money) {System.out.println(money *10);}
							ten(1000);
							ten(10);
							
	// public static void add(int money, int bitcoin) {System.out.println( money + bitcoin);}
								add(1000, 50);
								add(100, 200);
	}// end main
	///////////////////////////////////////////

}
