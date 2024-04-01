package step4;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		int[] arr = new int[9];
		
		int max = arr[0];
		int num = 0;
		
		for(int i=0; i<9; i++) {
			int n = sc.nextInt();
			arr[i] = n;
			
			if(i==0) {
				max = n;
			} else if(max<n) {
				max = n;
				num = i;
			}
			
			
			
		}
		System.out.println(max);
		System.out.println(num+1);
		
	}
}
