package confirm.ch06;

public class Test16Printer {
	
	public void println (int value) {
		System.out.println(value);
	}
	
	public void println (boolean value) {
		System.out.println(value);
	}
	
	public void println (double value) {
		System.out.println(value);
	}
	
	public void println (String value) {
		System.out.println(value);
	}
	
	
	public static void main(String[] args) {
		Test16Printer printer = new Test16Printer();
		
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
	}

}
