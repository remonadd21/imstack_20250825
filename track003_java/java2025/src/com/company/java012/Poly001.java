package com.company.java012;

// 1. 클래스는 부품객체
// 2. 클래스는 상태와 행위를 가진다.
/*
 * 		Object			Object
 * 		  ↑				  ↑
 * 		TestA			TestB
 * 		(int a)			(int b)
 * 		110v, 일자나사		220v, 플러스나사
 * 		같아 보이지만 다른 종류의 자료형이자 클래스
 */
class TestA1 extends Object{ int a; }

class TestB1 extends Object{ int B; }


///////////////////////////////////////////////////
public class Poly001 {
	public static void main(String[] args) {
		TestA1 ta1 = new TestA1();
		
		// TestB1 tb1 = ta1;
		// ↑ 오류나는 이유는?
		// 클래스도 자료형의 한 종류 (틀 - object)
		// TestA1과 TestB1은 다른 클래스이자 다른 자료형!
		
		
		
	}

}
///////////////////////////////////////////////////
