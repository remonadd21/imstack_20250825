package com.company.java011;

/*	상속: 클래스의 재사용 (실선 - 속이 빈 화살표 (extends))
 * 		Object						3) Object							4) }		
 * 		  ↑ 
 * 		Animal	  2) Animal()	{ name, age / eat(), sleep(), poo() )    5)  }
 * 	    ↑	↑	  1) Cat()      { animal_card / qukquk()
 *  Person   Cat  0) 1번지       { animal_card / qukquk() 					6) }
 * -----------------------------------------------------------
 * Cat brad = new Cat();
 * -----------------------------------------------------------
 * 1) Cat은 Animal이다.
 * 2)
 * 
 * */


class Animal{
	
	String name;
	int age;
	
	void eat		() { System.out.println("먹고");}
	void sleep	() {System.out.println("자고");}
	void poo		() {System.out.println("싸고");}
	
}
class Cat extends Animal{
	String animal_card;
	
	void qukquk() {System.out.println("이름:"+this.name+"꾹꾹이");}
}



public class Extends002 {

	public static void main(String[] args) {
	
		Cat brad = new Cat();
		brad.name="브래드";
		brad.age=22;
		brad.animal_card="ani-123";
		brad.eat();
		brad.sleep();
		brad.poo();
		brad.qukquk();
		
	}

}
//연습문제1)  멤버변수
//패키지명 : com.company.java011_ex
//클래스명 :   ExtendsEx001.java
//1. 아래 조건에 맞게 Extends002.java 파일을 작성하고, main() 메서드를 수정하여 다음과 같은 출력 결과가 나오도록 하시오.
//2. 주어진 코드 (수정 전)
//```java
//public class ExtendsEx001 {
//    public static void main(String[] args){
//        Green mygreen = new Green();
//        mygreen.name = "LIGHT_GREEN";
//        mygreen.num = 5;
//        mygreen.show();
//    }
//}
//```
//3.출력 결과 
//GREEN
//NAME : LIGHT_GREEN
//NUM : 5
//
//4. 클래스 구조 설명
// Color 클래스 : 멤버 변수:  name (String, public)  / num (int, private)
//  ↑
//Green 클래스  : 멤버 변수:  name (String, public), num (int, private)
// 
//
//5 요구사항
//1) Color와 Green 클래스의 상속 관계를 활용할 것
//2) main() 메서드에서 직접 name과 num에 값을 할당할 수 있도록 접근 제어자를 고려할 것
//3) show() 메서드를 통해 출력 형식을 맞출 것
