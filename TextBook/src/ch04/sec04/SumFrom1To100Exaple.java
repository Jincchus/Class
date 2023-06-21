package ch04.sec04;
/*
 * 날짜 : 2023/06/14
 * 이름 : 박경진
 * 내용 : 교재 p126예제
 */

public class SumFrom1To100Exaple {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		
		for(i=1; i<=100; i++) {
			sum+=i;
		}
		System.out.println("1~" + (i-1) + " 합 : " +sum);
		
	}
}

