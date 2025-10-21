package com.company.java017_ex_network;

import java.util.Scanner;

class QuestionCount extends Thread{
	
	int count=0;
	@Override public void run() { 
		for(int i=10; i>0; i--) {
			System.out.println(++count+"초"+i);
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) { e.printStackTrace(); }
		}		
	}
	
}

class AppleQuest extends Thread{

	@Override
	public void run() {
		try { Thread.sleep(10000); } 
		catch (InterruptedException e) { e.printStackTrace(); }
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("사과의 스펠링 입력: ");
		String apple = scanner.next().toLowerCase();
		System.out.println(apple.equals("apple")?"사과의 스펠링이 맞다! 그렇다!":"아니다!");
	}
	
	
	
}


public class ThreadEx001 {

	public static void main(String[] args) {
		Thread count = new QuestionCount();
		Thread appleQ = new AppleQuest();
		
		count.start();
		appleQ.start();
	

	}

}
//연습문제1)  Thread
//패키지명 : com.company.java016_ex
//클래스명 : ThreadEx001
//1.  QuestionCount  - 10부터 1까지 
//    카운트 1초에 10 ,
//              2초에 9, 
//              3초에  8.....
//
//2. 사과알파벳을 입력하세요.
// 사과를 입력을받으면 정답입니다 / 정답이 아닙니다