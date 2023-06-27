package step4;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];


		int max = arr[0];
		int min = arr[0];

		for(int i = 0; i<n; i++) {
			int a = sc.nextInt();
			arr[i] = a;

			if(i == 0) {
				max = a;
				min = a;
			} else {
				if(a < min) {
					min = a;
				} 
				if (a > max) {
					max = a;
				}

			}
		}

		System.out.print(min + " ");
		System.out.println(max);
	}
}