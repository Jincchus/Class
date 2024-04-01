package ch06.sec08.exam03;

/*
 * 날짜 : 2023/06/22
 * 이름 : 박경진
 * 내용 : 교재 p238예제
 */

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setGas(5);
		
		//isLeftGas()메서드호출, 받은 리턴값이 true일 경우 if 블록 실행
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다");
			
			myCar.run();
		}
		System.out.println("gas를 주입하세요.");
	}
}
