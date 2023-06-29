package step4;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int bucket = sc.nextInt();
		int change = sc.nextInt();
		
		int[] buckets = new int[bucket];
		
		int buc1 = 0;
		int buc2 = 0;
		
		int[] temps = new int[0];
		
		for(int i=1 ; i<=change ; i++) {
			buc1 = sc.nextInt();
			buc2 = sc.nextInt();
			
			buckets[i] =i; 
	
		}
		
		
		
		for(int j=0; j<bucket; j++) {
			
			temps[j] = buckets[buc1];
			buckets[buc1] = buckets[buc2];
			buckets[buc2] = temps[j];
		}
		
		System.out.print(buckets[change] + " ");
		
		
		
		
	}
}
