package step4;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int bucket = sc.nextInt();
		int change = sc.nextInt();

		int[] buckets = new int[bucket +1];

		int buc1 = 0;
		int buc2 = 0;

		for(int i=1 ; i<=bucket ; i++) {

			buckets[i] =i; 
		}

		for(int i=0; i<change; i++) {
			buc1 = sc.nextInt();
			buc2 = sc.nextInt();



			int temp = buckets[buc1];
			buckets[buc1] = buckets[buc2];
			buckets[buc2] = temp;

		}

		for(int i = 1; i<=bucket; i++) {

			System.out.print(buckets[i] + " ");
		}

	}
}
