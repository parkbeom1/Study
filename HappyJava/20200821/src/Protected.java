
/*
	Bird�� ��� �޾Ƽ� ���� �Ѵ�.
	Protected : ��� ���迡�� �����Ǹ� ���൵ �ǰ� �����൵ �ȴ�. ( ���û��� )	
*/
class Bi extends Bird2 {

	// ������ ���ָ� ���ھ� �� protected �� �޳�? default �� �����ϱ�
	@Override
	protected void moveFast() {
	// �θ����� ������ ���� �ҷ��´�.
	  super.moveFast(); 
	}	
}
class Ostrich extends Bird2 {
	// ��üȭ Ư��ȭ ���ش�
	void run() {
		System.out.println("run~~~~~~");
	}
	// ������ �ؼ� ���� ���� �ʿ信 ���� ������ ���ټ� �ִ�. 
	// ��Ӱ��迡�� ������ �ϸ� protected�� �Ⱦ��ٰ� �ؼ� ���� ���� �ʴ´�.
	@Override
	protected void moveFast() {
		// run�ϱ⶧���� �����ٰ� ���������� �Լ� ȣ��
		run(); 
	}
}

public class Protected {
	public static void main(String[] args) {
		Bi b = new Bi();
		b.fly();
		// ������ �Լ� ȣ�� super�� ���� �θ��� Flying ȣ��
		b.moveFast(); 
		Ostrich o = new Ostrich();
		o.run(); 
		// ������ �Լ� ȣ��  run~~~~~~
		o.moveFast(); 
	}
}
