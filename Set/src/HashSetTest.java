import java.util.HashSet;
import java.util.Iterator;

// set�� ��ȸ�ϸ鼭 ������ �׷��� �߰��� ������� ���� ��µȴ�.(��������)


public class HashSetTest {
	public static void main(String[] args) {
		
		HashSet <String> set = new HashSet<String>();
		
		set.add("�̼���");
		set.add("������");
		set.add("�Ϸ����");
		
		
		Iterator<String> ir = set.iterator(); 
		
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}
	}
}
