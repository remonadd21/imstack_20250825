package com.company.java013;

/*
 
원칙   설명
S - SRP (단일 책임 원칙)   클래스는 하나의 책임만 가져야 함. 즉, 변경의 이유가 하나여야 함.
O - OCP (개방-폐쇄 원칙)   확장에는 열려 있고, 변경에는 닫혀 있어야 함. 기존 코드를 수정하지 않고 기능을 추가할 수 있어야 함.
L - LSP (리스코프 치환 원칙)   하위 클래스는 상위 클래스의 기능을 대체할 수 있어야 함. 즉, 다형성을 지켜야 함.
I - ISP (인터페이스 분리 원칙)   클라이언트는 자신이 사용하지 않는 메서드에 의존하면 안 됨. 인터페이스는 작고 명확하게 분리해야 함.
D - DIP (의존 역전 원칙)   고수준 모듈은 저수준 모듈에 의존하면 안 되고, 추상화에 의존해야 함. 즉, 인터페이스에 의존하라는 뜻.
 
 *
 *	S	: 한가지 클래스는 한가지 일만	(쿠키반죽 반죽만, 쿠키굽기는 쿠기굽기만)
 *	O	: 수정말고 추가만, 새로운 쿠기 쉽게 추가
 *	L	: 다형성 : 같은방식으로 처리, 모든 쿠키는 같은 방식으로 만들기
 *	I	: (필요한 기능만 딱!) 인터페이스 나누기
 *	D	: 추상적인 쿠키의존
 *
 *
 */


// S: 단일의 책임
class CookieMaker{
	public void bakeCookie(String type) {System.out.println(type + "쿠키를 구워요");}
}


// O : 개방- 폐쇄의 원칙 (새로운 쿠키를 추가할 수 있지만, 기존코드는 건들지 마세요.)
interface Cookie{void make();}
class ChocoCookie implements Cookie {
	@Override public void make() { System.out.println("초코쿠키");}
}
class DeepChocoCookie implements Cookie {
	@Override public void make() { System.out.println("딥초코쿠키");}
}
class BananaCookie implements Cookie {
	@Override public void make() { System.out.println("바나나쿠키");}
}

// L : 리스코프 치환 (어떤 쿠키든 Cookie 인터페이스로 바꿔서도 문제없어요! 부모-자식)
class CookieFactory{
	public void makeCookie(Cookie cookie) { // Cookie cookie = 각종 쿠키종류
		cookie.make();// 어떤 쿠키든 만들 수 있어요!
	}
}


// I : interface	- 너무 많은 기능을 강요하지 말것!, 꼭 필요한 기능만 (절차)
interface SimpleCookie { void make(); }
class SimpleCookieMake implements SimpleCookie{
	@Override public void make() { System.out.println("쿠키만드는 방법은 간단하게"); }
}


// D : 의존역전원칙 - CookieFactory는 구체적인 쿠키가 아니라 추상적인 Cookie에 의존
class CookieShop{
	private Cookie cookie;
	// 쿠키종류는 외부에서 넣어줘요~

	public CookieShop() { super(); }
	public CookieShop(Cookie cookie) {
		super();
		this.cookie = cookie;
	}
	
	public void sell() {System.out.println("cookie 가게에서..."); cookie.make();} 
	// => 어떤 쿠키든 살 수 있음
	
}


/////////////////////////////////////////////////////////////
public class SolidBasic {
	public static void main(String[] args) {

		System.out.println("1. S: 단일 책임의 원칙 - 쿠키굽기(기계)"); 
		
		CookieMaker maker = new CookieMaker();
		maker.bakeCookie("씨발");
		maker.bakeCookie("조같네");
		maker.bakeCookie("아오!");
		
		
		System.out.println("2,3. OL 개방페쇄 (추가) + 리스코프 (공장 - 어떤 쿠키든 굽기가능) 치환");
		CookieFactory factory = new CookieFactory();
		factory.makeCookie(new ChocoCookie());
		factory.makeCookie(new DeepChocoCookie());
		factory.makeCookie(new BananaCookie());
		
		
		System.out.println("4. I , 인터페이서 분리");
		SimpleCookie making = new SimpleCookieMake();
		making.make();
		
		
		System.out.println("5. D의존역전 : 어떤 쿠키든 가게에서 팔 수 있음");
		CookieShop shop = new CookieShop(new DeepChocoCookie());
		shop.sell();
		
	}

}
//////////////////////////////////////////////////////////////