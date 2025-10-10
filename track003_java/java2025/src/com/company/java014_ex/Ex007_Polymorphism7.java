package com.company.java014_ex;


/*

	Object			
	 ↑				↓
	Papa 	(10000, sing) 
	 ↑				↓
	Son2		(1500, @sing)
		
		
	값은 위에서 아래로 10000을 읽고, 메서드는 오버라이드 자녀를 읽음

*/
class Papa extends Object{
    int money=10000;
    public Papa(){super();}
    public void sing(){System.out.println("GOD-거짓말");}

}

class Son2 extends Papa{
    int money=1500;
    public Son2(){super();}
	@Override
	public void sing() {
		System.out.println("빅뱅-거짓말");
	}
    
}

public class Ex007_Polymorphism7{
    public static void main(String[] args){
        Papa mypapa = new Son2();

        //##1. 예상되는 출력되는 결과는? 10000
        // 생성자는 아래서 위로, 객체는 위에서 아래로 읽음, 10000
        System.out.println(mypapa.money);
        
        //##2. 예상되는 출력결과는? 빅뱅-거짓말
        // 오버라이드 값을 읽음 , 빅뱅- 거짓말
        mypapa.sing(); 

        // ##3. 1500 출력되게 해주세요.   
        System.out.println(((Son2)mypapa).money);
    }

}