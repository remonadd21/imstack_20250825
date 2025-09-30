package com.company.java012;

class Parent7  extends Object{
	int x = 100;
	public Parent7() { super(); }
	void method() { System.out.println("Parent Method"); }
} 
class Child7 extends Parent7 {
	int x = 200;
	public Child7() { super(); }
	@Override  void method() { System.out.println("Child Method"); }
	
	//추가
	void papaMethod() {super.method();}
}


////////////////////////////////////////////////////////
public class PolyEx005 {

	public static void main(String[] args) {

	  Parent7 p = new Child7();     
	  // Q3.  Parent7 p   보장하는 범위   
	  /*
	   * 업 캐스팅
	   * (x=100,-------)
	   * p = Child7(-----, method("Child Method"))
	   * 
	   * ==>   x=100, @method("Child Method")
	   * 
	   * */
	  
	  
	  
	  // Q4. 인스턴스화 했을때 사용가능한 범위 : new Child7()
	  /*		x=200, @method("Child Method");
	   * 
	   * */
	  
	  Child7 c = new Child7();     
	  System.out.println("p.x = " + p.x);  
	  p.method();  
	  // Q6. 출력되는 내용    
	  // x=100
	  // Child Method
	  System.out.println("c.x = " + c.x);   
	  // Q7. 출력되는 내용
	  // x=200
	  c.method();   // Q8. 출력되는 내용
	  //Child Method
	  // Q9. main에서 부모메서드 호출하기? - Parent Method
	  ((Parent7)p).method();	
	  // X 오버라이딩 된 메서드를 직접 호출하는건 불가능, 오버라이딩된 자식것만 호출됨
	  
	  // 추가
	  c.papaMethod();
	  // 추가 p에서 호출하기
	  	((Child7)p).papaMethod();
	}

}
//////////////////////////////////////////////////////////
//연습문제5)  다형성
//패키지명 : com.company.java012_ex
//클래스명 : PolyEx005
//다음과 같이 코드를 작성하시오.

//public class PolyEx002 {
//public static void main(String[] args) {
//  Parent7 p = new Child7();     
//  // Q3.  Parent7 p   보장하는 범위   
//  // Q4. 인스턴스화 했을때 사용가능한 범위 : new Child7()  
//  
//                        Child7 c = new Child7();     
//  System.out.println("p.x = " + p.x);  // Q5. 출력되는 내용   
//  p.method();  // Q6. 출력되는 내용     
//  System.out.println("c.x = " + c.x);   // Q7. 출력되는 내용  
//  c.method();   // Q8. 출력되는 내용   
//}
//}
