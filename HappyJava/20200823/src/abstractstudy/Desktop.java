package abstractstudy;

public class Desktop extends Computer {

	//�������� ���� �޼ҵ带 ���� �ϰڳ� ? 
	// �������ҰŸ�  �ڽĵ� �߻�Ŭ������ �޴´�.
	// �ΰ��� �ϳ��� ������ �������� �߻�Ŭ������ �޾���� �Ѵ�. 
	// ��δ� �������൵ Ŭ������ abstract Ű���带 ����ϸ� �߻�Ŭ������ �ȴ�. 
	
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
		System.out.println("��ǻ����������");
	}	
}
