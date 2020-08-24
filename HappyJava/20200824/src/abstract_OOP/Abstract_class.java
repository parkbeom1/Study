package abstract_OOP;
/*
	추상클래스 
	>> 일반화 되고 미완성 클래스 
	1. 완성된 코드 + 미완성 코드
	2. 완성(함수) 실행 블록이 있는 함수  + 미완성(함수) 실행 블럭이 없는 함수
	 (public void run(); (x) {}
	3. 완성된 클래스 (new 가능) - 미완성 클래스 ( 스스로객체 생성이 불가 )

	정리
	1. 추상클래스(미완성) : 스스로 객체 생성 불가 (new 사용 불가)
	2. 추상클래스는 결국... 완성된 클래스를 만듬 (상속을 통해서 만듬)
	3. 상속 관계에서 미완성된 자원은 (추상함수) 완성해라 (구현) >> 재정의 해라 (추상함수)
	
	설계자 입장에서
	>> 추상클래스의 추상함수를 왜만드냐  >>설계도를 만들때 반드시 만들어야되는 강제성을 띄운다? 
	 의도 >> 반드시 재정의해라  >> 강제적 구현 코드 
	  
*/
class Car {
	 void run() {
	 }
}

class Hcar extends Car {
	@Override
	 void run() {}
}
////////////////////////////////////// 강제성이 없다 
abstract class Car2 { // 추상클래스가 있는건 추상메소드 하나를 만들것이다.
	int pos;
	abstract void run(); // 미완성된 추상메소드 (실행블록이 없다)
	
	void stop() {};
}
//완성된 코드와 미완성 코드와 결합체
class Hcar2 extends Car2 {
	// 추상클래스를 상속받으면 구현해줘야하는 메소드를 반드시 재정의를 해줘야 한다.
	@Override
	void run() {
		int pos = 2;
		System.out.println("pos : " + this.pos);
	}
	void stop() {
		System.out.println("자식이 멈춤니다.");
	}
}
class Child2 extends Car2 {

	@Override
	void run() {
		int pos = 1;
		System.out.println("sop : " + this.pos);
	}
}

public class Abstract_class {
	public static void main(String[] args) {
		Child2 ch = new Child2();
		ch.run();
		ch.run();
		
		
//		Car2 ca = new Car2();  추상클래스는 만들수없다.
		Child2 ch2 = new Child2();
		//////////////////////////////////////////
		
		// 다형성 ( 주소값을 받을수있다. )
		Car2 ca3 = new Child2(); // 다형성 부모타입의 객체는 자식타입의 객체를 받을수있다.	
		ca3.run(); // 부모는 자기타입의 객체만 볼수있다.
		ca3.stop(); // 자식객체의 메소드가 오버라이딩 된다. 
		// ****업캐스팅으로 부모 타입으로 접근 ... 그자원이 추상함수 .... 자식에서 반드시 재정의
		// 부모타입으로 접근해도 재정의된 함수가 호출된다.
		ca3.run();  // 부모 자기껄 호출함 
	}
}
