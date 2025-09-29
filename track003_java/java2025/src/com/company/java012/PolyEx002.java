package com.company.java012;

////Q1. 상속도를 그리시오. 
/*
 *  *   Object			
 * 		  ↑				  
 * 		TestA3	(int a, toString)		
 * 		  ↑	
 * 		TestB3	(int b, toString)		
 * 
 * 
 * 
 * 
 */
class TestA3  extends Object{  
	int a=10;
	@Override public String toString() { return "TestA3 [a=" + a + "]"; }
}
class TestB3  extends TestA3{  
	int b=10;
	@Override public String toString() { return "TestB3 [b=" + b + "]"; }
} 



public class PolyEx002 {

	public static void main(String[] args) {
      TestB3  tb =  (TestB3) new TestA3();
      //Q2. 15번째줄에서   TestB3  tb는 클래스의 무엇을 사용할수 있을까요? 코드의 의미
      // 자료형이자 클래스는 자녀가 부모를 잡고 있으므로 보이는데로 보자면..
      // TestB3 (int b, toString)을 사용할 수 있고, 
      // 부모인 TestA3()에 타입캐스팅까지 되어 있어서 부모에도 접근이 가능하여
      // TestA3	(int a, toString) 사용할 수 있음
      
      //Q3. 15번째줄에서   T(TestB3) new TestA3() 클래스의 무엇을 사용할 수 있을까요?
      // TestB3{b=10, toString} - TestA3{a=10}
      
      
      
      //Q4. 코드상에서는 문제가 없는데 코드를 실행하면 오류가 나는 이유는?
      // 부모에서 자녀생성자 , heap area에 접근한 적이 없음
      // b=10의 값을 가져올 수가 없음
      // 즉! 부모에서 자녀를 이용할 수 없기 때문에 한번이라도 부모가 자녀를 이용할 수 있어야 함!
      

	}

}
//연습문제2)
//패키지명 : com.company.java012_ex
//클래스명 :  PolyEx002
//

///////////////////////////////////////////////////
//public class PolyEx002 {
//   public static void main(String[] args) {

//   }
//}
//
//
//연습문제3)
//패키지명 : com.company.java012_ex
//클래스명 :  PolyEx003
//
//
////Q1. 상속도를 그리시오. 
//class TestA4  extends Object{  
//   int a=10;
//   @Override public String toString() { return "TestA4 [a=" + a + "]"; }
//}
//class TestB4  extends TestA4{  
//   int b=20;
//   @Override public String toString() { return "TestB4 [b=" + b + "]"; }
//}
///////////////////////////////////////////////////
//public class PolyEx003 {
//   public static void main(String[] args) {
//      TestA4  ta = new TestA4();
//      //Q2. TestA4  ta 사용할수 있는범위는?
//      //Q3. new TestA4() 는  heap area 에서 호출되는 생성자의 순서와 객체가 만들어지는 순서는?
//      TestB4  tb = new TestB4();  
//      //Q4. TestB4  tb 사용할수 있는범위는?
//      //Q5. new TestB4() 는  heap area 에서 호출되는 생성자의 순서와 객체가 만들어지는 순서는?
//      ta = new TestB4();
//      //Q6. ta가 사용할수 있는 보장하는 변수와 메서드는?
//      //Q7.ta = new TestB4(); 에서 new TestB4() 에서 사용할수 있는 범위는? 
//      tb         = (TestB4) ta;   
//      //Q8. tb         = (TestB4) ta;   에서 tb가 사용할수 있는 범위는?
//      //Q9. 컴피일러시  tb         = (TestB4) ta;  오류가 안나는 이유는?
//      
//      System.out.println(tb);  //Q10. 출력내용과 그이유는? TestA4  vs  TestB4
//      System.out.println(tb.b);//Q11. 출력내용?
//      System.out.println(tb.a);//Q12. 출력내용?
//      
//   }
//}