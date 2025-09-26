package com.company.java011;

public class Toy {
	
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
		
		// to String 추가
		@Override
		public String toString() {
			return "Toy [name=" + name + ", age=" + age + "]";
		}
		
		
}
