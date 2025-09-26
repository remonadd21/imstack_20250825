package com.company.java011;
import com.company.java011_ex.Score;

public class ModifierEx3 extends Score{    
	public static void main(String[] args) {
	Score iron = new Score();     
	Score hulk = new Score("hulk" , 20,50,30);    
	
	// Score.info()위에 메서드작성해주세요!  ##
	// setter를 이용해주세요!
	iron.setName("iron"); iron.setKor(100); iron.setEng(100); iron.setMath(99);
	
	Score.info();     // 클래스메서드
	iron.show();          
	hulk.show();   
	}

}
//
//Score.info() 사용시화면
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//이름   국어   영어   수학   총점   평균   합격여부   장학생   랭킹
//:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//
