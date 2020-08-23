package instanceofTest;

public class MethodTest {
	
	public static void main(String[] args) {
		
		abc(); // 메소드 호출
		abc(); // 메소드 호출 
	}
	
	public static void abc() { // 호출된게 실행됨 
		System.out.println("안녕1");
		System.out.println("안녕2");	
		System.out.println("안녕3");	
	}
}
