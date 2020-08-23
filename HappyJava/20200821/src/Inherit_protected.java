// 접근제어자

/*	public , protected , default , private
	protected : 상속 관계에서의 재정의 상속이 없으면 오버라이딩 한다
	상속이 없으면 protected 가 없다.
	설계자한테 유연성을 부여하고 양면성을 지닌다. 박쥐 >> default , public 약간의 양면성을 지닌다.
	>> 상속이 없는 클래스 안에서 protected 접근자는 default 와 같다
	>> 결국 상속관계 에서만 의미가 있다. 
	
*/
class Dclass {
	private int p; // 다른패키지에서 사용할수 없다. 무조건 같은 클래스
	public int i; // 다른 패키지에서 사용할수 있다
	int s; // default 같은 패키지안에서 사용할수있다.
	protected int k; // default와 같다 안써도 여기서 사용할 이유가없다. 
	// 일반클래스는 여기에 사용할 이유가없다 >> 상속관계 에서는 달라진다.
	
}

class Child2 extends Pclass {

	public void method() {
	
		this.k = 1000;
		this.j = 2000;
		this.k = 2000; // 노란색 protected 보인다. 상속관계 에서 자식은 부모의 protected 자원 접근이 가능
		// public 처럼 사용할수 있다. >> 양면성 
		// 상속관계에서 자식은 부모의 protected 접근
		System.out.println(this.k);
	}
	// 강제하지 않으면서 유연성을 확보
}
class Inherit {
	
}

public class Inherit_protected {
	public static void main(String[] args) {
		Pclass p = new Pclass();
		int num = p.j; // public 이니까 참조 변수 입장에서 public 만 접근이 가능
		System.out.println(num);
		Pclass p2 = new Pclass();
	}
}
