// ����(�κ���ü), ���� 

// ������ �κа� ��ü�� ����������( BŸ���� �����ϴϱ� )
// ������ BŸ���� ���������ʰ� AŬ������ �޼ҵ�� BŸ���� ȣ���Ѵ�. 
// https://cafe.naver.com/springbit
// ����(�κ�,��ü) - ����ʵ带 ���� - �Ϲݰ� Ư���γ���  Ư�� ����  �л��б�����(����),�ڵ�������(�ռ�����,����������Ŭ�̰���)
// ����������Ŭ(������������ -)
// ���տ���,�ռ������� ��ȣ�ϸ� �Ϲݿ����̴�.
// ����(����)  - �޼ҵ�� ���� 

/********** ����(��ü) ���� = �ռ� ���� **************/
// A�� �⺻�����ڸ� �����ϸ� B�����ڰ� ���ÿ� �����Ѵ�
class B{}
class A{
	int i;
	B b; // ���԰���
	
	A() {
		b = new B(); // ��ü����
	}
}
/********** ����(�κ�) ���� **************/
// A�� �⺻�����ڸ� �����ϸ� B������ ������ �����Ҽ��ִ�. 
class B2{}
class A2 {
	int i;
	B b; // ���԰��� 
	A2(){}
	A2(B b) { // B�� �Ķ���ͷ� �޴´� - �κа���
			  // B��  B b = new B(); ���� ����������Ѵ�.
		this.b = b;
	}
}
/********** ���� ���� **************/
class B3{}
class A3{
	int i;
	//B3 b3 // member field B��� Ÿ���� ���� �ʴ´�. 
	void print(B3 b3) {}   // A�� B�� �޼ҵ�� �����Ѵ�.
	B3 print() { // A�� B�� �޼ҵ�� �����Ѵ�. 
		B3 b3 = new B3();
		return b3;
	}
}
interface Icall2 {
	void m();
}
class D2 implements Icall2 {

	@Override
	public void m() {
		System.out.println("D2ȣ��");
	}
}
class F2 implements Icall2 {
	@Override
	public void m() {
		System.out.println("F2ȣ��");
	}
}
class C2 {
	// �������̽� ��ü�ּҸ� �Ķ���ͷ� ����
	void method(Icall2 ic) {
		ic.m(); 
	}
}
public class Ex05_User_ProviderTest {		
	public static void main(String[] args) {
		D2 d2 = new D2();
		F2 f2 = new F2();
		C2 c2 = new C2();
		c2.method(d2);
		c2.method(f2);
	}

}
