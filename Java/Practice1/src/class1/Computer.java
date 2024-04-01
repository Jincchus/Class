package class1;
//문제 10 - 다음을 만족하는 클래스 Computer를 작성하시오.
//	1)다음을 상수 필드로 선언
//		public … String[] osType = {"원도7", "애플 OS X", "안드로이드"};
//	2)다음과 같은 클래스 Computer의 객체의 사용 결과에 적합하도록 생성자와 메소드 구현
//		Computer pc = new Computer(0, 16);
//		Computer apple = new Computer(1, 32);
//		Computer galaxy = new Computer(2, 16);
//		pc.print();
//		apple.print();
//		galaxy.print();
//	운영체제: 원도7, 메인메모리: 16
//	운영체제: 애플 OS X, 메인메모리: 32
//	운영체제: 안드로이드, 메인메모리: 16

public class Computer {
	
	public String[] osType = {"윈도7","애플 OS X", "안드로이드"};
	
	int operate ;
	int mainMem ;
	
	public Computer(int operate, int mainMem) {
		this.operate = operate;
		this.mainMem = mainMem;
	}
	
	void print() {
		System.out.println("운영체제 : "+ osType[operate]+", 메인메모리 : " + mainMem);
	}
	
	public static void main(String[] args) {

		Computer pc = new Computer(0, 16);
		Computer apple = new Computer(1, 32);
		Computer galaxy = new Computer(2, 16);
		
		pc.print();
		apple.print();
		galaxy.print();
		
	}
}
