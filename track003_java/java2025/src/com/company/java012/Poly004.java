package com.company.java012;

/*
 * 		   Object           
		     ↑               
		   TestA4 (int a , toString)     
		     ↑               
		   TestB4 (int b , toString)  
 *
 */	
//
//class TestA4 extends Object{
//	int a=10;
//
//	@Override
//	public String toString() {
//		return "TestA4 [a=" + a + "]";
//	}
//	
//}
//
//class TestB4 extends TestA4{
//	int b=10;
//
//	@Override
//	public String toString() {
//		return "TestB4 [b=" + b + "]";
//	}
//	
//}


public class Poly004 {

	public static void main(String[] args) {
		
		TestA4 ta = new TestA4();
		// 1. (int a , toString)      = 1000번지 (int b , toString)    
		TestB4 tb = new TestB4();
		// 2. tb{int b, @ToString}  - {int a, ----------}
		//					= 2000번지 {int b, @ToString}  - {int a, ----------}
		// 아래 코드 오류가 생김
		// 3. tb {int b, @toString}- {int a, ----------}
		//						= 1000번지 {int a, toString}- {}
		// 현재 생성자를 통해서 처리한 적이 없음,
		// 부모에서 자녀를 담지만, 자녀에서 부모를 담는게 성립되기 어려움
		
		ta = new TestB4();//>>>  5) 부모에 자식을 담은 적이 있어야 한다.
						  // 자식에서 부모를 직접 담을때 타입캐스팅을 해도 오류가 생기는 이유는
						  // 부모가 자녀를 한번은 담은적이 있어야 하기 때문이다. (업케스팅 필요)
		
		tb = (TestB4) ta; // 4) 자식=부모 / 다운캐스팅 / 타입캐스팅 필요
		
		
		
		
		System.out.println(tb.a);
		
		
	}

}
