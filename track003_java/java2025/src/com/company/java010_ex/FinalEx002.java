package com.company.java010_ex;

class User002 {
	final String nation = "Korea";   
	final String jumin;   
	String name;
	
	public User002() { jumin="00000"; }
	public User002(String jumin, String name) {
	 this.jumin = jumin;
	 this.name = name;
	}
}



////////////////////////////////////////////////////////
public class FinalEx002 {
	public static void main(String[] args) {
		 User002 user1 = new User002("123456-1234567", "아이유");
	    System.out.println(user1);   
	    // user1.nation = "USA";      	// 상수인 final 값이라 변경이 불가능함
	    // user1.jumin  = "123123-1234321"; // 상수인 final 값이라 변경이 불가능함
	    user1.name = "IU"; 
	    System.out.println(user1); 

	}

}
/////////////////////////////////////////////////////////
/////>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
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
