package step3;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(); //총 금액
		int n = sc.nextInt(); //물건 종류 수
		
		
		int totalPrice = 0;
		for(int k = 0; k<n ; k++ ) {

			int a = sc.nextInt(); //물건 가격
			int b = sc.nextInt(); //물건 개수
			
			totalPrice += a*b;
		}

		if( totalPrice == x) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
