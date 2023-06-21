package ch04.sec04;

/*
 * 날짜 : 2023/06/15
 * 이름 : 박경진
 * 내용 : 교재 p127 예제
 */

public class MultiplicationTableExample {
	public static void main(String[] args) {
		for(int m=2; m<=9; m++) {
			System.out.println("*** " + m + "단 ***");
			for(int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + (m*n));
			}
		}
				
	}
}
