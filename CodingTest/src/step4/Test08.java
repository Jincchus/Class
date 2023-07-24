package step4;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] A = new int [10];
		
		for(int i=0 ; i < 10 ; i++) {
			A[i] = sc.nextInt() % 42;
		}

		int count = 0;
		for(int i=0 ; i<10 ; i++) {
			boolean isDuplicate = false;
			
			for(int j=0 ; j<i; j++) {
				if(A[i] == A[j]) {
					isDuplicate = true;
					break;
				}
			}
			
			if(!isDuplicate){
				count++;
			}
			
		}
		System.out.println(count);
	}
}
