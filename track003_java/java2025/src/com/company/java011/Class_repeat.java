package com.company.java011;


// 1. 클래스는 부품객체
// 2. 클래스는 상태와 행위
/*
 * 						초기화(기본) 		명시적초기화 			초기화블록					생성자
 * (static)company		null 			(주) 703 toyland		(주) 703 toyland			X
 * (static)num			0					X					0					X
 * ------------------------------------------------------------------------------------------
 * 		kitty 	{name="null", age=0}			유지					유지					유지			this.name	
 * 		gundam	{name="null", age=0}			유지					유지			{name="건담", age=47} this.name
 * 
 * */


/*
class Toy{
	// 상태 : 멤버변수
	private String name;			// 인스턴스 변수 , heap area , new O , 생성자 O, this 각각
	private int age;				// 인스턴스 변수 
	static final String company="(주) 703 toyland";	//  클래스명.company 직접 호출가능, 변경불가
	static int num;				// 클래스 변수 , method area, new X, 생성자 X  (공용)

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	public int getAge() { return age; }
	public void setAge(int age) { this.age = age; }
	
	public Toy() { super(); }
	public Toy(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	// 행위 : 멤버함수
	public void show() {
		System.out.println("NAME :  "+this.name);
		System.out.println("AGE :  "+this.age);

	}
	
}
*/

//////////////////////////////////////////////////
public class Class_repeat {
	public static void main(String[] args) {
		Toy kitty = new Toy();  // [장난감] 2단계 	1) new 메모리 객체, 2) 생성자, 3) kitty 번지
		//kitty.name="헬로키티" // [갖고놀기] 3단계
		kitty.setName("할로윈 키티");
		kitty.setAge(52);
		kitty.show();
		
		Toy gundam = new Toy();
		gundam.show();
	}

}
///////////////////////////////////////////////////
///////// RuntimeData /////////

/*------------------------------------------------------	
 * 
 * method[ static, final, 공용정보 ]
 * 
 * > Toy.class, Class_Repeat.class
 * 
 * 
 *-------------------------------------------------------
 * 
 * 	heap[동적]							| stack[임시저장]
 * 	
 *  2번지 {name="건담", age=47}			<-- gundam (2번지)
 *	1번지 {name=할로윈 키티, age=52}			<-- kitty(1번지)
 * 
 * 										| main
 */


