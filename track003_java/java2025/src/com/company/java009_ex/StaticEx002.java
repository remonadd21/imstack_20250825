package com.company.java009_ex;

//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위 (멤버함수)
class Mobile2{  
	String   serialNo;
	static  int count=0; 
	static {count=4;}
	
	void show() {
		serialNo = "2030-"+(count--);
	}
	
	
} 

////////////////////////////////////////////////////
public class StaticEx002 {
	public static void main(String[] args) {
		Mobile2 m1 = new Mobile2(); //1. new 공간빌리기  2. 생성자()  3. 번지
		Mobile2 m2 = new Mobile2(); 
		Mobile2 m3 = new Mobile2();  
		Mobile2 m4 = new Mobile2();  
		
		
		System.out.println("모바일 갯수는 모두 "+ Mobile2.count +"개 입니다.");
		m1.show();
		System.out.println("m1의 제품번호 " + m1.serialNo);  //1
		m2.show();
		System.out.println("m2의 제품번호 " + m2.serialNo);  //2
		m3.show();
		System.out.println("m3의 제품번호 " + m3.serialNo);  //3
		m4.show();
		System.out.println("m4의 제품번호 " + m4.serialNo);  //4

	}
}
////////////////////////////////////////////////////

//연습문제2)  static
//패키지명 : com.company.java010_ex
//클래스명 :  StaticEx002
//-- class Mobile2   작성해주세요    
//
//
//class Mobile2{  
//    String   serialNo;
//    static  int count=0; 
//} 
//
//public class StaticEx002{
//public static void main(String[] args) {
//   Mobile2 m1 = new Mobile2(); //1. new 공간빌리기  2. 생성자()  3. 번지
// Mobile2 m2 = new Mobile2(); 
// Mobile2 m3 = new Mobile2();  
// Mobile2 m4 = new Mobile2();  
//
// System.out.println("모바일 갯수는 모두 "+ Mobile2.count +"개 입니다.");   
// System.out.println("m1의 제품번호 " + m1.serialNo);  //1
// System.out.println("m2의 제품번호 " + m2.serialNo);  //2
// System.out.println("m3의 제품번호 " + m3.serialNo);  //3
// System.out.println("m4의 제품번호 " + m4.serialNo);  //4
//}
//}
//
//출력된결과:
//모바일 갯수는 모두 4개 입니다.
//m1의 제품번호 2030-1
//m2의 제품번호 2030-2
//m3의 제품번호 2030-3
//m4의 제품번호 2030-4




//클래스명 :  MemberVarEx001
//-- class Sawon3작성해주세요 
//1. 인스턴스변수, 클래스변수, 지역변수 를 구분하시오.
//2. 인스턴스메서드, 클래스메서드 구분하시오.
//3. 오류나는 이유는?
//class Sawon3{ 
//  int pay      =10000;    
//  static int su=10;     
//  static int basicpay=pay;    
//  static int basicpay2;    
//  
//  public static void showSu() {   System.out.println(su);  }          
//  public static void showPay() {   System.out.println(this.pay);  }    
//
//  public  void  showAll001() {   
//     System.out.println(su);  
//     System.out.println(this.pay);  
//  } 
//  public static  void  showAll002() {   
//      showAll001();    
//     System.out.println(this.pay);
//  } 
//} 
//public class MemberVarEx001{
//public static void main(String[] args) {
// Sawon3   sola = new Sawon3();  
// sola.showAll001();
//}
//}
