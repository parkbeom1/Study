package TemplateMethod;

public abstract class Car {
	
	public abstract void drive(); 
	// �����̾ȵ� �ڽ��� �����������
	public abstract void stop();
	
	public void startCar() {
		System.out.println("�õ��� ŵ�ϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	public void washCar() {}; // ������ Ȯ���� ���� 
	
	// �ó����� �ۼ� - �����ǵǸ� �ȵȴ�. final 
	// final �帧�� �������ִ�. 
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
		
	}
}

