package pattern;
// �̱��� �ǵ�  : �ϳ��� ��ü�� �����ϴµ� ����

import pattern_main.Singleton;

public class SingleTon_main {
	public static void main(String[] args) {
//		Singleton s = new Singleton(); // �����ڸ� private ���� ���Ƶ�  new ���� ���Ѵ�.
		// ���� ��ü�� �������� ���ϰ� ���´�.- ��ü ���� �Ұ� 
		
		Singleton s = Singleton.getInstance(); // ��ü�� �ּҰ� ����
		Singleton s1 = Singleton.getInstance(); // ��ü�� �ּҰ� ����
		Singleton s2 = Singleton.getInstance(); // ��ü�� �ּҰ� ����
		
		// �Ȱ��� �ּҰ��� ������. 
		System.out.println(s == s1);
		System.out.println(s == s2);
		System.out.println(s1 == s2);
		
	}
}
