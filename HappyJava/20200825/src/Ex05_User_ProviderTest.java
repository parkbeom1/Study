
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
		System.out.println("A2 �����ǵ� m �޼ҵ尡 ��µ˴ϴ�.");
	}
}

class B2 implements Icall2 {
	public void m() {
		System.out.println("B2�����ǵ�  m�޼ҵ尡 ��µ˴ϴ�.");
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
