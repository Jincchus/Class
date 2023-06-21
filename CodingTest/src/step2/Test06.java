package step2;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int m = sc.nextInt();
		int timer = sc.nextInt();



		if(60<m+timer) {
			h+=1;
			m += timer-60;
			if(h>23) {
				h = 0;
				
			}
			if(m==60) {
				m=0;
				h+=1;
			}
		} else if(60>m+timer) {
			m += timer;
		} 

		System.out.println(h+" "+m);
	}
}

