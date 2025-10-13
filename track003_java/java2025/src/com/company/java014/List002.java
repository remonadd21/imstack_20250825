package com.company.java014;

import java.util.ArrayList;
import java.util.List;

// 0. 저장단위 : 변수 < 배열 (내가 원하는 같은 자료형 모음) < 클래스 (내가 원하는 자료형 모음 + 메서드) 
//	< 콜렉션 크레임워크 < 파일 < DB 

// 1. 배열 단점 - 한가지 자료형 사이즈 조정 String [] arr = new String[3]
// 2. 콜렉션 프레임워크 (배열의 단점 보정) - 동적배열(List★, Set, Map)
// 3. List [기차]  : 순서O , 중복O, (add, get, size, remove, contains)
// 4. Set [주머니]  : 순서X , 중복X, (add, get(get 사용X, 대신 순번사용), size, remove, contains)
// 5. Map [사전] : key:value(entry), (put, get(key) / iterator, size, remove, contains)

public class List002 {
	public static void main(String[] args) {
		//1. List : 원하는 자료형 원하는 갯수 만큼 
		List list1 =  new ArrayList(); // ctrl + shift + o
		list1.add("one"); 
		list1.add(1);	// 무분별한 데이터
		list1.add(list1);
		System.out.println(list1);
		
		//2. List - <>
		List<String> list2 = new ArrayList<>();
		list2.add("banana");
		list2.add("apple");
		list2.add("coconut");
		// list2.add(3); // 무분별한 자료형을 막기 위해 제네릭 사용 <String>
		System.out.println(list2);
		
		//3. List - 활용 (add, get(번호), size, remove(번호), contains)
		List<UserDto> users = new ArrayList<>();
		users.add(new UserDto("aaa@gmail.com"));
		users.add(new UserDto("bbb@gmail.com"));
		
		System.out.println("1) get> "+users.get(0));
		System.out.println("2) size> "+users.size());
		System.out.println("3) reomve> "+users.remove(0));
		System.out.println("4) contains> "+users.contains("bbb@gmail.com"));
		System.out.println("5) contains> "+users.contains("ccc@gmail.com"));
		System.out.println(users);
	}

}

class UserDto{
	private static int cnt=0; // static(공용) 유저가 생기는 만큼 자동카운트
	private final int no;			// final(수정X)
	private String email;			// 사용자가 입력하는 email
	// 기본생성자, 필드생성자, toString, getters/setters
	public UserDto() {
		this.no = cnt++; // 유저번호 = 값; 값넣고 1개씩 증가
	}
	public UserDto(String email) {
		this();
		this.email = email;
	}
	public UserDto(int no, String email) {
		super();
		this.no = no;
		this.email = email;
	}
	@Override
	public String toString() 
	{ return "UserDto [no=" + no + ", email=" + email + "]"; }
	
	public String getEmail() { return email; } 
	public void setEmail(String email) { this.email = email; }
	public static int getCnt() { return cnt; } 
	public int getNo() { return no; }
	
	
	
	
	
}
