import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		
		TreeSet<String> treeset = new TreeSet<String>();
		
		treeset.add("ȫ�浿");
		treeset.add("�̼���");
		treeset.add("������");
		
		for(String str : treeset) {
			System.out.println(str);  // ������ ������  �⺻������ ������������ ������ , ���������� �����ؾ��Ѵ�.
 		}
		
	}
}