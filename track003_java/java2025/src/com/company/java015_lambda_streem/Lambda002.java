package com.company.java015_lambda_streem;

/*
	1. 클래스는 부품객체 - 설계도 (틀, can do this~!)
	2. 상태 + 행위 - interface(public static final / public abstract)
*/

interface InterA2{void hi();}
interface InterB2{void hi(String name);}
interface InterC2{ String hi();}
interface InterD2{void hi(int num, String name);}

interface Desc{void hi(int num, String name);}

interface Desc2{ String hi(int num, String name); }

public class Lambda002 {
	public static void main(String[] args) {
		System.out.println("\n\n[STEP1] 매개변수 x, 리턴값x");
		
		// 익명객체 hi 출력
		InterA2 a2 = new InterA2(){ @Override public void hi() { System.out.println("hi~");}}; 
		a2.hi();
		InterB2 b2 = new InterB2(){ @Override public void hi(String name) {  System.out.println(name); }};
		b2.hi("minjae");
		InterC2 c2 = new InterC2(){ @Override public String hi() { return "good day!!";  }};
		System.out.println(c2.hi());
		InterD2 d2 = new InterD2() {  @Override public void hi(int num, String name) {System.out.println(num+"\t"+name);  }};
		d2.hi(10,"minddung");
		
		// 람다식 ()->{}
		InterA2 a21 =()->{System.out.println("hi~a2");}; a21.hi(); 
		
		// 받아오는 자료형이 하나라면 아래와 같이 표현가능!
		InterB2 b21 =(String name)->{System.out.println(name);}; b21.hi("minjae-hoi");
		InterB2 b21_1 =(name)->{System.out.println(name);}; b21_1.hi("minjae-hoi2");
		InterB2 b21_2 =name->{System.out.println(name);}; b21_2.hi("minjae-hoi3");
		
		
		InterC2 c21 =()->{return "good Day!";}; 
		System.out.println(c21.hi());
		
		InterD2 d21 =(int num, String name)->{System.out.println(num+"\t"+name);};
		d21.hi(100,"gogoMinjae");
		
		// Q1 hi brad
		Desc d = new Desc() { 
			@Override public void hi(int num, String name) { 
				System.out.println(num +"\t"+ name); } 
		};
		d.hi(1,"brad");
		d.hi(2,"ford");
		
		// Q1 lambda
		Desc d1 =(int num, String name)->{System.out.println(num +"\t"+ name); };
		d1.hi(11, "good");
		d1.hi(12, "lucky");
		
		
		//Q2 return
		Desc2 d2s = new Desc2() {
			@Override
			public String hi(int num, String name) {
				
				String star="";
				for(int i=0; i<num; i++) {star+="★";}
				
				String res = num+","+name+" "+star;
				
				return res;
			}
		};
		
		System.out.println(d2s.hi(1, "brad"));
		System.out.println(d2s.hi(2, "ford"));
		
		
		Desc2 d22s = new Desc2() {
			@Override
			public String hi(int num, String name) {
				
				String star="";
				for(int i=0; i<num; i++) {star+="★";}
				
				String res = num+","+name+" "+star;
				
				return res;
			}
		};
		
		System.out.println(d22s.hi(3, "brad"));
		System.out.println(d22s.hi(4, "ford"));
		
		
		//Q2 rambda
		// 자료형 int num, String name => num, name으로 변경가능
		Desc2 d2ss =(num, name)->{
			String star="";
			for(int i=0; i<num; i++) {star+="★";}
			String res= num+","+name+" "+star; 
			return res;
		};
		System.out.println(d2ss.hi(5, "lucky"));
		System.out.println(d2ss.hi(6, "good"));
		
		
	}

}
