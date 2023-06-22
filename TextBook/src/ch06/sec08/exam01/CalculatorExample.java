package ch06.sec08.exam01;

/*
 * 날짜 : 2023/06/22
 * 이름 : 박경진
 * 내용 : 교재 p233예제
 */

public class CalculatorExample {
	public static void main(String[] args) {
		// Calculator 객체 생성
		Calculator myCalc = new Calculator();
		
		//메서드 호출
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1 : " + result1);
		int x = 10;
		int y = 4;
		
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : " + result2);
		
		myCalc.powerOff();
	}
}
