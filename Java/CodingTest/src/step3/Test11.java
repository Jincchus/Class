package step3;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int a, b;
		
		do {
			a=sc.nextInt();
			b=sc.nextInt();
			
			if(a!=0 || b!=0) {
				int sum = a+b;
				System.out.println(sum);
			}
		} while(a!=0 || b!=0);
		

	}
}