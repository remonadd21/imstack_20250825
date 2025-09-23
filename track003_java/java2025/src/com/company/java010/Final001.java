package com.company.java010;

// 1. Final 변경하지 않음!
// 클래스는 부품객체
// 클래스는 상태(멤버변수)와 행위(멤버함수)
// 상속 X  override X

//			extends Object가 원래는 기본적으로 장착되어 있음
class FinalEx{
	
	// 클래스 변수, method area 직접 사용가능, 생성자X , new X
	final static String gaeCheon = "10-3";		
	
	// 인스턴스 변수, heap area, new O , 생성자 O
	String name;
	
	//final void show(){} 처럼 final이 붙으면 
	//아래 자녀에서 부모요소를 가져다 쓸 수 없음
	void show() {
		System.out.println( FinalEx.gaeCheon+"\t"+name);
	}
}


class FinalSon extends FinalEx{
	// 오버라이드 - 상속시 자식 클래스에서 부모의 클래스를 재수정
	// 단! 부모의 메서드나 변수에 final이 붙어있으면 상속받지 못함
	@Override
	void show() {
		super.show();
	}
	
}


//////////////////////////////////////////////////////
public class Final001 {
	public static void main(String[] args) {
		
		//The final field FinalEx.gaeCheon cannot be assigned (Final 객체는 변경되지 않음)
		//FinalEx.gaeCheon="10-1";
		
		FinalEx fx = new FinalEx();
		fx.name="호빵맨";
		fx.show();
		
	}
}
//////////////////////////////////////////////////////
