package test8;

/*
 * 날짜 : 2023/07/21
 * 이름 : 박경진
 * 내용 : 자바 총정리 연습문제
 */

public class Test04 {
	public static void main(String[] args) {
		
		int		i = 5;
		char	c = 'A';
		Float	f = 3.14f;
		double	d = 31.14;
		boolean	b = true;
		String	s = "Hello";
		
		printArgsInfo(i);
		printArgsInfo(c);
		printArgsInfo(f);
		printArgsInfo(d);
		printArgsInfo(b);
		printArgsInfo(s);
	}
	
	public static <T> void printArgsInfo(T arg){
		System.out.println("타입 : " + arg.getClass());
		System.out.println("값 : " + arg.toString());
	}

//	public static void printArgsInfo1(Object arg){
//		System.out.println("타입 : " + arg.getClass());
//		System.out.println("값 : " + arg.toString());
}
