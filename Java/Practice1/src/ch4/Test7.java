package ch4;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean bank = true;
		int sum = 0;

		
		while(bank) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택>" );

			int choice = sc.nextInt();

			
			
			if(choice==1) {
				System.out.print("예금액>");
				int in = sc.nextInt();
				sum += in;
			} else if(choice==2){
				System.out.print("출금액>");
				int out = sc.nextInt();
				sum -= out;;
			} else if(choice==3) {
				System.out.println("잔고>" + sum);
				
			}else if(choice==4){
				bank = false;
				System.out.println();
			}
		}
		System.out.println("프로그램 종료");
		
	}
}
