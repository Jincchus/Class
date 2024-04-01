package exam;

/*
 * 날짜 : 2023/07/05
 * 이름 : 박경진
 * 내용 : Java 수행평가
 * 
 * 문제1.
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 프로그램을 작성하시오.
 * 단, 오른쪽 기준으로 정렬
 * 입력조건 : 첫째 줄에 N(1 <= N <= 100)이 주어진다.
 * 출력조건 : 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 * 
 *  예제입력		예제입력
 *    3			  5
 * 
 * 	예제출력		예제출력
 * 	   *		    *
 * 	  **		   **
 * 	 ***		  ***
 * 				 ****
 * 				*****
 */

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			for(int j=n; j>i; j--) {
			System.out.print(" ");
			}
			
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}



