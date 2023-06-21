package sub4;

/*
 * 날짜 : 2023/06/15
 * 이름 : 박경진
 * 내용 : Java 메서드 오버로딩 실습
 */

public class MethodOverloadTest {

	public static void main(String[] args) {
	
		int r1 = plus(1); //인자값이 1개이기 때문에 첫번째 메서드 호출
		int r2 = plus(1,2); //인자값이 2개이기 때문에 두번재 메서드 호출
		double r3 = plus(1.1, 2.3); //데이터 타입이 double이기 때문에 세번째 메서드 호출
		String r4 = plus("Hello", " World"); //데이터타입이 String이기 때문에 네번재 메서드 호출
	
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);
		System.out.println("r4 : " + r4);
		
		
	}
	
	// 오버로딩 메서드 정의
	public static int plus(int a) {
		return a + a;
	}
	
	public static int plus(int a, int b) {
		return a + b;
	}
	
	public static double plus(double a, double b) {
		return a + b;
	}
	
	public static String plus(String a, String b) {
		return a + b;
	}
	
	
	
	
}
