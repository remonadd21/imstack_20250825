package com.company.java013;
/*
 * Abstract (is A) 일반 클래스 + 설계
 * 고양이는 동물이다. 
 * 개도 동물이다.
 * 
 * 		Animal
 * 		↑	↑
 * 	  Cat 	Dog
 * 
 * */
abstract class Animalz{		//일반클래스 + 설계
	String name;
	abstract void eat();			// 추상메서드가 있으면 반드시 추상 클래스로 만들어줘야 함.
	abstract void sleep();		// 구현부가 없는 {} 메서드들
	abstract void poo();			// 추상화, 일반화 설계: 공통의 속성, 구체적인 내용이 없음
	// public Animalz() { super(); } 
	
}

class Cats extends Animalz{	// 구현 클래스
	

	@Override void eat() { System.out.println(super.name+"고양이 냠냠!"); }
	@Override void sleep() { System.out.println(super.name+"고양이 수면"); }
	@Override void poo() { System.out.println(super.name+"고양이 응가!");}
	
}

class Dogs extends Animalz{	// 구현 클래스

	@Override void eat() { System.out.println(super.name+"강아지 냠냠!"); }
	@Override void sleep() { System.out.println(super.name+"강아지 수면"); }
	@Override void poo() { System.out.println(super.name+"강아지 응가!");}
	
}


public class Abstract001 {
	public static void main(String[] args) {
		//1. abstract class : 일반클래스 + 설계
		//Animalz ani = new Animalz();	new 메모리 빌리고, 객체생성 / Animal()초기화, {}구현부 없음
		Animalz ani = null;
		ani = new Cats();	// 부모 = 자식, 업캐스팅, 타입캐스팅 필요없음
		ani.name="brad";		ani.eat();
		
		ani = new Dogs();	// 부모 = 자식, 업캐스팅, 타입캐스팅 필요없음
		ani.name="Gae";		ani.eat();
		
		//2. 사용목적
		Animalz [] arr = {new Cats(),new Cats(), new Dogs(), new Dogs() };
		int cnt=0;
		for(Animalz a: arr) {
			a.name ="ani"+ ++cnt; a.eat();
		}
	}

}
/*
 * 		Object
 * 		  ↑
* 		Animal	{name / eat(), sleep(), poo()}
* 		↑	↑
* 	  Cat 	Dog	{@eat(), @sleep(), @poo() }
* 
* */
