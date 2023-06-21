package sub1;

/*
 * 날짜 : 2023/06/14
 * 이름 : 박경진
 * 내용 : Java 배열 실습하기
 */

public class ArrayTest {
	
	public static void main(String[] args) {
		
		// 배열
		int[] 	 arr1 = {1,2,3,4,5};	//[] : 배열 키워드
		char[] 	 arr2 = {'A','B','C'};
		String[] arr3 = {"서울","대전","대구","부산","광주"};
		
		// 원소 출력
		System.out.println("arr1[0] : " + arr1[0]);
		System.out.println("arr1[2] : " + arr1[2]);
		System.out.println("arr1[3] : " + arr1[3]);
		
		System.out.println("arr2[2] : " + arr2[2]);
		
		System.out.println("arr3[3] : " + arr3[3]);
		
		// 배열 길이(원소 갯수)
		System.out.println("arr1 길이 : " + arr1.length);	//. >참조 연산자(기능을 참조 할 때 사용)
		System.out.println("arr2 길이 : " + arr2.length);	
		System.out.println("arr3 길이 : " + arr3.length);	
				
		// 배열 반복문
		for(int i=0 ; i<arr1.length ; i++){
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println(); //개행
		
		for(char c : arr2/*배열의 조건식 arr2의 배열이 c변수에 대입됨*/) {
			System.out.print(c+" ");
		}
		
		System.out.println(); //개행
		
		for(String s : arr3) {
			System.out.print(s+" ");
		}
		
		System.out.println(); //개행
		
		// 1차원 배열
		int[] scores = {80, 60, 78, 62, 92};	//배열 이름은 복수형으로
		int total = 0;
		
		for(int score : scores) {
			total += score;
		}
		
		System.out.println("scores 합 : " + total);
		
		// 2차원 배열 (출력은 이중 for문 사용)
		int[][] arr2d = {{1,  2,  3, 4}, 
						 {5,  6,  7, 8}, 
						 {9, 10, 11, 12}};
		
		for(int a=0; a<3 ; a++) {
			
			for(int b=0; b<4 ; b++) {
				System.out.println("arr2d["+a+"]["+b+"] : " + arr2d[a][b]);
			}
		}
		
		// 3차원 배열 (출력은 3중 for문 사용)
		int[][][] arr3d = {{{1,  2,  3}, 
							{4,  5,  6}, 
							{7,  8,  9}}, 
						   {{10, 11, 12}, 
							{13, 14, 15}, 
							{16, 17, 18}}, 
						   {{19, 20, 21}, 
							{22, 23, 24}, 
							{25, 26, 27}}};
		
		for(int x = 0; x<3 ; x++) {
			for(int y = 0; y<3 ; y++) {
				for(int z = 0; z<3 ; z++) {
					System.out.println("arr3d["+x+"]["+y+"]["+z+"] : " + arr3d[x][y][z]);
					System.out.printf("arr3d[%d][%d][%d] : %d\n", x, y, z, arr3d[x][y][z]);
				}
			}
		}
		
		
	}
}
