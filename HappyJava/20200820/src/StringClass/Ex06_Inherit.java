package StringClass;
/*
 	this : 객체 자신을 가리키는 this(thie.empno,this.ename)
	this : 다른 생성자를 호출하는 this(100,"red");
	상속
	부모,자식
	super(현재 자식이 부모의 접근 주소값) 상속관계에서 부모에 대한 접근을 하는 방법
	1. super >> 상속 관계에서 부모 자원 접급
	2. super >> 상속 관계에서 부모의 생성자를 호출할때 (명시적으로)
	tip ) java >> super()
*/
class Base {
	String basename = "부모생성자";
	Base() { // 부모의 기본생성자
		System.out.println("Base 기본 생성자 함수");
	}
	Base(String basename) { // 
		System.out.println("basename : " + this.basename);
	}
	void method() {
		System.out.println("부모가 가지는 메소드");
	}
}

class Derived extends Base {
	String dname;
	Derived() {
		System.out.println("Derived 기본 생성자 함수");
	}
	Derived(String dname) {
		// 나도 부모 생성자(Overloading) .. 호출 ..
		super(dname); // 부모의 Base(String basename) 이 호출된다.
		this.dname = dname;
		System.out.println("dname " + this.dname);
	}
	@Override
	void method() {
		System.out.println("자식이 가지는 메소드");
	}
	// 어느날 부모님 자원이 그리워요 .. { method ... 재정의 ...
	// 유일한 방법 super를 통해서 부모 자원에 접근한다. 자식의 기능 ( 함수 안에서만 사용 가능 )
	void parent_method() {
		super.method(); // 부모의 메소드에 접근한다.
	}
}
public class Ex06_Inherit {
	public static void main(String[] args) {
		/*
		 Derived d = new Derived();
		 System.out.println(d.basename);
		 System.out.println(d.dname); 
		  d.method(); // 자식이 가지는 메소드
		  d.parent_method(); 
		 */
		Derived d = new Derived("Hello");
		// super()를 호출하여 부모의  생성자 basename 이 호출된다.
		
	}
}
