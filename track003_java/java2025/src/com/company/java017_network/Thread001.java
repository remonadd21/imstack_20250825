package com.company.java017_network;

import java.awt.Toolkit;

//1 프로세스 - 실행중인 프로그램
//2 프로세스 - 자원(데이터, 메모리) + Thread(실제 작업수행)


public class Thread001 {
	public static void main(String[] args) {
		System.out.println("001. Thread");
		//1. 코어 (일꾼수) Runtime 환경클래스
		int core = Runtime.getRuntime().availableProcessors();
		System.out.println("1. core(일꾼수) : "+core);
		
		//2. 현재스레드(실행프로그램) 확인 - Thread 작업 수행 클래스
		Thread current = Thread.currentThread();
		System.out.println("2. 현재스레드(실행 프로그램) 이름: "+current.getName());
		System.out.println("3. 활성화 스레드 (실행 프로그램) 수 : "+Thread.activeCount());
		
		// #1 ˙Ꙫ˙
		for(int i=0; i<5; i++) {
			System.out.print("˙Ꙫ˙ ");
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) { e.printStackTrace();}
		}
		
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
/************
1. 프로세스: 실행중인 하나의 프로그램
2. 멀티프로세스 : 동시에 여러프로세스를 실행
	크롬 실행 -> 프로세스1
			실행 -> 프로세스2
				실행 -> 프로세스3
				
3. 프로세스 구성
- 자원(Resource) + Thread(자원으로 실제작업을 수행)
- 모든 프로세스는 최소한 하나의 스레드 (main)
- 같은 프로세스 내의 스레드들은 서로 자원을 공유

4. 동시성 병렬성
- 동시성 실행하는 것 같은 효과(동시성과 병렬성)
- 동시성 : 하나의 코어, 멀티스레드가 번갈아가면서 실행
	작업수 > 일하는 일 꾼 (코어수)
	
- 병렬성 : 멀티코어에서 개별스레드를 [동시에] 실행
	작업수 < 일하는 일꾼 (코어수)
	
	
5. 작업스레드 생성
-1) Thread 상속 	2)Runnable 인터페이스 구현

*/