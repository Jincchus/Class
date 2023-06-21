package step3;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int inputbyte = sc.nextInt(); //N바이트 정수입력값
		
		for(int i = 0; i<inputbyte/4; i++) {

			
			String sumType = "";
			String typeName = "long"; //자료형 이름
						
			sumType += typeName;
			System.out.print(typeName + " ");
		}
		

		System.out.println("int");
		

	}
}
