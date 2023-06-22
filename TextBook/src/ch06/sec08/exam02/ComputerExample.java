package ch06.sec08.exam02;

/*
 * 날짜 : 2023/06/22
 * 이름 : 박경진
 * 내용 : 교재 p235예제
 */

public class ComputerExample {
	public static void main(String[] args) {
		//Computer 객체 생성
		Computer myCom = new Computer();
		
		//sum() 메서드 호출 시 매개값 1,2,3을 제공, 합산 결과를 리턴 받아 result1 변수에 대입
		int result1 = myCom.sum(1,2,3);
		System.out.println("result1 : " + result1);
		
		//매개값 1~5 제공 result2에 대입
		int result2 = myCom.sum(1,2,3,4,5);
		System.out.println("result2 : " + result2);
		
		//sum()메서드 호출시 배열제공 result3변수에 대입
		int values[] = {1,2,3,4,5};
		int result3 = myCom.sum(values);
		System.out.println("result3 : " + result3);
		
		int result4 = myCom.sum(new int[] {1,2,3,4,5});
		System.out.println("result4 : " + result4);
		
	}
}
