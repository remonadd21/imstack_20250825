package com.company.java002;

import java.util.Scanner;

public class Input002 {
	public static void main(String[] args) {
		
		//GIGO (입력, 처리, 출력)
		//변수
		// float, double 둘다 실수형으로 누가 누군지 구분이 되지 않는다.
		// float는 값의 뒤에 f를 붙여 float 임을 알려 준다.
		// 하지만 double이 기본형! 
		float f= 3.14f;
		double d = 3.14;
		
		Scanner scanner = new Scanner(System.in);		
		//입력
		System.out.print("실수를 입력하세요: ");
		// f = scanner.nextFloat();
		d = scanner.nextDouble();
		
		//처리 X
		//출력
		System.out.println("입력 받은 실수의 값은 "+d+" 입니다.");
		
	}//end main
}// end class
