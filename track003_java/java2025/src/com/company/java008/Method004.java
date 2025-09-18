package com.company.java008;

import java.util.Arrays;

public class Method004 {
	
	// 오버로딩?  같은 목적으로 비슷한 동작을 수행하는 메서드들을 이름을 일관되게 작업
	//			[파라미터의 타입]과 [갯수]로 메서드 구분
	
	// ==> 같은 이름으로 파라미터를 이용하든 이용하지 않든 오버해서 더욱 사용이 가능하다.
	public static void show() {
		System.out.println("마법상자~!");
	};
	
	
	public static void show(int a){ System.out.println("무조건*10 > "+a*10);};
	
	public static void show(int a, int b, int c){ 
		System.out.printf("%d, %d, %d \n",a*100,b*100,c*100);
	};
	

	
	///////////////////////////////////////////////////////
	public static void main(String[] args) {
		
		int [] arr = {1,2,3};
		
		// public static 리턴값 메서드명(파라미터(재료값)){}
		
		// public static void show();
		show();
		// public static void show(int a){ 10배 출력};
		show(2);  //값: 10배 출력
		show(arr[2]);
		
		//public static void show(int a){ 100배 출력};
		show(1,2,3); //값 : 100배
		
		
		show(arr[0], arr[1], arr[2]); //값: (배열값)
		show(arr); // public static void show(int[] arr){}
		System.out.println("main : "+Arrays.toString(arr));

	}
	///////////////////////////////////////////////////////


	private static void show(int[] arr) { // 배열에 접근해서, 주소를 따라가 값을 가져오기
		for(int i=0; i<arr.length; i++) {
			arr[i]*=1000;
		}
		System.out.println("show 무조건 1000배 : "
		+System.identityHashCode(arr)+ Arrays.toString(arr));
		
		// System.identityHashCode(arr) 해당배열의 주소 확인 가능
		
	}
	
//	연습문제7)  method
//	패키지명 : com.company.java008_ex
//	클래스명 :  MethodEx007
//	오류나는 메서드는?
//
//	public class Method007_ex {
//	   public static int add(int x, int y) {return x+y;}
//	   
//	   public static int  add(byte x, byte y)   {return x+y;}   
//	   public static int  add(short x, short y) {return x+y;}   
//	   public static long add(int  x, int y)    {return x+y;}   
//	   public static long add(long  x, long y)  {return x+y;}   
//	   
//	   public static void main(String[] args) { 
//	   }
//	}



}
