package ch5;

//주어진 배열 항목에서 최대값을 출력하는 코드를 작성해보세요(for문 이용)
public class Test7 {
	public static void main(String[] args) {
	
		int array[] = {1,5,3,8,2};
		int max;
		
		for(int i = 0; i<array.length; i++) {
			max = array[i];
			if(max>array[i+1]) {
				max = array[i+1];
			}
		}
		System.out.println(max);
		
	}
	
}
