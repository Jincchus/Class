package ch04.sec03;
/*
 * 날짜 : 2023/06/14
 * 이름 : 박경진
 * 내용 : 교재 p120예제
 */

public class SwitchNoBreakCaseExample {
	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 8;
		System.out.println("현재 시간 : " + time + "시");
		
		switch(time) {
		case 8 : 
			System.out.println("출근합니다.");
		case 9 :
			System.out.println("회의를 합니다.");
		case 10 :
			System.out.println("업무를 봅니다.");
		default :
			System.out.println("외근을 나갑니다.");
		}
	}
}
