package com.company.java009;


//1. 클래스는 부품객체
//2. 클래스는 속성(멤버변수)과 행위(멤버함수)

class Animal002{
	// 속성 - 멤버변수
	String name;
	int age;
	// 행위 - 멤버함수
	void show(){
		System.out.println(this.name +"\t"+ this.age);
	}
}

////////////////////////////////////////////////////
public class Class002 {
	public static void main(String[] args) {  
		Animal002 a1 = new Animal002();
		// 1. new(1번지, 객체생성), 2. Animal002() 초기화 ,  3. a1 주소 =1번지
		a1.name="별이";
		a1.age=3;
		a1.show();
		
		Animal002 a2 = new Animal002();
		a2.name="뭉이";
		a2.age=7;
		a2.show();
		
	}

}
////////////////////////////////////////////////////
/*

------------------------------------------- [runtime data area]

[method : 정보, static, final, 공용정보]
Animal002.class, Class002.class			클래스 (설계도) -> (인스턴스화) 객체(Object/ a1, a2)
															-> 인스턴스 (별이, 뭉이)
------------------------------------------------
[heap: 동적]								|	[stack : 잠깐 빌리기]
 
 27, 28번째 줄 : {name="뭉이", age=7}		<-a2[2번지]  a2.show(){this.name(2번지의 name)}
 26번째 줄 : 2번지{name=null, age=0}		<-a2[2번지]
 
 22, 23번째 줄 : {name="별이", age=3}		<-a1[1번지]  a1.show(){this.name(1번지의 name)}
 20번째 줄 : 1번지{name=null, age=0}		<-a1[1번지]
 				
 										| 	main


------------------------------------------------


*/

//연습문제1)  class
//패키지명 : com.company.java009_ex
//클래스명 :  ClassEx001
//class Student001{
//  멤버변수 : String name;  int no, kor, eng, math;
//  멤버함수 : void info()
//}
//
//public class ClassEx001{
//   public static void main(String[] args) {
//      Student001   s1 = new Student003();
//     s1.name="first";  s1.no=11; s1.kor=100; s1.eng=100; s1.math=99;
//     s1.info();
//   }
//}
//출력내용 : 
//  이름: first
//  총점 : 299
//  평균 : 99.67
