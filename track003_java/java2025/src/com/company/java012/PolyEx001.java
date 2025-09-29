package com.company.java012;

	
/*	Q1. 상속도를 그리시오.
 * 
 * 		Object			
 * 		  ↑				  
 * 		TestA2	(int a, toString)		
 * 		  ↑	
 * 		TestB2	(int b, toString)		
 */
class TestA2 extends Object{ 
	
	int a=10;

	@Override
	public String toString() {
		return "TestA2 [a="+a+"]";
	} 
	
}

class TestB2 extends TestA2{ 
	
	int b=20; 
	
	@Override
	public String toString() {
		return "TestB2 [b="+b+"]";
	} 

}

/////////////////////////////////////////////////////
//public class PolyEx001 {
//	public static void main(String[] args) {
//		TestA2 ta = new TestB2();
//		
//		//Q2. 37번째 줄에서 TestA2 ta는 클래스의 무엇을 사용할 수 있을 까요? 코드의 의미
//		// (int a, toString)	 - TestB2	(int b, toString)
//		
//		
//		//Q3. 37번째 줄에서 TestB2()는 클래스의 무엇을 사용할 수 있을 까요?
//		// 1번지의 (int b, toString)
//		
//		
//		System.out.println(ta); // Q4. 출력내용과 이유? TestA2 vs TestB2
//		// 현재 자료형이자 클래스인 부모 TestA2를 통해 ta를 사용하고 있고, heap 공간의 TestB2를 담고 있기 때문에
//		// TestB2의 지번에 있는 toString 값을 보여주고 있다.
//		
//		System.out.println(ta.a); // Q5. 사용가능?
//		// 자신의 클래스이자 자료형은 TestA2를 사용하고 있기 때문에 값인 10에 접근이 가능하다.
//		
//		//System.out.println(ta.b); // Q6. 사용가능?
//		// 자녀요소의 값이 아닌 지번, 즉! new TestB2()에 접근하고 있어서 값보다는 지번을 통한 접근이 가능하다.
//
//	}
//
//}
/////////////////////////////////////////////////////
/*
 * 
 * 연습문제1)
package com.company.java012_ex;
 
//Q1. 상속도를 그리시오. 
class TestA2 extends Object{  
   int a=10;
   @Override public String toString() { return "TestA2 [a=" + a + "]"; }    
}
class TestB2 extends TestA2{
   int b=10;
   @Override public String toString() { return "TestB2 [b=" + b + "]"; }   
}
/////////////////////////////////////////////////
public class PolyEx001 {
   public static void main(String[] args) {
      TestA2  ta = new TestB2();
      //Q2. 15번째줄에서   TestA2  ta 는 클래스의 무엇을 사용할수 있을까요? 코드의 의미
      //Q3. 15번째줄에서   TestB2() 는 클래스의 무엇을 사용할 수 있을까요?
      
      System.out.println(ta); // Q4. 출력내용과 이유?   TestA2  vs  TestB2
      System.out.println(ta.a); //Q5.사용가능?
      //System.out.println(ta.b); //Q6.사용가능?
   }
}
/////////////////////////////////////////////////

연습문제2)
패키지명 : com.company.java012_ex
클래스명 :  PolyEx002

//Q1. 상속도를 그리시오. 
class TestA3  extends Object{  
   int a=10;
   @Override public String toString() { return "TestA3 [a=" + a + "]"; }
}
class TestB3  extends TestA3{  
   int b=10;
   @Override public String toString() { return "TestB3 [b=" + b + "]"; }
} 
/////////////////////////////////////////////////
public class PolyEx002 {
   public static void main(String[] args) {
      TestB3  tb =  (TestB3) new TestA3();
      //Q2. 15번째줄에서   TestB3  tb는 클래스의 무엇을 사용할수 있을까요? 코드의 의미
      //Q3. 15번째줄에서   T(TestB3) new TestA3() 클래스의 무엇을 사용할 수 있을까요?
      //Q4. 코드상에서는 문제가 없는데 코드를 실행하면 오류가 나는 이유는?
   }
}


연습문제3)
패키지명 : com.company.java012_ex
클래스명 :  PolyEx003


//Q1. 상속도를 그리시오. 
class TestA4  extends Object{  
   int a=10;
   @Override public String toString() { return "TestA4 [a=" + a + "]"; }
}
class TestB4  extends TestA4{  
   int b=20;
   @Override public String toString() { return "TestB4 [b=" + b + "]"; }
}
/////////////////////////////////////////////////
public class PolyEx003 {
   public static void main(String[] args) {
      TestA4  ta = new TestA4();
      //Q2. TestA4  ta 사용할수 있는범위는?
      //Q3. new TestA4() 는  heap area 에서 호출되는 생성자의 순서와 객체가 만들어지는 순서는?
      TestB4  tb = new TestB4();  
      //Q4. TestB4  tb 사용할수 있는범위는?
      //Q5. new TestB4() 는  heap area 에서 호출되는 생성자의 순서와 객체가 만들어지는 순서는?
      ta = new TestB4();
      //Q6. ta가 사용할수 있는 보장하는 변수와 메서드는?
      //Q7.ta = new TestB4(); 에서 new TestB4() 에서 사용할수 있는 범위는? 
      tb         = (TestB4) ta;   
      //Q8. tb         = (TestB4) ta;   에서 tb가 사용할수 있는 범위는?
      //Q9. 컴피일러시  tb         = (TestB4) ta;  오류가 안나는 이유는?
      
      System.out.println(tb);  //Q10. 출력내용과 그이유는? TestA4  vs  TestB4
      System.out.println(tb.b);//Q11. 출력내용?
      System.out.println(tb.a);//Q12. 출력내용?
      
   }
}
 * 
 * 
 * 
 * */
 