package abstractstudy;
/* �߻�Ŭ���� �� �߻� �޼ҵ� (�ַ� ����Ŭ�������� )
 
 ����Ŭ�������� ���� 
 
 */
public abstract class Computer { // abstract �޼ҵ带 ������ abstract Ŭ������ ����
	//����Ŭ�������� ��ü���� �ٸ��� ���� 
	public abstract void display(); // �߻�޼���
	public abstract void typing();
	
	//�������� �����ص� 
	public void turnOn() {
		System.out.println("������ ŵ�ϴ�.");
	}
	public void turnOff() {
		System.out.println("������ ���ϴ�.");
	}
}
