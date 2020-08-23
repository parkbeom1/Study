package abstractstudy;

public class Desktop extends Computer {

	//구현되지 않은 메소드를 구현 하겠나 ? 
	// 구현안할거면  자식도 추상클래스로 받는다.
	// 두개중 하나라도 구현을 안했으면 추상클래스로 받아줘야 한다. 
	// 모두다 구현해줘도 클래스에 abstract 키워드를 사용하면 추상클래스가 된다. 
	
	@Override
	public void display() {
		System.out.println("Desktop display");
	}
	@Override
	public void typing() {
		System.out.println("typing");
	}
	@Override
	public void turnOff() {
		System.out.println("컴퓨터전원오프");
	}	
}
