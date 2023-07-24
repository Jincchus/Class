package step4;
/* 1. 학생 30명
 * 2. 각 학생별로 1부터 30까지 번호
 * 3. 과제 28명 제출, 제출 안 한 사람 2명
 * 4. 입력 28개 한줄씩 다 받기
 * 5. 안한 사람 2명, 출석 번호 중 작은것부터 출력됨
 */

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int students[] = new int[30]; //1
		int don ;
		
		
		for(int i=1; i<=28; i++ ) {
			int report = sc.nextInt();
			students[report-1] = 1;
		}

		for(int i=0 ; i<30; i++) {
			if(students[i] == 0) {
				System.out.println(i+1);
			}
		}
	}
}
