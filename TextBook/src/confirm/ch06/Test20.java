package confirm.ch06;

import java.util.Scanner;

/**
 *  키보드로 계좌 정보를 입력받아 계좌를 관리하는 프로그램
 *  계좌는 Account 객체로 생성, BankApplication에서 길이 100인 Account[] 배열로 관리
 *  실행결과를 보고 Account와 BankApplication 클래스를 작성하라
 *  (키보드로 입력받을 때는 Scanner의 nextLine() 메소드 사용)
 *
 */

class BankAccount {
	private String id ;
	private String name ;
	private int balance ;

	public BankAccount(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return id + "\t" + name + "\t" + balance;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void deposit(int amount) {
		balance += amount;
	}
	public void withdraw(int amount) {
		balance -= amount;
	}

}


public class Test20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BankAccount[] accounts = new BankAccount[100];

		int balance = 0;
		while(true) {
			System.out.println("-----------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------");

			System.out.print("선택>");
			int choice = sc.nextInt();

			if(choice == 5) {
				break;
			} else if(choice == 1) {
				System.out.println("--------");
				System.out.println("계좌생성");
				System.out.println("--------");

				System.out.print("계좌번호 : ");
				String id = sc.next();

				System.out.print("계좌주 : ");
				String name = sc.next();

				System.out.print("초기입금액 : ");
				balance = sc.nextInt();

				BankAccount account = new BankAccount(id, name, balance);

				for(int i = 0 ; i < accounts.length ; i++) {
					if(accounts[i] == null) {
						accounts[i] = account;
						System.out.println("결과 : 계좌가 생성되었습니다");
						break;
					}
				}

			} else if(choice == 2) {
				System.out.println("--------");
				System.out.println("계좌목록");
				System.out.println("--------");

				for(BankAccount account : accounts) {
					if(account != null) {
						System.out.println(account);
					}
				}

			} else if(choice == 3) {
				System.out.println("--------");
				System.out.println("예금");
				System.out.println("--------");

				System.out.print("계좌번호 : ");
				String id = sc.next();

				for(int i = 0 ; i < accounts.length ; i++) {
					if(accounts[i] != null && id.equals(accounts[i].getId())) {
						System.out.print("예금액 : ");
						int deposit = sc.nextInt();

						accounts[i].deposit(deposit);
						break;
					}else if(i == accounts.length -1) {
						System.out.println("선택하신 계좌번호가 없습니다.");
					};
				}
			} else if(choice == 4) {
				System.out.println("--------");
				System.out.println("출금");
				System.out.println("--------");

				System.out.print("계좌번호 : ");
				String id = sc.next();

				for(int i = 0 ; i < accounts.length ; i++) {
					if(accounts[i] != null && id.equals(accounts[i].getId())) {
						System.out.print("출금액 : ");
						int withdraw = sc.nextInt();
						
						accounts[i].withdraw(withdraw);
						break;
					}else if(i == accounts.length -1){
						System.out.println("선택하신 계좌번호가 없습니다.");
					};
				}


			}

		}
		System.out.println("프로그램 종료");

	}
}
