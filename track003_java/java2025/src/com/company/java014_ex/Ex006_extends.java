package com.company.java014_ex;

// 1) 클래스를 상속받는 이유는?
// 클래스는 각각 부품객체로 조립하여 사용할 수 있는데
// 부모에서 부터 Object에서 부터 상속받으면 해당하는 맴버 변수나
// 멤버 함수를 사용할 수 있게 된다. 업 캐스팅이나 다운 캐스팅도 가능하다.
/*

	Object{ 4) 생성자	    객체(5 }
	↑						↓
	A1	{ 3)	생성자		객체(6 }
	↑						↓
	B1	{ 2)	생성자		객체(7 }
	↑						↓
	C1	{ 1) 생성자		객체(8 }


*/
class A1 extends Object{ //Object 를 상속받는다.
    int a;
    public A1(){super();}
    public A1(int a){super(); this.a=a;}
}

class B1 extends A1{//A1을 상속받는다.
	int b;
	public B1(){super();}
	public B1(int b){this.b=b;}
	public B1(int a, int b){super(a); this.b=b;}
}

class C1 extends B1{//B1을 상속받는다.
	int c;
	public void showC(){
    System.out.println("상속받은 A 클래스의 a: "+a);
    System.out.println("상속받은 B 클래스의 b: "+b);
    System.out.println("자신의 멤버 C 클래스의 c: "+c);
    }
}
public class Ex006_extends{
    public static void main(String[]args){
        C1 myc = new C1();
        myc.a=10; myc.b=20; myc.c=30;
        myc.showC();
    }
}