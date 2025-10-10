package com.company.java014_ex;

//1) abstract와 interface의 공통점과 차이점은?
/*
	공통점 : abstract는 추상 클래스로 구현부가 없다. 
			interface도 구현부가 없다. 구현 가능한 메서드가 필요하다.

	다른점 : abstract 클래스는 abstract라는 추상 객체를 반드시 만들어야 한다. extends로 클래스 상속이 가능하다.
			interface는 메인 클래스 상속과 구현부 implements로 다중 상속이 가능하다.

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
	void drive(MotorCycle1b m) {
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