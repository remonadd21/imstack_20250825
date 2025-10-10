package com.company.java014_ex;

class Sawon005{
    int pay=10000;			// 인스턴스 변수

    static int su=10;		// 클래스 변수
    // static int basicpay=pay; // 클래스 변수안에 인스턴스 변수를 담을 수 없음
    static int basicpay2;
    static {basicpay2=20000;}	// 클래스 그룹
    
    // 클래스 메서드 안에 클래스 변수 사용가능
    public static void showSu(){System.out.println(su);}	
    
    // 클래스 메서드 안에 인스턴스 변수 사용 불가능
    // public static void showPay(){System.out..println(this.pay);}

    public void showAll0011(){		// 인스턴스 메서드
        System.out.println(su);		// 인스턴스 메서드 안에서 클래스 변수 호출이 불가능
        System.out.println(this.pay); // 인스턴스 메서드 안에서 인스턴스 변수 사용가능
    }

    public static void showAll001(){		// 클래스메서드
        //showAll0011();					// 클래스 메서드 안에서 인스턴스 메서드 호출 불가능
        //System.out.println(this.pay);	// 클래스 메서드 안에서 인스턴스 변수 호출 불가능
    }
}

public class Ex003_error{
    public static void main(String[] args){
        Sawon005 sola = new Sawon005();
        sola.showAll001();
    }
}