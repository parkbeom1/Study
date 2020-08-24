package abstractExam;

abstract class OddDatector {
	protected int n;
	
	public OddDatector(int n) {
		this.n = n;
	}
	public abstract boolean isOdd(); // 홀수이면 true 리턴
}
class B2 extends OddDatector {

	public B2(int n) {
		super(n);
	}
	@Override
	public boolean isOdd() { // 홀수이면 true를 리턴하도록 만듬
		return n % 2 != 0 ? false : true;
		// 홀수이면 true를 리턴하도록 만듬
	}
}
public class abstractExam3 {
	public static void main(String[] args) {
		B2 b = new B2(10);
		System.out.println(b.isOdd());
	}
}
