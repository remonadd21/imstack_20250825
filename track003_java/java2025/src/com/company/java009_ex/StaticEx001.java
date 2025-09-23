package com.company.java009_ex;

//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위 (멤버함수)
class Area1{
	
	static double pi=3.14159;

	static double rect(int i, int j) {
		return i*j;
	}


	static double triangle(int i, int j) {
		return (i*j)/2;
	}
	
}

////////////////////////////////////////////////////
public class StaticEx001 {
	public static void main(String[] args) {
		
		
		System.out.println("원의 면적    : " + 10 * 10 * Area1.pi);
		System.out.println("사각형의 면적 : " + Area1.rect(10, 5));
		System.out.println("삼각형의 면적 : " + Area1.triangle(10, 5));
	}
}
////////////////////////////////////////////////////
//연습문제1)  static
//패키지명 : com.company.java010_ex
//클래스명 :  StaticEx001
//-- class Area1 작성해주세요   ※ pi값은 3.14159
//public class StaticEx001{
//public static void main(String[] args) {  
// System.out.println("원의 면적    : " + 10 * 10 * Area1.pi);
// System.out.println("사각형의 면적 : " + Area1.rect(10, 5));
// System.out.println("삼각형의 면적 : " + Area1.triangle(10, 5));
//}
//}
//
//출력내용 : 
//원의 면적    : 314.159
//사각형의 면적 : 50.0
//삼각형의 면적 : 25.0
//

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



