package com.company.java014_ex;

class A{
    int a;			// 인스턴스 변수 
    static String company="(주) 민재컴퓨터";	//클래스 변수
    static {company="울트라 민재컴퓨터";}
    void method(){int a;} // 지역변수
    
    // 클래스 변수는 인스턴스 함수 안에서 사용할 수 없기 때문에 에러날 수 있음
    // 초기화 순서
    // 기본값, 명시적초기화, 초기화블록, 생성자.
    
}



public class Ex002_error {

	public static void main(String[] args) {
		System.out.println(A.company);

	}

}
