package TemplateMethod;

public class CarTest {
// static�̶� ���� ���� �� ? ���� ������ ���� 	
// �ܺο��� �������� ����ϴ� ��찡 ���� ������ 	
// Ŭ�����տ� final �� ������ ���̻� ��� ���� ���Ѵ�. 	
public final static double PI = 3.14;
	
	
	public static void main(String[] args) {
		
		Car aicar = new AiCar(); // ��ĳ����
		aicar.run();
		System.out.println("---------");
		Car manualcar = new ManualCar();
		manualcar.run();
	}
}
