package com.company.java009;

//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위(멤버함수)를 가지고 있다.

class Farm{
	// 상태 - 멤버변수
	// ▼ 명시적 초기화: final 같은 고정값으로 사용할때, 시리얼 넘버같은 값을 사용할때
	// String name ="animal name";
	
	String name;		// 인스턴스 변수 - cat(1번지).name, dog(2번지).name
	int age;			// 인스턴스 변수 - cat(1번지).age, dog(2번지).age
	
	////////////////////////////////////////////////////////
	// [ static ]은 메모리 상에 가장 먼저 올려 놓을때 사용함!
	// ▼ 명시적 값들은 method area, new , 생성자와 전혀 상관없음
	// ▼ 명시적 초기화 and 클래스 변수 (클래스명으로 호출하는 변수)
	// ▼ 명시적 값은 무조건 클래스명.변수명
	static String FarmName="(주) 동물농장";
	static int FarmNum;
	static String FarmBoss;
	static {FarmNum=2; FarmBoss="MC신동엽";} // 초기화 블록
	////////////////////////////////////////////////////////

	
	// 행위 - 멤버함수
	// >> void num_plus() {FarmNum++;}
	// 		담고있는 변수가 클래스변수 이기 때문에 static 붙어 있음
	// 		main에서 dog.num_plus(); 로 호출이 가능하나.. warning이 발생함
	
	// >> static void num_plus()로 사용해야 안전함
	//		static이 붙어 있는 함수는 메모리영역에 가장 먼저 올라가 있고, 
	//		고정되어 있기 때문에 this가 붙은 변수를 사용할 수 없다.
	//		this는 어디서든 접근가능하나... static에서는 사용하기 어려움!
	static void num_plus() {FarmNum++;  /*this.age++;*/}
	
	
	void show() { // 인스턴스 메서드 
		System.out.println("\n\n::::::::::::::::");
		System.out.println("> 이름: "+this.name);
		System.out.println("> 나이: "+this.age);
		System.out.println("> 인원: "+Farm.FarmNum);
	}
}

///////////////////////////////////////////////////
public class Static001 {
	public static void main(String[] args) {
		System.out.println("\n\n0. 동물농장");
		
		//static으로 만든 클래스 변수는, 클래스명.해당변수명으로 호출
		System.out.println("회사이름: "+Farm.FarmName);
		System.out.println("회사사장: "+Farm.FarmBoss);
		System.out.println("회사인원: "+Farm.FarmNum);
		
		System.out.println("\n\n1. 동물농장 식구 - this는 각각");
		Farm cat = new Farm(); // 조립 1) new로 메모리를 빌리고 객체 생성, 2) 생성자 Farm() 초기화,3) cat번지
		cat.name="brad"; cat.age=10; cat.show(); // cat으로 가져와서 가지고 놀기
		Farm dog = new Farm(); 
		dog.name="mung"; dog.age=5; 
		dog.num_plus();
		dog.show();
		
	}
}
///////////////////////////////////////////////////
/* 
 * [메모리상 올라오는 순서, static이 가장 상위에 배치됨]
 * 
 * 초기화 순서  : 기본값  			명시적초기화   				초기화블록   				생성자
 * 	FarmNum 		0					0						2					  X
 * 	FarmBoss  	null				   null					 MC신동엽					  X
 *  FarmName		null				(주)동물농장					X					  X

 * 
 * 
 * 	cat	 name=null, age=0	(X)name=null, age=0   name=null, age=0		name=null, age=0
 * 	dog	 name=null, age=0	(X)name=null, age=0   name=null, age=0		name=null, age=0
 * 	
 * 명시적 초기화는 고정된값, 시리얼넘버 같은 값을 사용할때만 사용하기 때문에 많이 사용되지 않음
 * 
------------------------[ runtime data area]
[method: 정보, static, final : 공용정보]	
	Fram.class, Static001.class			★ 클래스 : 설계도
	FarmNum=2; 	FarmBoss="MC신동엽";  FarmName="(주) 동물농장";
------------------------------------
[heap: 동적]            | [stack : 잠깐빌리기]
2번지 {name=null, age=0}		<- dog[2번지]
1번지 {name=null, age=0}		<- cat[1번지]
					  | main
------------------------------------
*/
//연습문제1)  static
//패키지명 : com.company.java010_ex
//클래스명 :  StaticEx001
//-- class Area1 작성해주세요   ※ pi값은 3.14159
//public class StaticEx001{
//  public static void main(String[] args) {  
//   System.out.println("원의 면적    : " + 10 * 10 * Area1.pi);
//   System.out.println("사각형의 면적 : " + Area1.rect(10, 5));
//   System.out.println("삼각형의 면적 : " + Area1.triangle(10, 5));
//  }
//}
//
//출력내용 : 
//원의 면적    : 314.159
//사각형의 면적 : 50.0
//삼각형의 면적 : 25.0
//
//
//연습문제2)  static
//패키지명 : com.company.java010_ex
//클래스명 :  StaticEx002
//-- class Mobile2   작성해주세요    
//
//
//class Mobile2{  
//      String   serialNo;
//      static  int count=0; 
//} 
//
//public class StaticEx002{
//  public static void main(String[] args) {
//     Mobile2 m1 = new Mobile2(); //1. new 공간빌리기  2. 생성자()  3. 번지
//   Mobile2 m2 = new Mobile2(); 
//   Mobile2 m3 = new Mobile2();  
//   Mobile2 m4 = new Mobile2();  
//
//   System.out.println("모바일 갯수는 모두 "+ Mobile2.count +"개 입니다.");   
//   System.out.println("m1의 제품번호 " + m1.serialNo);  //1
//   System.out.println("m2의 제품번호 " + m2.serialNo);  //2
//   System.out.println("m3의 제품번호 " + m3.serialNo);  //3
//   System.out.println("m4의 제품번호 " + m4.serialNo);  //4
//  }
//}
//
//출력된결과:
//모바일 갯수는 모두 4개 입니다.
//m1의 제품번호 2030-1
//m2의 제품번호 2030-2
//m3의 제품번호 2030-3
//m4의 제품번호 2030-4
