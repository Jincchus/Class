package class1;


public class Cylinder {

	//Circle형의 원 필드 선언
	Circle cir;
	//실수형의 높이 필드 선언
	double height = 0;

	//Cylinder 생성자
	public Cylinder(Circle cir, double height) {
		this.cir = cir;
		this.height = height;
	}

	//원통 부피를 반환하는 메소드 getVolume()
	public double getVolume() {
		return cir.getArea()* height;
	}


	public static void main(String[] args) {
		//반지름 2.8, 높이 5.6인 원통 부피 출력

		Circle circle = new Circle(2.8);
		double height = 5.6;
		Cylinder cylinder = new Cylinder(circle,height);
		double volume = cylinder.getVolume();

		System.out.println("원통의 부피 : " + volume);



	}
}
