package Generic;
/*	
 * Today Point
 * Generic jdk 1.5
 c# , java 필수기능 

Collection 데이터를 저장할수있는 컬렉션들의 모임이다. 
Collection 클래스 >> 데이터 기본 저장 공간 : 
1. Object 타입 저항 ... >> 타입 .. 문제 >> 타입 강제 (객체 생성 .. 타입) >> 제너릭
2. 타입 안정성 (타입 강제) 객체를 만들떄 설정할수있게 해준다. 
3. 강제 형변환 (casting) : (car)object (x)
시점 : 클래스를 설계할때 만들어놨다 

*/

import java.util.ArrayList;

class Generic <T> { // 타입 파라미터	
	T obj;	
	void add(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}
class Person extends Object {
	int age = 100;
	
}

public class Ex06_Generic2 {
	public static void main(String[] args) {
		Generic<String> mygen = new Generic<String>(); // T타입에 매칭걸었다  타입을 문자로 강제 
		mygen.add("문자열");
		String str = mygen.get();
		System.out.println(str);
		
		ArrayList list = new ArrayList();
		// 저장 공간의 타입은 Object 배열 : Object[] elements 
		list.add(new Person());
		list.add("홍길동");
		
		// 출력
		// 개선된 for문
		for(Object obj : list) {
			// person 객체는 나이를 출력
			// 나머지는 값을 출력하시오.
			// System.out.println(obj);
			// 객체인것과 객체가 아닌것......
			if(obj instanceof Person) {
				Person person = (Person) obj; // 다운캐스팅
				System.out.println(person.age);
			} else {
				System.out.println(obj);
			}
		}
		ArrayList<Person> plist = new ArrayList<Person>();
		plist.add(new Person());
		
		for(Person p : plist) {
			System.out.println(p.age);
		}
	}
}
