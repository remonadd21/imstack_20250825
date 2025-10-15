package com.company.java014_ex;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;


class UserInfo2{
	
	private int no; 
	private  String name; 
	private  int age;
	public UserInfo2() { super(); }
	public UserInfo2(int no, String name, int age) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name, no);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfo2 other = (UserInfo2) obj;
		return age == other.age && Objects.equals(name, other.name) && no == other.no;
	}

}


public class SetEx001 {
	public static void main(String[] args) {
		
		
		Set<UserInfo2> set2 = new HashSet<>();
		set2.add(new UserInfo2(1, "아이언맨" , 50));
		set2.add(new UserInfo2(2, "헐크" , 40));
		set2.add(new UserInfo2(3, "캡틴" , 120));
		set2.add(new UserInfo2(3, "캡틴" , 120));

		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 입력: ");
		String temNm = scanner.next();
		double avg=0;
		double no=0;
		
		
		
		for(UserInfo2 st : set2) {
			
			avg+=st.getAge() / 3.0;
			
			if(st.getName().equals(temNm)) {
				System.out.println("학번: "+st.getNo()+
									"/ 이름: "+st.getName()+
									"/ 나이: "+st.getAge());
				break;
			}
			
			
		}
		
		System.out.println("평균나이: "+avg);

		
	}

}
