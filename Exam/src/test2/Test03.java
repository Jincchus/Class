package test2;

/*
 * 날짜 : 2023/06/15
 * 이름 : 박경진
 * 내용 : 자바 배열 역순으로 정렬 연습문제
 */

public class Test03 {
	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// 현재 배열 출력
		for(int i = 0 ;  i < 10 ; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		System.out.print("\n");
		
		// 배열의 원소를 역순으로 정렬
		for(int j = 0 ; j < 5 ; j++) {
			int temp = arr[j];
			arr[j] = arr[9-j];
			arr[9 - j] = temp;
		}
		
		//강사님 답 for(int n : arr)
		for(int n = 0 ; n < arr.length; n++)
			System.out.print(arr[n]+", ");
	}
}
