package confirm.ch04;

/*
 * while 문과 Math.random() 메소드를 이용해 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고,
 * 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성하라
 * 눈의 합이 5가 되는 경우는 (1,4),(4,1),(2,3),(3,2)이다
 */

public class Test4 {
	public static void main(String[] args) {
		
		
		while(true) {
			int num1 = (int) Math.ceil(Math.random() * 6);
			int num2 = (int) Math.ceil(Math.random() * 6);

			System.out.println("(" + num1 + "," + num2 + ")");
			
			int tot = num1 + num2;
			if(tot == 5) {
				break;
			}
		}
		
	}
}
