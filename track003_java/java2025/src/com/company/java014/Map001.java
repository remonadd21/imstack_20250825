package com.company.java014;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/*
1. 콜렉션 프레임워크는 [배열] 의 단점을 개선한 [객체]만 저장가능 [동적배열]
2. List, Set, Map
List(기차) - index O , 중복허용 O
	add / get (순서) / size / remove(순서) / contains
	
	
Set(주머니) - index가 없음(순서가 없음), 중복 허용이 되지 않음
	add / get (X) 대신에 향상된 for, iterator 
		/ size / remove(순서대신에 객체) / contains


Map(사전) - key:value-> entry (한쌍), put / get(key) / 향상된 for, iterator 
		/size / remove(객체) / contains
*/


public class Map001 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		
		System.out.println("1 : "+map);
		System.out.println("2 : "+map.get("two"));
		System.out.println("3 : "+map.size());
		System.out.println("4 : "+map.remove("two"));
		System.out.println("5 : "+map.containsKey("one"));
		
		// key:value 한 묶음, 한쌍 - [one=1, three=3]
		System.out.println(map.entrySet());
		
		for(Entry<String, Integer> one:map.entrySet()) {
			System.out.println(one.getKey() +"/"+ one.getValue());
		}
		
		//1. 줄서기 -> [one=1, three=3]
		Iterator<Entry<String, Integer>>  iter = map.entrySet().iterator(); 
		while(iter.hasNext()) {//2. [iter -> one=1, three=3]
			Entry<String, Integer> temp = iter.next();
			System.out.println(":: iter 확인하기");
			System.out.println(temp.getKey() +"/"+ temp.getValue());
		}
		
		
	}

}
//연습문제1)  Collection  Framework
//패키지명 : com.company.java014_ex
//클래스명 : SetEx001
//1. UserInfo2    Dto 클래스만들기  - 속성 : private int no; private  String name; private  int age;
//2. users   HashSet만들기
//3. 다음의 데이터 넣기
//   new UserInfo2(1, "아이언맨" , 50) , 
//   new UserInfo2(2, "헐크" , 40) , 
//   new UserInfo2(3, "캡틴" , 120), 
//   new UserInfo2(3, "캡틴" , 120)
//4. 향상된 for / Interator 이용해서 데이터 출력 (3명만 출력되게- 같은자료 중복안되게)
//5. 사용자들의 이름 입력받기 - 이름을 입력받으면 해당하는  유저의 자료출력
//6. 사용자들의 나이 평균처리
//
//
//
//연습문제2)  Collection  Framework
//패키지명 : com.company.java014_ex
//클래스명 : MapEx001
//1. MAP 만들기
//KEY   VALUE
//피구왕   통키
//---------------------
//제빵왕   김탁구
//---------------------
//요리왕   비룡
//
//Map<String, String> map = new HashMap<>();
//
//2 다음과 같이 문제풀기
//==============================
//KING   NAME
//==============================
//피구왕   통키
//---------------------
//제빵왕   김탁구
//---------------------
//요리왕   비룡
//---------------------
//KING의 정보를 제공중입니다
//이름을 입력하세요> 제빵왕
//
//ㅁ제빵왕 : 김탁구
//

