package com.company.java015_lambda_streem;

class RefClass{void method(String str){System.out.println(str);} }
interface InterUsing{ void inter(RefClass c, String str); }


interface InterBasic{ int method(int a, int b);}
interface InterString{int compare(String a, String b); }
interface InterParse{ int parse(String s);}
interface InterAbs{ int apply(int a); }
interface InterPrint{ String print(String s);}

// ex1
interface Length1 { int les(String s); }

// ex2
interface Length2 { void print(String s);}

public class Lambda003 {
	public static void main(String[] args) {
		// #1. 익명클래스
		InterUsing a1 = new InterUsing() {

			@Override
			public void inter(RefClass c, String str) {
				c.method(str);
			}	
		};
		
		a1.inter(new RefClass(), "Goo :D");
		
		// #2. 람다 ()->{}
//		InterUsing a2 = (RefClass c, String str)->{c.method(str);};
//		a2.inter(new RefClass(), "Goo :D");
		
		
		InterUsing a2 = (c, str)->{c.method(str);};
		a2.inter(new RefClass(), "Goo :D");
		
		// #3. 표현식 (참조)
		InterUsing a3 = RefClass::method;	// 자동연결 1) RefClass 2) method
		a3.inter(new RefClass(), "Goo :D");
	
		// #4. interface InterBasic{ int method(int a, int b);}
		
		InterBasic ba = (a, b)->{return Math.max(a, b);};
		System.out.println(ba.method(10, 3));
		
		
		InterBasic ba1 = (a, b)-> Math.max(a, b);
		System.out.println(ba1.method(100, 3));
		
		
		InterBasic ba2 = Math::max;
		System.out.println(ba2.method(1000, 3));
		
		
		InterBasic ba3 = (a,b)-> Math.min(a, b); 
		System.out.println(ba3.method(10, 3));
		
		
		InterBasic ba4 = Math::min; 
		System.out.println(ba4.method(1, 100));
		
		
		// #5 interface interString{int compare(String a, String b); }
		InterString ins = (a,b)->a.compareTo(b);
		System.out.println(ins.compare("bradford", "brad"));
		// 문자열의 길이 값 확인!
		// 문자열이 같으면 0, 뒤에 글자가 많고, 앞에 글자가 짧을때... 
		//				   다르면 음수, 다른값이 몇개나 다른지 음수가 나옴
		// 뒤에 글자가 짧고, 앞에 글자가 길때, 얼마나 다른지 양수로 나옴
		
		InterString ins2 = String::compareTo;
		System.out.println(ins2.compare("coconut", "apple"));
		
		InterParse bas3 = s-> Integer.parseInt(s);
		System.out.println(bas3.parse("10")+2);
		
		// interface InterAbs{ int apply(int a); }
		
		InterAbs abs = Math::abs;	// abs(absolute로 절대값 양수만듬)
		System.out.println(abs.apply(-10));
		
		// interface InterPrint{ void print(String s);}
		InterPrint ipr = s-> System.out.println(s);
		ipr.print("GOOOOOD!");
		
		
		InterPrint ipr2 = System.out::println;
		ipr2.print("GOOOOOD!");
		
		// ex1) 람다식 구현하기
		// System.out.println("hi".length());
		// System.out.println(ex1.getLength("hello")); 출력시 5
		
		// interface Length1 { int les(s); }
		
		Length1 ex1 = String::length;
		System.out.println(ex1.les("hello"));
		
		// ex2) 람다식을 구현하시오.
		//ex2.getLength("lambda :)");
		
		Length2 ex2 = System.out::println;
		ex2.print("lambda :)");
		
	}

}
