/*
������ (��Ӱ��迡���� �����Ѵ�) : �ϳ��� �ڵ尡 �������� �ڵ带 �����Ѵ�.
������ : �������� ���� ���¸� ������ �ִ� �ɷ��̴�.

JAVA : [��� ���� ] ���� �θ� �ϳ��� ���� ������ �������� �ڽİ�ü�� Ÿ���� ������
�ϳ��� ���� ���� >> [ �θ� Ÿ�� ] 
�߿� �� �θ� Ŭ���� Ÿ���� ���� ������ �������� �ڽ�Ŭ���� ��ü�� ���� �� �ִ�
������ : ���� ) �θ�� �ڽĿ��� ���Ǿ��� ���� �ش�.
�ڽ��� �θ𿡰� ���Ǿ��� �帰��. >> ������
*/
// �θ�� ������̴�. �Ϲ�ȭ , �߻�ȭ , �����ڿ� , �и� 
class Tv { 
	boolean power; // ������ ������
	int ch; //  ä��
	
	void power() { // ���� ų���ִ�.
		this.power = !this.power;
	}
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
}
public class Inherit_Poly {
	public static void main(String[] args) {
		
	}
}
// Tv�� ��� ����� ������ CapTv 
class CapTv extends Tv {
	// �ڽ� Ŭ�������� Ư��ȭ �ǰ� ��üȭ �ǰ� ������ �ڿ��� ǥ�� 
	String text; // �ڸ����� ����� �������ִ�.
	
	String captionTest() {
		return this.text = "���� �ڸ� ó����....";
	}
	public static void main(String[] args) {
		CapTv captv = new CapTv();
		captv.power();
		System.out.println("���� : " + captv.power);
		
		captv.chUp();
		System.out.println("ä�� ���� : " + captv.ch);
		// �ڽ��� �ڸ� ó�� ���
		System.out.println(captv.captionTest());
		
		//Car Ÿ�Կ� c�� = new Car();
		//Car Ÿ�Կ� c2�� = c ; ���� ����Ÿ���̴ϱ� 
		Tv tv2 = captv;
		// �θ�Ÿ���� �ڽ�Ÿ���� �ּҸ� ������ �ִ�. - ������ 
		// �� �θ�� �ڽ��� �ڿ��� ���� �Ҽ� �ִ�.
		// �� �����Ǹ� �����ϰ� 
		// tv2�� �θ𲨸� ���δ�.
		System.out.println(tv2.toString());
		System.out.println(captv.toString());
		// ���� �ּ� ������ ���̴� ���� �ٸ���
		
		// ���� 601ȣ�� ���� �ڽ��� �� ���� ������ �θ�� �ڽ��� ��͸� ���δ�.
		Tv tv = new CapTv(); // ��ĳ����
		CapTv captv2 = (CapTv)tv; // �ٿ�ĳ���� 
	}
}