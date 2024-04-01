package ch03.sec01;
/*
 * 날짜 : 2023/06/13
 * 이름 : 박경진
 * 내용 : 교재 p78 예제
 */
public class SignOperatorExample {
	public static void main(String[] args) {
		int x = -100;
		x = -x;
		System.out.println("x : " + x);
		
		byte b = 100;
		int y = -b;
		System.out.println("y :" + y);
	}
}
