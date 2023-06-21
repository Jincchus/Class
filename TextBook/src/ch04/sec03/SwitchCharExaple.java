package ch04.sec03;
/*
 * 날짜 : 2023/06/14
 * 이름 : 박경진
 * 내용 : 교재 p121예제
 */

public class SwitchCharExaple {
	public static void main(String[] args) {
		char grade = 'B';
		
		switch(grade) {
		case 'A' :
		case 'a' :
			System.out.println("우수 회원입니다.");
			break;
		case 'B' :
		case 'b' :
			System.out.println("일반 회원입니다.");
			break;
		default : 
			System.out.println("손님입니다.");
		}
	}
}
