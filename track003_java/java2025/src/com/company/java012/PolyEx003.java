package com.company.java012;

////Q1. 상속도를 그리시오. 
/*
 * 
 * 		Object
 * 		  ↑
 * 		TestA4	(int a, toString)
 * 
 * 		  ↑
 * 		TestB4	(int b, toString)

 * */


class TestA4  extends Object{  
	int a=10;
	@Override public String toString() { return "TestA4 [a=" + a + "]"; }
}
class TestB4  extends TestA4{  
	int b=20;
	@Override public String toString() { return "TestB4 [b=" + b + "]"; }
}



public class PolyEx003 {

	public static void main(String[] args) {
	    TestA4  ta = new TestA4();
	    //Q2. TestA4  ta 사용할수 있는범위는?
	    // 부모인 A4가 자신 스스로의 heap area를 사용하고 있기 때문에 
	    // (int a , toString) 사용가능
	    
	    //Q3. new TestA4() 는  heap area 에서 호출되는 생성자의 순서와 객체가 만들어지는 순서는?
	    /*
	     * 생성자 : Test4() -> Object();
	     * 객체생성 : Object -> Test4();
	     * */
	    
	    TestB4  tb = new TestB4();  
	    
	    
	    //Q4. TestB4  tb 사용할수 있는범위는?
	    // TestB4가 자신 스스로의 heap area를 사용하고 있기 때문에 
	    // (int b, toString) 사용가능 
	    
	    //Q5. new TestB4() 는  heap area 에서 호출되는 생성자의 순서와 객체가 만들어지는 순서는?
	    // 생성자 : TestB4-> TestA4-> Object
	    // 객체생성 : Object -> TestA4 -> TestB4
	    ta = new TestB4();	    
	    
	    //Q6. ta가 사용할수 있는 보장하는 변수와 메서드는?
	    // 부모에서 자녀를 담았지만 타입 캐스팅이 없으므로 ta.a,  ta.toString(자녀의 주소)접근가능
	    // 자녀의 heap area를 담고 있기 때문에 toString  TestA4 로 작성되어 있어도 자녀가 호출된다.
	    
	    // 선생님 설명::
	    // 생성자는 아래서 위로 생성 123 객체는 456 위에서 아래로 생성
	    // 3			4
	    // 2			5
	    // 1			6
	    // 부모가 자녀를 담은 업 캐스팅
	    // 부모의 값을 가져오고, 자녀의 주소를 가져온다.
	    
	    //Q7.ta = new TestB4(); 에서 new TestB4() 에서 사용할수 있는 범위는? 
	    // 자녀요소의 타입캐스팅이 부모 요소 앞에 적용되어 있기 때문에 
	    // tb.a, tb.b, tb.toString(TestB4) 사용가능
	    tb         = (TestB4) ta;   
	    
	   
	    //Q8. tb         = (TestB4) ta;   에서 tb가 사용할수 있는 범위는?
	    // 자녀에서 부모를 사용하도록 타입캐스팅이 되어 있음
	    // 자녀의 tb.b, tb.toString, tb.a 호출가능
	    
	    
	    //Q9. 컴피일러시  tb         = (TestB4) ta;  오류가 안나는 이유는?
	    
	    System.out.println(tb);  
	    //Q10. 출력내용과 그이유는? TestA4  vs  TestB4
	    // 부모에서 자녀를 담은 적이 있고, 부모앞에 타입 캐스팅이 되어 있기 때문에
	    // ta는 자녀 tb의 heap area를 담고 있음
	    // ta는 리턴값 자녀의 toString 호출가능 TestB4
	    
	    System.out.println(tb.b);//Q11. 출력내용?
	    // int b=20의 20
	    System.out.println(tb.a);//Q12. 출력내용?
	    // int a=10의 10
	}

}
//연습문제3)
//패키지명 : com.company.java012_ex
//클래스명 :  PolyEx003
//
//

///////////////////////////////////////////////////
//public class PolyEx003 {
// public static void main(String[] args) {
//    TestA4  ta = new TestA4();
//    //Q2. TestA4  ta 사용할수 있는범위는?
//    //Q3. new TestA4() 는  heap area 에서 호출되는 생성자의 순서와 객체가 만들어지는 순서는?
//    TestB4  tb = new TestB4();  
//    //Q4. TestB4  tb 사용할수 있는범위는?
//    //Q5. new TestB4() 는  heap area 에서 호출되는 생성자의 순서와 객체가 만들어지는 순서는?
//    ta = new TestB4();
//    //Q6. ta가 사용할수 있는 보장하는 변수와 메서드는?
//    //Q7.ta = new TestB4(); 에서 new TestB4() 에서 사용할수 있는 범위는? 
//    tb         = (TestB4) ta;   
//    //Q8. tb         = (TestB4) ta;   에서 tb가 사용할수 있는 범위는?
//    //Q9. 컴피일러시  tb         = (TestB4) ta;  오류가 안나는 이유는?
//    
//    System.out.println(tb);  //Q10. 출력내용과 그이유는? TestA4  vs  TestB4
//    System.out.println(tb.b);//Q11. 출력내용?
//    System.out.println(tb.a);//Q12. 출력내용?
//    
// }
//}
/////////////////////////////////////////////////////////////////////////////



//연습문제4)  다형성
//패키지명 : com.company.java012_ex
//클래스명 : PolyEx004
//다음과 같이 코드를 작성하시오.
//// Q1. 상속도 그리기
//// Q2. 각클래스에서 사용할수있는 멤버변수/멤버메서드
//class Papa extends Object{  
//   int money = 10000;     
//   public Papa() { super(); }
//   public void sing() {  System.out.println("GOD-거짓말");  }
//}// end class
//class Son extends Papa{ 
//   int money = 1500;
//   public Son() { super(); }
//   @Override public void sing() {  System.out.println("빅뱅-거짓말"); }
//} // end class
//public class PolyEx001 {
//   public static void main(String[] args) { 
//      Papa mypapa = new Son2();    
//      // Q3. Papa mypapa 의미?
//      // Q4. 인스턴스화한 실제 메모리 빌려온그림
//      System.out.println(mypapa.money); // Q5.  출력   
//      mypapa.sing();  //Q6. 출력 
//       //Q7. mypapa.money 를 이용해서  1500 출력되게 해주세요.  
//   }
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
//   int x = 100;
//   public Parent7() { super(); }
//   void method() { System.out.println("Parent Method"); }
//} 
//class Child7 extends Parent7 {
//   int x = 200;
//   public Child7() { super(); }
//   @Override  void method() { System.out.println("Child Method"); }
//}
//public class PolyEx002 {
//   public static void main(String[] args) {
//      Parent7 p = new Child7();     
//      // Q3.  Parent7 p   보장하는 범위   
//      // Q4. 인스턴스화 했을때 사용가능한 범위 : new Child7()  
//      
//                            Child7 c = new Child7();     
//      System.out.println("p.x = " + p.x);  // Q5. 출력되는 내용   
//      p.method();  // Q6. 출력되는 내용     
//      System.out.println("c.x = " + c.x);   // Q7. 출력되는 내용  
//      c.method();   // Q8. 출력되는 내용   
//   }
//}

