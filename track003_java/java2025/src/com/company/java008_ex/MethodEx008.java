package com.company.java008_ex;

import java.util.Arrays;

public class MethodEx008 {

	public static void upper(char [] ch){
		
		for(int i=0; i<ch.length; i++) {
			ch[i]-=32;
		}
	}
	
	/////////////////////////////////////////////////
	public static void main(String[] args) {
		char[] ch = {'a','b','c'};
		// public static void upper(char ch){}
		upper(ch);  
		System.out.println("main. 배열값 : "      +  Arrays.toString(ch)          );  // [A,B,C]
	}
	/////////////////////////////////////////////////
//	연습문제8)  method
//	패키지명 : com.company.java008_ex
//	클래스명 :  MethodEx008
//
//	public class MethodEx008{ 
//	    char[] ch = {'a','b','c'};
//	    upper(ch);     
//	    System.out.println("main. 배열값 : "      +  Arrays.toString(ch)          );  // [A,B,C]
//	}
//
//
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

}
