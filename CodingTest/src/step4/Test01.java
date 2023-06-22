package step4;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();	//정수 개수
		int[] count = new int[n];

		for (int i=0; i< n; i++) {
			count[i] = sc.nextInt();
		}

		int v = sc.nextInt();
		int num = 0;

		for(int i=0; i<n; i++) {
			if(count[i] == v) {
				num++;
			}

		}

		System.out.println(num);

		 sc.close();
	}
}
