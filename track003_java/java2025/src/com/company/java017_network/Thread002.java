package com.company.java017_network;

import java.awt.Toolkit;

// 3. 작업수행 클래스 만드는 법 - Thread(상속-run-start), Runnable
class PigSound extends Thread{ // SOUND

	@Override public void run() {  
		try { Thread.sleep(10); } 
		catch (InterruptedException e) { e.printStackTrace(); }
		
		// #2. 비프음
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			System.out.print("꿀");
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) { e.printStackTrace();}
		}
	}
	
}
class PigCnt extends Thread{

	@Override public void run() { 
		
		for(int i=0; i<5; i++) {
			System.out.print((i+1)+"마리");
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) { e.printStackTrace();}
		}
		
	}
	
}

public class Thread002 {
	public static void main(String[] args) {
		Thread sound = new PigSound();
		Thread count = new PigCnt();
		
		sound.start();
		count.start();
		// View ˙Ꙫ˙
		for(int i=0; i<5; i++) {
			System.out.print("˙Ꙫ˙ ");
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) { e.printStackTrace();}
		}
		
	}

}

//연습문제1)  Thread
//패키지명 : com.company.java016_ex
//클래스명 : ThreadEx001
//1.  QuestionCount  - 10부터 1까지 
//      카운트 1초에 10 ,
//                2초에 9, 
//                3초에  8.....
//
//2. 사과알파벳을 입력하세요.
//   사과를 입력을받으면 정답입니다 / 정답이 아닙니다
