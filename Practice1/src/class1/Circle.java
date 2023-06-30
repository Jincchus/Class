package class1;

//문제 3 - 다음에 구현된 Circle 클래스를 참고로 다음을 만족하는 Cylinder 클래스를 작성하시오.
// 1) 원통을 나타내는 Cylinder 클래스는 Circle형의 원과 실수형의 높이를 필드로 선언
// 2) 메소드 getVolume()은 원통의 부피를 반환
// 3) Cylinder 클래스의 main() 메소드에서 반지름이 2.8, 높이가 5.6의 원통의 부피를 출력
// 4) 다음은 원을 나타내는 클래스 Circle
//
//문제 4 -  위에서 구현한 Cylinder를 다음 조건에 맞도록 기능을 추가하여 작성하시오.
// 1) 다음과 같은 객체 생성이 가능하도록 생성자를 구현
// 2) Cylinder cd = new Cylinder(new Circle(2.8), 5.6);

public class Circle {
	public double radius;	// 반지름
	public static double PI = 3.141592;	// 원주율

	//생성자 구현

	public Circle(double radius) {
		this.radius = radius;
	}

	//현재 반지름을 사용하여 원의 면적을 구하는 메소드
	public double getArea() {
		return radius * radius * PI;	//원 면적
	}
}