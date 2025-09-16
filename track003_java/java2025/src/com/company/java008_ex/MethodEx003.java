package com.company.java008_ex;

public class MethodEx003 {
	
	public static void printProfile(String name, int age, String loca) {
		System.out.println("=== 사용자 프로필 ===\n이름:"+name+"\n나이:"+age+"\n지역:"+loca);
		
	}
	public static void line() {System.out.println("==================");}
	public static void checkAge(int age){
		if( age<19) {
			System.out.println("미성년자 입니다.");
		}
		else {
			System.out.println("미성년자가 아닙니다.");
		}
	}
	public static void repeatMessage(String hello, int num){
		
		for(int i=0; i<num; i++) {
			System.out.println(hello);
		}
	}
	public static void drawBox(int num, char s){

// ver-1
//	System.out.print("#");System.out.print("#");System.out.print("#");System.out.print("#");System.out.print("#");
//	System.out.println();
//	System.out.print("#");System.out.print("#");System.out.print("#");System.out.print("#");System.out.print("#");
//	System.out.println();

		// ver-2
		for(int j=0; j<num; j++) {
			for(int i=0; i<num; i++) {
				System.out.print(s);
			}
			System.out.println();
		}
	}
	
	
	
	
	/////////////////////////////////////////////////
	public static void main(String[] args) {
		printProfile("홍길동", 25, "서울"); 
		line();
		checkAge(17); 
		line();
		repeatMessage("안녕하세요!", 3);
		line();
		drawBox(5, '#');
	}
	/////////////////////////////////////////////////
}
/*
패키지명 : com.company.java008_ex 
클래스명 : MethodEx003 다음과 같이 
printProfile(), checkAge(), repeatMessage(), drawBox() 메서드를 정의하시오.

public static void main(String[] args) {
    // public static 리턴값 메서드명(파라미터)
    printProfile("홍길동", 25, "서울");   // 이름, 나이, 지역 출력
    checkAge(17);                      // 미성년자 여부 판단
    repeatMessage("안녕하세요!", 3);     // 메시지 반복 출력
    drawBox(5, '#');                   // 문자로 박스 출력
}
■ 출력 예시
=== 사용자 프로필 ===
이름: 홍길동
나이: 25
지역: 서울
===================
미성년자입니다.
안녕하세요!
안녕하세요!
안녕하세요!
#####
#####
#####
#####
#####









*/