package sub3;

/*
 * 날짜 : 2023/06/15
 * 이름 : 박경진
 * 내용 : Java 메서드 형태 실습
 */

public class MethodTypeTest {

	public static void main(String[] args) {
		
		double r1 = type1(1.1);
		double r2 = type1(2.1);
		
		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		
		type2(true); //리턴값이 없기때문에 리턴값을 받아 줄 매개변수 필요X, 호출만 함
		type2(false);
		
		boolean r3 = type3();
		
		System.out.println("r3 : " + r3);

		type4();
		
	}
	
	// 형태1 : 매개변수 O, 리턴값 O
	public static double type1(double x) {
		
		double y = x + 3.14;
		return y;
		
	}
	
	// 형태2 : 매개변수 O, 리턴값 X
	public static void type2(boolean status) {
		
		if(status) {
			System.out.println("참 입니다.");
		}else {
			System.out.println("거짓 입니다.");
		}		
	}
	
	// 형태3 : 매개변수 X, 리턴값 O
	public static boolean type3() {
		
		int num1 = 1;
		int num2 = 2;
		
		if(num1 > num2) {
			return true;
		} else {
			return false;
		}
	}
	
	// 형태4 : 매개변수 X, 리턴값 X
	public static void type4() {
		double result = type1(0.3);
		System.out.println("type4 실행결과 : " + result);
	}
	
	
	
}