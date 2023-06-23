package ch4;


//for문을 이용해 1부터 100까지의 정수 중 3의 배수의 총합을 출력하는 코드 작성
public class Test3 {
	
	public static void main(String[] args) {
		

		int sum = 0;
		
		for(int i = 1; i<=100 ; i++) {
			
			if(i%3 == 0) {
				sum += i;
			}
			
		}
		System.out.println(sum);
	}
}
