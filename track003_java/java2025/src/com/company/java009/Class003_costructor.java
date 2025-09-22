package com.company.java009;

//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위(멤버함수)

class Car31{} // 생성자 Car31()을 만들지 않았어도.. 컴파일러가 기본생성자를 자동으로 만듬
class Car32{
	String color;
	
	// alt + shift + s ★ 밑에서 3번째(2, 3, 4)
	public Car32() { super(); }
	
	// 기본형은 class Car32 extends Object{}로 작성해야 함
	// 하지만 super로 대체함, super()가 있으면 생략가능
	// super();도 생략가능
	// 하지만 super()는 상속에도 관련있어서 중요하게 쓰인다. 
	
	
	public Car32(String color) { super(); this.color = color; }
	
	@Override
	public String toString() {
		return "Car32 [color=" + color + "]";
	}

}

///////////////////////////////////////////////////////
public class Class003_costructor {
	public static void main(String[] args) {
		Car31 car1 = new Car31();
		System.out.println(car1);
		//1. new (메모리 빌리고, 객체생성)
		//2. Car31() 초기화
		//3. car1 번지(주소확인)
		// Car31@73a28541
		
		Car32 car2 = new Car32();
		System.out.println(car2+"\t"+car2.color);
		
		
		Car32 car3 = new Car32("red");
		System.out.println(car3+"\t"+car3.color);
	}
}
///////////////////////////////////////////////////////
/*
 * Q1. 클래스란? [설계도] 예)[Car31.class ,Car32.class, Class003_costructor.class ]
 * Q2. 객체? [실제(new)로 만든 장난감]	예)[ car1, car2 , car3 ]
 * Q3. 인스턴스[각각의 장난감들] 예)[ car1, car2(null) , car3(red) ]
 * 
 * */
