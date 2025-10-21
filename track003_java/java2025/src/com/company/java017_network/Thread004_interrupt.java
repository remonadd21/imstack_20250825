package com.company.java017_network;

import com.company.java017_network.Candy;
import com.company.java017_network.MentolSeller;

//1. Candy를 mentol 클래스가 상속받는 경우 1초에 1개 팔렸다고 실행 클래스를 만들려고 함
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
				// break가 적용되지 않을때
				// 인터럽트 상태를 상태복수 -> isInterrupted(), true로 감지체크
				//Thread.currentThread().interrupt();
				break;
			}
		}
		
	}
	
	

	
}


public class Thread004_interrupt {
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
		// 쓰레드 중단요청
		t.interrupt();
		
	}

}

//패키지명: com.company.java017_network_ex
//클래스명: ThreadEx003
//■문제명: Thread.interrupt()를 이용한 카운트 중단 스레드 구현
//Thread를 상속받은 Count 클래스를 만들고, 10부터 1까지 1초 간격으로 숫자를 출력하는 스레드를 구현하세요.  
//main()에서는 사용자 입력을 받아 "y"를 입력하면 스레드를 중단합니다.  
//이때 interrupt() 메서드를 사용하여 스레드를 안전하게 종료하도록 구현하세요.
//
//■요구사항
//1. Count 클래스를 정의하세요.
//   - Thread를 상속받습니다.
//   - run() 메서드에서 for 반복문을 통해 10부터 1까지 1초 간격으로 출력합니다.
//   - Thread.sleep(1000)을 사용하며, InterruptedException이 발생하면 break로 반복을 종료합니다.
//
//2. ThreadEx003 실행 클래스를 작성하세요.
//   - Count 객체를 생성하고 start()로 실행합니다.
//   - JOptionPane.showInputDialog 를 통해 사용자 입력을 받습니다.
//   - 사용자가 "y"를 입력하면 count.interrupt()를 호출하여 스레드를 중단합니다.
//   - "main end...."를 출력하며 프로그램을 종료합니다.
//
//■ 힌트
//- Thread.sleep() 중 interrupt()가 호출되면 InterruptedException이 발생합니다.
//- catch 블록에서 break를 사용하면 반복문을 빠져나와 스레드를 종료할 수 있습니다.
//- Scanner는 java.util.Scanner를 import해야 합니다.
//
//■ 출력 예시
//10
//count stop?  y/n
//9
//8
//y
//count를 멈춥니다.
//> main end....
//
//※ "y"를 입력한 시점 이후부터는 숫자 출력이 멈춥니다.
//
//■ 예시 코드 참고
//
//package com.company.java017_network_ex;
//
//import java.util.Scanner;
//
//class Count extends Thread {
//    @Override  public void run() {
//   #####1. ... 10~1까지 카운트
//   #####2. 오류시 break
//    }
//}
//
//public class Thread004_interrupt {
//    public static void main(String[] args) {
//        Thread count = new Count();
//        count.start();
//
//        ##### 3. 입력받기
//
//        System.out.println("> main end....");
//    }
//}

