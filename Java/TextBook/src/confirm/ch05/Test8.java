package confirm.ch05;

// 주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성하라(중첩 for문 이용)

public class Test8 {
	public static void main(String[] args) {

		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		
		for(int i = 1 ; i < array.length ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				sum += array[i][j];
			}
			
		}
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + sum/array.length);
	}
}
