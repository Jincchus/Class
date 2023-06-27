package sub2;

/*
 * 날짜 : 2023/06/27
 * 이름 : 박경진
 * 내용 : Java StringBuilder 실습
 */

public class StringBuilderTest {
	public static void main(String[] args) {
		
		
		// String immutable 특성
		String str = "Java";
		System.out.println("str 객체 주소 : " +System.identityHashCode(str) );
		System.out.println("str : " +str);
		
		str += "Programing";
		System.out.println("str 객체 주소 : "  +System.identityHashCode(str));
		System.out.println("str : " +str);
		
		
		// String의 immutable 특성을 개선한 StringBuilder
		StringBuilder sb = new StringBuilder("Java");
		System.out.println("sb 객체 주소 : " + System.identityHashCode(sb));
		System.out.println("sb : " +sb);
		
		sb.append("Programing");
		System.out.println("sb 객체 주소 : " + System.identityHashCode(sb));
		System.out.println("sb : " +sb);
		
	}
}
