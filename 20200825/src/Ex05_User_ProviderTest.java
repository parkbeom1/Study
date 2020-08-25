// 포함(부분전체), 의존 

// 포함은 부분과 전체로 나뉘어진다( B타입을 선언하니까 )
// 의존은 B타입은 선언하지않고 A클래스에 메소드로 B타입을 호출한다. 
// https://cafe.naver.com/springbit
// 연관(부분,전체) - 멤버필드를 가짐 - 일반과 특수로나뉨  특수 에서  학생학교관계(집합),자동차엔진(합성연관,라이프사이클이같다)
// 라이프사이클(생명을같이함 -)
// 집합연관,합성연관이 모호하면 일반연관이다.
// 의존(참조)  - 메소드로 가짐 

/********** 포함(전체) 관계 = 합성 관계 **************/
// A는 기본생성자를 생성하면 B생성자가 동시에 생성한다
class B{}
class A{
	int i;
	B b; // 포함관계
	
	A() {
		b = new B(); // 전체관계
	}
}
/********** 포함(부분) 관계 **************/
// A는 기본생성자를 생성하면 B생성자 생성을 선택할수있다. 
class B2{}
class A2 {
	int i;
	B b; // 포함관계 
	A2(){}
	A2(B b) { // B를 파라미터로 받는다 - 부분관계
			  // B는  B b = new B(); 따로 생성해줘야한다.
		this.b = b;
	}
}
/********** 참조 관계 **************/
class B3{}
class A3{
	int i;
	//B3 b3 // member field B라는 타입을 갖지 않는다. 
	void print(B3 b3) {}   // A는 B를 메소드로 참조한다.
	B3 print() { // A는 B를 메소드로 참조한다. 
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
		System.out.println("D2호출");
	}
}
class F2 implements Icall2 {
	@Override
	public void m() {
		System.out.println("F2호출");
	}
}
class C2 {
	// 인터페이스 객체주소를 파라미터로 받음
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
