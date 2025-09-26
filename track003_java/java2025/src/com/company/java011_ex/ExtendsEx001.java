package com.company.java011_ex;

/*  재활용
Object						 ■3. Object(){ 													} ■4.
↑
Color 클래스 :                 ■2. Color(){    name=null               / num=0               } ■5.
↑							 	
Green 클래스 :  void show(){}  ■1. Green(){                              show()              } ■6.   
		                	 ■0. 1번지)  
-----------------------------------
Green mygreen = new Green();
-----------------------------------
1.  Green은 Color이다, Green은 Object이다 ( 속이빈화살표 실선  )
2. 생성자호출  :  Green() → Color() →  Object()
3. 객체생성   :   Object → Color →  Green
*/
class Color{
	public String name;
	private int num;
 
	public int getNum() { return num; } 
	public void setNum(int num) { this.num = num; }
	@Override public String toString() { return "Color [name=" + name + ", num=" + num + "]"; }
}
class Green extends Color{
	public void show() {
		System.out.println("GREEN");
		System.out.println("NAME: " + this.name);
		System.out.println("NUM : " + this.getNum()); // private
	}
}
public class ExtendsEx001 {
	public static void main(String[] args) {
        Green mygreen = new Green();
        mygreen.name = "LIGHT_GREEN";
        mygreen.setNum(5);// mygreen.num = 5;
        mygreen.show();
	}
}

/*
연습문제1)  멤버변수
패키지명 : com.company.java011_ex
클래스명 :   ExtendsEx001.java
1. 아래 조건에 맞게 ExtendsEx001.java 파일을 작성하고, 
main() 메서드를 수정하여 다음과 같은 출력 결과가 나오도록 하시오.

2. 주어진 코드 (수정 전)
```java
public class ExtendsEx001 {
    public static void main(String[] args){
        Green mygreen = new Green();
        mygreen.name = "LIGHT_GREEN";
        mygreen.num = 5;
        mygreen.show();
    }
}
```
3.출력 결과 
GREEN
NAME : LIGHT_GREEN
NUM : 5

4. 클래스 구조 설명
 Color 클래스 : 멤버 변수:  name (String, public)  / num (int, private)
  ↑
Green 클래스  : 멤버 변수:  name (String, public), num (int, private)
 

5 요구사항
1) Color와 Green 클래스의 상속 관계를 활용할 것
2) main() 메서드에서 직접 name과 num에 값을 할당할 수 있도록 접근 제어자를 고려할 것
3) show() 메서드를 통해 출력 형식을 맞출 것

*/



//연습문제2)     클래스 상속과 메서드 오버라이딩
//패키지명 : com.company.java011_ex 
//클래스명 : ClassEx002.java
//
//1. 아래 조건에 맞게 ClassEx002.java 파일을 작성하고,
//   main() 메서드를 수정하여 다음과 같은 출력 결과가 나오도록 하시오.
//2. 주어진 코드 (수정 전)
//```java
//public class ClassEx002 {
//    public static void main(String[] args) {
//        MobileNote7 my7 = new MobileNote7();
//        my7.setIris("brown");
//        my7.setFace("pretty");
//        my7.newShow();
//
//        MobileNote8 my8 = new MobileNote8();
//        my8.setFace("pretty");
//        my8.newShow();
//
//        MobileNote9 my9 = new MobileNote9();
//        my9.setBattery(24);
//        my9.newShow();
//    }
//}
//```
//3. 출력 결과 
//
//NOTE7 객체 기능(Overriding)
//iris = brown
//face = pretty
//
//NOTE8 객체 기능(Overriding) 추가
//face = pretty
//
//NOTE9 객체 기능(Overriding) 추가
//battery 예쁘게 사용하기!
//battery = 24
//
//4. 클래스 구조 설명
//클래스명      멤버변수        멤버메서드
//MobileNote   없음                        void show()
//MobileNote7   String iris, String face  void newShow()
//MobileNote8   String face                 void newShow()
//MobileNote9   int battery                 void newShow()
//모든 멤버변수는 private으로 선언
//
//-각 클래스는 MobileNote 클래스를 상속받음
//-newShow() 메서드는 각 클래스에서 오버라이딩되어 고유한 출력 형식을 가짐
//
//5. 요구사항
//-MobileNote 클래스를 기반으로 상속 구조를 설계할 것 (MobileNote7, MobileNote8, MobileNote9 모두 상속)
//-각 클래스에서 setter 메서드를 통해 멤버변수 값을 설정할 수 있도록 구현할 것
//-newShow() 메서드를 오버라이딩하여 출력 형식을 문제에서 제시한 형태로 맞출 것
//-출력 순서와 내용이 정확히 일치하도록 main() 메서드를 구성할 것
//
//
//
//연습문제3)    클래스 상속과 메서드 호출 우선순위
//패키지명 : com.company.java011_ex 
//클래스명 : ClassEx003.java
//
//1. 아래 조건에 맞게 ClassEx003.java 파일을 작성하고, 
//   빈칸을 채운 뒤 main() 메서드를 실행하여 출력 결과를 예상하시오.
//2. 주어진 코드 (수정 전)
//```java
//class Grand extends Object {
//    public void one() { System.out.println("grand : one"); }
//    public void two() { System.out.println("grand : two"); }
//}
//// (1) Father 클래스가 Grand 클래스를 상속받도록 수정
//public class Father {
//    public void three() { System.out.println("Father : three"); }
//}
//
//```
//3. 출력 결과  
// 
//grand : one
//grand : two
//Father : three
//
//4. 클래스 구조 설명
//클래스명        상속 관계       주요 메서드
//1) Object   최상위 클래스           -
//2) Grand      Object → Grand         one(), two()
//3) Father   Grand → Father       three()
//4) Uncle      Object → Uncle 
//5) Aunt      Object → Aunt     
//- 모든 클래스는 Object 클래스를 기본적으로 상속받음
//- Grand 클래스는 one()과 two() 메서드를 정의
//- Father 클래스는 Grand를 상속받아 three() 메서드를 추가
//
//5. 요구사항
//- Father 클래스가 Grand 클래스를 상속받도록 extends 키워드를 활용할 것
//- main() 메서드에서 Father 객체를 생성하고 one(), two(), three() 메서드를 순서대로 호출할 것
//- 상속 관계에 따라 메서드 호출 우선순위를 이해하고 출력 결과를 정확히 예측할 것
//- Uncle, Aunt 클래스도 Object를 상속받는 구조로 확장 가능하므로, 필요 시 추가 구현할 것
