package confirm.ch08;

interface Remocon {
	public void powerOn();
}

public class Test5Tv implements Remocon {
	@Override
	public void powerOn() {
		System.out.println("TV를 켰습니다.");
	}
	public static void main(String[] args) {
		Remocon r = new Test5Tv();
		r.powerOn();
	}
}
