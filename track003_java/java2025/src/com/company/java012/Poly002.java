package com.company.java012;

// 1. 클래스는 부품객체
// 2. 클래스는 상태와 행위를 가진다.
// 3. 상속은 재활용
/*
 * 		Object			
 * 		  ↑				  
 * 		TestA2	(int a, toString)		110v
 * 		  ↑	
 * 		TestB2	(int b, toString)		220v
 */
//class TestA2 extends Object{ 
//	
//	int a=10;
//
//	@Override
//	public String toString() {
//		return "TestA2 [a="+a+"]";
//	} 
//	
//}
//
//class TestB2 extends TestA2{ 
//	
//	int b=20; 
//	
//	@Override
//	public String toString() {
//		return "TestB2 [b="+b+"]";
//	} 
//
//}


///////////////////////////////////////////////////
public class Poly002 {
	public static void main(String[] args) {
		
		// 부모 = 자식			업케스팅
		TestA2 ta = new TestB2();
		// 0. 값은 자료형의 것을 사용하고, 지번은 heap 공간의 것을 사용중
		// 1. 자료형이자 클래서인 TestA2 ta를 사용하겠다. (int a, toString)
		// 2. 단! 지번.. heap 공간의 주소의 값 TestB2의 b=20을 사용하겠다.
		//		1번지 TestB2(int b, toString) -> TestA2(int a, toString) -> Object(){}
		// 	ta[1번지] = 1번지(int b=20, toString) - (int a=10, toString)
		
		
		System.out.println(ta);			// 기본은 자녀의 지번 값을 가져옴
		System.out.println(ta.a);		// 부모값도 가져올 수 있음
		System.out.println(((TestB2)ta).b); // 자식의 값을 보여주려면, 자식의 자료형으로 형변환!
	}

}
///////////////////////////////////////////////////
