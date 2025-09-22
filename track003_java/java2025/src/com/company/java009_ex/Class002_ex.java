package com.company.java009_ex;

import java.util.Scanner;

//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위 (멤버함수)




class MyPrice001{
	// 멤버변수 
	String name;  int price;
	//멤버함수 : 
	// 입력기능
	
//  상품이름 입력 >  apple
//  상품가격 입력 >  1500
//
//  상품정보입니다
//  상품이름 : apple  / 상품가격 : 1500
	
	
	
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("상품이름 입력: ");
		this.name = scanner.next();
		
		System.out.print("상품가격 입력: ");
		this.price = scanner.nextInt();
	};
	//출력해주는 기능
	void show() {
		System.out.println("상품이름: "+this.name+"\t 상품가격: "+this.price);
	}; 
}

////////////////////////////////////////////////////
public class Class002_ex {
	
	
	public static void main(String[] args) {
		 MyPrice001   p1 = new MyPrice001();
		 p1.input();
		 p1.show();
	}
}
////////////////////////////////////////////////////
/*
 * -------------------------------------------------
 * [method 정보] 
 * Student001.class , Class002_ex.class				클래스 (설계도)
 * -------------------------------------------------	객체(p1) 인스턴스(p1.name="apple" / p1.price= 15000)
 * [heap 동적]									|	[stack] 잠깐빌리기
													p1.input()
													p1.show()
	1번지 {name=null, price=0, input(), show()}		<- p1[1번지]
 
 * 												| 	main (public void main 호출 JVM)
 * 
 */


//연습문제2)  class
//패키지명 : com.company.java009_ex
//클래스명 :  ClassEx002
//class MyPrice001{
//  멤버변수 : String name;  int price;
//  멤버함수 : void input()  입력받는 기능 / void show()  출력해주는 기능
//}
//public class ClassEx002{
//   public static void main(String[] args) {
//        MyPrice001   p1 = new MyPrice001();
//        p1.input();
//        p1.show();
//   }
//}
//출력내용 : 
//  상품이름 입력 >  apple
//  상품가격 입력 >  1500
//
//  상품정보입니다
//  상품이름 : apple  / 상품가격 : 1500