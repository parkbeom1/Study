/*    포함        
 *  부분  전체      의존(함수) 
 * 
 * 
user 사용자 관점 : provider 제공자

class A{}
class B{}
두개의 클래스가 서로 관계를 가지게 해준다
관계 A는 B를 사용합니다.
1. 상속 A extends B
2. 포함 A라는 클래스안에서  Member Field B를 사용 >> Class A { B b; }
2.1 부분
2.2 전체

class B{}
class A {
	int i;
	B b; // A는 B를 사용합니다. 포함
	
	A() {
	b = new B(); // 메모리 생성  생성자체가 A에 의존 
}
>> B는 독자적인 생성이 불가능 하다. A라는 객체가 만들어져야 B도 만들어진다. B의 운명은 A가 쥐고 있다.
>> A a = new A(); 했을때  A객체 생성 동시에 B객체 생성도 만들어진다. 두 명은 운명을 같이한다 ...컴포지션관계
(전체집합)


독자적인 삶을 살려면 
---------------------------------------
---------------------------------------
A는 B를 참조한다 (참조란단어가 붙으면 멤버 필드로써 B가 선언되어있다.)
-----------------------------------------
class B {}
class A {
	int i;
	B b; // A는 B를 사용합니다.
	A(){}
	
	A(B b) { // 필요에 따라서   메소드로봐도 상관없다  A (B b)를 호출할때 파라미터로 받을수있는데  메모리는 main에서 생성해줘야한다.
	this.b = b;
	}
}
>> B b = new B();
>> A a = new A(b);
>> 같은 운명이 아니다....
부분집합 (어그리게이션)

------------------------------------------
의존관계

class B{}
class A{
	int i;
	member field B라는 타입을 갖지 않는다.
	// 메소드로 만드는데 의존관계 이다. 의존관계(함수안에서)
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
		System.out.println("D Icall 인터페이스의 m() 재정의 ");
	}
}
class F implements Icall {

	@Override
	public void m() {
		System.out.println("F Icall 인터페이스 m() 재정의");
	}
}
// 현대적인 프로그래밍 방식 (interface...) Icall이 implements하는 모든 객체가 올수있다. >> 유연하게 >> 대충 ... 

class C {					// 다향성 : 부모타입은 자식타입의 주소를 받을수있다. 
	void method(Icall ic) { // 인터페이스를 받음  ic라는 ... Icall 구현한 모든 객체의 주소를 받을수있다. (확장성)
		ic.m();
	}
	/* 효율적인 코드인가 ? 
	void method2(D d) {
		d.m();
	}
	void method3(F f) {
		f.m();
	}
	
	
	// 이게 더 효율적이다 밑에 있는 코드가 
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
		// 인터페이스 부모 타입을 받으면 재정의한 자식들의 주소를 참조할수있다. 
	}

}
