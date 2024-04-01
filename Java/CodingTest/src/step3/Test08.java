package step3;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		int sum ;
		
		for(int i = 1; i<=t ; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			sum = a+b;
			
			System.out.println("Case #"+i+ ": " + a + " + " + b + " = " + sum);
			
		}
		
	}
}
