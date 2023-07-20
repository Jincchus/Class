package confirm.ch07;

class Parent1 {
	
	public String nation;
	
	public Parent1() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Parent1(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}

class Child extends Parent1{
	
	public String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(string name) call");
	}
}

public class Test7ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
	}
	
}