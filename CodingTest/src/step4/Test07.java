package step4;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/* 1. 학생 30명
		 * 2. 각 학생별로 1부터 30까지 번호
		 * 3. 과제 28명 제출, 제출 안 한 사람 2명
		 * 4. 입력 28개 한줄씩 다 받기
		 * 5. 안한 사람 2명, 출석 번호 중 작은것부터 출력됨
		 */
		
		int student = 30;
		int students[] = new int[student+1]; //1
		
		int work =0 ;
		int student2 = 0;
		int donwork[] = new int[student2+1];
		
		for(int i=0; i<=student; i++ ) {
			students[i] = i;
		}
		
		
		
		for(int i=0; i<student2-1; i++) {
			work = sc.nextInt();
			if (students[i]!=work) {
				donwork[student2] = students[i];
				student2++;
			}
		}
		
		for (int i = 0; i<student2-1;i++) {
			System.out.println(donwork[i]+" ");
		}
		
		
		
		
	}
}
