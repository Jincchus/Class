package ch02.sec06;
/*
 * 날짜 : 2023/06/13
 * 이름 : 박경진
 * 내용 : 교재 p51 예제
 */
public abstract class TextBlockExample {
	public static void main(String[] args) {
		String str1 = "" +
				"{\n" +
				"\t\"id\":\"winter\",\n" +
				"\t\"name\":\"눈송이\"\n" +
				"}";

		String str2 = """
				{
					"id":"winter",
					"name":"눈송이"
				}
				""";

		System.out.println(str1);
		System.out.println("--------------------");
		System.out.println(str2);
		System.out.println("--------------------");
		String str = """
				나는 자바를 \
				학습합니다.
				나는 자바 고수가 될 겁니다.
				""";
		System.out.println(str);
	}
}