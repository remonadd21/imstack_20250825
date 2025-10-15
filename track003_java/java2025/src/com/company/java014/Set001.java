package com.company.java014;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
	1. 콜렉션 프레임워크는 [배열] 의 단점을 개선한 [객체]만 저장가능 [동적배열]
	2. List, Set, Map
	List(기차) - index O , 중복허용 O
		add / get (순서) / size / remove(순서) / contains
		
		
	Set(주머니) - index가 없음(순서가 없음), 중복 허용이 되지 않음
		add / get (X) 대신에 향상된 for, iterator 
			/ size / remove(순서대신에 객체) / contains
*/

class Candy{
	String name;
	int price;
	public Candy() { super(); }
	public Candy(String name, int price) 
	{ super(); this.name = name; this.price = price; }
	
	
	// 1. Candy 클래스 확인 용도
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
	
	// 2. 사용자가 기입하거나 작성한 값을 비교해서 중복을 제외시킴
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candy other = (Candy) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}
	
	
	
}

public class Set001 {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
							// 원래는 바로 아래처럼 사용해야 하나.. 지금 add(1) 직접 입력함
		set1.add(1);		// Integer e  = new Integer(1) (부품객체)
		set1.add(new Integer(1)); // 예전거지만 현장에서 아직 쓸수 있음
		set1.add(1);		// 부품객체 = 기본값 (Integer-wapper 클래스)	
		set1.add(2);		// 기본값을 자동으로 -객체화 - 부품객체
		set1.add(3);		// int -> Integer, float-> Float 오토박싱
		System.out.println(set1); // [1,2,3] 1이 중복되지 않는 것 확인가능!
		
		Set<Candy> set2 = new HashSet<>();
		set2.add(new Candy("츄파츕스", 3000));
		set2.add(new Candy("ABC", 2500));
		set2.add(new Candy("알사탕", 4000));
		set2.add(new Candy("ABC바닐라", 2500));
		set2.add(new Candy("츄파츕스", 3000));
		set2.add(new Candy("츄파츕스", 3000));
		System.out.println(set2);
		
		// new가 있기 때문에 중복이 허용되지 않지만 지번이 존재함
		System.out.println(set2.size());
	}
}
