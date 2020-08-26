import java.util.ArrayList;

/*
 * �ڹ� 8���� �⺻ Ÿ��(��Ÿ��) : JAVA API ����
 * 8���� �⺻Ÿ�Կ� ���ؼ� ��ü ���·� ����ϵ��� ����� ( Wrapper class)
  �⺻ Ÿ�� ��ſ� ��ü ���� Ÿ���� ��� ... > ���׸� �ڿ����� , static (���ڸ� -> ������ , �Ǽ���  ) 
  1.�Ű����� ��ü �䱸�ɶ�
  2.�⺻�� ���� �ƴ� (��ü����)�� ����
  3.��ü�� ���� �� �Ҷ�
  4.Ÿ�Ժ�ȯ�� ���� ó���� �䱸�ɶ�
*/
public class Ex08_Wrapper_Class {
	public static void main(String[] args) {
	int i = 100; // �������� ���� ��
	Integer n = new Integer(500); 
	System.out.println(n); // �� 500�� ���´� .  string�� ������ �ּҰ��ƴϰ� ���� ������ toString�������س��� , Integer �� toString ������ �ּҾƴ� ��... 
	System.out.println(n.MAX_VALUE); // static final ��� ������ ������ // �ִ� �����Ҽ��ִ� ������
	System.out.println(n.MIN_VALUE);

	// POINT
	// parameter ���
	// ���ʸ� (generic) ��ü�� �����Ҷ� Ÿ���� ���� �ϴ� ��� Object�� ���� Ÿ���� ���� �����ν� ĳ������ �����ʰ�  �ڵ带 ����ȭ ���Ѽ� ó���Ѵ�.
	
	ArrayList<Integer> li = new ArrayList<Integer>(); // ���ʸ��� Ÿ���� �����Ѵ�.
		li.add(100); // ����Ÿ�Ը� �ü��ִ�.
		li.add(200);
		li.add(300);
		for(int li2 : li) { // ������ �޴´� ����for�� ���� ����Ѵ�. 
			System.out.println(li2);
		}	
		Integer i2 = new Integer(100);
		Integer i3 = new Integer(100);
		System.out.println(i2 == i3); 	   // �ּҰ� ��  false 
		System.out.println(i2.equals(i3)); // �ȿ� �ִ� ���� �� true 
		
		
		// equals �� Object ���ε�
		// String Ŭ���� ������  , Integer Ŭ������ ������   ������ ���� ���ϵ��� ������ �� 
		
		int i4 = 100;
		int i5 = 100;
		System.out.println(i4 == i5); // true 	

		Integer t = new Integer(500);
		integerMethod(t); //t��� �ϴ� ���������� ������ [�ּҰ�] ...
		intMethod(t); // t��� ���������� ������ �ִ� [����] �ѱ��. 
	}
	//  Integer i = new Integer();
	static void integerMethod(Integer i) {
		System.out.println("Integer param : " + i); // 500  // toString �������ؼ� ���� ���´�.  
		// i.toString 	
		System.out.println(i.MAX_VALUE); // �ִ밪�� ���´�.
	}
	static void intMethod(int i) {
		System.out.println("int param : " + i); // 500 
	}
}
