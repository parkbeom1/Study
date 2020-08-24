package pattern;
// 싱글톤 의도  : 하나의 객체를 공유하는데 보장

import pattern_main.Singleton;

public class SingleTon_main {
	public static void main(String[] args) {
//		Singleton s = new Singleton(); // 생성자를 private 으로 막아둠  new 하지 못한다.
		// 직접 객체를 생성하지 못하게 막는다.- 객체 생성 불가 
		
		Singleton s = Singleton.getInstance(); // 객체의 주소값 리턴
		Singleton s1 = Singleton.getInstance(); // 객체의 주소값 리턴
		Singleton s2 = Singleton.getInstance(); // 객체의 주소값 리턴
		
		// 똑같은 주소값을 가진다. 
		System.out.println(s == s1);
		System.out.println(s == s2);
		System.out.println(s1 == s2);
		
	}
}
