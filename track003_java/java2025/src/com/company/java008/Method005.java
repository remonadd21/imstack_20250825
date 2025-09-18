package com.company.java008;

import java.util.Arrays;

public class Method005 {
	
	public static void call(int a) {
		System.out.println("10 더해주는 값: "+(a+=10));
	}
	
	public static void call(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i]+=100;
		}
		System.out.println();
		
		// main에서 확인한 주소가 같음
		System.out.println("call [주소] "+System.identityHashCode(arr)+Arrays.toString(arr));
	}
	
	///////////////////////////////////////////////////////
	public static void main(String[] args) {
		int [] arr={10,20,30};
		
		
		//1. 아래의 2개 메서드는 값에만 접근한다.
		//2.  +10을 해주고, 주소와 주소에 있는 값 확인하기
		call(10);		
		call(arr[0]);
		
		
		
		// 해당주소는 컴퓨터 마다 다르다. 
		System.out.println("[1] main > "+System.identityHashCode(arr));
		// 위에서는 20 이라는 숫자로 바뀌지만 해당하는 arr[0]의 값은 10으로 유지됨
		// call by value 라고 해서 값만 참조해서 사용함
		System.out.println("[2] main > "+Arrays.toString(arr));
		
		
		//3. 직접 주소를 찾아감!
		call(arr);		// +100을 해주는 마법상자
		System.out.println("[3] main > "+System.identityHashCode(arr));
		// call by reference는 주소 따라가서 직접 값을 건드림!
		System.out.println("[4] main > "+Arrays.toString(arr));

	}
	///////////////////////////////////////////////////////
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
