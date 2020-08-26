package Generic;
/*	
 * Today Point
 * Generic jdk 1.5
 c# , java �ʼ���� 

Collection �����͸� �����Ҽ��ִ� �÷��ǵ��� �����̴�. 
Collection Ŭ���� >> ������ �⺻ ���� ���� : 
1. Object Ÿ�� ���� ... >> Ÿ�� .. ���� >> Ÿ�� ���� (��ü ���� .. Ÿ��) >> ���ʸ�
2. Ÿ�� ������ (Ÿ�� ����) ��ü�� ���鋚 �����Ҽ��ְ� ���ش�. 
3. ���� ����ȯ (casting) : (car)object (x)
���� : Ŭ������ �����Ҷ� �������� 

*/

import java.util.ArrayList;

class Generic <T> { // Ÿ�� �Ķ����	
	T obj;	
	void add(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}
class Person extends Object {
	int age = 100;
	
}

public class Ex06_Generic2 {
	public static void main(String[] args) {
		Generic<String> mygen = new Generic<String>(); // TŸ�Կ� ��Ī�ɾ���  Ÿ���� ���ڷ� ���� 
		mygen.add("���ڿ�");
		String str = mygen.get();
		System.out.println(str);
		
		ArrayList list = new ArrayList();
		// ���� ������ Ÿ���� Object �迭 : Object[] elements 
		list.add(new Person());
		list.add("ȫ�浿");
		
		// ���
		// ������ for��
		for(Object obj : list) {
			// person ��ü�� ���̸� ���
			// �������� ���� ����Ͻÿ�.
			// System.out.println(obj);
			// ��ü�ΰͰ� ��ü�� �ƴѰ�......
			if(obj instanceof Person) {
				Person person = (Person) obj; // �ٿ�ĳ����
				System.out.println(person.age);
			} else {
				System.out.println(obj);
			}
		}
		ArrayList<Person> plist = new ArrayList<Person>();
		plist.add(new Person());
		
		for(Person p : plist) {
			System.out.println(p.age);
		}
	}
}
