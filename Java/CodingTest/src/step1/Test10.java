package step1;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();

		int num1 = a*(b%10);
		int num2 = a*((b/10) % 10);
		int num3 = a*(b/100);
		int num4 = a*b;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		
	}
}
