package sub2;

/*
 *  날짜 : 2023/06/12
 *  이름 : 박경진
 *  내용 : Java 자료형 실습하기
 * 
 * 자료형(Data Type)
 *  - 변수에 저장되는 데이터의 종류와 크기를 나타낸 키워드
 *  - 자료형은 기본형과 참조형(*객체)으로 나뉨
 *  
 */
public class DataTypeTest {
	public static void main(String[] args) {
		
		// 정수형
		byte 	num1 = 127; //가장 크기가 작은 정수형 최대 127까지 저장
		short 	num2 = 32767; //최대 32767까지 저장
		int 	num3 = 2147483647; //최대 2147483647까지 저장, 주로 사용
		long	num4 = 922337203685477507L; //최대 922337203685477507L까지 저장마지막에 대문자L을 표기(long타입임을 알려줌)
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		
		// 실수형(소숫점)
		float var1 = 0.123456789f; //마지막에 소문자f 입력(float타입임을 알려줌), 8자리까지 출력
		double var2 = 0.1234567890123456789; //17자리까지 출력
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		
		// 논리형
		boolean data1 = true;
		boolean data2 = false;
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		
		// 문자형
		char c1 = 'A';
		char c2 = '가'; //문자 하나만 저장 가능
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		
		// 문자열(참조타입)
		String str1 = "A";
		String str2 = "가";
		String str3 = "Apple";
		String str4 = "가을"; //단어 저장 가능
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		System.out.println("str4 : " + str4);

	}
}
