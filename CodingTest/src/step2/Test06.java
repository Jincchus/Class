package step2;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		int timer = sc.nextInt();

		int endM = m+timer;
		
		if(endM>=60) {
			h += endM / 60;
			endM %= 60;
		}
		if(h>=24) {
			h %= 24;
		}

		System.out.println(h+" "+endM);
	}
}

