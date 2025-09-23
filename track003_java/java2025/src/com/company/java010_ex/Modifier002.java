package com.company.java010_ex;

// import해서 다른 폴더에 있는 클래스 가져오기
import com.company.java010.UserInfo;


class UserSon2 extends UserInfo{
	public void show() {
		System.out.println("친구의 이름 > "+super.name);			// public 자식
		System.out.println("친구의 호빵번호 > "+super.safeCode);		// protected 자식
		
		// ▼ default로 지정되어 있거나 아무 작성이 없는 변수, 함수들은 "같은 폴더"에 없다면 사용할 수 없다.
		// UserInfo 클래스는 com.company.java010에 있음
		// 지금은 com.company.java010_ex 폴더!
		//System.out.println("친구의 집 주소 > "+super.house);			// package 자식(같은 폴더)
		
		
		// iQ가 private이기 때문에 접근이 불가능함...
		// System.out.println("친구의 IQ > "+super.iQ());

		// getter를 이용하면 가져올 수 있음
		System.out.println("친구의 IQ > "+super.getiQ());

	}
}


///////////////////////////////////////////////////
public class Modifier002 {
	public static void main(String[] args) {
		
		System.out.println("\n\n01. 호빵맨에 대한 정보");
		// public > protected > default > private
		
		UserInfo user = new UserInfo();
		user.name="호빵맨";		// public은 어디에서든 접근가능
		//user.safeCode="1234";	// protected 본인꺼 접근가능
		// user.house="서울시 강남구";
		// user.iQ =190;  // private 위에 만들어진 UserInfo 클래스 안에서만 접근이 가능함
		// private은 getters와 setters를 이용하여 접근이 가능하다.
		//		setters로 셋팅하고, getters로 잡아다가 보여준다.
		user.setiQ(190);
		System.out.println(user.getiQ());
		
	}
}
///////////////////////////////////////////////////






