package confirm.ch06;

public class Test18ShopService {
	private static Test18ShopService instance = new Test18ShopService();
	
	public static Test18ShopService getInstance() {
		return instance;
	}
	public Test18ShopService() {}
	
	public static void main(String[] args) {
		Test18ShopService obj1 = Test18ShopService.getInstance();
		Test18ShopService obj2 = Test18ShopService.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 ShopService 객체입니다.");
		}else {
			System.out.println("다른 ShopService 객체입니다.");
		}
	}
}
