package com.company.java014_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

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


public class MapEx001 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("피구왕", "통키");
		map.put("제빵왕", "김탁구");
		map.put("요리왕", "비룡");
		map.put("천재왕", "효뿡");
		
		// System.out.println("1 : "+map);
		//System.out.println("2 : "+map.size());
		//System.out.println("3 : "+map.containsKey("요리왕"));
		
		// key:value 한 묶음, 한쌍
		// System.out.println(map.entrySet());
		
		// 이름 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.println("무슨 왕을 입력 받겠습니까? (천재왕,요리왕,피구왕,제빵왕) ");
		String kingNm = scanner.next();
		
		// containskey 확인
		System.out.println("containsKey 확인: "+map.containsKey(kingNm));
		
		System.out.println(map.containsKey(kingNm) ? kingNm +"-"+ map.get(kingNm):"찾는 왕 없음!");
		
		for(Entry<String, String> king:map.entrySet()) {
			if(king.getKey().equals(kingNm)) {
				System.out.println("["+king.getKey() +"]["+ king.getValue()+"]");
			}
		}

		System.out.println("================================\nKING\tNAME");
		
		Iterator<Entry<String, String>>  iter = map.entrySet().iterator(); 
		while(iter.hasNext()) {
			Entry<String, String> temp = iter.next();
			
			System.out.println(""+temp.getKey() +"\t"+ temp.getValue());
		}
		
		
	}

}

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
