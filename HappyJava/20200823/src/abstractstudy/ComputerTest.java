package abstractstudy;
// �߻�Ŭ������ �ַ� ����Ŭ������ ����  �߻�޼ҵ�� ����Ŭ������ �����ؾ��ϴ� �޼ҵ��̴�.
// �߻�Ŭ�������� ������ �޼ҵ�� ���������� ���δ�. �̶� ����Ŭ������ ������ �Ҽ� �ִ�. 
// �̶� �θ�Ŭ������ �޼ҵ忡�� final �޼ҵ�� �����ϸ� �ڽ��� �������̵��� ���Ѵ�. 


public class ComputerTest {
	public static void main(String[] args) {
		
//		Computer computer = new Computer(); �߻�Ŭ������ �ν��Ͻ�ȭ �Ҽ� ����
		Computer computer = new Desktop(); // ������ ��ĳ���� ����(����������ȯ)
		computer.display(); 
		
		// ����Ŭ���� Ÿ������ �ڵ鸵 �ؼ� ���̵� �ڵ��Ѵ�.
		computer.turnOff(); // ��ĳ�����ص� �������̵��� �޼ҵ尡 ȣ��� 
		computer.turnOn();	
	}
}
