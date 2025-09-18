package com.company.java008_ex;

import java.util.Arrays;
import java.util.Scanner;

public class MethodEx009 {

	public static void who_are_you(String [][] users){  
			Scanner scanner = new Scanner(System.in);
			System.out.print("아이디 입력받기");
			String id = scanner.next();
			
			for(int ch=0; ch<users.length; ch++) {
				for(int kan=0; kan<users[ch].length; kan++) {
					
					if(id.equals(users[ch][kan])) {
						System.out.println(users[ch][2]+"인 입니다.");
						break;
					}
					
				}
				
			}
			
		}
	  public static void who_pass_change(String [][] users){ 
		  Scanner scanner = new Scanner(System.in);
			
		  String id="", pw="";
		  
		  System.out.print("아이디 입력받기");
		  id = scanner.next();
		
		  System.out.print("비밀번호 입력받기");
		  pw = scanner.next();
		  

		  
		  for(int ch=0; ch<users.length; ch++) {
				for(int kan=0; kan<users[ch].length; kan++) {
					
					// 내가 입력한 id가 [ch][kan]과 같아야 하는데... 0,1, 1,2, 2,2? 어떤것과 같은지 모름
					// id는 0칸, pw는 1칸, 층만 다르고 칸은 같으므로 반드시 확인하기!
					if(id.equals(users[ch][0]) && pw.equals(users[ch][1])) {
						System.out.print("변경할 비밀번호를 입력하세요");
						users[ch][1]= scanner.next();
						break;
					}
					
					
				}
			
		  }
		  
		 System.out.println(Arrays.deepToString(users));
		  
	  }
	/////////////////////////////////////////////////
	public static void main(String[] args) {
		//변수
			String [][] users = {
			{ "aaa"  , "111"   , "한국"     } ,     // 00 01 02
			{ "bbb" , "222"   , "호주"       } ,       // 10 11 12
			{ "ccc"  , "333"   , "중국"      }};      // 20 21 22
			
		//입력
		   who_are_you(users);    
		   who_pass_change(users); 
	
	}
	/////////////////////////////////////////////////

//	연습문제9)  method
//	패키지명 : com.company.java008_ex
//	클래스명 :  MethodEx009
//
//	public class MethodEx009{ 
//	   // 변수
//	   String [][] users = {{ "aaa"  , "111"   , "한국"     } ,     // 00 01 02
//	                      { "bbb" , "222"   , "호주"       } ,       // 10 11 12
//	                      { "ccc"  , "333"   , "중국"      }};      // 20 21 22
//	   // 입력
//	   who_are_you(users);    
//	   //  public static void who_are_you(String [][] users){  아이디를입력받아서 나라조회 }
//	   who_pass_change(users); 
//	   //  public static void who_pass_change(String [][] users){ 아이디,비밀번호가 맞으면 비밀번호 바꾸기}
//	}
//
//	출력내용) who_are_you(users);    
//	//  public static void who_are_you(String [][] users){  아이디를입력받아서 나라조회 }
//	아이디를 입력해주세요>aaa
//	aaa는 한국사람입니다.
//
//
//	출력내용)
//	who_pass_change(users); 
//	//  public static void who_pass_change(String [][] users){ 아이디,비밀번호가 맞으면 비밀번호 바꾸기}
//
//	아이디를 입력해 주세요 > bbb
//	비밀번호를 입력해 주세요 > 123
//	유저를 확인해주세요!
//
//	아이디를 입력해 주세요 > bbb
//	비밀번호를 입력해 주세요 > 222
//	변경하실 비밀번호를 입력해주세요123
//	정보확인 : [bbb, 123, 호주]
//
	
	
	
//	연습문제10)  method
//	패키지명 : com.company.java008_ex
//	클래스명 :  MethodEx010
//	다음 조건을 만족하는 동물 병원 예약 시스템을 만들어보세요.
//
//	■[1단계] 데이터 구성
//	다음과 같은 정보를 담고 있는 2차원 배열을 선언하세요:
//
//	String[][] pets = {
//	    {"콩이", "010-1234-5678", "예방접종"},
//	    {"초코", "010-2345-6789", "건강검진"},
//	    {"보리", "010-3456-7890", "치아관리"}
//	};
//
//	- 각 행은 한 마리의 동물에 대한 정보입니다.
//	  - [0] 동물 이름
//	  - [1] 보호자 전화번호
//	  - [2] 예약된 진료 항목
//
//	■ [2단계] 메뉴 출력 및 선택
//	다음과 같은 메뉴를 **무한 반복**으로 출력하세요:
//
//	🐾 동물 병원 시스템 메뉴
//	1. 진료 항목 조회
//	2. 진료 항목 변경
//	3. 종료
//	👉 메뉴 번호를 선택해주세요:
//	 
//
//
//	■ [3단계] 기능 구현
//
//	#### ① 진료 항목 조회
//	- 동물 이름을 입력받아 해당 동물의 진료 항목을 출력하세요.
//	> 출력예시
//	🐶 동물 이름을 입력해주세요 > 콩이
//	✅ 콩이는 예방접종 예약이 되어 있어요.
//	 
//
//	#### ② 진료 항목 변경
//	> 출력예시
//	- 동물 이름과 보호자 전화번호를 입력받아 정보가 맞으면 진료 항목을 변경하세요.
//
//	🐱 동물 이름을 입력해주세요 > 초코
//	📞 보호자 전화번호를 입력해주세요 > 010-2345-6789
//	🩺 변경하실 진료 항목을 입력해주세요 > 피부검사
//	✅ 예약 정보 확인: [초코, 010-2345-6789, 피부검사]
//	 
//
//	- 정보가 틀리면 다음과 같이 출력하세요:
//	 
//	❌ 등록 정보를 확인해주세요!
//	 
//
//	#### ③ 종료
//	- 메뉴에서 3번을 선택하면 프로그램을 종료하세요.
//	 
//	👋 시스템을 종료합니다. 안녕히 가세요!
//	 
//	 
//	 
//
//	###  ④  보너스 과제 (선택)
//
//	- 신규 동물 등록 기능을 추가 
//	- 전체 예약 목록을 출력하는 기능 
//	- 진료 항목을 랜덤으로 추천해주는 기능 
//	 
}
