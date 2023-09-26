package Ch01.sub1;

/*
 * 날짜 : 2023/09/19
 * 이름 : 박경진
 * 내용 : Proxy기반 AOP원리 실습 
 */
public class ProxyTest {
	
	public static void main(String[] args) {
		
		Target target = new Targetlmpl();
		Target proxy = new TargetProxy(target);
		
		proxy.doBusiness();		
	}
}