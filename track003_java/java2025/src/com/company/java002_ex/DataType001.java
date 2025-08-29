package com.company.java002_ex;

public class DataType001 {
	public static void main(String[] args) {
		// 1. 자바의 자료형 분류 (기본형 /참조형)
		// 2. 기본형 : 값 저장
		// 논리, 정수, 실수
		boolean bl = true;   // true, false
		System.out.println("1. 논리: "+bl);
		
		//정수 (1,2,4,8 : byte, short, ★int, long:L)
		System.out.println("2. 정수 byte - short - int - long");
		byte by = 1; short sh =2; int i = 4; long l = 8L;

		
		//기본형의 단위
		// > 에러발생 : byte result = by +1;
		// by + 1에서 1을 기본 자료형 int로 인식하기 때문에 
		// byte 자료형이 담을수 없음
		
		
		System.out.println("3. 실수 float - double");
		//실수 (float 4byte, ★double 8byte)
		// > 에러발생 : float fl = 3.14
		// 3.14를 기본 자료형 double로 인식하기 때문에
		// 3.14f라고 작성해야 함.
		
		float fl = 3.14f; 
		double d =3.14;
		
		//3. 정밀도
		float fper1 = 1.0000001f; 
		// 0은 6개, 1까지 포함하여 7개 작성
		// 정확하게 표현됨
		
		float fper2 = 1.00000001f; 
		// 0, 7개, 1개 포함 8개 작성
		// 반올림 되거나 제외되어 근사값으로 표현됨
		
		float fper3 = 1.11111111f; 
		// 1, 8개 작성
		// 반올림 되거나 제외되어 근사값으로 표현됨
		
		System.out.println(fper1+"\t"+fper2+"\t"+fper3);
		
		
		
		double dper1 = 1.000000000000001; 
		// 0은 14개, 1은 1개, 총 15개
		// 정확하게 표현됨
		
		double dper2 = 1.0000000000000001; 
		// 0, 15개, 1 작성,  총 16개
		// 반올림 되거나 제외되어 근사값으로 표현됨
		
		double dper3 = 1.1111111111111111; 
		// 1, 16개 작성
		// 반올림 되거나 제외되어 근사값으로 표현됨
		
		System.out.println(dper1+"\t"+dper2+"\t"+dper3);
		
	}
}
