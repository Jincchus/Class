package confirm.ch05;

// 배열 항목에서최대값 출력하는 코드 작성(for문 이용)
public class Test7 {
	public static void main(String[] args) {
		int[] array = {1, 5, 3, 8, 2};
		
		int max = array[0] ;
		
		for(int i = 1 ; i < array.length ; i++) {
			
			if(array[i] > max ) {
				max = array[i];
			}
		}
		System.out.println("최대값 : " + max);
	}

}
