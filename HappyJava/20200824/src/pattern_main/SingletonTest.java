package pattern_main;

public class SingletonTest {

	private static SingletonTest p;  // private static p��ü �� �����Ϸ���  public static �� ����
									 // ������ �� ������� �ص� �����ڰ� private  �̸� 
									 // public static ���� �����Ѵ�.  if���ǹ����� p��ü�� ������  SingletonTest() �����ڸ� �����Ѵ�.
									 // �̱����� ���� �ּҰ��� ������.
										
	private SingletonTest() {
		
	}
	
	public static SingletonTest getInstance() {
		if(p == null) {
			p = new SingletonTest();
		}
		return p;
	}
}