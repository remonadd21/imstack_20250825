package com.company.java008_ex;

public class MethodEx004 {
	
	//문제1
	public static int return_num() {return 1;}
	
	//문제2
	public static float return_float() { return 10/3.0f; }
	
	//문제3
	public static String mycolor() { return "purple"; }
	
	//문제4
	public static String jangsu() { return "★★★★★"; }
	
	//문제5
	public static int myadd(int num1, int num2) { return num1+num2; }
	
	//문제6
	public static String myban(char s) {

		return s=='A'?"노랑조":s=='B'?"주황조":"";		
	}
	
	//문제7
	public static String stdId(int std) { return "G"+std; }
	
	//문제8
	public static String stdAvg(double avg) {
		return avg>=90?"A":avg>=80?"B":avg>=70?"C":"D";
	}
	/////////////////////////////////////////////////
	public static void main(String[] args) {
		// public static 리턴값 메서드명(){}
		System.out.println("1. 내가 좋아하는 숫자:" + return_num());
		System.out.println("2. 10/3.0을 실수로 표현 :" + return_float());
		System.out.println("3. BEST COLOR :" + mycolor());
		System.out.println("4. 장수돌침대 별이 :" + jangsu());
		System.out.println("5. 10+20= " + myadd(10,20));
		System.out.println("6. 반(노랑조/주황조)=" + myban('B'));
		System.out.println("7. 당신의 학번은?" + stdId(1111)); // G하고 넣어준 학번 나오게
		
		System.out.println("8.당신의 평균은?" + stdAvg(90)); 
		// 90점이상이면 A , 80점이상이면 B , 70점이상이면 C , 아니라면 D
	}
	/////////////////////////////////////////////////
}
/*
 * 
 * 연습문제4) method 패키지명 : com.company.java008_ex 클래스명 : MethodEx004
 * 
 * System.out.println("1. 내가 좋아하는 숫자    :" + return_num()); // 1을 결과값으로 줌
 * System.out.println("2. 10/3.0을 실수로 표현 :" + return_float()); // 3.3333을 결과값으로
 * System.out.println("3. BEST COLOR        :" + mycolor()); // PURPLE을 결과값으로
 * System.out.println("4. 장수돌침대 별이       :" + jangsu()); // ★★★★★을 결과값으로 줌
 * System.out.println("5. 10+20= " + myadd(10,20)); // 두숫자를 더한값을 결과값으로 줌
 * System.out.println("6. 반(노랑조/주황조)=" + myban('B')); // A이면 노랑조 , B이면 주황조
 * System.out.println("7. 당신의 학번은?" + stdId(1111)); // G하고 넣어준 학번 나오게
 * System.out.println("8.당신의 평균은?" + stdAvg(88)); // 90점이상이면 A , 80점이상이면 B ,
 * 70점이상이면 C , 아니라면 D
 * 
 * 출력결과 : 1. 내가 좋아하는 숫자 : 1 2. 10/3.0을 실수로 표현 : 3.3333 3. BEST COLOR : PURPLE 4.
 * 장수돌침대 별이 : ★★★★★ 5. 10+20= 30 6. 반(노랑조/주황조)= 나는 노랑조 7. 당신의 학번은? G1111 8. 당신의
 * 평균은? B
 * 
 * 
 * 
 * 
 * 연습문제5) method 패키지명 : com.company.java008_ex 클래스명 : MethodEx005
 * 
 * public class MethodEx005{ public static void main(String[] args) {
 * /////////////////////(1) 변수 String name = ""; int kor, eng, math, total ;
 * float avg = 0.0f; String pass = ""; String jang = ""; String star= "";
 * Scanner scanner = new Scanner(System.in);
 * 
 * /////////////////////(2) 입력 : 이름, 국어, 영어, 수학점수를 입력받으시오.
 * 
 * /////////////////////(3) 처리 : total = process_total(kor , eng, math); // 1.
 * 총점처리
 * 
 * avg = process_avg(total); //2. 평균처리
 * 
 * ////////3. 합격 평균이60이상이고, 각각 국어, 영어, 수학40이상/불합격/재시험-각각 40미만인게 있다면 pass =
 * process_pass(avg , kor, eng, math);
 * 
 * //////// 4. 평균이 95점이상이면 장학생 jang = process_scholar( avg );
 * 
 * //////// 5. 평균점수대로 별표 붙이기 , 예) 70점대이면 별7개, 80점대이면 별8개, 90점대이면 별9개 , 100점이면
 * 별10개 star = process_star(avg);
 * 
 * 
 * /////////////////////(4) 출력 process_show(name, kor, eng, math, total, avg,
 * pass, jang, star);
 * 
 * 
 * }// end main
 * 
 * 
 * }// end class
 * 
 * 
 * :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
 * :::::::::::::::::::: 이름 국어 영어 수학 총점 평균 합격여부 장학생 랭킹
 * -----------------------------------------------------------------------------
 * --------------- 아이언맨 100 100 100 300 100.0 합격 장학생 **********
 * -----------------------------------------------------------------------------
 * ---------------
 */