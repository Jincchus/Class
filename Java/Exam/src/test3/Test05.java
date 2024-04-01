package test3;

/*
 * 날짜 : 2023/06/23
 * 이름 : 박경진
 * 내용 : 싱글톤 객체 연습문제
 */

class Vehicle {
	private String name;
	private int price;
	
	public Vehicle(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("===============");
		System.out.println("차량명 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("---------------");
	}
}

class CarFactory{	//싱글톤 클래스
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		return instance;
	}
	
	public Vehicle createCar(String name, int price) {
		return new Vehicle(name, price);
		
		// Vehicle v = new Vehicle(name, price);
		// return v;
	}
}

public class Test05 {
	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance();	//CarFactory 생성자가 private라 직접 참조 불가
														//직접 참조시에는 생성자를 public으로 바꾸고 
														//CarFactory factory = new CarFactory로 사용
		
		Vehicle avante = factory.createCar("아반테", 2500);
		Vehicle sonata = factory.createCar("소나타", 3000);
		
		avante.info();
		sonata.info();
		
		
	}
}
