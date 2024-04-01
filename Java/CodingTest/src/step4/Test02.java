package step4;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] A = new int[n];
		

		int x = sc.nextInt();
		
		for(int i = 0; i<n ; i++) {
			A[i] = sc.nextInt();

		}
		

		
		for(int i = 0; i<n ; i++) {
			if(A[i] < x) {
				System.out.print(A[i] + " ");
			}
		}
		
		sc.close();
		
	}
}
