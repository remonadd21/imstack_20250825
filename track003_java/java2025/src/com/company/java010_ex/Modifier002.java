package com.company.java010_ex;

// import해서 다른 폴더에 있는 클래스 가져오기
import com.company.java010.UserInfo;


class UserSon2 extends UserInfo{
	public void show() {
		System.out.println("친구의 이름 > "+super.name);			// public 자식
		System.out.println("친구의 호빵번호 > "+super.safeCode);		// protected 자식
		
		// ▼ default로 지정되어 있거나 아무 작성이 없는 변수, 함수들은 "같은 폴더"에 없다면 사용할 수 없다.
		// UserInfo 클래스는 com.company.java010에 있음
		// 지금은 com.company.java010_ex 폴더!
		//System.out.println("친구의 집 주소 > "+super.house);			// package 자식(같은 폴더)
		
		
		// iQ가 private이기 때문에 접근이 불가능함...
		// System.out.println("친구의 IQ > "+super.iQ());

		// getter를 이용하면 가져올 수 있음
		System.out.println("친구의 IQ > "+super.getiQ());

	}
}


///////////////////////////////////////////////////
public class Modifier002 {
	public static void main(String[] args) {
		
		System.out.println("\n\n01. 호빵맨에 대한 정보");
		// public > protected > default > private
		
		UserInfo user = new UserInfo();
		user.name="호빵맨";		// public은 어디에서든 접근가능
		//user.safeCode="1234";	// protected 본인꺼 접근가능
		// user.house="서울시 강남구";
		// user.iQ =190;  // private 위에 만들어진 UserInfo 클래스 안에서만 접근이 가능함
		// private은 getters와 setters를 이용하여 접근이 가능하다.
		//		setters로 셋팅하고, getters로 잡아다가 보여준다.
		user.setiQ(190);
		System.out.println(user.getiQ());
		
	}
}
///////////////////////////////////////////////////


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
//    String owner;        
//    int rice = 90;               
//    int soup = 85;               
//
//    static int trayCount = 0;      
//
//    static int totalFood = rice + soup;
//
//    static int maxRice = 100;       
//
//    public int getFoodAmount() {
//        return rice + soup;         
//    }
//
//    public static void showTrayCount() {
//        System.out.println("전체 급식판 수: " + trayCount);   
//    }
//
//    public static void showOwner() { 
//       System.out.println(owner);
//    }
//
//    public void showTray() {
//        System.out.println("\n\n:: 주인 이름: " + owner);                
//        System.out.println("총 음식량: " + getFoodAmount());     
//    }
//}
//
//
//public class MemberVarEx003 {
//   public static void main(String[] args) {
//        LunchTray tray1 = new LunchTray();   
//        tray1.showTray();                    
//        LunchTray.showTrayCount();         
//
//        LunchTray tray2 = new LunchTray();   
//        tray2.showTray();                   
//        LunchTray.showTrayCount();         
//   }
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
//   final String nation = "Korea";   
//   final String jumin;   
//   String name;
//
//   public User002() { jumin="00000"; }
//   public User002(String jumin, String name) {
//      this.jumin = jumin;
//      this.name = name;
//   }
//}
// public class FinalEx {
//   public static void main(String[] args) {
//      User002 user1 = new User002("123456-1234567", "아이유");
//      System.out.println(user1);   
//      
//      user1.nation = "USA";      
//      user1.jumin  = "123123-1234321"; 
//      user1.name = "IU"; 
//      System.out.println(user1);   
//   }
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
//   Milk [mno=0, mname=null, mprice=0]
//   Milk [mno=0, mname=null, mprice=2000]
//   
//ㅁ주어진조건
//public class Milk{  // java011_ex에 설정해주세요!
//   private int  mno;   
//   private String mname;  
//   private  int mprice;  
//}
//public class ModifierEx2{ // java011 패키지에 설정해주세요.
//   public static void main(String[] args) {
//      Milk m1 = new Milk();  
//      System.out.println( m1 );  
//      m1.setMprice(2000);       
//      System.out.println( m1 );
//   } // end main
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
//   private String name;
//   private int kor, eng, math , total;
//   private double aver;
//   private String p  , s  , rank;
//} // java011_ex에 설정해주세요!
//
//public class ModifierEx3{    // java011 패키지에 설정해주세요.
//   public static void main(String[] args) {
//      Score iron = new Score();     
//      Score hulk = new Score("hulk" , 20,50,30);    
//      
//      // Score.info()위에 메서드작성해주세요!  ##
//      // setter를 이용해주세요!
//      iron.setName("iron"); iron.setKor(100); iron.setEng(100); iron.setMath(100);
//      
//      Score.info();     // 클래스메서드
//      iron.show();          
//      hulk.show();   
//   }
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
