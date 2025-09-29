package com.company.java012;

/*
 * 		   Object           
		     ↑               
		   TestA3 (int a , toString)     
		     ↑               
		   TestB3 (int b , toString)  
 *
 */	
//class TestA3 extends Object{
//	int a=10;
//
//	@Override
//	public String toString() {
//		return "TestA3 [a=" + a + "]";
//	}
//	
//}
//
//class TestB3 extends TestA3{
//	int b=10;
//
//	@Override
//	public String toString() {
//		return "TestB3 [b=" + b + "]";
//	}
//	
//}

public class Poly003 {
	public static void main(String[] args) {
		
		// 자식 = 부모		다운캐스팅
		// 아래 코드의 오류는 없어 보이나 오류가 생김
		TestB3 tb = (TestB3) new TestA3();
		//1. TestB3 tb 사용범위 : TestB3 (int b, toString) - TestA3 (int a, toString)
		//2. TestA3()은 {int a, toString}만 처리가능
		
	}

}
