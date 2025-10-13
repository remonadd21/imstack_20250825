package com.company.java014_ex;

//1) abstract와 interface의 공통점과 차이점은?
/*
	공통점 : 둘다 성계가 가능한 클래스, 자식객체를 통해서 코드를 구현한다.
	차이점 : 추상화정도가 interface가 더 크다.
	abstract - 인스턴스 변수, 인스턴스 메서드 사용가능
	interface - 상수 (public static final), abstract 메서드

*/
//2) 아래 구현 되도록 코드 작성하기

interface Vehicle1b{public void run();}
class MotorCycle1b implements Vehicle1b{
    @Override public void run(){
        System.out.println("오토바이가 달립니다.");
    }
    public void helmet(){System.out.println("헬멧을 착용합니다.");}
}

class Car1b implements Vehicle1b{
      @Override public void run(){
        System.out.println("자동차가 달립니다.");
    }
}

class Driver1b{
	public void drive(MotorCycle1b m) { // 의존관계
		m.helmet();
		m.run();
	}
}

public class Ex008_9_interface{
    public static void main(String [] args){
    	Driver1b driver1b = new Driver1b();
        
        MotorCycle1b motorSycle1b = new MotorCycle1b();
        Car1b car1b = new Car1b();

        System.out.println("자동차가 고장나서 교통수단을 바꿉니다.");

        driver1b.drive(motorSycle1b);
    }
}