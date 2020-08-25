
interface Icall2 {
	
	public void m();
}

class C2 {
	public void method(Icall2 ic) {
		ic.m();
	}
}

class A2 implements Icall2 {
	
	public void m() {
		System.out.println("A2 재정의된 m 메소드가 출력됩니다.");
	}
}

class B2 implements Icall2 {
	public void m() {
		System.out.println("B2재정의된  m메소드가 출력됩니다.");
	}
}
public class Ex05_User_ProviderTest {		
	public static void main(String[] args) {
		C2 c2 = new C2();
		A2 a2 = new A2();
		B2 b2 = new B2();
		
		c2.method(b2);
		c2.method(a2);
	}
}
