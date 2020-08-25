import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

class Marin {
	
}


public class Ex01_Vector_Test {
	public static void main(String[] args) {
	
		// Vector ȭ���
		Vector v = new Vector();
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);
		v.add(1);

		System.out.println(v.size()); // 5
		System.out.println(v.capacity()); // 10
		
		for(Object obj : v) {
			System.out.print(obj.toString()); // 11111
		}
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i));
		}
		
		Vector<String> v2 = new Vector<String>();
		v2.add("��");
		v2.remove(0); // �� ���� 
		v2.add("��");
		v2.add("��");
		v2.add("��");
		
		for(String str : v2) {
			System.out.print(str); // ���ٶ�
		}
		
		for(int i = 0 ; i < v2.size(); i++) {
			System.out.println(v2.get(i)); // ���ٶ�
		}
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("��");
		arr.add("��");
		arr.add("��");
		
		for(String str2 : arr) {
			System.out.print(str2); // ������
		}
		
		Vector<Integer> v3 = new Vector<Integer>();
		v3.add(1);
		v3.add(2);
		v3.add(3);
		int sum = 0;
		
		for(int i = 0; i < v3.size(); i++) {
			sum += v3.get(i);
		}
		System.out.println(sum); //6
		System.out.println(v3.size()); // 3
		
		LinkedList lin = new LinkedList();
			
		lin.addAll(v3); // ������ �����´�.
		for(Object obj : lin) {
			System.out.println(obj);
		}
		
		System.out.println(lin.size()); // 3
		
		lin.clear(); // ��� ��� ���� 
		System.out.println(lin.size()); // 0
		for(Object obj : lin) {
			System.out.println(obj); //0
		}
		
		ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("��");
		arr2.add("��");
		arr2.add("��");
		arr2.trimToSize(); // ������� �ּ�ȭ
		
		Vector <String> ve = new Vector();
		v2.capacity();
		
		Vector vtr = new Vector();
		vtr.add(1);
		vtr.add(2);
		vtr.add(3);
		
		for(Object obj : vtr) {
			System.out.println(obj);
		}
		
		vtr.add(0, 5);
		
		for(Object obj : vtr) {
			System.out.println(obj); // 5123
		}
		
		System.out.println(vtr.capacity()); //10
		vtr.removeAll(vtr);
		vtr.trimToSize();
		System.out.println(vtr.capacity()); // �뷮 0���� ����
		
		Vector<String> vtr2 = new Vector<String>();
		
		vtr2.add("��");
		vtr2.add("��");
		vtr2.add("��");
		vtr2.add("��");
		vtr2.add("��");
		vtr2.add("��");
		
		for(String str : vtr2) {
			System.out.print(str + " ");
		}
		System.out.println(vtr2.firstElement()); // ù��° ���
		
		Vector<Integer> vtr5 = new Vector<Integer>();
		vtr5.add(10);
		vtr5.add(11);
		vtr5.add(20);
		
		for(Integer i : vtr5) {
			System.out.println(i); // 10 11 20
		}
		
		Vector vtr6 = new Vector();
		vtr6.capacity();
		vtr6.setSize(sum); // �հ谪�� ������ ? 
		
		for(Object obj : vtr6) {
			System.out.println(obj);
		}
		
		Vector vtr7 = new Vector<>();
		
		for(int i = 0; i < vtr7.size(); i++) {
			System.out.println(vtr7);
		}
		
		Marin[] intarray = {new Marin(),new Marin()};
		Vector<Marin> vtr8 = new Vector<Marin>();
		
		Vector vtr9 = new Vector(50); // 50�� ����
		vtr9.add(1);
		vtr9.add(2);
		vtr9.add(3);
		System.out.println(vtr9.capacity());// 50 �� ����
		vtr9.add(vtr8);
		Vector vtr10 = vtr9; // �ּҰ� �Ҵ� 
		
		for(Object obj : vtr10) {
			System.out.print(obj + " "); // 
		}
		System.out.println(vtr10 == vtr9); // true
		
		Vector<String> str5 = new Vector<String>();
		System.out.println(str5.capacity()); // 10
		System.out.println(str5.size()); // 0
		
		str5.add("��");
		str5.add("��");
		str5.add("��");
		str5.add("��");
		
		for(int i = 0 ; i < str5.size(); i ++ ) {
			System.out.println(str5.get(i));
		}
		
		Vector<Integer>	itr = new Vector<Integer>(5);
		itr.trimToSize();
		System.out.println(itr.capacity()); // 5 - > 0
		
		ArrayList arr10 = new ArrayList<>();
		for(Object obj : arr10) {
			System.out.println(obj);
		}	
		ArrayList<Integer> arr11 = new ArrayList<Integer>();

			
		}
	}
