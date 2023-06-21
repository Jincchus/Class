package ch06.sec04;
/*
 * 날짜 : 2023/06/19
 * 이름 : 박경진
 * 내용 : 교재 p210예제
 */

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");
		
		Student s2 = new Student();
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
	}
}
