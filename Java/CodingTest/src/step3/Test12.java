package step3;

import java.util.Scanner;

public class Test12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b;

		while(sc.hasNextInt()) {
			a = sc.nextInt();
			b = sc.nextInt();

			int sum = a+b;
			System.out.println(sum);
		}

	}
}