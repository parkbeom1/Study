// fianl ������ Ÿ�� ����� 

/*
������ �ݴ븻 ���
��� : �ѹ� ���� �������� (�ʱ�ȭ �ȴ�) ������ �Ұ��� �ϴ�
����ڿ� : ������(�ֹι�ȣ) ����(PI = 3.141592....,������ȣ �ý��� ������ȣ)
����� ���������� �빮�ڷ� ����.
java : final int NUM = 10; // final = �ʰ� ������ ���̾�� �ٲٸ� �ȵ�

final Ű����
Ŭ���� �տ� >> final class Car{} >> final math >> ��� ����
�Լ� �տ� public final >> ��� ���迡�� �������̵� ������ ��������� ���̴�.
(override ����)
 public static final void print() >> ��ü�� ���� ����
 */
class Vcard {
	final String KIND = "10"; // ����� ������ Ÿ�� �����ϸ� �ٷ� �ʱ�ȭ ����� �Ѵ�.
	final int NUM; // �ʱ�ȭ ���ҽ� �����ڿ��� �ʱ�ȭ

	public Vcard() {
		NUM = 20;
	}
	void methd() {
		System.out.println(Math.PI);
	}
}
class Vcard2 {
	final String KIND; // ����ʵ忡�� �ݵ�� �ʱ�ȭ�� ����� ������ ������
					   // �����ڿ��� �ʱ�ȭ�� ����� �Ѵ� -> �⺻���� �ȴ�.
	final int NUM; // �����ڿ��� �ʱ�ȭ�� ���ش�.
	
	public Vcard2(String KIND,int NUM) {
// �����ε��� ����� �ʱ�ȭ�� ����� �Ѵ�. �����ε� ������ �ʱ�ȭ�� ���ִ� 
// �䱸���� : ī�� 35���� ���� ���ڴ� �ٸ��� �ѹ� �������� ������ �Ұ��� �ϴ�
// ��ü�� ��������� �ѹ��� �ʱ�ȭ �ϴϱ�  �����̽��� 1�� �����̽��� 2��  �����̽��� 3�� ��ü���� �ʱ�ȭ �Ҽ��ִ�.  
// 35���� ī�带 ����鼭 �ѹ������� ī����� ��ȣ�� ������ �Ұ��ϴ� 		
		this.KIND = "KIND";
		this.NUM = 5;
	}
	public String toString() {
		return KIND + NUM;
	}
}
public class Final {
	public static void main(String[] args) {
		Vcard vcard = new Vcard();
		vcard.methd();
		Vcard2 vcard2 = new Vcard2("space",1); // �ѹ� �������� ���ٲ۴� ��? final �޼ҵ�� �������־
		System.out.println(vcard2);
	}
}
