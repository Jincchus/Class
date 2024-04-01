package confirm.ch04;

import java.util.Scanner;

public class Test7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int balance = 0;
		
		while(true) {
			
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			
			System.out.print("선택 : ");
			
			int answer = sc.nextInt();
			
			if(answer == 4) {
				break;
			} else if(answer == 1) {
				System.out.print("예금액 : ");
				int deposit = sc.nextInt();
				balance += deposit;
				System.out.print("현재 잔고 : " + balance);
			} else if(answer == 2) {
				System.out.println("출금액 : ");
				int withdraw = sc.nextInt();
				balance -= withdraw;
				System.out.println("현재 잔고 : " + balance);
			} else if (answer == 3) {
				System.out.println("현재 잔고는 " + balance + "원 입니다.");
			} else {
				System.out.println("잘못된 선택입니다. 다시 선택해주세요");
			}
			
		}
		
		System.out.println("프로그램 종료");
		
	}
}
