package com.company.java011;

import java.util.Arrays;

public class ClassArr001 {
	public static void main(String[] args) {
		
		// 사용방법21
		// 1) Toy[] 나는 주소를 받을 수 있어.
		Toy[] toys = new Toy[3];  // 2)  new 번지 Toy형태의 자료형 3개
		System.out.println("1. "+toys);
		System.out.println("2. "+Arrays.toString(toys));
		
		// 생성자 추가 : 에러 안남
		toys[0] = new Toy();
		
		toys[0].setName("할로윈 키티");
		toys[0].setAge(52);
		System.out.println("3. "+ toys[0]);
		/*
		 * 생성자를 만들지 않아서 에러가 남
		 * 
		 * Exception in thread "main" java.lang.NullPointerException
		 *   at com.company.java011.ClassArr001.main(ClassArr001.java:12)
		 * 
		 * */
		
		// 사용방법2
		Toy [] toys2 = new Toy[] {
				new Toy("할로윈 키티", 52), new Toy("건담", 47)
		};
		
		// toys[0].name , toys[0].age
		
		for(int i=0; i<toys2.length; i++) {
			toys2[i].show();
		}
		
		
	}
}
///////////////////////////////////////////////////
///////// RuntimeData /////////


//연습문제1)  클래스배열
//패키지명 : com.company.java011_ex
//클래스명 : ClassArrEx1
//다음과 같이 코드를 작성하시오.
//ㅁ출력된 화면
//Apple [name=RED, order=iron, num=2, price=1000]
//Apple [name=GREEN, order=hulk, num=1, price=1500]
//Apple [name=GOLD, order=captain, num=3, price=2000]
//
//ㅁ주어진 옵션
//public class Apple{   //// 실행 main과 파일을 분리해주세요!
// private String name;
// private String order;
// private int num;
// private int price;
//}
//
//public class ClassArrEx1{
//public static void main(String[] args) {
//      Apple[] apples= new Apple[3]; 
//      //위의 화면처럼 값 셋팅
//      //위의 화면처럼 출력
//}
//}


