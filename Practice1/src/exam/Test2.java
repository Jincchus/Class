package exam;

public class Test2 {
	public static void main(String[] args) {
		
		for(int i =1; i<=4; i++) {
			for(int j=4; j>i; j--) {
			System.out.print("☆");
			}
			
			for(int k=1; k<=2*i-1; k++) {
				System.out.print("★");
			}
			for(int j=4; j>i; j--) {
			System.out.print("☆");
			}
			System.out.println();
		}
	}
}


/*
 * 날짜 : 2023/07/05
 * 이름 : 박경진
 * 내용 : Java 수행평가
 * 
 * 문제2.
 * 다음과 같이 출력하는 프로그램을 작성하시오.
 * ☆☆☆★☆☆☆
 * ☆☆★★★☆☆ 
 * ☆★★★★★☆
 * ★★★★★★★
 */
