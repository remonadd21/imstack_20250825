package com.company.java010;

// public (아무데서나) > protected (extends) > default(같은 폴더에서만) > private(사용중인 클래스안에서만)

// 아래 main에 public이 있기 때문에 public 작성하면 충돌이 생김 
// 아래 코드 잘라내기
/*public*//* class UserInfo{
	public String name;
	protected String safeCode;  // 자녀
			  String house;
	private 	int iQ;
	
	public int getiQ() {
		return iQ;
	}
	public void setiQ(int iQ) {
		this.iQ = iQ;
	}
}
*/
class UserSon1 extends UserInfo{
	public void show() {
		System.out.println("친구의 이름 > "+super.name);			// public 자식
		System.out.println("친구의 호빵번호 > "+super.safeCode);		// protected 자식
		System.out.println("친구의 집 주소 > "+super.house);			// package 자식(같은 폴더)
		
		
		// iQ가 private이기 때문에 접근이 불가능함...
		// System.out.println("친구의 IQ > "+super.iQ());

		// getter를 이용하면 가져올 수 있음
		System.out.println("친구의 IQ > "+super.getiQ());

	}
}


///////////////////////////////////////////////////
public class Modifier001_public_private {
	public static void main(String[] args) {
		
		System.out.println("\n\n01. 호빵맨에 대한 정보");
		// public > protected > default > private
		
		UserInfo user = new UserInfo();
		user.name="호빵맨";		// public은 어디에서든 접근가능
		user.safeCode="1234";	// protected 본인꺼 접근가능
		user.house="서울시 강남구";
		// user.iQ =190;  // private 위에 만들어진 UserInfo 클래스 안에서만 접근이 가능함
		// private은 getters와 setters를 이용하여 접근이 가능하다.
		//		setters로 셋팅하고, getters로 잡아다가 보여준다.
		user.setiQ(190);
		System.out.println(user.getiQ());
		
	}
}
///////////////////////////////////////////////////