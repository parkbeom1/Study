// ����������

/*	public , protected , default , private
	protected : ��� ���迡���� ������ ����� ������ �������̵� �Ѵ�
	����� ������ protected �� ����.
	���������� �������� �ο��ϰ� ��鼺�� ���Ѵ�. ���� >> default , public �ణ�� ��鼺�� ���Ѵ�.
	>> ����� ���� Ŭ���� �ȿ��� protected �����ڴ� default �� ����
	>> �ᱹ ��Ӱ��� ������ �ǹ̰� �ִ�. 
	
*/
class Dclass {
	private int p; // �ٸ���Ű������ ����Ҽ� ����. ������ ���� Ŭ����
	public int i; // �ٸ� ��Ű������ ����Ҽ� �ִ�
	int s; // default ���� ��Ű���ȿ��� ����Ҽ��ִ�.
	protected int k; // default�� ���� �Ƚᵵ ���⼭ ����� ����������. 
	// �Ϲ�Ŭ������ ���⿡ ����� ���������� >> ��Ӱ��� ������ �޶�����.
	
}

class Child2 extends Pclass {

	public void method() {
	
		this.k = 1000;
		this.j = 2000;
		this.k = 2000; // ����� protected ���δ�. ��Ӱ��� ���� �ڽ��� �θ��� protected �ڿ� ������ ����
		// public ó�� ����Ҽ� �ִ�. >> ��鼺 
		// ��Ӱ��迡�� �ڽ��� �θ��� protected ����
		System.out.println(this.k);
	}
	// �������� �����鼭 �������� Ȯ��
}
class Inherit {
	
}

public class Inherit_protected {
	public static void main(String[] args) {
		Pclass p = new Pclass();
		int num = p.j; // public �̴ϱ� ���� ���� ���忡�� public �� ������ ����
		System.out.println(num);
		Pclass p2 = new Pclass();
	}
}
