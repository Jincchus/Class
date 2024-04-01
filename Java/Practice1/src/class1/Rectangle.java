package class1;
//문제 9 - 다음을 만족하는 클래스 Rectangle을 작성하시오.
//	1)사각형의 가로와 세로로 객체를 생성하는 생성자
//	2)면적을 반환하는 메소드 getArea(), 둘레를 반환하는 메소드 getCircumference(),
//	3)다음과 같이 클래스 Rectangle 이용
//Rectangle rc = new Rectangle(3.82, 8.65);
//System.out.println("면적: " + rc.getArea());
//System.out.println("둘레: " + rc.getCircumference());

public class Rectangle/*직사각형*/ {
	double width ; //가로
	double length ; //세로
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	double getArea() {
		double area = width * length;
		return area;
	}
	
	double getCircumference() {
		double cf = (width+length)*2;
		return cf;
	}
	
	public static void main(String[] args) {
		Rectangle rc = new Rectangle(3.82, 8.65);
		
		System.out.println("면적: " + rc.getArea());
		System.out.println("둘레: " + rc.getCircumference());
	}

}
