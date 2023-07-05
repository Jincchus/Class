package Itex1;

public class Test2 {
	public static void main(String[] args) {
		int numAry[] = new int[5];
		int result =0;
		
		for(int i=0; i<5; i++) {
			numAry[i] = i+1;
		}
		
		for(int i : numAry) {
			result += i;
		}
		
		System.out.printf("%d", result);
	}
}
