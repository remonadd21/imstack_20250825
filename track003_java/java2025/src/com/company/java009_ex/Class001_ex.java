package com.company.java009_ex;

//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위 (멤버함수)

class Student001{
	//멤버변수
	String name;  int no, kor, eng, math;
	
	
	
	//멤버변수
	void info() {
		System.out.println("이름: "+this.name+", no: "+this.no+
				", 국어: "+this.kor+", 영어: "+this.eng+", 수학:"+this.math+
				", 총점: "+(this.kor+this.eng+this.math)+", 평균: "+ 
				String.format("%.2f",(this.kor+this.eng+this.math)/3.0));
	};
}

////////////////////////////////////////////////////
public class Class001_ex {
	public static void main(String[] args) {
		Student001   s1 = new Student001();
		s1.name="first";  s1.no=11; s1.kor=100; s1.eng=100; s1.math=99;
		s1.info();
	}
}
////////////////////////////////////////////////////
/*
 * -------------------------------------------------
 * [method 정보] 
 * Student001.class , Class001_ex.class
 * -------------------------------------------------
 * [heap 동적]									|	[stack] 잠깐빌리기
													s1.info()
	1번지 {name=null, no=0,kor=0, eng=0, math=0}		<- s1[1번지]
	
	1번지 name, kor, eng,math에 접근하여 first, 100, 100, 99 입력해주기.
 * 
 * 
 * 												| 	main (public void main 호출 JVM)
 * 
 */

//연습문제1)  class
//패키지명 : com.company.java009_ex
//클래스명 :  ClassEx001
//class Student001{
//멤버변수 : String name;  int no, kor, eng, math;
//멤버함수 : void info()
//}
//
//public class ClassEx001{
// public static void main(String[] args) {
//    Student001   s1 = new Student003();
//   s1.name="first";  s1.no=11; s1.kor=100; s1.eng=100; s1.math=99;
//   s1.info();
// }
//}
//출력내용 : 
//이름: first
//총점 : 299
//평균 : 99.67



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