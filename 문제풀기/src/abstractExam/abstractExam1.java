package abstractExam;

class A {
	private int a;
	protected A(int i) {
		a = i;
	}
	public A() {
		
	}
	
	class B extends A {
		private int b;
		public B() {
			super(1); 
			b=0;
		}
	}
}



public class abstractExam1 {
	public static void main(String[] args) {
		
	}
}
