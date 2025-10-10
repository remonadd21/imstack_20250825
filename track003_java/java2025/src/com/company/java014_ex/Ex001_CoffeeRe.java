package com.company.java014_ex;

class Coffee012{
	private String name;
	private int num;
	private int price;
	
	public Coffee012() {
		super();
		this.name = "아메리카노";
		this.num = 1;
		this.price = 1000;
	}

	public Coffee012(String name, int num, int price) {
		super();
		this.name = name;
		this.num = num;
		this.price = price;
	}
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	void show() {
		System.out.println("============== coffee"
				+ "\n커피명: "+this.name
				+ "\n커피잔수: "+this.num
				+ "\n커피가격: "+this.price);
	}

	@Override
	public String toString() {
		return "Coffee012 [name=" + name + ", num=" + num + ", price=" + price + "]";
	}
	
	
}


public class Ex001_CoffeeRe {
	public static void main(String[] args) {
		    Coffee012 a1 = new Coffee012("카페라떼",2 , 4000);
		    a1.show();
		    Coffee012 a2 = new Coffee012();
//		    a2.setName("아메리카노");
//		    a2.setNum(1);
//		    a2.setPrice(2000);
		    a2.show();
		}
	}

