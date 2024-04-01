package confirm.ch06;

/*
 * Account : 은행 계좌 객체 , balance : 잔고 필드 음수값이 될 수 없고 최대 백만원까지 저장
 * 외부에서 balance 필드를 마음대로 변경하지 못하고, 
 * 0 <= balance <= 1,000,000 범위의 값만 가질 수 있도록 Account 클래스 작성
 * 
 * 조건
 * Setter와 Getter 이용
 * 0과 1,000,000은 MIN_BALANCE와 MAX_BALANCE 상수를 선언해서 이용
 * Setter의 매개값이 음수이거나 백만원을 초과하면 현재 balance값을 유지
 */

class Account {
	private int balance;
	private static final int MIN_BALANCE = 0;
	private static final int MAX_BALANCE = 1000000;
	
	public Account() {	}

	public int getBalance() {

		return balance;
	}
	public void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		} 
	}
}

public class Test19 {
	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(-100);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(2000000);
		System.out.println("현재 잔고 : " + account.getBalance());

		account.setBalance(300000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
	}

}
