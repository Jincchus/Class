package ch04.sec07;

/*
 * 날짜 : 2023/06/16
 * 이름 : 박경진
 * 내용 : 교재 p134 예제
 */

public class BreakExample {

	public static void main(String[] args) throws Exception {
		while(true) {
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			if(num == 6) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
	
}
