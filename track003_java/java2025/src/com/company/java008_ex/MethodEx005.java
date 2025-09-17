package com.company.java008_ex;

import java.util.Scanner;

public class MethodEx005 {

	
	
/// 과목 입력받기 1
//	public static void kor() {
//		System.out.println("국어점수를 입력하세요: ");
//	}
//	public static void eng() {
//		System.out.println("영어점수를 입력하세요: ");
//	}
//	public static void math() {
//		System.out.println("수학점수를 입력하세요: ");
//	}
	
	// 이름 입력받기
	public static String inputName(String nm) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("%s을 입력하세요: ",nm);
		return scanner.next();
	}
	
	// 과목을 파라미터로 넘겨 받기
	public static int inputScore(String s){
		Scanner scanner = new Scanner(System.in);
		System.out.print(s+"점수를 입력하세요.");
		
		return scanner.nextInt();
	}

	
	/// 총점 
	public static int process_total(int kor , int eng, int math) {
		return kor+eng+math;
	}
	
	/// 평균
	///process_avg(total)
	public static float process_avg(int total) {
		return total/3.0f;
	}
	
	// 통과
	///3.  합격  평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면  
	public static String process_pass(double avg , int kor, int eng, int math) {
		
		return avg<60?"불합격":kor<40 || eng<40 || math <40?"재시험":"합격";
	}
	
	// 장학생
	public static String process_scholar( double avg  ) {
		return avg>=95?"장학생":"--";
	}
	
	// 별점
	public static String process_star( double avg) {
		String res="";
		avg=(int)avg/10;
		
		for(int i=0; i<avg; i++) {
			res+="*";
		}
		
		return res;
		
	}
	
	// 출력
	  public static void process_show(String name, int kor, int eng, int math, 
			  int total, double avg, String pass, String jang, String star){
			
		  System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	      System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\n"
                  , "NAME", "KOR" , "ENG" , "MATH","TOTAL", "AVG" , "PASS","장학생", "LEVEL" );
		  
		  System.out.println("---------------------------------------------------------------------");
		  System.out.printf("%-5s\t%-5d\t%-5d\t%-5d\t%-5d\t%-5.2f\t%-5s\t%-5s\t%-5s\n"
					, name, kor, eng, math, total, avg, pass, jang, star);
		  
		  System.out.println("---------------------------------------------------------------------");
			
		}
	
	/////////////////////////////////////////////////
	public static void main(String[] args) {
	  // 변수
	  String name  = ""; 
      int kor=0, eng = 0, math = 0, total ;
      float avg = 0.0f; 
      String pass = "", jang = "", star= "";  
      
     
      //Scanner scanner = new Scanner(System.in);
      
      // public static 자료형 메서드명(재료값)
      
      //입력1

//      kor();
//	  kor = scanner.nextInt();
//	  eng();
//	  eng = scanner.nextInt();
//	  math();
//	  math = scanner.nextInt();
 
      
      // 이름 입력
      name = inputName("이름");
      // 입력2
      kor = inputScore("국어");
      eng = inputScore("영어");
      math = inputScore("수학");
     
	  // public static int process_total(int kor , int eng, int math)
	  // 총점 처리
	  total = process_total(kor , eng, math); 
	  
	  // 평균 처리
	  avg = process_avg(total); 
	  
	  
	  // 패스 처리
	  // public static String process_pass(doulbe avg , int kor, int eng, int math)
	  pass = process_pass(avg , kor, eng, math); 
	  
	  // 장학생 처리
	  // public static String process_scholar( double avg  )
	  jang = process_scholar(  avg  ); 
	  
	  
	  // 별점 처리
	  // public static String process_star( double avg)
	  star = process_star(avg);
	  
      //출력
	  process_show(name, kor, eng, math, total, avg, pass, jang, star);
	/////////////////////////////////////////////////
	}
}
/////////////////////////////////////////////////////
//연습문제5)  method
//패키지명 : com.company.java008_ex
//클래스명 :  MethodEx005
//
//public class MethodEx005{ 
//   public static void main(String[] args) {
//   /////////////////////(1)  변수
//      String name  = ""; 
//      int kor, eng, math, total ;
//      float avg = 0.0f; 
//      String pass = "";
//      String jang = "";
//      String star= "";  
//      Scanner scanner = new Scanner(System.in);
//      
//      /////////////////////(2) 입력 : 이름, 국어, 영어, 수학점수를 입력받으시오.
//   
//      /////////////////////(3) 처리 : 
//      total = process_total(kor , eng, math);    // 1. 총점처리
//      
//      avg = process_avg(total);    //2.  평균처리
//      
//      ////////3.  합격  평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면  
//      pass = process_pass(avg , kor, eng, math);  
//      
//      //////// 4. 평균이 95점이상이면 장학생
//      jang = process_scholar(  avg  ); 
//      
//      //////// 5. 평균점수대로 별표 붙이기 , 예) 70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개 
//      star = process_star(avg);  
//      
//      
//      /////////////////////(4) 출력
//      process_show(name, kor, eng, math, total, avg, pass, jang, star);
//    
//      
//   }// end main
// 
//   
//}// end class
//
// 
//::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: 
//이름      국어   영어   수학   총점  평균    합격여부   장학생   랭킹
//--------------------------------------------------------------------------------------------
//아이언맨   100   100   100   300    100.0    합격      장학생   **********
//--------------------------------------------------------------------------------------------


//연습문제6)   
//패키지명: com.company.java008_ex 
//클래스명: MethodEx006
//1. 당신은 게임 캐릭터의 능력치를 분석하는 프로그램을 만들려고 합니다.  
//사용자로부터 캐릭터 이름과 공격력, 방어력, 민첩성을 입력받아 
//총합, 평균, 등급, 별표 랭킹, 추천 퀘스트, 캐릭터 타입을 출력하는 프로그램을 작성하세요.
//
//
//1 (1단계) 변수 선언  
//아래와 같은 변수를 선언하세요:
//- `String name` : 캐릭터 이름  
//- `int attack, defense, speed` : 능력치  
//- `int total` : 능력치 총합  
//- `float avg` : 평균  
//- `String grade, star, quest, type` : 등급, 별표, 퀘스트, 캐릭터 타입  
//- `Scanner scanner` : 입력 도구
//
//2 (2단계) 입력 처리  
//사용자로부터 다음 정보를 입력받으세요:
//- 캐릭터 이름
//- 공격력 (0~100)
//- 방어력 (0~100)
//- 민첩성 (0~100)
//
//3 (3단계) 메서드 작성 및 호출  
//아래 기능을 각각 메서드로 작성하고, main 메서드에서 호출하세요:
//
//| 기능 | 메서드명 | 설명 |
//|------|----------|------|
//| 총합 계산 | `process_total()` | 공격력 + 방어력 + 민첩성 |
//| 평균 계산 | `process_avg()` | 총합 ÷ 3 |
//| 등급 처리 | `process_grade()` | 평균에 따라 S~D 등급 |
//| 별표 처리 | `process_star()` | 평균 점수대별 별 개수 |
//| 퀘스트 추천 | `process_quest()` | 평균에 따라 추천 퀘스트 |
//| 캐릭터 타입 | `process_type()` | 가장 높은 능력치 기준 |
//
//
//4 (4단계) 출력 메서드 작성  
//`process_show()` 메서드를 만들어 다음 정보를 출력하세요:
//
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//캐릭터   공격력   방어력   민첩성   총합   평균   등급   랭킹   추천퀘스트   캐릭터타입
//-------------------------------------------------------------------------------------------------
//피카츄   85   90   95   270   90.0   S등급   *********   전설의 용 퇴치   도적형
//-------------------------------------------------------------------------------------------------
// 
//5   보너스 과제 (선택)
//- 평균이 100점이면 “전설의 영웅” 칭호를 부여해보세요.
//- 여러 캐릭터를 배열로 입력받아 비교하는 기능으로 확장해보세요.
 