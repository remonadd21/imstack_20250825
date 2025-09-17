package com.company.java008_ex;

import java.util.Scanner;

public class MethodEx006 {
	
	// 이름 입력
	public static String inputName(String nm){
		Scanner scanner = new Scanner(System.in);
		System.out.printf("%s을 입력하세요: ",nm);
		return scanner.next();
	}
	
	// 능력치 입력
	public static int inputAbility(String tx) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(tx+"을 입력하세요: ");
		return scanner.nextInt();
	}
	
	// 능력치 총합
	public static int process_total(int attack, int defense, int speed)
	{
		return attack+defense+speed;
	}
	
	// 능력치 평균
	public static float process_avg(int total) {
		return total/3.0f;
	};
	
	
	// s~d 등급
	public static String process_grade(double avg){
		return avg>=95?"S등급":avg>=90?"A등급":avg>=80?"B등급":avg>=75?"C등급":"D등급";
	}
	
	// 별점
	public static String process_star(double avg){
		avg = (int)avg/10;
		String star="";
		
		for(int i=0; i<avg; i++) {
			star+="★";
		}
		
		return star;
		
	}
	
	
	// 평균에 따른 퀘스트
	public static String process_quest(double avg) {
		
		return avg>=95?"무적의 마왕격퇴":avg>=90?"전설의 용 퇴치":avg>=85?"마왕 군단 토벌":avg>75?"암흑무리 격퇴":"도적단 토벌";
	}
	
	
	// 타입
	public static String process_type(double avg) {
		return avg==100?"전설의 영웅":avg>=95?"절대 무적형":avg>=85?"용자형":avg>=75?"마법사형":"도적형";
	} 
	                         
	// 출력
	public static void process_print(String name, int attack, int defense, int speed, 
			int total, double avg, String grade, String quest, String type) {
		   System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	      System.out.printf("%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t\t%-5s\n"
                 , "캐릭터", "공격력" , "방어력" , "민첩성","총합", "평균" , "등급",  "추천퀘스트",   "캐릭터타입" );
		  
		  System.out.println("------------------------------------------------------------------------------------");
		  System.out.printf("%-5s\t%-5d\t%-5d\t%-5d\t%-5d\t%-5.2f\t%-5s\t%-5s\t%-5s\n"
					, name, attack, defense, speed, total, avg, grade, quest, type);
		  
		  System.out.println("------------------------------------------------------------------------------------");
	};

	/////////////////////////////////////////////////
	public static void main(String[] args) {
		
		// 변수
		String name="", grade="", star="", quest="", type="";
		// 이름,		등급, 	별표, 	퀘스트, 	타입
		
		int attack, defense, speed, total;
		float avg;
		// 입력
		// public static 리턴값 메서드명 (재료값){}
		// public static String inputName(String nm){}
		name = inputName("이름");
		
		do {
			attack = inputAbility("공격력(0~100)");
		}while(!(attack>=0 && attack<=100));
		
		do {
			defense = inputAbility("방어력(0~100)");
		}while(!(defense>=0 && defense<=100));
		
		do {
			speed = inputAbility("스피드(0~100)");
		}while(!(speed>=0 && speed<=100));
		
		// 처리 총점
		// public static int abilityTotal(int attack, int defense, int speed)
		total = process_total(attack, defense, speed);
		
		
		// 처리 평균
		avg = process_avg(total);
		
		
		// 평균에 따른 등급 s~d 까지
		// public static String process_grade(double avg){}
		grade = process_grade(avg);
		
		
		// 평균에 따른 별점
		// public static String process_star(double avg){}
		star = process_star(avg);
	
		// 평균에 따른 퀘스트
		// public static String process_quest(avg) {}
		quest = process_quest(avg);
		
		// 호칭
		// public static String process_type(avg) {} 
		type = process_type(avg);
		
		// 출력
		process_print(name, attack, defense, speed, total, avg, grade, quest,type);
		
		
	}
	/////////////////////////////////////////////////
}
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