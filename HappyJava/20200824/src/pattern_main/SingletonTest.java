package pattern_main;

public class SingletonTest {

	private static SingletonTest p;  // private static p객체 에 접근하려면  public static 를 만들어서
									 // 생성자 를 만들려고 해도 생성자가 private  이면 
									 // public static 으로 접근한다.  if조건문으로 p객체가 없으면  SingletonTest() 생성자를 생성한다.
									 // 싱글톤은 같은 주소값을 가진다.
										
	private SingletonTest() {
		
	}
	
	public static SingletonTest getInstance() {
		if(p == null) {
			p = new SingletonTest();
		}
		return p;
	}
}