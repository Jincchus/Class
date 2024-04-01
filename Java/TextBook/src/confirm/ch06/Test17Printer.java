package confirm.ch06;

public class Test17Printer {
	public static void println (int value) {
		System.out.println(value);
	}
	
	public static void println (boolean value) {
		System.out.println(value);
	}
	
	public static void println (double value) {
		System.out.println(value);
	}
	
	public static void println (String value) {
		System.out.println(value);
	}

	public static void main(String[] args) {
		
		Test17Printer.println(10);
		Test17Printer.println(true);
		Test17Printer.println(5.7);
		Test17Printer.println("홍길동");
		
	}
}
