package Itex1;

class SuperObject{
	public void paint() {
		draw();
	}
	
	public void draw(){
		draw();
		System.out.println("Super Object");
	}
}

class SubObject extends SuperObject{
	public void paint() {
		super.draw();
	}
	
	public void draw() {
		System.out.println("Sub Object");
	}
}

public class Test1 {
	public static void main(String[] args) {
		SuperObject a = new SubObject();
		a.paint();
	}
}
