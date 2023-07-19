package confirm.ch06;

public class Test14 {
	public static void main(String[] args) {
		
		Test13Member user1 = new Test13Member("홍길동", "hong");
		
		Test15MemberService memberService = new Test15MemberService();
		
		boolean result = memberService.login("hong", "12345");
		
		if(result) {
			
			System.out.println("로그인 되었습니다.");
			Test15MemberService.logout("hong");
			
		} else {
			
			System.out.println("id 또는 password가 올바르지 않습니다.");
			
		}
				
				
	}
}
