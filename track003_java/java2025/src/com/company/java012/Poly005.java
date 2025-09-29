package com.company.java012;

class Animal{
	String name;
	int age;
	public Animal() { super(); } //오버로딩과 상속시엔 컴파일러로 생성자가 자동생성 되지 않음!
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void show() {System.out.println("Animal");}
}
class Cat extends Animal{
	String number;
	public void show() {System.out.println("Cat > "+super.name+" / "+super.age);};
}

class Person extends Animal{
	String jumin;
	public void show() {System.out.println("Person > "+super.name+" / "+super.age);};
}

/////////////////////////////////////////////////////////
public class Poly005 {
	public static void main(String[] args) {
		// 부모 = 자식 / 업캐스팅 / 타입캐스팅X
		Animal [] anis = { new Cat(), new Cat(), new Person(), new Person() };
		// 1. 보장 : {String name; int age; 사용가능!}
		// 					= new Cat(){number, @show} - Animal{String name, ing age}
		// 1. 보장 : {String name; int age; 사용가능!}
		// 					= new Person(){jumin, @show} - Animal{String name, ing age}
	
	
		Animal Controller = null;
		Controller = anis[0]; Controller.show();
		Controller = anis[1]; Controller.show();
		Controller = anis[2]; Controller.show();
		Controller = anis[3]; Controller.show();
	
	
	}

}
/////////////////////////////////////////////////////////
