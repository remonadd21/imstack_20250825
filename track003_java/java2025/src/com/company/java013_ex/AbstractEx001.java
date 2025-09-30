package com.company.java013_ex;

/* Abscrtact : 일반 클래스 + 설계 - 추상클래스 : 공통 기능 설계
 * 
 * 
 * 							Object
 * 					
 * 							  ↑
 * 							Robot	{abstract charge(), move(), speak()}
 * 
 * 		↑					  ↑					↑
 * 	CleaningRobot		SecurityRobot		CookingRobot
 * 	@charge				@charge				@charge	
 * 	@move				@move				@move
 * 	@speak				@speak				@speak
 * 		
 * */

abstract class Robot{
	String model;
	int batteryLevel;
	
	void myrobot() {System.out.println("로봇입니다.");}
	
	abstract void charge();		// 충전방식
	abstract void move();		// 이동방식
	abstract void speak();		// 말하기 방식
}

class CleaningRobot extends Robot{	// 구현부 클래스


	@Override void charge() { System.out.println(super.model+"청소로봇 충전 중... 배터리 "+super.batteryLevel+"%"); }
	@Override void move() {  System.out.println("청소로봇: 청소 중");}
	@Override void speak() { System.out.println(super.model+"청소로봇: 먼지를 제거합니다!"); }
	
}
class SecurityRobot extends Robot{	// 구현부 클래스


	@Override void charge() { System.out.println(super.model+"경비로봇 태양광 충전 중... 배터리 "+super.batteryLevel+"%"); }
	@Override void move() {   System.out.println("경비로봇: 경비 중");}
	@Override void speak() { System.out.println(super.model+"경비로봇: 이상 없음. 안전 확보!"); }
	
}
class CookingRobot extends Robot{	// 구현부 클래스


	@Override void charge() { System.out.println(super.model+"요리로봇 인덕션 충전 중... 배터리 "+super.batteryLevel+"%");}
	@Override void move() {  System.out.println("요리로봇: 요리만드는 중"); }
	@Override void speak() { System.out.println(super.model+"요리로봇: 오늘의 메뉴는 파스타입니다!");  }
	
}

public class AbstractEx001 {
	public static void main(String[] args) {
			// Robot robot = new Robot(); 
			//Q1.why? 구현부가 없어서 에러가 발생함
		Robot [] bots = {new CleaningRobot(), new SecurityRobot(), new CookingRobot()};
		int [] levels = {50, 70, 95};
		int cnt = 0;

		for(int i=0; i<bots.length; i++) {
		   bots[i].model="Robo"+(i+1);  bots[i].batteryLevel=levels[i];		
		   bots[i].charge(); bots[i].move(); bots[i].speak();
		}
//bots[0] = 1번지 CleaningRobot{@charge(), @move(), @speak()}-Robot{model="Robo1", batteryLevel=50}
//bots[1] = 2번지 CleaningRobot{@charge(), @move(), @speak()}-Robot{model="Robo1", batteryLevel=70}
//bots[2] = 3번지 CleaningRobot{@charge(), @move(), @speak()}-Robot{model="Robo1", batteryLevel=95}
	}

}
/*
 * 	method area : 클래스 정보
 * 
 * 	heap area : 동적, 배열 			stack area	: 임시
 *  	1번지 {model, battery, charge()X}

heap area: 동적,배열              stack area : 임시
1번지{model, battery, charge()X} ← robot(1번지)
 
--- 로봇 배열 시뮬레이션 ---
Robo1 청소로봇 충전 중... 배터리 50%
Robo1 청소로봇: 먼지를 제거합니다!
Robo2 경비로봇 태양광 충전 중... 배터리 70%
Robo2 경비로봇: 이상 없음. 안전 확보!
Robo3 요리로봇 인덕션 충전 중... 배터리 95%
Robo3 요리로봇: 오늘의 메뉴는 파스타입니다!
*/


//연습문제2)
//패키지명 : com.company.java013_ex 
//클래스명 : AbstractEx002.java
//다음과 같이 출력되게 main 코드를 작성하시오.
//주어진 조건
//1) 상속도 구조 
//            Object
//              ↑
//        Astronaut { abstract explore(), report(), rest() }
//   ↑            ↑               ↑ 
//Engineer     Biologist       Pilot
//{ @explore(), @explore(),    @explore(),
//  @report(),  @report(),     @report(),
//  @rest() }   @rest() }      @rest() }
//  
//- Astronaut는 추상 클래스이며, 모든 대원이 공통적으로 수행해야 할 기능을 설계함
//- 각 대원 클래스는 Astronaut를 상속받아 기능을 구체적으로 구현함
//- rest() 메서드는 각 대원의 고유한 휴식 방식 출력  
//
//2) 코드
//abstract class Astronaut {
//    protected String name;
//    protected int stamina;
//
//    public void setName(String name) { this.name = name; }
//    public void setStamina(int stamina) { this.stamina = stamina; }
//    public int getStamina() { return stamina; }
//
//    abstract void explore();
//    abstract void report();
//    abstract void rest();
//}
//
//class Engineer extends Astronaut {
//    @Override void explore() { System.out.println(name + " 엔지니어 탐사: 기계 장치 점검 완료!"); }
//    @Override void report() { System.out.println(name + " 보고서: 에너지 시스템 안정적"); }
//    @Override void rest() { System.out.println(name + " 휴식: 공구 정리하며 재충전 중..."); }
//}
//
//class Biologist extends Astronaut {
//    @Override void explore() { System.out.println(name + " 생물학자 탐사: 외계 식물 샘플 채취!"); }
//    @Override void report() { System.out.println(name + " 보고서: 생명체 흔적 발견"); }
//    @Override void rest() { System.out.println(name + " 휴식: 생체 리듬 조절 중..."); }
//}
//
//class Pilot extends Astronaut {
//    @Override void explore() {
//        System.out.println(name + " 파일럿 탐사: 항로 재설정 및 우주선 조종!");
//    }
//    @Override void report() {
//        System.out.println(name + " 보고서: 궤도 진입 성공");
//    }
//    @Override void rest() {
//        System.out.println(name + " 휴식: 조종석에서 짧은 명상...");
//    }
//}
//
//3) main
//public class AbstractEx002 {
//    public static void main(String[] args) {
//        // Astronaut astro = new Astronaut();  // Q1. 왜 객체 생성이 불가능한가?
//
//        System.out.println("\n--- 우주 탐사 대원 시뮬레이션 ---");
//        Astronaut[] crew = { new Engineer(), new Biologist(), new Pilot() };
//        String[] names = { "Nova", "Flora", "Jet" };
//        int[] stamina = { 75, 60, 85 };
//
//        // Q2. 체력이 낮은 대원만 휴식  70미만이 휴식을 취하게 만들기 
//    }
//}
//
//출력화면
//--- 우주 탐사 대원 시뮬레이션 ---
//Nova 엔지니어 탐사: 기계 장치 점검 완료!
//Nova 보고서: 에너지 시스템 안정적
//Nova는 충분한 체력을 유지 중입니다.
//
//Flora 생물학자 탐사: 외계 식물 샘플 채취!
//Flora 보고서: 생명체 흔적 발견
//Flora 휴식: 생체 리듬 조절 중...
//
//Jet 파일럿 탐사: 항로 재설정 및 우주선 조종!
//Jet 보고서: 궤도 진입 성공
//Jet는 충분한 체력을 유지 중입니다.
//
