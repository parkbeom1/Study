package pattern_main;
//������ ���� (��������) >> new >> 
//��ü �ϳ��� ���� ���� ....
//�ǵ� : ����� �̱����� ���ٸ� �ϳ��� ��ü�� �����ϴ°��� �����ϰڴ�...
public class Singleton {
	private static Singleton p; // Singleton.p �� ���� �ϴµ� private���� ����
	private Singleton() { // �����ڿ� �����ڰ� Private 
			// ���� ��ü ���� �Ұ� ... new (x) ... heap ��ü ���� �Ұ� ...
	}
	
	// �� �޼ҵ忡 �����ؼ� ��ü�ּҰ� ����
	public static Singleton getInstance() { // public���� ���ο��� �޸𸮸� �÷���  �̱��� ���� ��ü�� ������ ���� 
		if(p == null) { // �ƹ��͵� Ÿ�� �޸𸮸� ������ �ʴ´ٸ�
			p = new Singleton(); // ���̶�� �޸𸮿� �̱��� ��ü�� �ö󰣴�. >> ��ü�� �ּҸ� p�� ���´� �����Ѵ�.
			// new�� �ѹ�������.�װ� ���纻���� ��(�� ������ִ°� ������ ����.)			
		}
		return p;
	}
	
	// Singleton.getInstance();	
}
