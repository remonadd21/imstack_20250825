package com.company.java009;

// 1. 클래스는 부품객체
// 2. 클래스는 상태(멤버변수)와 행위(멤버함수)
/*
 	Object							2) Object{ 				} 3) object 가 오출되면 닫음
 	   ↑
 	Product(name=null, price=0)		1) Product(){ super();가 2번 obejct 호출  		} 
 									4) Product p1 = new Product()
 
 */

class Product extends Object{
	String name;
	int price;
	public Product() { super(); }
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
}



////////////////////////////////////////////////////
public class Class004 {
	public static void main(String[] args) {  // jvm - main 구동시점
		Product p1 = new Product();	// 1) 공간빌리고 객체생성, 2)생성자 호출, 3)p1주소
		System.out.println(p1);
		
		
		Product p2 = new Product("applle",2000);
		System.out.println("이름: "+p2.name);
		System.out.println("가격: "+p2.price);
	}

}
////////////////////////////////////////////////////
/* [runtime data area]
----------------------------------------------------
[method : 클래스정보, static , final:공용정보] Product.class, Class004.class

----------------------------------------------------
[heap : 동적]					|		[stack: (잠깐 빌리기)]	Product p1 = new Product();
				Object();
1번지{name=null, price=0}		<-	p1[1번지]					
							|		main
----------------------------------------------------
*/

/*
 * 연습문제3)  class
패키지명 : com.company.java009_ex
클래스명 :  ClassEx003
-- 생성자 작성하시오.
class Coffee{
  멤버변수 : String name;  int  price, num;
  멤버함수 : void show(){}   //커피정보출력
}
public class Class003 {
   public static void main(String[] args) {
   Coffee a1 = new Coffee("까페라떼" ,2 , 4000);  a1.show();
   Coffeea2 = new Coffee();                            a2.show();
  }
}
출력내용 :
=====커피
커피명 : 까페라떼
커피잔수 : 2 
커피가격 : 8000
=====커피
커피명 : 아메리카노
커피잔수 : 1
커피가격 : 2000




연습문제4)  class
패키지명 : com.company.java009_ex
클래스명 :  ClassEx004
-- 생성자 작성하시오.
class TV{
//상태-멤버변수  : 채널/볼륨 String channel; int volume;   
//행위-멤버함수  : 채널, 볼륨 입력: input() / 출력 : show()
}
public class ClassEx004 {
    public static void main(String[] args) {
   TV  t1 = new TV("JDBC" , 8);
   t1.show(); 
   TV  t2 = new TV();
   t2.input();  
   t2.show();
   }
}
출력내용 :
JDBC   8

* channel입력>youtube
* volume 입력>10
youtube   10
 



연습문제5)  class
패키지명 : com.company.java009_ex
클래스명 :  ClassEx005
-- 생성자 작성하시오.
class Card{
   //상태-멤버변수  : 채널/볼륨 int cardNum; boolean  isMembership;   
   //행위-멤버함수  : 채널, 볼륨 입력: input() / 출력 : show()
}
public class ClassEx005{
   public static void main(String[] args) {
   Card  c1= new Card(); 
   System.out.println(c1);  
   }
}

출력내용 :
Card[cardNum=0, isMembership=false]

 


연습문제6)  class
패키지명 : com.company.java009_ex
클래스명 :  ClassEx006
-- 생성자 작성하시오.
class Score{
   //상태-멤버변수  :  String stdid; int kor,eng,math,total,avg;   
   //행위-멤버함수  :  void total() 총점구해주기
   //               void avg()  평균구하기
   //                      void info()   학생정보출력  ※힌트2)  info(){    total();  avg();     }  다른메서드에서 메서드 사용가능  
   //※ 힌트1) 생성자 :   Score() / Score(stdid, kor, eng, math)
}
public class ClassEx006{
   public static void main(String[] args) {
   Score  s1= new Score("std1234" , 100, 100 , 99 ); 
   s1.info();
   }
}

출력내용 :
학번   kor   eng   math   total   avg
std1234   100   100   99   299   99.67

 

연습문제7)  class
패키지명 : com.company.java009_ex
클래스명 :  ClassEx007
-- 생성자 작성하시오.
class Calc{
   //상태-멤버변수  :  int num1, num2;  char op;  double result;
   //행위-멤버함수  :  void input()   입력받기
   //               void opcalc() +더하기계산, -라면 -계산  , *라면 *계산 , /라면 /계산 
   //                      void show()    연산출력   
}
public class ClassEx007{
   public static void main(String[] args) {
   Calc  c1= new Calc(10,3,'+');  
   c1.show();
   
   Calc  c2= new Calc();  
   c2.input();   
   c2.show(); 
    
   }
}

출력내용)
10+3=3

숫자1> 10
숫자2> 3
연산자> /
10/3=3.33
 * 
 * 
 * */
