package com.company.java010_ex;

// 클래스는 부품객체
// 클래스는 상태(멤버변수)와 행위(멤버함수)

//////////////////////////////////////////////////////////////
///				초기화		명시적초기화 		초기화블록		생성자
/// trayCount	0				0				0		공용으로 사옹관련X
/// maxRice		0				100				100		생성자안에서 클래스 변수 사용가능
///				초기화		명시적초기화 		초기화블록		생성자
/// owner		null				null				null		null
/// rice			0				90				90		90
/// soup			0				85				85		85
//////////////////////////////////////////////////////////////



class LunchTray {
	
	// 멤버변수
	String owner;    	    // 인스턴스 변수, heap area, new O, 생성자 O
	int rice = 90;          // 인스턴스 변수, heap area, new O, 생성자 O
	int soup = 85;          // 인스턴스 변수, heap area, new O, 생성자 O    
	
	static int trayCount = 0;      // 클래스 변수 , method area , new X, 생상자 X, 직접사용 O

	
	// 클래스 변수 , method area , new X, 생상자 X, 직접사용 O
	// 		인스턴스 변수와 사용이 어려움, 
	//		method area를 사용하는 클래스 변수와 heap area를 사용하는 인스턴스 변수는 서로 영역도 다름!
	//static int totalFood = rice + soup;  
	
	static int maxRice = 100;   // 클래스 변수 , method area , new X, 생상자 X, 직접사용 O
	
	public LunchTray() {
		this.owner = "std-"+ ++trayCount;
	}
	// 멤버함수
	public int getFoodAmount() {		// 인스턴스 메서드, heap area, new O, 생성자 O
	  return rice + soup;         
	}

	public static void showTrayCount() {		// 클래스 메서드, method Area, new X, 생성자 X
	  System.out.println("전체 급식판 수: " + trayCount);   
	}
	
	/*	클래스 메서드, owner 인스턴스 변수 사용이 어려움
	 * public static void showOwner() { System.out.println(owner); }
	 */
	
	public void showTray() {		// 인스턴스 메서드
	  System.out.println("\n\n:: 주인 이름: " + owner);                
	  System.out.println("총 음식량: " + getFoodAmount());     
	}
}



/////////////////////////////////////////////////////
public class FinalEx001 {
	public static void main(String[] args) {
      LunchTray tray1 = new LunchTray();
      tray1.showTray();                    
      LunchTray.showTrayCount();         

      LunchTray tray2 = new LunchTray();
      tray2.showTray();                   
      LunchTray.showTrayCount(); 

	}

}

/////////////////////////////////////////////////////
// [method , static, final, 공용정보]
// class: LunchTray.class, FinalEx001.class
// static : trayCount, maxRice, showTrayCount()

		
/////////////////////////////////////////////////////
// [heap]							   			 					| [statck]
// {owner=null, rice = 90, soup = 85, getFoodAmount(), showTray() }	<-2번지 (tray2)
// {owner=null, rice = 90, soup = 85, getFoodAmount(), showTray() }	<-1번지 (tray1)
/////////////////////////////////////////////////////


/////////////////////////////////////////////////////
//연습문제3)  멤버변수
//패키지명 : com.company.java010_ex
//클래스명 :  MemberVarEx003
////- 문제 1. 다음 코드에서 인스턴스변수, 클래스변수, 지역변수를 구분하시오.  ( 보관되는 영역도 추가 )
////- 문제 2. 인스턴스메서드와 클래스메서드를 구분하시오.  
////- 문제 3. 오류가 발생하는 이유를 설명하시오.
////- 문제 4. runtime data area 위치영역 그림그리기
////- 문제 5. 다음과 같이 출력되도록 코드를 작성하시오.
//:: 주인 이름: std-1
//총 음식량: 175
//전체 급식판 수: 1
//
//
//:: 주인 이름: std-2
//총 음식량: 175
//전체 급식판 수: 2
//
//
//class LunchTray {
//  String owner;        
//  int rice = 90;               
//  int soup = 85;               
//
//  static int trayCount = 0;      
//
//  static int totalFood = rice + soup;
//
//  static int maxRice = 100;       
//
//  public int getFoodAmount() {
//      return rice + soup;         
//  }
//
//  public static void showTrayCount() {
//      System.out.println("전체 급식판 수: " + trayCount);   
//  }
//
//  public static void showOwner() { 
//     System.out.println(owner);
//  }
//
//  public void showTray() {
//      System.out.println("\n\n:: 주인 이름: " + owner);                
//      System.out.println("총 음식량: " + getFoodAmount());     
//  }
//}
//
//
//public class MemberVarEx003 {
// public static void main(String[] args) {
//      LunchTray tray1 = new LunchTray();   
//      tray1.showTray();                    
//      LunchTray.showTrayCount();         
//
//      LunchTray tray2 = new LunchTray();   
//      tray2.showTray();                   
//      LunchTray.showTrayCount();         
// }
//} 
//
//
//
//
//
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//연습문제1)  final
//패키지명 : com.company.java011_ex
//클래스명 : FinalEx
//다음코드에서 오류나는 부분을 찾아 주석달고 이유를 적으시오.
//class User002 {
// final String nation = "Korea";   
// final String jumin;   
// String name;
//
// public User002() { jumin="00000"; }
// public User002(String jumin, String name) {
//    this.jumin = jumin;
//    this.name = name;
// }
//}
//public class FinalEx {
// public static void main(String[] args) {
//    User002 user1 = new User002("123456-1234567", "아이유");
//    System.out.println(user1);   
//    
//    user1.nation = "USA";      
//    user1.jumin  = "123123-1234321"; 
//    user1.name = "IU"; 
//    System.out.println(user1);   
// }
//}
//
//
//
//
//
//연습문제2)  지정접근자
//패키지명 : com.company.java010_ex
//클래스명 : ModifierEx2
//다음과 같이 코드를 작성하시오.
//ㅁ출력된화면
// Milk [mno=0, mname=null, mprice=0]
// Milk [mno=0, mname=null, mprice=2000]
// 
//ㅁ주어진조건
//public class Milk{  // java011_ex에 설정해주세요!
// private int  mno;   
// private String mname;  
// private  int mprice;  
//}
//public class ModifierEx2{ // java011 패키지에 설정해주세요.
// public static void main(String[] args) {
//    Milk m1 = new Milk();  
//    System.out.println( m1 );  
//    m1.setMprice(2000);       
//    System.out.println( m1 );
// } // end main
//} // end class
//
//
//
//
//
//연습문제3)  지정접근자
//패키지명 : com.company.java011_ex
//클래스명 : ModifierEx3
//다음과 같이 코드를 작성하시오.
//
//ㅁ출력된화면
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//이름   국어   영어   수학   총점   평균   합격여부   장학생   랭킹
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//iron   100   100   100   300   100.00   합격   장학생   **********
//hulk   20   50   30   100   33.33   불합격      ***
//
//
//
//
//
//ㅁ주어진조건
//public class Score{
// private String name;
// private int kor, eng, math , total;
// private double aver;
// private String p  , s  , rank;
//} // java011_ex에 설정해주세요!
//
//public class ModifierEx3{    // java011 패키지에 설정해주세요.
// public static void main(String[] args) {
//    Score iron = new Score();     
//    Score hulk = new Score("hulk" , 20,50,30);    
//    
//    // Score.info()위에 메서드작성해주세요!  ##
//    // setter를 이용해주세요!
//    iron.setName("iron"); iron.setKor(100); iron.setEng(100); iron.setMath(100);
//    
//    Score.info();     // 클래스메서드
//    iron.show();          
//    hulk.show();   
// }
//
//}
//
//Score.info() 사용시화면
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//이름   국어   영어   수학   총점   평균   합격여부   장학생   랭킹
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//
//
//
//
//
//
//
