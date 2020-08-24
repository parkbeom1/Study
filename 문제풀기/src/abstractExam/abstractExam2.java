package abstractExam;

abstract class A1 {
	abstract void f();
}

abstract class A2 {
	void f() {
		System.out.println("-");
	}
}

abstract class B1 {
	abstract void f();
}

class C extends B1 {

	@Override
	void f() {
		System.out.println("--");
	}
}











public class abstractExam2 {

	
	
	public static void main(String[] args) {
		
	}
}
