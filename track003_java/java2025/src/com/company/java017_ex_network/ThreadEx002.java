package com.company.java017_ex_network;

// 1. Candy를 mentol 클래스가 상속받는 경우 1초에 1개 팔렸다고 실행 클래스를 만들려고 함
class Candy{
	String name;

	public Candy() {
		super();
	}

	public Candy(String name) {
		super();
		this.name = name;
	}
	
	public void sell() {
		System.out.println(this.name+"가 1개 팔렸습니다.");

	}
}

class MentolSeller extends Candy implements Runnable{
	
	@Override
	public void run() {
		while(true) {
			sell();
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) { 
				System.out.println("판매 중단됨");
				break;
			}
		}
		
	}
	
	

	
}


public class ThreadEx002 {
	public static void main(String[] args) {
		MentolSeller seller = new MentolSeller();
		seller.name="멘톨캔디";
		
		Thread t = new Thread(seller);
		t.start();

		
		for(int i=0; i<5; i++) {
			System.out.println("손님 기다리는 중...");
			try { Thread.sleep(1000); } 
			catch (InterruptedException e) { 
				System.out.println("판매를 종료합니다.");
			}
		}
		
		t.interrupt();
		
	}

}
