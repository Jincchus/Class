package test3;

/*
 * 날짜 : 2023/06/23
 * 이름 : 박경진
 * 내용 : 정적변수 연습문제
 */

class Student{
	protected static int studentId;
	private String studentName;
	private String major;
	private int grade;
	
	public Student(String studentName, String major, int grade) {
		this.studentId++;
		this.studentName = studentName;
		this.major = major;
		this.grade = grade;
	}
	
	public void studentInfo() {
		System.out.println("===============");
		System.out.println("학번 : " + studentId);
		System.out.println("이름 : " + studentName);
		System.out.println("전공 : " + major);
		System.out.println("학년 : " + grade);
		System.out.println("---------------");
	}
}


public class Test04 {
	public static void main(String[] args) {
		
		Student.studentId = 20201000;	//Student클래스로 직접 접근> static
		
		Student Kim = new Student("김유신", "국문과", 1);
		Kim.studentInfo();
		
		Student lee = new Student("이순신", "경제학과", 1);
		lee.studentInfo();
		
		Student lim = new Student("임꺽정", "경영학과", 1);
		lim.studentInfo();
		
	}
}
