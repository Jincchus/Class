package sub2;

/*
 * 날짜 : 2023/06/15
 * 이름 : 박경진
 * 내용 : Java 메서드 실습하기
 */

public class MethodTest {
	
	// 전역변수 : 객체가 해제 될 때 해제
	int num = 1;
	
	// main method : 프로그램 진입점
	public static void main(String[] args) {
		
		// 메서드 호출
		int y1 = f(1); //x에 대입한 1은 인자값(argument)라고 함
		int y2 = f(2);
		int y3 = f(3);
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);
		
		// 메서드 지역변수와 스택
		int t1 = sum(1, 10);
		int t2 = sum(1,100);
		
		
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		
		
		
		
	}
	
	// 메서드 정의
	public static int f(int x) {	//int x는 매개변수
		
		int y = 2 * x + 3;
		
		return y;
		
	}
	
	// 메서드 정의
	public static int sum(int start, int end){
		
		//지역변수 : 메서드에서 선언된 변수, 메서드가 종료되면 스택에서 해제
		int total = 0;
		
		for(int k = start ; k <= end ; k++) {
			
			total += k;
			
		}
		
		return total;
	}
		
}
