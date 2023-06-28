package sub6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 날짜 : 2023/06/28
 * 이름 : 박경진
 * 내용 : Java 정규표현식 실습
 * 		교재 P545
 */

public class RegularExpressionTest {
	public static void main(String[] args) {

		// 정규표현식
		String strPatt = "a[a-z]*";	// a로 시작하는 문자, 그 다음 문자가 a-z중 문자 0개 이상

		Boolean r1 = Pattern.matches(strPatt, "apple");
		Boolean r2 = Pattern.matches(strPatt, "banana");
		Boolean r3 = Pattern.matches(strPatt, "a");


		System.out.println("r1 : " + r1);
		System.out.println("r2 : " + r2);
		System.out.println("r3 : " + r3);

		// 정규표현식 패턴
		String[] patterns = {
								"[0-9]+",		// 숫자 1개 이상
								"1[0-9]*",		// 숫자 1로 시작하고 이후 숫자 0개 이상
								"^[0-9]",		// 숫자로 시작하는 문자
								"[^0-9]",		// 숫자가 아닌 문자
								".",			// 문자 1개
								"[a-z]?",		// 영어 소문자 1개
								"[a-z]*",		// 영어 소문자 0개 이상
								"[a-z]+",		// 영어 소문자 1개 이상
								"[A-Z]*",		// 영어 대문자 0개 이상
								"[가-힣]+",		// 한글 1자 이상
								"[0-9a-z]*",	// 숫자+영어 조합 0개 이상
								"[0-9가-힣]*",	// 숫자+한글 조합 0개 이상
								"^[A-Z][a-z]*",	// 영어 대문자로 시작하는 문자 0개 이상
								"\\s",			// 공백
								"\\S",			// 공백이 아닌 문자
								"\\d",			// 숫자
								"\\w",			// 숫자와 문자
								"\\W"			// 특수 문자
		};
		String[] words = {"apple", "123한글","123456", "011", "hello", "홍길동", "1", "Banana", "APPLE", "#"};

		for(String word : words) {

			System.out.print(word + " 문자와 일치하는 패턴 : ");

			for(String pattern : patterns) {

				boolean result = Pattern.matches(pattern, word)	;

				if(result) {
					System.out.print(pattern + ", ");
				}


			}

			System.out.print("\n");
		}

		// 자주 사용하는 정규표현식
		String ptt1 = "^[a-zA-Z0-9]*$";	// 영어,숫자로 이루어짐
		String ptt2 = "^[가-힣]*";		// 한글
		String ptt3 = "(01\\d{1})-(\\d{3,4})-(\\d{4})";	//\\d 숫자 {1} 한 번 반복,\\d{3,4}숫자 3개 또는 4개, \\d{4}숫자 4개
		String ptt4 = "(\\w+)@(\\w+).(\\w+)";	
		
		String str = "이름:홍길동, 휴대폰:010-1234-1001, 휴대폰:011-123-1001, 이메일:hong@gmail.com";
		
		Pattern p1 = Pattern.compile(ptt3);
		Matcher m1 = p1.matcher(str);
		
		System.out.println("휴대폰 조회");
		while(m1.find()) {
			System.out.println(m1.group());
		}
		
		Pattern p2 = Pattern.compile(ptt4);
		Matcher m2 = p2.matcher(str);
		
		System.out.println("이메일 조회");
		while(m2.find()) {
			System.out.println(m2.group());
		}
		
	}
}
