package confirm.ch03;

public class Test5 {
	public static void main(String[] args) {
		
		int lenghthTop = 5;
		int lenghthBottom = 10;
		int height = 7;
		
		double area1 = (lenghthTop + lenghthBottom) * height / 2.0;
		double area2 = (lenghthTop + lenghthBottom) * height * 1.0 / 2;
		double area3 = (double) (lenghthTop + lenghthBottom) * height / 2;
		double area4 = (double) ((lenghthTop + lenghthBottom) * height / 2);
		
		System.out.println(area1);
		System.out.println(area2);
		System.out.println(area3);
		System.out.println(area4);
		
	}

}
