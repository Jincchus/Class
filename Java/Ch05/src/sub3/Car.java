package sub3;

public class Car {
	
	//필드(속성) heap에 저장
	private String name;
	private String color;
	private int speed;
	//클래스변수(정적변수) Method Area에 저장(Data 영역)
	public static int count;	
	
	//생성자 : 캡슐화된 속성을 초기화하기 위한 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
		count++;
	}

	//클래스 메서드(정적메서드), Static변수를 다루는 메서드이기 때문에 Static선언
	public static int getCount() {
		return count;
	}
	
	//메서드(기능)
	public void speedUp(int speed) {
		this.speed += speed;
	}
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
}
