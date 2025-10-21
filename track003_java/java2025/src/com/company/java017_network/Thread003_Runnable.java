package com.company.java017_network;


//1) Thread 상속 -> Runnable 구현 2) run 수행내용  3) start 실행
class Animal{String name;}
class Dog extends Animal implements Runnable{

	@Override public void run() { 
		for(int i=0; i<5; i++) {
			System.out.print("멍");
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) { e.printStackTrace(); }
		}
	}
	
} 


public class Thread003_Runnable {
	public static void main(String[] args) {
		Thread sound = new Thread(new Dog()); 
		sound.start();
		for(int i=0; i<5; i++) {
			System.out.print("◖⚆ᴥ⚆◗");	
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) { e.printStackTrace(); }
		}
	}

}
