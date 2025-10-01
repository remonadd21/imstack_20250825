package com.company.java013_ex;


interface Board {    void exec();  }

class BoardInsert implements Board{

	@Override
	public void exec() {
		System.out.println("글쓰기 기능");
	}
}
class BoardSelect implements Board{

	@Override
	public void exec() {
		System.out.println("글읽기 기능");
	}
}
class BoardUpdate implements Board{

	@Override
	public void exec() {
		System.out.println("글수정 기능");	
	}
}
class BoardDelete implements Board{

	@Override
	public void exec() {
		System.out.println("글삭제 기능");	
	}
}





public class Interface001_ex {

	public static void main(String[] args) {

      Board controller = null; 
      controller = new BoardInsert();  controller.exec();
      controller = new BoardSelect();  controller.exec();
      controller = new BoardUpdate();  controller.exec();
      controller = new BoardDelete();  controller.exec();
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
//  public static void main(String[] args) {
//      Board controller = null; 
//      controller = new BoardInsert();  controller.exec();
//      controller = new BoardSelect();  controller.exec();
//      controller = new BoardUpdate();  controller.exec();
//      controller = new BoardDelete();  controller.exec();
//  }
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
// public void run();
//} 
//class MotorCycle implements Vehicle {
// @Override
// public void run() {
//    System.out.println("오토바이가 달립니다.");
// }
//}
//class Car implements Vehicle {
// @Override
// public void run() {
//    System.out.println("자동차가 달립니다.");
// }
//}
//
//3. 메인화면
//public class Oop014_method_polymorphism {
// public static void main(String[] args) {
//    Driver driver = new Driver();
//    
//    Car car = new Car();
//    MotorCycle mo = new MotorCycle();
//    
//    driver.drive(car);
//    driver.drive(mo);
// }
//}
//
//4. 실행화면
//자동차가 달립니다.
//오토바이가 달립니다.

