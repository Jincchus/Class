package class1;
//문제 1 - 다음을 만족하는 Student 클래스를 작성하시오.
//		1)String형의 학과와 정수형의 학번을 필드로 선언
//		2)Student 클래스의 main() 메소드에서 Student 객체를 생성하여 학과와 학번 필드에 적당한 값을 입력 후 출력
//문제 2 - 위에서 구현한 Student 클래스를 다음을 만족하도록 기능을 추가하여 작성하시오.
//		1)필드를 모두 private로 하고, getter와 setter를 구현하고
//		2)Student 클래스의 main() 메소드에서 Student 객체를 생성하여 setter를 사용하여 학과와 학번 필드에 적당한 값을 입력 후 출력

class Student1{
	private String department;
	private int stdNo;

	
	void setDepartment(String department) {
		this.department = department;
	}
	String getDepartment() {
		return department;
	}

	void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}	
	int getStdNo() {
		return stdNo;
	}
}



public class Student{
	public static void main(String[] args) {

		Student1 std = new Student1();
		
		std.setDepartment("컴퓨터공학과");
		std.setStdNo(35);
		
		System.out.println("학과 : " + std.getDepartment());
		System.out.println("번호 : " + std.getStdNo());
		

	}
}
