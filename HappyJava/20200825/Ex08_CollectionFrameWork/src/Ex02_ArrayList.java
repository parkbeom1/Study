import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

// Today Point
public class Ex02_ArrayList {
	public static void main(String[] args) {
		// List �������̽� ���� .. ������������ ,�ߺ������ ����������
		ArrayList arraylist = new ArrayList();
		// Object Ÿ���� ������ �����迭  hip�޸𸮿� �����ȴ�.
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		arraylist.add(400);
		
		int sum = 0; 
		for(int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
				System.out.println(arraylist.get(0));
		}
		System.out.println(arraylist.toString()); // ����ִ� �����͸� ���������� ������ش�.
		
		// add ���������� ������ �ֱ�
		arraylist.add(0, 111); // 0���� �濡 111 �� ������ �װ��� �ִ� ������ �ڷ� �и���.
							   // �տ� ����θ� ��ĭ�� ������ �� �����.
							   // �߰��� �����͸� �����ϰų� �����ϴ°� ������ �Ҿ��ϰ� �����Ѵ�. 
							   // �����͸� �ڿ� �߰��ϰ� �ڿ������� �����ϴ°� ��������̴�.
		System.out.println(arraylist.toString());
		
		System.out.println(arraylist);
		arraylist.add(4, 444);
		System.out.println(arraylist);
		
		// ��������� ������ �߰� , ���� >> ArrayList �������� �ʴ´�. >> ������ �ִ� �������� ����
		// �������� ������ �߰��� ������ ^^
		
		// arraylist.remove(200);// �ְ� �ε��� ��ȣ�� �����ؼ� ������ �� �ε�������..
		//ArrayList�� ������ �ִ� �Լ��� �����ϱ�
		System.out.println(arraylist.contains(100)); // �Ķ���Ϳ�  �迭�� ���� ������ true 
		arraylist.clear(); // �����͸� ����� ������ �����ִ�.
		System.out.println(arraylist.toString()); // [] 
		System.out.println(arraylist.size()); // 0 
		System.out.println(arraylist.isEmpty()); // �����Ͱ� ����ִ� true
		
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		
		System.out.println(arraylist.isEmpty()); // �����Ͱ� �־ false;
	
		System.out.println("���� ��" + arraylist.size());
		Object value = arraylist.remove(0); // 0���� �濡 ����  ����� �����͸� Object�� ���Ϲ޾���
		System.out.println(value);// ������ �����͸� ���� �������ִ�.
		System.out.println("���� ��" + arraylist.toString()); // 102 , 103 [ �߰��� ������� ����� ġ��ö󰣴� ]  
		System.out.println(arraylist.size()); // 2 
		
		arraylist.add(104);
		System.out.println(arraylist.toString());
		arraylist.remove(0);
		System.out.println(arraylist.toString());
		
		arraylist.add(105);
		System.out.println(arraylist.size()); // 3
		
		for(Object obj : arraylist) {
			System.out.println(obj); // 103 , 104 , 105
		}
		Vector vector2 = new Vector();
		//Point
		// ������ ���� �ڵ� ...... �ϻ�ٹݻ� ��� ���� ?
		// ������.....
		List li = new ArrayList(); // ArrayList �θ� List�� �ּҰ��� �����Ҽ� �ִ�. ( ������  )
		// ���⼺�� ���� Ȯ�强�� ���� �������� Ȯ�� , ���������� ������ �����Ѵ�.
		li.add("��"); // ��� Ÿ���� �������ִ�.
		li.add("��"); 
		li.add("��"); 
		li.add("��"); 
		li.add("��"); // list��  �ߺ� ��� ��? ÷�ڷ� �����Ҽ������ϱ�
	
		List li2 = li.subList(0, 2); // sublist ������ִ� ������ ������ �ִ� ������ �����̴�.
		System.out.println(li2.toString()); // 0�������� 1�������� ������
		
		ArrayList alist = new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(7);
		alist.add(40);
		alist.add(46);
		alist.add(3);
		alist.add(15);
		System.out.println(alist.toString());
		
		Collections.sort(alist); // �ʱ��ڴ� ���� ���� �ȵȴ�. >> �߱��� �̻� 
		System.out.println(alist.toString()); // ������...
											  // ������...
		// ���������� �����Ϸ���  �������ϰ��� �������� �������� �Ҽ��ִ�.
		Collections.reverse(alist); // reverse�� void�� ä���� �ȸ�����.
		System.out.println(alist.toString());
		
		arraylist.add(0,200);
		
	}
}
