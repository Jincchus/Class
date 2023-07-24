package step4;

/*
 * 도현이 가진 총 바구니 갯수 : N개
 * 역순으로 바꿀 횟수 : M번
 * 역순으로 만들 바구니 시작 : i번째 바구니
 * 역순으로 만들 바구니 끝 : j번째 바구니
 */
import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 바구니 갯수
		int[] basket = new int [N];
		for(int i=0;i<N;i++) {
			basket[i] = i+1;
		}
		
		int M = sc.nextInt(); // 역순으로 바꿀 횟수
		
		for(int a=0;a<M;a++) {
			int i = sc.nextInt(); // 역순 바구니 시작
			int j = sc.nextInt(); // 역순 바구니 끝
			
			for(int b=0; b<(j-i+1)/2; b++) {
				int temp = basket[i-1+b] ;
				basket[i-1+b] = basket[j-1-b];
				basket[j-1-b] = temp;
			}
		}
		
		for(int b=0; b<N; b++) {
			System.out.print(basket[b] + " ");
		}
	}
}
