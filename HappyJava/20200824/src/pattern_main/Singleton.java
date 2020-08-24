package pattern_main;
//디자인 패턴 (생성패턴) >> new >> 
//객체 하나를 만들어서 공유 ....
//의도 : 당신이 싱글톤을 쓴다면 하나의 객체를 공유하는것을 보장하겠다...
public class Singleton {
	private static Singleton p; // Singleton.p 로 접근 하는데 private으로 막음
	private Singleton() { // 생성자에 접근자가 Private 
			// 직접 객체 생성 불가 ... new (x) ... heap 객체 생성 불가 ...
	}
	
	// 이 메소드에 접근해서 객체주소값 전달
	public static Singleton getInstance() { // public으로 내부에서 메모리를 올려둠  싱글톤 패턴 객체로 접근이 가능 
		if(p == null) { // 아무것도 타입 메모리를 가지지 않는다면
			p = new Singleton(); // 힙이라는 메모리에 싱글톤 객체가 올라간다. >> 객체의 주소를 p가 갖는다 참조한다.
			// new를 한번만쓴다.그걸 복사본으로 찍어냄(즉 만들어있는걸 가져다 쓴다.)			
		}
		return p;
	}
	
	// Singleton.getInstance();	
}
