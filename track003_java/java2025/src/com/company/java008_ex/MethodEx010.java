package com.company.java008_ex;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MethodEx010 {
	
	
	// 입력
	public static String scan() {
		Scanner scanner = new Scanner(System.in);
		return scanner.next();
	}
	
	

	
	public static void animal_name(String [][] pets) {
		
		System.out.print("🐱 동물의 이름을 입력하세요: ");
		String name = scan();
		
		for(int ch=0; ch<pets.length; ch++) {
			for(int kan=0; kan<pets[ch].length; kan++) {
				if(name.equals(pets[ch][0])) {
					System.out.println("=======================================\n"
							+pets[ch][0]+"는 예방 접종이 예약되어 있습니다.\n"
							+ "=======================================");
					break;
				}
				
			}
		}
		
	}; //end 동물이름
	
	public static void animal_info(String [][] pets) {
		
		
		System.out.print("🐱 동물의 이름을 입력하세요: ");
		String name = scan();
		
		System.out.print("📞 보호자 전화번호를 입력해주세요: ");
		String tel = scan();
		
		
		for(int ch=0; ch<pets.length; ch++) {
			for(int kan=0; kan<pets[ch].length; kan++) {
				if(name.equals(pets[ch][0]) && tel.equals(pets[ch][1])) {
					System.out.print("🩺 변경하실 진료 항목을 입력해주세요: ");
					String chn = scan();
					pets[ch][2]=chn;
					
					System.out.println("✅ 예약 정보 확인: [동물이름:"+pets[ch][0]+", "
							+ "전화번호:"+pets[ch][1]+", 검진:"+pets[ch][2]+"]");
					break;
				}
				
			}
		}
		//✅ 예약 정보 확인: [초코, 010-2345-6789, 피부검사]
		//System.out.println(Arrays.deepToString(pets));
		
	}; //end 동물정보
	
	

	public static void newAnimal(String [][] petPlus){
		
		//변수
		String chk="";
		int find=-1;
		
		
		// 입력받기
		System.out.print("🐱 동물의 이름을 입력하세요: ");
		String name = scan();
		
		System.out.print("📞 보호자 전화번호를 입력해주세요: ");
		String tel = scan();
	
		
		for(int i=0; i<petPlus.length; i++) {
			if(name.equals(petPlus[i][0]) && tel.equals(petPlus[i][1])) {
				
				System.out.println("해당하는 정보가 있습니다. 확인해주세요");
				find=i;
				break;
			}
		}
		if(!(find !=-1)) {
			System.out.print("=======================\n"
					+ "🩺 진료 과목을 입력해주세요: ");
			chk = scan();
		}else {
			System.out.println("=======================\n"
					+ "해당 정보가 있습니다.\n"
					+ "정보를 확인해 주세요.\n"
					+ "=======================");
		}
		
	
		petPlus[3][0]=name;
		petPlus[3][1]=tel;
		petPlus[3][2]=chk;
		System.out.println("✅ 예약 정보 확인: [동물이름:"+petPlus[3][0]+", "
				+ "전화번호:"+petPlus[3][1]+", 검진:"+petPlus[3][2]+"]");
		
		//System.out.println(Arrays.deepToString(petPlus));
		
		
	}// 애니멀 추가 등록

	public static void animal_sav(String [][] petPlus) {
			
		for(int ch=0; ch<petPlus.length; ch++) {
			for(int kan=0; kan<petPlus[ch].length; kan++) {
				System.out.print(petPlus[ch][kan]+"\t");
			}
			System.out.println();
		}
	};// 전체 예약 목록
	
	
	public static void animal_random(String [][] petPlus) {
		
		String [] helth = {"건강검진","피부염","치아관리","예방접종","초음파","관절치료","이상증상"};
		
		Random rand = new Random();
		int result = rand.nextInt(7); //0~7
		
		System.out.println("===============\n"+"진료항목: "
							+helth[result]+
							"\n===============");
		
	}
	// 랜덤 질병
	
	
	
	///////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		
		//변수(배열)
		
		String[][] pets = {
		    {"콩이", "010-1234-5678", "예방접종"},
		    {"초코", "010-2345-6789", "건강검진"},
		    {"보리", "010-3456-7890", "치아관리"}
		};
		
		
		// 새로운 배열 만들어서 기존 배열의 길이+1
		String [][] petPlus = new String [pets.length+1][];
		
		// pets의 데이터들 새로운 배열에 덮어주기
		for(int i=0; i<pets.length; i++) {
			petPlus[i] = pets[i];
		}
		
		// 새로만든 배열에 값 초기화
		petPlus[pets.length] = new String[] {"예약가능","예약가능","예약가능"};
		
		
		
		String sel;
		
		boolean i=true;
		while(i) {
			System.out.println("🐾 동물 병원 시스템 메뉴\n1. 진료 항목 조회\n2. 진료 항목 변경\n"
					+ "3. 신규 동물 등록\n4. 전체 예약 목록\n5. 진료 항목 랜덤\n9. 종료");
			
			
			
			
			//입력
			
			System.out.print("👉 메뉴 번호를 선택해주세요:");
			sel = scan();
			
			//처리
			// public static 리턴값 메서드명(파라미터){}
			switch(sel) {
				case "1": System.out.println("1. 진료 항목 조회");
				animal_name(pets);
				break;
				
				case "2": System.out.println("2. 진료 항목 변경");
				animal_info(pets);
				break;
				
				case "3": System.out.println("3. 신규 동물 등록");
				newAnimal(petPlus);
				break;
				
				case "4": System.out.println("4. 전체 예약 목록");
				animal_sav(petPlus);
				break;
				
				case "5": System.out.println("5. 진료 항목 랜덤");
				animal_random(petPlus);
				break;
				
			}
			if(sel=="9") {
				System.out.println("👋 시스템을 종료합니다. 안녕히 가세요!");
				break;
			}
			
			System.out.println(sel);
			// 출력
			
			 
		}
	}
	///////////////////////////////////////////////////////////////////////////////////////

}
//연습문제10)  method
//패키지명 : com.company.java008_ex
//클래스명 :  MethodEx010
//다음 조건을 만족하는 동물 병원 예약 시스템을 만들어보세요.
//
//■[1단계] 데이터 구성
//다음과 같은 정보를 담고 있는 2차원 배열을 선언하세요:
//
//String[][] pets = {
//    {"콩이", "010-1234-5678", "예방접종"},
//    {"초코", "010-2345-6789", "건강검진"},
//    {"보리", "010-3456-7890", "치아관리"}
//};
//
//- 각 행은 한 마리의 동물에 대한 정보입니다.
//  - [0] 동물 이름
//  - [1] 보호자 전화번호
//  - [2] 예약된 진료 항목
//
//■ [2단계] 메뉴 출력 및 선택
//다음과 같은 메뉴를 **무한 반복**으로 출력하세요:
//
//🐾 동물 병원 시스템 메뉴
//1. 진료 항목 조회
//2. 진료 항목 변경
//3. 종료
//👉 메뉴 번호를 선택해주세요:
// 
//
//
//■ [3단계] 기능 구현
//
//#### ① 진료 항목 조회
//- 동물 이름을 입력받아 해당 동물의 진료 항목을 출력하세요.
//> 출력예시
//🐶 동물 이름을 입력해주세요 > 콩이
//✅ 콩이는 예방접종 예약이 되어 있어요.
// 
//
//#### ② 진료 항목 변경
//> 출력예시
//- 동물 이름과 보호자 전화번호를 입력받아 정보가 맞으면 진료 항목을 변경하세요.
//
//🐱 동물 이름을 입력해주세요 > 초코
//📞 보호자 전화번호를 입력해주세요 > 010-2345-6789
//🩺 변경하실 진료 항목을 입력해주세요 > 피부검사
//✅ 예약 정보 확인: [초코, 010-2345-6789, 피부검사]
// 
//
//- 정보가 틀리면 다음과 같이 출력하세요:
// 
//❌ 등록 정보를 확인해주세요!
// 
//
//#### ③ 종료
//- 메뉴에서 3번을 선택하면 프로그램을 종료하세요.
// 
//👋 시스템을 종료합니다. 안녕히 가세요!
// 
// 
// 
//
//###  ④  보너스 과제 (선택)
//
//- 신규 동물 등록 기능을 추가 
//- 전체 예약 목록을 출력하는 기능 
//- 진료 항목을 랜덤으로 추천해주는 기능 
// 