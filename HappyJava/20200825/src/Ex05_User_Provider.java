/*    ����        
 *  �κ�  ��ü      ����(�Լ�) 
 * 
 * 
user ����� ���� : provider ������

class A{}
class B{}
�ΰ��� Ŭ������ ���� ���踦 ������ ���ش�
���� A�� B�� ����մϴ�.
1. ��� A extends B
2. ���� A��� Ŭ�����ȿ���  Member Field B�� ��� >> Class A { B b; }
2.1 �κ�
2.2 ��ü

class B{}
class A {
	int i;
	B b; // A�� B�� ����մϴ�. ����
	
	A() {
	b = new B(); // �޸� ����  ������ü�� A�� ���� 
}
>> B�� �������� ������ �Ұ��� �ϴ�. A��� ��ü�� ��������� B�� ���������. B�� ����� A�� ��� �ִ�.
>> A a = new A(); ������  A��ü ���� ���ÿ� B��ü ������ ���������. �� ���� ����� �����Ѵ� ...�������ǰ���
(��ü����)


�������� ���� ����� 
---------------------------------------
---------------------------------------
A�� B�� �����Ѵ� (�������ܾ ������ ��� �ʵ�ν� B�� ����Ǿ��ִ�.)
-----------------------------------------
class B {}
class A {
	int i;
	B b; // A�� B�� ����մϴ�.
	A(){}
	
	A(B b) { // �ʿ信 ����   �޼ҵ�κ��� �������  A (B b)�� ȣ���Ҷ� �Ķ���ͷ� �������ִµ�  �޸𸮴� main���� ����������Ѵ�.
	this.b = b;
	}
}
>> B b = new B();
>> A a = new A(b);
>> ���� ����� �ƴϴ�....
�κ����� (��׸����̼�)

------------------------------------------
��������

class B{}
class A{
	int i;
	member field B��� Ÿ���� ���� �ʴ´�.
	// �޼ҵ�� ����µ� �������� �̴�. ��������(�Լ��ȿ���)
	void print(B b) {}
	
	B print() {
		B b= new B();
		return b;
	}
}
>> B b = new B();
>> A a = new A();
>> a.print(b);  // print(B b) 
>> b.print(a);
*/
interface Icall {
	void m();
}
class D implements Icall {

	@Override
	public void m() {
		System.out.println("D Icall �������̽��� m() ������ ");
	}
}
class F implements Icall {

	@Override
	public void m() {
		System.out.println("F Icall �������̽� m() ������");
	}
}
// �������� ���α׷��� ��� (interface...) Icall�� implements�ϴ� ��� ��ü�� �ü��ִ�. >> �����ϰ� >> ���� ... 

class C {					// ���⼺ : �θ�Ÿ���� �ڽ�Ÿ���� �ּҸ� �������ִ�. 
	void method(Icall ic) { // �������̽��� ����  ic��� ... Icall ������ ��� ��ü�� �ּҸ� �������ִ�. (Ȯ�强)
		ic.m();
	}
	/* ȿ������ �ڵ��ΰ� ? 
	void method2(D d) {
		d.m();
	}
	void method3(F f) {
		f.m();
	}
	
	
	// �̰� �� ȿ�����̴� �ؿ� �ִ� �ڵ尡 
	void method (Icall ic) {
	
	}
	*/
}
public class Ex05_User_Provider {
	public static void main(String[] args) {
		C c = new C();
		D d = new D();
		F f = new F();	
		c.method(d);
		c.method(f);
		// �������̽� �θ� Ÿ���� ������ �������� �ڽĵ��� �ּҸ� �����Ҽ��ִ�. 
	}

}
