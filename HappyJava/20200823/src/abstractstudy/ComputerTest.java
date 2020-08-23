package abstractstudy;
// 추상클래스는 주로 상위클래스로 사용됨  추상메소드는 하위클래스가 구현해야하는 메소드이다.
// 추상클래스에서 구현된 메소드는 공통기능으로 쓰인다. 이때 하위클래스가 재정의 할수 있다. 
// 이때 부모클래스의 메소드에서 final 메소드로 선언하면 자식은 오버라이딩을 못한다. 


public class ComputerTest {
	public static void main(String[] args) {
		
//		Computer computer = new Computer(); 추상클래스는 인스턴스화 할수 없다
		Computer computer = new Desktop(); // 하지만 업캐스팅 가능(묵시적형변환)
		computer.display(); 
		
		// 상위클래스 타입으로 핸들링 해서 많이들 코딩한다.
		computer.turnOff(); // 업캐스팅해도 오버라이딩된 메소드가 호출됨 
		computer.turnOn();	
	}
}
