package class1;
//2)클래스 AccountTest의 main() 메소드에서 인출 상한 이상의 금액을 인출하려는 메소드를 호출하여 출력

public class AccountTest {
	public static void main(String[] args) {
		
		Account account = new Account();

		account.setOwner("박정진");
		String owner = account.getOwner();
		account.setBalance(10000);
		long balance = account.getBalance();
		
		long a = account.deposit(5000);
		
		long b = account.withdraw(8000);
		
		long c = account.withdraw(10000);
	}
}
