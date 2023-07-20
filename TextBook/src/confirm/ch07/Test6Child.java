package confirm.ch07;

class Parent {
	public String name;
	
	public Parent(String name) {
		this.name = name;
	}
	
}

public class Test6Child extends Parent {
	public int studentNo;
	
	public Test6Child(String name, int studentNo) {
		super(name);
		this.studentNo = studentNo;
	}
}
