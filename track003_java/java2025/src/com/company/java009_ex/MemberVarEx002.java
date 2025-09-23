package com.company.java009_ex;

class Student {
	String name = "홍길동";        //인스턴스 변수 (heap area, new)
	int kor = 90;                //인스턴스 변수  (heap area, new)
	int eng = 85;                //인스턴스 변수  (heap area, new)
	static int studentCount = 0;    // 클래스 변수 (method area, 직접사용가능)
	
	// 클래스 변수에서 인스턴스 변수 사용불가
	// 추가로 this도 없음
	// static 값들은 method area를 이용하여 직접 적용
	// this 값들은 heap area의  new를 통해서 사용가능함, 사용방식부터 다름!
	//static int total = kor + eng;   
	
	static int maxScore = 100;     // 클래스 변수 (method area, 직접사용가능)
	

	public Student() {				// 생성자
	  studentCount++;             	// 클래스 메서드
	}
	
	public int getTotalScore() {		// 인스턴스 메서드
	  return kor + eng;        		
	}
	
	public static void showStudentCount() {		// 클래스 메서드
	  System.out.println("전체 학생 수: " + studentCount);  
	}


// 클래스 메서드에서 인스턴스 변수 사용불가
//public static void showName() {
//   System.out.println(name);  
//}

	public void showInfo() {		// 인스턴스 메서드
	  System.out.println("이름: " + name);            
	  System.out.println("총점: " + getTotalScore());    
	}
}

//////////////////////////////////////////////////////
public class MemberVarEx002 {
	
	public static void main(String[] args) {
      Student s1 = new Student();     
      // Student s2 = new Student(); 
      // method, heap, stack 어디서도 사용하지 않고 있어서 위험으로 뜸
      
      s1.showInfo();
      Student.showStudentCount(); 
	}
}

//////////////////////////////////////////////////////
/*
 * runtime data area
 * ----------------------------------------------------------
 * [method, static, final 공용정보] 
 * Student.class, MemberVarEx002.class
 * static : Student.studentCount,Student.maxScore Student.showStudentCount(),Student.ShowName() 
 * ----------------------------------------------------------
 * [heap 동적]												|	[stack] 잠깐빌리기
 * 
 * {name=홍, kor=90, eng=85,  getTotalScore(), showInfo()}	 <-- s2[2번지]
 * {name=홍, kor=90, eng=85,  getTotalScore(), showInfo()}	 <-- s1[1번지]
 * 															| 	main (public void main 호출 JVM)
 * -----------------------------------------------------------
 */
/*
 * 초기화					기본						명시적초기화	 				초기화블록		생성자
 * studentCount			0							0							x			0
 * maxScore				0			  				100							x			100
 * s1{name,kor,eng}		{name=null, kor=0, eng=0}{name="홍길동",kor=90,eng=85}		x		{name="홍길동",kor=90,eng=85}	
 * s2{name,kor,eng}		{name=null, kor=0, eng=0}{name="홍길동",kor=90,eng=85}		x		{name="홍길동",kor=90,eng=85}	
 * */


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