package ch4;
/*\
 * while문과 Math.random()메소드를 이용해 두 개의 주사위를 던졌을 때 나오는 눈을 눈(1, 눈2)형태로 출력하고
 * 눈의 합이 5이면 실행을 멈추는 코드를 작성
 * 눈의 합이 5가 되는 경우는 (1,4),(4,1),(2,3),(3,2)
 */


public class Test4 {
	public static void main(String[] args) {
	

		int dice1 = 0;
		int dice2 = 0;
		
		while(dice1 + dice2 != 5){
			
			dice1 = (int)(Math.random()*6)+1;
			dice2 = (int)(Math.random()*6)+1;

			int sum = dice1 + dice2;
			
			System.out.println("주사위 1 : " + dice1 + ", 주사위 2 : " + dice2 + ", 합계 : " + sum);
			
		}
//		
//		챗GPT답
//		
//		boolean stop = false;
//
//		while (!stop) {
//			int dice1 = (int) (Math.random() * 6) + 1; // 주사위 1의 눈
//			int dice2 = (int) (Math.random() * 6) + 1; // 주사위 2의 눈
//			int sum = dice1 + dice2; // 눈의 합
//
//			System.out.println("주사위 1의 눈: " + dice1 + ", 주사위 2의 눈: " + dice2);
//
//			if (sum == 5) {
//				stop = true; // 눈의 합이 5일 경우 반복 종료
//			}
//		}
//

	}
}




