package ch02.sec02;

/*
 * 날짜 : 2023/06/13
 * 이름 : 박경진
 * 내용 : 교재 p43 예제
 */

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
//		long var3 = 1000000000000; 컴파일러는 int로 간주해 에러 발생
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
