package confirm.ch05;

import java.util.Scanner;

/* 학생들의 점수를 분석하는 프로그램
 * 학생 수와 각 학생들의 점수를 입력받고 while 문과 Scanner의 nextLine()메소드를 이용해
 * 최고점수 및 평균점수를 출력하는 코드 작성
 */

public class Test9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int scores[] = null;
		
		while(true) {
			System.out.println("--------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("--------------------------------------------");
			
			System.out.print("선택 : ");
			int choice = sc.nextInt();
			if(choice == 1) {
				System.out.print("학생수 : ");
				int num = sc.nextInt();
				
				scores = new int[num];
			} else if(choice == 2) {
				for(int i = 0 ; i < scores.length ; i++) {
					System.out.print("scores[" + i + "] : ");
					scores[i] = sc.nextInt();
				}
			} else if(choice == 3) {
				for(int i = 0 ; i < scores.length ; i++) {
					System.out.println("scores[" + i + "] : " + scores[i]);
				}
			} else if(choice == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i=0; i<scores.length ; i++) {
					if(scores[i] > max) {
						max = scores[i];
					}
					sum += scores[i];
				}
				avg = (double) sum/scores.length;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
			} else if(choice == 5) {
				System.out.println("프로그램 종료");
				break;
			} else {
				break;
			}
			
		}
		
	}

}
