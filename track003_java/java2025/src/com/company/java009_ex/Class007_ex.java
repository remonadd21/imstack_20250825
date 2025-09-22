package com.company.java009_ex;

import java.io.PrintStream;
import java.util.Scanner;

//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위 (멤버함수)
class Calc{
	   int num1, num2;  char op;  double result;
	   
	   
	   
	   
	   public Calc() { super(); }
	   
	   public Calc(int num1, int num2, char op) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
	}

	   public Calc(int num1, int num2, char op, double result) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.op = op;
		this.result = result;
	}
	   //입력받기
	   void input() {
		   Scanner scanner = new Scanner(System.in);
		   System.out.println("숫자 입력1: ");
		   this.num1 = scanner.nextInt();
		   System.out.println("연산자 입력: ");
		   this.op = scanner.next().charAt(0);
		   System.out.println("숫자 입력2: ");
		   this.num2 = scanner.nextInt();
		   
	   };
	   //+더하기계산, -라면 -계산  , *라면 *계산 , /라면 /계산
	   void opcalc() {
		   switch(this.op) {
		   case '+': result = (this.num1+this.num2); 
		   System.out.println(result);
		   break;
		   
		   case '-': result = (this.num1-this.num2);	
		   System.out.println(result);
		   break;
		   case '*': result = (this.num1*this.num2); 
		   System.out.println(result);
		   break;
		   case '/': result = (double)this.num1/this.num2;	
		   System.out.println(String.format("%.2f",result)   );
		   break;
		   }
	   }
	  // 연산출력   
	   void show() {
		   result = (this.num1+this.num2);
		   System.out.println(">> 첫번째 생성자 10,3,+ 문제답:"+this.num1+this.op+this.num2+"="+(int)result);
		   this.input();
		   this.opcalc();
		   
	   	}
  
	
}






////////////////////////////////////////////////////
public class Class007_ex {
	public static void main(String[] args) {		
		   Calc  c1= new Calc(10,3,'+');  
		   c1.show();
		   
		   Calc  c2= new Calc();  
		   c2.input();   
		   c2.opcalc(); 
			    

	}
}
////////////////////////////////////////////////////
/*


 연습문제7)  class
패키지명 : com.company.java009_ex
클래스명 :  ClassEx007
-- 생성자 작성하시오.
class Calc{
   //상태-멤버변수  :  int num1, num2;  char op;  double result;
   //행위-멤버함수  :  void input()   입력받기
   //               void opcalc() +더하기계산, -라면 -계산  , *라면 *계산 , /라면 /계산 
   //                      void show()    연산출력   
}
public class ClassEx007{
   public static void main(String[] args) {
   Calc  c1= new Calc(10,3,'+');  
   c1.show();
   
   Calc  c2= new Calc();  
   c2.input();   
   c2.show(); 
    
   }
}

출력내용)
10+3=3

숫자1> 10
숫자2> 3
연산자> /
10/3=3.33
 * 
 * 
 * */



/*패키지명: com.company.java009_ex 
클래스명: ClassEx008 주제: 동물 캐릭터를 생성하고, 능력치를 계산하여 출력하는 프로그램

■설명
AnimalCharacter 클래스를 만들어서 동물 이름, 타입(육식/초식), 기본 속도, 특수 능력치를 입력받고, 최종 속도를 계산해 출력한다. 
특수 능력치는 타입에 따라 다르게 적용된다.
육식 동물: 특수 능력치가 속도에 +20%
초식 동물: 특수 능력치가 속도에 +10%

-- 생성자 작성하시오.

class AnimalCharacter {
    // 상태 - 멤버변수  
    // String name;  
    // String type;  // 육식 or 초식  
    // int baseSpeed;  
    // int specialBoost;  
    // double finalSpeed;

    // 행위 - 멤버함수  
    // void input() : 사용자 입력 받기  
    // void calculateSpeed() : 타입에 따라 속도 계산  
    // void show() : 캐릭터 정보 출력
}

public class ClassEx007 {
    public static void main(String[] args) {
        AnimalCharacter a1 = new AnimalCharacter("치타", "육식", 100, 30);
        a1.show();

        AnimalCharacter a2 = new AnimalCharacter();
        a2.input();
        a2.show();
    }
}



■ 출력내용 
🦁 동물 캐릭터: 치타
🌿 타입: 육식
🚀 최종 속도: 106.00

동물 이름> 토끼
동물 타입(육식/초식)> 초식
기본 속도> 60
특수 능력치> 40
🦁 동물 캐릭터: 토끼
🌿 타입: 초식
🚀 최종 속도: 64.00
*/
