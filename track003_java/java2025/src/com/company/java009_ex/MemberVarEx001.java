package com.company.java009_ex;


class Sawon3{ 
	int pay =10000;    // 인스턴스변수  - heap area, new, 생성자와 연관되어 있음
	static int su=10;     // 클래스 변수 method area, new X, 생성자X
	// static int basicpay=pay;   // 인스턴스 변수는 클래스 변수 안에 담을 수 없음.. method area의 값은
									// 바로 사용이 가능하나.. heap은 new 공간을 통해서 사용해야 하기 때문에 사용불가!
	static int basicpay2;    
	
	public static void showSu() {   System.out.println(su);  }          
	// public static void showPay() { System.out.println(this.pay); 
	// 클래스 메서드안에 인스턴스 변수 넣을수 없음!, this는 각각 new를 통해서만 사용이 가능함 }    
	
	public  void  showAll001() {   
	   System.out.println(su);  
	   System.out.println(this.pay);  
	} 
	//public static  void  showAll002() {   
	   // showAll001(); // static안에서 멤버함수 사용불가    
	   // System.out.println(this.pay);	// this값도 사용불가
	//} 
} 


//////////////////////////////////////////////////////
public class MemberVarEx001 {
	public static void main(String[] args) {
		Sawon3 sola = new Sawon3();  
		sola.showAll001();
	}
}

//////////////////////////////////////////////////////
/*
 * -------------------------------------------------
 * [method 정보] 
 * Sawon3.class, MemberVarEx001.class
 * static : Sawon3.su, Sawon3.basicpay2, Sawon3.showSu(), Sawon3.showAll002()
 * -------------------------------------------------
 * [heap 동적]									|	[stack] 잠깐빌리기
 * 
 * 1번지 {pay=0, showAll001()}					<-- sola[1번지]
 * 												| 	main (public void main 호출 JVM)
 * 
 */


//클래스명 :  MemberVarEx001
//-- class Sawon3작성해주세요 
//1. 인스턴스변수, 클래스변수, 지역변수 를 구분하시오.
//2. 인스턴스메서드, 클래스메서드 구분하시오.
//3. 오류나는 이유는?
//class Sawon3{ 
//int pay      =10000;    
//static int su=10;     
//static int basicpay=pay;    
//static int basicpay2;    
//
//public static void showSu() {   System.out.println(su);  }          
//public static void showPay() {   System.out.println(this.pay);  }    
//
//public  void  showAll001() {   
//   System.out.println(su);  
//   System.out.println(this.pay);  
//} 
//public static  void  showAll002() {   
//    showAll001();    
//   System.out.println(this.pay);
//} 
//} 
//public class MemberVarEx001{
//public static void main(String[] args) {
//Sawon3   sola = new Sawon3();  
//sola.showAll001();
//}
//}