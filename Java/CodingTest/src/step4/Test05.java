package step4;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int arr[] = new int[n+1];
		
		for(int i=0 ; i<m; i++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			int num = sc.nextInt();
			
			for(int j=start; j<=end; j++) {
				arr[j] = num;
			}
		}
		
		for(int i = 1; i<=n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
}
