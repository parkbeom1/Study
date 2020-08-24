package abstractExam;

class A3 {
	int i;
}
class B3 extends A3 {
	int j;
}
class C1 extends B3 {
	int k;
}
class D1 extends C1 {
	int m;
}

public class abstractExam4 {
	public static void main(String[] args) {
		//업캐스팅하기
		// 참조변수 instanceof 자식클래스명 
		
		A3 a3 = new A3();
		if(a3 instanceof B3) { // 객체명 instanceof 자식클래스
			B3 b3 = (B3) a3;
		} else if(a3 instanceof C1) {
			C1 c1 = (C1) a3;
		} else if(a3 instanceof D1) {
			D1 d1 = (D1) a3;
		}
	}
}
