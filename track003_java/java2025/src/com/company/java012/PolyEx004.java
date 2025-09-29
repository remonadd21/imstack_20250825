package com.company.java012;

/*	쌈박한 상속도 그리기 
 * 
 * 	Object
 *	  ↑
 * 	Papa		(int money, void sing)
 * 
 * 	  ↑
 * 	 Son		(int money, void sing)
 * 
 * */


class Papa extends Object{  
	int money = 10000;     
	public Papa() { super(); }
	public void sing() {  System.out.println("GOD-거짓말");  }
}// end class
class Son extends Papa{ 
	int money = 1500;
	public Son() { super(); }
	@Override public void sing() {  System.out.println("빅뱅-거짓말"); }
} // end class



///////////////////////////////////////////////////////
public class PolyEx004 {
	public static void main(String[] args) {
		
		Papa mypapa = new Son();    
	    // Q3. Papa mypapa 의미?
	    // 업캐스팅으로 
	    // Papa의 int money 10000과 Son의 void sing을 가지고 있음 
	    

	    // Q4. 인스턴스화한 실제 메모리 빌려온그림
	    System.out.println(mypapa.money); // Q5.  출력   
	    mypapa.sing();  //Q6. 출력 
	     //Q7. mypapa.money 를 이용해서  1500 출력되게 해주세요.  
	  
	    System.out.println(((Son)mypapa).money);
	
	}	
		
	
}
////////////////////////////////////////////////////////

//연습문제4)  다형성
//패키지명 : com.company.java012_ex
//클래스명 : PolyEx004
//다음과 같이 코드를 작성하시오.
////Q1. 상속도 그리기
////Q2. 각클래스에서 사용할수있는 멤버변수/멤버메서드

//public class PolyEx001 {
// public static void main(String[] args) { 
//    Papa mypapa = new Son2();    
//    // Q3. Papa mypapa 의미?
//    // Q4. 인스턴스화한 실제 메모리 빌려온그림
//    System.out.println(mypapa.money); // Q5.  출력   
//    mypapa.sing();  //Q6. 출력 
//     //Q7. mypapa.money 를 이용해서  1500 출력되게 해주세요.  
// }
//}
//
//
//
//

//연습문제5)  다형성
//패키지명 : com.company.java012_ex
//클래스명 : PolyEx005
//다음과 같이 코드를 작성하시오.
//class Parent7  extends Object{
// int x = 100;
// public Parent7() { super(); }
// void method() { System.out.println("Parent Method"); }
//} 
//class Child7 extends Parent7 {
// int x = 200;
// public Child7() { super(); }
// @Override  void method() { System.out.println("Child Method"); }
//}
//public class PolyEx002 {
// public static void main(String[] args) {
//    Parent7 p = new Child7();     
//    // Q3.  Parent7 p   보장하는 범위   
//    // Q4. 인스턴스화 했을때 사용가능한 범위 : new Child7()  
//    
//                          Child7 c = new Child7();     
//    System.out.println("p.x = " + p.x);  // Q5. 출력되는 내용   
//    p.method();  // Q6. 출력되는 내용     
//    System.out.println("c.x = " + c.x);   // Q7. 출력되는 내용  
//    c.method();   // Q8. 출력되는 내용   
// }
//}

