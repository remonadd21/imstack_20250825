package com.company.java008_ex;

public class MethodEx001_test {

	public static void dog() {
		System.out.println("멍멍!");
	}
	
	public static void disp(int num , char s) {
		
		for(int i=0; i<num; i++) {
			System.out.print(s);
		}
	}
	
	public static String stdAvg(double avg) {
		return avg>=90?"A":avg>=80?"B":avg>=70?"C":"D";
	}
	
	///////////////////////////////////////////////////
	public static void main(String[] args) {
		System.out.println("🐶강아지가 등장합니다.");
		// public static 자료형 메서드명()
		dog();
		
		System.out.println("🎯강아지가 시험을 봤습니다. 점수를 공개합니다.");
		disp(7,'*');
		
		System.out.println("\n📊당신의 평과 결과는? ");
		System.out.println("당신의 평균은?"+ stdAvg(90));
	}
//	///////////////////////////////////////////////////
//	연습문제5)  method
//	패키지명 : com.company.java008_ex
//	클래스명 :  MethodEx005
//
//	public class MethodEx005{ 
//	   public static void main(String[] args) {
//	   /////////////////////(1)  변수
//	      String name  = ""; 
//	      int kor, eng, math, total ;
//	      float avg = 0.0f; 
//	      String pass = "";
//	      String jang = "";
//	      String star= "";  
//	      Scanner scanner = new Scanner(System.in);
//	      
//	      /////////////////////(2) 입력 : 이름, 국어, 영어, 수학점수를 입력받으시오.
//	   
//	      /////////////////////(3) 처리 : 
//	      total = process_total(kor , eng, math);    // 1. 총점처리
//	      
//	      avg = process_avg(total);    //2.  평균처리
//	      
//	      ////////3.  합격  평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면  
//	      pass = process_pass(avg , kor, eng, math);  
//	      
//	      //////// 4. 평균이 95점이상이면 장학생
//	      jang = process_scholar(  avg  ); 
//	      
//	      //////// 5. 평균점수대로 별표 붙이기 , 예) 70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면 별10개 
//	      star = process_star(avg);  
//	      
//	      
//	      /////////////////////(4) 출력
//	      process_show(name, kor, eng, math, total, avg, pass, jang, star);
//	    
//	      
//	   }// end main
//	 
//	   
//	}// end class
//
//	 
//	::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: 
//	이름      국어   영어   수학   총점  평균    합격여부   장학생   랭킹
//	--------------------------------------------------------------------------------------------
//	아이언맨   100   100   100   300    100.0    합격      장학생   **********
//	--------------------------------------------------------------------------------------------


}
