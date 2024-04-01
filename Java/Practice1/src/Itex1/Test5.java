package Itex1;

//다음은 변수 n에 저장된 10진수를 2진수로 변환하여 출력하는 Java 프로그램이다
//프로그램을 분석하여 (?)안에 들어갈 알맞은 코드를 쓰시오
public class Test5 {
	public static void main(String[] args) {
		
		int a[] = new int[8];
		int i = 0;
		int n = 10;
		while (n>0) {
			a[i++] = n%2;
			n /= 2;
		}
		
		for(i = 7; i>= 0; i--) {
			System.out.print(a[i]);
		}
	}
}
