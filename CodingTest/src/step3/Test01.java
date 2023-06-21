package step3;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int x =1 ; x<=9 ;x++) {
			System.out.println(n+ " * " + x + " = " + n*x);
		}
	}
}
