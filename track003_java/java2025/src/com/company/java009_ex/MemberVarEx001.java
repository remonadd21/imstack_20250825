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



//패키지명 : com.company.java010_ex
//클래스명 : MemberVarEx002
//
//-- class Student 작성해주세요
//
//- 문제 1. 다음 코드에서 인스턴스변수, 클래스변수, 지역변수를 구분하시오.  ( 보관되는 영역도 추가 )
//- 문제 2. 인스턴스메서드와 클래스메서드를 구분하시오.  
//- 문제 3. 오류가 발생하는 이유를 설명하시오.
//- 문제 4. runtime data area 위치영역 그림그리기
//
//class Student {
//    String name = "홍길동";        
//    int kor = 90;                  
//    int eng = 85;                 
//    static int studentCount = 0;    
//
//    static int total = kor + eng;   
//
//    static int maxScore = 100;     
//
//    public Student() {
//        studentCount++;             
//    }
//
//    public int getTotalScore() {
//        return kor + eng;        
//    }
//
//    public static void showStudentCount() {
//        System.out.println("전체 학생 수: " + studentCount);  
//    }
//
//   public static void showName() {
//         System.out.println(name);  
//   }
//
//    public void showInfo() {
//        System.out.println("이름: " + name);            
//        System.out.println("총점: " + getTotalScore());    
//    }
//}
//
//public class MemberVarEx002 {
//    public static void main(String[] args) {
//        Student s1 = new Student();     
//        Student s2 = new Student();     
//
//        s1.showInfo();                  
//        Student.showStudentCount();    
//    }
//}