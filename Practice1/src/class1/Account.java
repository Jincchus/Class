package class1;

//문제 6 -   다음을 만족하는 클래스 Account를 작성하시오.
//	1)다음의 2 개의 필드를 선언
//		private String owner;
//		private long balance;
//	2)위 모든 필드에 대한 getter와 setter의 구현
//	3)위 모든 필드를 사용하는 가능한 모든 생성자의 구현
//문제 7 - 위에서 구현된 클래스 Account에서 다음 기능을 추가하여 작성하시오.
//	1)메소드 deposit()의 헤드는 다음과 같으며 인자인 금액을 저축하는 메소드
//		public long deposit(long amount)
//	2)메소드 withdraw()의 헤드는 다음과 같으며 인자인 금액을 인출하는 메소드
//		public long withdraw(long amount)
//	3)Account 클래스의 main() 메소드에서 Account 객체를 생성하여 적당한 저축과 인출을 수행한 후 잔금을 출력
//문제 8 - 위에서 구현된 메소드 withdraw()를 다음 조건에 맞게 다시 작성하시오.
//	1)인출 상한 금액은 잔액까지로 하며, 이 경우 이러한 상황을 출력
//	2)클래스 AccountTest의 main() 메소드에서 인출 상한 이상의 금액을 인출하려는 메소드를 호출하여 출력

public class Account {
	private String owner;
	private long balance;

	public Account() {}
	public Account(String owner) {
		this.owner = owner;
	}
	public Account(long balance) {
		this.balance = balance;
	}	
	public Account(String owner, long balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwner() {
		return owner;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	public long getBalance() {
		return balance;
	}
	
//	1)메소드 deposit()의 헤드는 다음과 같으며 인자인 금액을 저축하는 메소드
	public long deposit(long amount) {
		System.out.println("입금금액 : " + amount);
		balance += amount;
		System.out.println("잔고 : " + balance);
		return balance;
		
	}
	
//2)메소드 withdraw()의 헤드는 다음과 같으며 인자인 금액을 인출하는 메소드
//	인출 상한 금액은 잔액까지로 하며, 이 경우 이러한 상황을 출력
	public long withdraw(long amount) {
		
		

		System.out.println("출금금액 : " + amount);
		
		if(balance<amount) {
			System.out.println("한도가 부족하여 인출 할 수 없습니다.");
			return balance;
		}
		
		balance -= amount;
		System.out.println("잔고 : " + balance);
		
		return balance;
	}
	
//3)Account 클래스의 main() 메소드에서 Account 객체를 생성하여 
//	적당한 저축과 인출을 수행한 후 잔금을 출력
	
	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.deposit(0);
		account.withdraw(0);
		
		long dep = account.deposit(2000);
		long wit = account.withdraw(500);
		
		
		System.out.println(dep);
		System.out.println(wit);
	}
}




