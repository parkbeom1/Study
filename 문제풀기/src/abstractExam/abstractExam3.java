package abstractExam;

abstract class OddDatector {
	protected int n;
	
	public OddDatector(int n) {
		this.n = n;
	}
	public abstract boolean isOdd(); // Ȧ���̸� true ����
}
class B2 extends OddDatector {

	public B2(int n) {
		super(n);
	}
	@Override
	public boolean isOdd() { // Ȧ���̸� true�� �����ϵ��� ����
		return n % 2 != 0 ? false : true;
		// Ȧ���̸� true�� �����ϵ��� ����
	}
}
public class abstractExam3 {
	public static void main(String[] args) {
		B2 b = new B2(10);
		System.out.println(b.isOdd());
	}
}
