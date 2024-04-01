package ch02.sec01;

/*
 * 날짜 : 2023/06/12
 * 이름 : 박경진
 * 내용 : 교재 p38 예제
 */

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;	//변수 x에 3저장
		int y = 5;	//변수 y에 5 저장
		System.out.println("x : " + x + ", y : " + y);
		
		int temp = x;	//변수 temp에 x값 저장
		x = y;			//변수 x에 y값 저장
		y = temp;		//변수 y에 temp값 저장
		System.out.println("x : " + x + ", y : " + y);
	}
}
