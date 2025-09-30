package com.company.java013_ex;

import java.util.Arrays;

abstract class Astronaut {
	protected String name;
	protected int stamina;

	public void setName(String name) { this.name = name; }
	public String getName() { return name; }
	public void setStamina(int stamina) { this.stamina = stamina; }
	public int getStamina() { return stamina; }

	abstract void explore();
	abstract void report();
	abstract void rest();
}

class Engineer extends Astronaut {
	@Override void explore() { System.out.println(super.name 
			+ "엔지니어 탐사: 기계 장치 점검 완료! 체력 "+super.getStamina()); }
	@Override void report() { System.out.println(super.name 
			+ " 보고서: 에너지 시스템 안정적 체력 "+super.getStamina()); }
	@Override void rest() { System.out.println(super.name 
			+ " 휴식: 공구 정리하며 재충전 중... 현재 체력: "); }
}

class Biologist extends Astronaut {
	@Override void explore() { System.out.println(super.name 
			+ " 생물학자 탐사: 외계 식물 샘플 채취! 체력 "+super.getStamina()); }
	@Override void report() { System.out.println(super.name + " 보고서: 생명체 흔적 발견"); }
	@Override void rest() { System.out.println(super.name 
			+ " 휴식: 생체 리듬 조절 중...현재 체력: "); }
	}

class Pilot extends Astronaut {
	@Override void explore() { System.out.println(super.name 
			+ " 파일럿 탐사: 항로 재설정 및 우주선 조종! 체력 "+super.getStamina()); }
	@Override void report() { System.out.println(super.name + " 보고서: 궤도 진입 성공");}
	@Override void rest() { System.out.println(super.name 
			+ " 휴식: 조종석에서 짧은 명상...현재 체력: "); }
}


public class AbstractEx002 {
	public static void main(String[] args) {
	
      // Astronaut astro = new Astronaut();  // Q1. 왜 객체 생성이 불가능한가?
	  // 이건 먼 과거에서 부터 시작된 이야기야....
	  // 구현 {} 하는 파트가 없어서 그렇다는데.. 비밀이야..

      System.out.println("\n--- 우주 탐사 대원 시뮬레이션 ---");
      Astronaut[] crew = { new Engineer(), new Biologist(), new Pilot() };
      String[] names = { "Nova", "Flora", "Jet" };
      int[] stamina = { 75, 60, 85 };
      
      for(int i=0; i < crew.length; i++) {
    	  	crew[i].name = names[i]; 
    	  	
    	  	// 스테미나 랜덤 휴식
    	  	stamina[i]=(int)(Math.random() * 20 + 5);
    	  	
    	  	
    	  	// 체력소모
    	  	crew[i].setStamina(stamina[i]*-1);
    	  	// 체력소모 받앙
    	  	int now = crew[i].getStamina();
    	  	
    	  	
    	  	
    	  	
    	  	
      }
      
      
	}
}
//연습문제2)
//패키지명 : com.company.java013_ex 
//클래스명 : AbstractEx002.java
//다음과 같이 출력되게 main 코드를 작성하시오.
//주어진 조건
//1) 상속도 구조 
//          Object
//            ↑
//      Astronaut { abstract explore(), report(), rest() }
// ↑            ↑               ↑ 
//Engineer     Biologist       Pilot
//{ @explore(), @explore(),    @explore(),
//@report(),  @report(),     @report(),
//@rest() }   @rest() }      @rest() }
//
//- Astronaut는 추상 클래스이며, 모든 대원이 공통적으로 수행해야 할 기능을 설계함
//- 각 대원 클래스는 Astronaut를 상속받아 기능을 구체적으로 구현함
//- rest() 메서드는 각 대원의 고유한 휴식 방식 출력  
//
//2) 코드
//abstract class Astronaut {
//  protected String name;
//  protected int stamina;
//
//  public void setName(String name) { this.name = name; }
//  public void setStamina(int stamina) { this.stamina = stamina; }
//  public int getStamina() { return stamina; }
//
//  abstract void explore();
//  abstract void report();
//  abstract void rest();
//}
//
//class Engineer extends Astronaut {
//  @Override void explore() { System.out.println(name + " 엔지니어 탐사: 기계 장치 점검 완료!"); }
//  @Override void report() { System.out.println(name + " 보고서: 에너지 시스템 안정적"); }
//  @Override void rest() { System.out.println(name + " 휴식: 공구 정리하며 재충전 중..."); }
//}
//
//class Biologist extends Astronaut {
//  @Override void explore() { System.out.println(name + " 생물학자 탐사: 외계 식물 샘플 채취!"); }
//  @Override void report() { System.out.println(name + " 보고서: 생명체 흔적 발견"); }
//  @Override void rest() { System.out.println(name + " 휴식: 생체 리듬 조절 중..."); }
//}
//
//class Pilot extends Astronaut {
//  @Override void explore() {
//      System.out.println(name + " 파일럿 탐사: 항로 재설정 및 우주선 조종!");
//  }
//  @Override void report() {
//      System.out.println(name + " 보고서: 궤도 진입 성공");
//  }
//  @Override void rest() {
//      System.out.println(name + " 휴식: 조종석에서 짧은 명상...");
//  }
//}
//
//3) main
//public class AbstractEx002 {
//  public static void main(String[] args) {
//      // Astronaut astro = new Astronaut();  // Q1. 왜 객체 생성이 불가능한가?
//
//      System.out.println("\n--- 우주 탐사 대원 시뮬레이션 ---");
//      Astronaut[] crew = { new Engineer(), new Biologist(), new Pilot() };
//      String[] names = { "Nova", "Flora", "Jet" };
//      int[] stamina = { 75, 60, 85 };
//
//      // Q2. 체력이 낮은 대원만 휴식  70미만이 휴식을 취하게 만들기 
//  }
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

////> 주어진조건: 
//1. explore() 시 체력 감소: stamina -= (int)(Math.random() * 20 + 5); → 5~24 사이의 랜덤한 체력 소모
//2. report() 시 체력 회복: stamina += 10;
//3. 체력이 70 미만이면 rest() 호출
//4. 체력은 0 미만으로 떨어지지 않도록 제한
//
//
//> 결과 예시 (실행 시마다 달라짐)
//코드
//Nova 엔지니어 탐사: 기계 장치 점검 완료! 체력 -18
//Nova 보고서: 에너지 시스템 안정적. 체력 +10
//→ 현재 체력: 67
//
//Flora 생물학자 탐사: 외계 식물 샘플 채취! 체력 -12
//Flora 보고서: 생명체 흔적 발견. 체력 +8
//Flora 휴식: 생체 리듬 조절 중... 체력 +20
//→ 현재 체력: 76
//
//Jet 파일럿 탐사: 항로 재설정 및 우주선 조종! 체력 -23
//Jet 보고서: 궤도 진입 성공. 체력 +12
//→ 현재 체력: 74
