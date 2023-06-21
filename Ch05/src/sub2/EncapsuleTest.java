package sub2;

/*
 * 날짜 : 2023/06/19
 * 이름 : 박경진
 * 내용 : Java 캡슐화 실습
 * 
 * 캡슐화(정보은닉, Encapsulation)
 *  - 캡슐화는 객체의 속성을 외부에 참조하지 못하게 객체의 정보(속성)를 은닉하는 특성
 *  - 클래스의 속성은 반드시 private 선언을 통해 캡슐화
 *  - private 속성의 초기화를 위해 생성자(Constructor) 정의
 *  - 은닉된 정보의 안전한 사용을 위해 Getter, Setter 제공
 */

public class EncapsuleTest {
	public static void main(String[] args) {
		
		//Car 객체 생성 초기화
		Car sonata = new Car("소나타", "흰색", 10) ;
		sonata.setName("그랜져");
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		
		//Car 객체 생성 초기화
		Car avante = new Car("아반떼", "검은색", 10) ;
		avante.speedUp(60);
		avante.setColor("남색");
		avante.speedDown(20);
		avante.show();
		
		//Account 객체 생성 초기화
		Account kb = new Account("국민은행","박카스","123-45-67890",10000);
		kb.deposite(20000);
		kb.withdraw(5000);
		kb.show();
		
		Account wr = new Account("우리은행","삼순","098-76-54321",20000);
		wr.deposite(20000);
		wr.withdraw(3000);
		wr.show();
		
	}
}
