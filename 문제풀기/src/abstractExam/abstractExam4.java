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
		//��ĳ�����ϱ�
		// �������� instanceof �ڽ�Ŭ������ 
		
		A3 a3 = new A3();
		if(a3 instanceof B3) { // ��ü�� instanceof �ڽ�Ŭ����
			B3 b3 = (B3) a3;
		} else if(a3 instanceof C1) {
			C1 c1 = (C1) a3;
		} else if(a3 instanceof D1) {
			D1 d1 = (D1) a3;
		}
	}
}
