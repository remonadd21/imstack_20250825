package com.company.java014_ex;


// final, static이 붙으면 변경이 되지 않고, 오버라이딩도 되지 않음

class User004{
    final char division; // A, B, C, D 4가지 타입으로 분류할 수 있다.
    final String jumin;
	
    
    // final이 붙은 객체는 초기화를 하지 않으면 에러가 발생하기 때문에 
    // 생성자에서 아래와 같이 초기화 함
    public User004() { super(); 
		this.division='A';
		this.jumin="123456-1234567";
	}
	public User004(char division, String jumin) {
		super();
		this.division = division;
		this.jumin = jumin;
	}
	@Override
	public String toString() {
		return "User004 [division=" + division + ", jumin=" + jumin + "]";
	}
	
    
    
}

public class Ex004_Final004{
	public static void main(String [] args) {
	    User004 c1 = new User004('B',"200101-1234567");
	    System.out.println(c1);
	
	    User004 c2 = new User004();
	    System.out.println(c2);
	}
}