package TemplateMethod;

public abstract class Car {
	
	public abstract void drive(); 
	// 구현이안됨 자식이 구현해줘야함
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 킵니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	public void washCar() {}; // 구현이 확장이 가능 
	
	// 시나리오 작성 - 재정의되면 안된다. final 
	// final 흐름이 정해져있다. 
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
		
	}
}

