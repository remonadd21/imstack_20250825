package com.company.java009_ex;

import java.io.PrintStream;
import java.util.Scanner;

//1. 클래스는 부품객체
//2. 클래스는 상태(멤버변수)와 행위 (멤버함수)
class Score{
	
	String stdid; int kor,eng,math,total;


	double avg;


	public Score() { super(); }
	public Score(String stdid, int kor, int eng, int math) {
		super();
		this.stdid = stdid;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public Score(String stdid, int kor, int eng, int math, int total, int avg) {
		super();
		this.stdid = stdid;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
	}
	
	
	// 처리
	void total() { this.total =this.kor+this.eng+this.math;};
	void avg() { this.avg= this.total/3.0;};
	
	// 출력
	void info(){   
		total();
		avg();
		System.out.printf("===============================================\n"
				+ "%-5s\t%-5s\t%-5s\t%-5s\t%-5s\t%-5s","학번","국어","영어","수학","총점","평균\n"
						+ "===============================================\n");
		System.out.printf("%-5s\t%-5d\t%-5d\t%-5d\t%-5d\t%.2f",this.stdid,this.kor,this.eng,
				this.math,this.total,this.avg);
	};
	
	
	
	@Override
	public String toString() {
		return "Score [stdid=" + stdid + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", total=" + total
				+ ", avg=" + avg + "]";
	}

}




////////////////////////////////////////////////////
public class Class006_ex {
	public static void main(String[] args) {		
		
		Score  s1= new Score("std1234" , 100, 100 , 99 ); 
		s1.info();
		
	}
}
////////////////////////////////////////////////////
/*

연습문제6)  class
패키지명 : com.company.java009_ex
클래스명 :  ClassEx006
-- 생성자 작성하시오.
class Score{
   //상태-멤버변수  :  String stdid; int kor,eng,math,total,avg;   
   //행위-멤버함수  :  void total() 총점구해주기
   //               void avg()  평균구하기
   //                      void info()   학생정보출력  ※힌트2)  
   /// info(){    total();  avg();     }  다른메서드에서 메서드 사용가능  
   //※ 힌트1) 생성자 :   Score() / Score(stdid, kor, eng, math)
}
public class ClassEx006{
   public static void main(String[] args) {
   Score  s1= new Score("std1234" , 100, 100 , 99 ); 
   s1.info();
   }
}

출력내용 :
학번   kor   eng   math   total   avg
std1234   100   100   99   299   99.67

 

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
