package com.company.java013;

/*
	1. 클래스는 부품객체
	2. 부품객체는 상태(멤버변수)와 행위(멤버함수)
	3. 일반상속 : 클래스의 재사용, 단일 상속
	4. 인터페이스 : can do this, 다중상속 가능

-----------------------------------------------------

Papa{brain}		Mama{Brain}
		↑		↑
		   son()
*/

class Papa{int brain;}
class Mama{int brain;}

/*
		Animal2			{Company="(주) 코코오 / eat()"}
		↑	  ↑
	  Saram	  Pig
	{@eat()}	  {@eat()}

1. 부모 = 자식			  > 하나의 자료타입(부모)으로 여러타입(자식, 자식, ,,, 자식들)을 관리
2. 업캐스팅, 타입캐스팅 X, > 부모가 메서드 사용시 자식의 메서드가 호출  @Override

*/




// class Son extends Papa,Mama{} Syntax error on token ",", . expected
// interface, abstract 모두 class에 해당하기 때문에 같은 이름 사용이 어려움
interface Animal2{
	// public static final 가 자동으로 붙음 - 클래스 변수, animal2.Company, Method area
	// new 와는 관련없고, 생성자와도 관련없음!
	String Company="(주) 코코오: ";
	
	void eat(); //<= abstract 메서드,  자동으로 public abstract이 붙음,
}

// implements의 뜻은 구현하다는 뜻
// Saram 클래스에서 Animal2를 구현한다는 뜻
class Saram implements Animal2{

	@Override
	public void eat() {/* Company="kakao"; */ System.out.println(Animal2.Company+"차돌박이.. 촥촵"); } 
	// 맴버변수가 static final 붙어 있어서 super로 쓸수가 없음
}


class Pig implements Animal2{

	@Override
	public void eat() {/* Company="kakao"; */ System.out.println(Animal2.Company+"제육볶음, 촥촵"); } 
	// 맴버변수가 static final 붙어 있어서 super로 쓸수가 없음
}


public class Interface001 {
	public static void main(String[] args) {
		
		// Animal2 ani = new Animal2();  // Cannot instantiate the type Animal2
		Animal2 [] anis= {new Saram(), new Saram(), new Pig()};
		
		for(Animal2 a:anis) {
			a.eat();
		}

	}

}
