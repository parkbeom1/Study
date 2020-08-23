package abstractstudy;
/* 추상클래스 와 추상 메소드 (주로 상위클래스에서 )
 
 하위클래스에서 구현 
 
 */
public abstract class Computer { // abstract 메소드를 가지면 abstract 클래스로 선언
	//하위클래스에서 객체마다 다르게 구현 
	public abstract void display(); // 추상메서드
	public abstract void typing();
	
	//공통기능은 구현해둠 
	public void turnOn() {
		System.out.println("전원을 킵니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
