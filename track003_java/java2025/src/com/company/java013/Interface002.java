package com.company.java013;

/*
	1. 클래스는 기본적으로 단일 상속

	Papa2{brain}		Mama2{Brain}
			↑		↑
   			  son()
*/

class Papa2{int brain;}
class Mama2{int brain;}


//2. 인터페이스는 다중상속이 가능하다.
/*			{inter()}					{method()}				{method()}
 * <<interface>> Inter20		<<interface>>Inter21		<<interface>>Inter22
 * 											↑			↑		(실선 + 속이 빈 화살표)
 * 										 <<interface>>Inter23
 * 
 * 				⋯⋯⋯△										⋯⋯⋯△
 * 	<<class>>Papa2
 * 			↑	
 * 			Using1		extends PaPa2		implements Inter23, Inter20
 * 				- {@method()}
 * 				- {@inter()}
 */
interface Inter20{void inter();}
interface Inter21{void method();}
interface Inter22{void method();}
interface Inter23 extends Inter21, Inter22{ }

//3. 많이 사용되는 형식	주요 메인 클래스상속, 	추가설계1, 추가설계2
class  Using1 extends Papa2 implements Inter23, Inter20{

	@Override public void method() {  }
	@Override public void inter() {  }
	
}


public class Interface002 {
	public static void main(String[] args) {
		
		// Inter23 my = new Inter23();
		Using1 my = new Using1();
		//  instanceof  클래스확인, 상속확인 (내 부모? 족보확인)
		
		if(my instanceof Object) {System.out.println("1. Object");}
		if(my instanceof Papa2) {System.out.println("2. Papa");}
		//if(my instanceof Mama2) {System.out.println("3. Mama");}
		//관계가 없다는 뜻 Incompatible conditional operand types Using1 and Mama2
		if(my instanceof Inter20) {System.out.println("4. Inter20");}
		if(my instanceof Inter23) {System.out.println("5. method");}
		

	}

}


//연습문제1) 게시판 기능을 인터페이스로 구현하기
//패키지명 :  package com.company.java013_ex;
//클래스명 :  public class InterfaceEx001
//
//1. 문제 설명
//다음은 게시판 기능을 인터페이스로 추상화한 프로그램이다. 
//Board 인터페이스는 게시판 기능의 공통 동작을 정의하며, 
//BoardInsert, BoardSelect, BoardUpdate, BoardDelete 클래스는 이를 구현하여 각각의 기능을 수행한다.
//
//2. 주어진 조건
//
//interface Board {    void exec();  }
//
//구현 클래스들
//BoardInsert: 글쓰기 기능
//BoardSelect: 글읽기 기능
//BoardUpdate: 글수정 기능
//BoardDelete: 글삭제 기능
//- 각 클래스는 exec() 메서드를 오버라이딩하여 해당 기능을 출력한다.
//
//3. 메인 클래스 작성 
//```
//public class InterfaceEx002 {
//    public static void main(String[] args) {
//        Board controller = null; 
//        controller = new BoardInsert();  controller.exec();
//        controller = new BoardSelect();  controller.exec();
//        controller = new BoardUpdate();  controller.exec();
//        controller = new BoardDelete();  controller.exec();
//    }
//}
//```
//4.  실행 결과
//코드
//글쓰기
//글읽기
//글수정
//글삭제
//
//
//연습문제2)  
//패키지명 :  package com.company.java013_ex;
//클래스명 :  public class InterfaceEx002
//
//1. Driver 클래스를 작성하시오.  
//2. 주어진조건
//interface Vehicle {
//   public void run();
//} 
//class MotorCycle implements Vehicle {
//   @Override
//   public void run() {
//      System.out.println("오토바이가 달립니다.");
//   }
//}
//class Car implements Vehicle {
//   @Override
//   public void run() {
//      System.out.println("자동차가 달립니다.");
//   }
//}
//
//3. 메인화면
//public class Oop014_method_polymorphism {
//   public static void main(String[] args) {
//      Driver driver = new Driver();
//      
//      Car car = new Car();
//      MotorCycle mo = new MotorCycle();
//      
//      driver.drive(car);
//      driver.drive(mo);
//   }
//}
//
//4. 실행화면
//자동차가 달립니다.
//오토바이가 달립니다.

