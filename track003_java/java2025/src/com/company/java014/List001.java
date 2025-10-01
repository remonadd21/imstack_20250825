package com.company.java014;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

// 1. 콜렉션 프레임워크 - 동적배열 
// 2. 배열의 단점 개선 - 한 가지 자료형으로 사이즈가 고정


public class List001 {
	public static void main(String[] args) {
		//Step1. Array
		String[] arr = new String[3];
		arr[0]="헐크";
		System.out.println(Arrays.toString(arr));
		
		//Step2. 동적배열-List 사용법
		List list=null;  // ctrl + shift + o
		list = new ArrayList<>();	// 자식
		list = new LinkedList<>();	// 자식
		list = new Vector<>();	// 자식
		
		
		//Step3. <>	자료형의 구분없이 전부 담을 수 있다.
		// 무분별하게 사용하다보면 문제가 많아질 수 있어서 generic 개념으로 자료형을 사용함
		List<String> list2 = new ArrayList<String>();
		list2.add("one");	// Object obj = "one";
		//list2.add(1);		// Object obj = 1;
		list2.add(new String("two"));	// Object obj = new String("two");
		list2.add("A");
		//list2.add(3.14);
		System.out.println(list2);
		
		//Step4. add(추가), get(배열중에 잡아옴), size(length 와 비슷(갯수)), 
		//		remove(삭제), contains(배열에 해당하는 내용이 있는지 알 수 있음, true, false)
		// 뒤쪽은 자료형을 빼는 경우가 많음
		// 다른 자료형으로 바꾸는 경우가 종종 생기기 때문에 빼놓고 사용함
		List<String> list3 = new ArrayList<>();
		list3.add("apple");
		list3.add("banana");
		list3.add("fineapple");
		list3.add("coconut");
		
		System.out.println(list3.get(2));
		System.out.println(list3.size());
		System.out.println(list3.remove(2)+" / "+list3);
		System.out.println(list3.contains("apple"));
	}

}
//연습문제1)  Collection  Framework
//패키지명 : com.company.java014_ex
//클래스명 : ListEx001
//다음과 같이 코드를 작성하시오.
// 1.  ArrayList이용해서 colors 만들기
// 2. red, green, blue 데이터 추가
// 3. 출력
//
//연습문제2)  Collection  Framework
//패키지명 : com.company.java014_ex
//클래스명 : ListEx002
//1.  numbers ArrayList 만들기
//2.  one, two, three 데이터 추가
//3.  사용자에게 1,2,3 입력받기
//4.  1을 입력받으면 one 출력
//    2를입력받으면 two 출력
//    3을입력받으면 three 출력