package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("�̼���");
		set.add("������");
		set.add("������");
		System.out.println(set); // set�� ������� ��µ��� �ʴ´�. �ߺ��� ������� �ʴ´�.
		// ������ , ������ , �̼���  
		
		ArrayList<String> set2 = new ArrayList<String>();
		
		Iterator ir = set.iterator();
		
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}
	}
}
